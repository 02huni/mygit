import pandas as pd

# pandas로 외부 데이터 일어와서 저장
df=pd.read_csv("https://bit.ly/perch_csv_data")
perch_full=df.to_numpy()
# print(perch_full)

import numpy as np
perch_weight= np.array(
    [5.9, 32.0, 40.0, 51.5, 70.0, 100.0, 78.0, 80.0, 85.0, 85.0, 110.0,
       115.0, 125.0, 130.0, 120.0, 120.0, 130.0, 135.0, 110.0, 130.0,
       150.0, 145.0, 150.0, 170.0, 225.0, 145.0, 188.0, 180.0, 197.0,
       218.0, 300.0, 260.0, 265.0, 250.0, 250.0, 300.0, 320.0, 514.0,
       556.0, 840.0, 685.0, 700.0, 700.0, 690.0, 900.0, 650.0, 820.0,
       850.0, 900.0, 1015.0, 820.0, 1100.0, 1000.0, 1100.0, 1000.0,
       1000.0]
)

from sklearn.model_selection import train_test_split
train_input, test_input, train_target, test_target=train_test_split(perch_full,perch_weight, random_state=42)

from sklearn.preprocessing import PolynomialFeatures


poly =PolynomialFeatures()
poly.fit([[2,3]]) # 2개의 특성 '2와 3'을 사진 가상의 샘플
# print(poly.transform([[2,3]]))
# 결과: [[1. 2. 3. 4. 6. 9.]]

# LineTegression에서 절편 자동생성
# PolynomialFeatures 절편 1특성 생성 필요 x include_bias=False로 지정
poly=PolynomialFeatures(include_bias=False)
poly.fit([[2,3]])
# print(poly.transform([[2,3]]))
# 결과: [[2. 3. 4. 6. 9.]]


# 다중회귀 모델 생성
poly =PolynomialFeatures(include_bias=False)

poly.fit(train_input)
train_poly=poly.transform(train_input)

print(train_poly.shape)
poly.get_feature_names_out()

test_poly=poly.transform(test_input)

# 다중회귀모델 훈련
from sklearn.linear_model import LinearRegression

lr= LinearRegression()

lr.fit(train_poly, train_target)
print(lr.score(train_poly, train_target))
print(lr.score(test_poly, test_target))


poly= PolynomialFeatures(degree=5, include_bias=False)
poly.fit(train_input)
train_poly=poly.transform(train_input)
test_poly=poly.transform(test_input)
# 너무 많은 특성 훈련으로 overfitting일어남
print(train_poly.shape)
lr.fit(train_poly, train_target)
print(lr.score(train_poly, train_target))
print(lr.score(test_poly, test_target))

from sklearn.preprocessing import StandardScaler

ss= StandardScaler()
ss.fit(train_poly)

train_scaled= ss.transform(train_poly)
test_scaled=ss.transform(test_poly)

# 릿지
from sklearn.linear_model import Ridge

ridge = Ridge()
ridge.fit(train_scaled, train_target)
print(ridge.score(train_scaled, train_target))
print(ridge.score(test_scaled, test_target))

import matplotlib.pyplot as plt
train_score=[]
test_score=[]

alpha_list=[0.001, 0.01, 0.1, 1, 10, 100]
for alpha in alpha_list:
    #릿지모델 생성
    ridge= Ridge(alpha=alpha)
    #릿지모델 훈련
    ridge.fit(train_scaled, train_target)
    #훈련점수와 테스트 점수 저장
    train_score.append(ridge.score(train_scaled, train_target))
    test_score.append(ridge.score(test_scaled, test_target))

plt.plot(np.log10(alpha_list), train_score)
plt.plot(np.log10(alpha_list), test_score)
plt.xlabel('alpha')
plt.ylabel('R^2')
plt.show()

# 라쏘
from sklearn.linear_model import Lasso
lasso= Lasso()
lasso.fit(train_scaled, train_target)
print(lasso.score(train_scaled, train_target))
print(lasso.score(test_scaled, test_target))

train_score=[]
test_score=[]

alpha_list=[0.001, 0.01, 0.1, 1, 10, 100]
for alpha in alpha_list:
    # 라쏘 모델생성
    lasso=Lasso(alpha=alpha, max_iter=10000)
    # 라쏘 모델훈련
    lasso.fit(train_scaled, train_target)
    # 훈련점수와 테스트점수 저장
    train_score.append(lasso.score(train_scaled, train_target))
    test_score.append(lasso.score(test_scaled, test_target))

plt.plot(np.log10(alpha_list), train_score)
plt.plot(np.log10(alpha_list), test_score)
plt.xlabel('alpha')
plt.ylabel('R^2')
plt.show()

lasso=Lasso(alpha=10)
lasso.fit(train_scaled, train_target)

print(lasso.score(train_scaled, train_target))
print(lasso.score(test_scaled, test_target))

print(np.sum(lasso.coef_==0))

