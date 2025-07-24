# from main import MAIN, resouces, profit
resources = {
    "water": 300,
    "milk": 200,
    "coffee": 100,
}

# 사용자에게 주문에 대해 요청하기
# " 어떤 음료를 원하시나요? (에스프레소 / 라떼 / 카푸치노)
def ask_order():
    ordered_menu = input(" 어떤 음료를 원하시나요? (에스프레소, 라떼, 카푸치노)  :")

    if ordered_menu == '에스프레소':
        ordered_menu = 'espresso'
    elif ordered_menu == '라떼':
        ordered_menu = 'latte'
    elif ordered_menu == '카푸치노':
        ordered_menu = 'cappuccino'

    return ordered_menu

# report를 입력하면 현재 자원 상태를 보여주는 보고서를 생성
# 물, 우유, 커피, 돈 자원 출력
def print_report():
    print(f" - 물 : {resources['water']} ")
    print(f" - 우유 : {resources['milk']} ")
    print(f" - 커피 : {resources['coffee']}")
    print(f" - 돈 : {profit}")
    return


# 음료를 주문할 경우 자원이 출분한 지 확인
# 물, 커피, 우유,
# 자원이 부족할 경우 " 죄송합니다. 물이 출분하지 않습니다." 메시지 출력
def is_resource_sufficient(order_ingredients):

    water = order_ingredients['water']
    milk =  order_ingredients['milk']
    coffee =  order_ingredients['coffee']
    print(f" water : {water}, milk : {milk}, coffee : {coffee}")

    if resources['water'] > water:
        if resources['coffee'] > coffee:
            if resources['milk'] > milk:
                return True
            
    return False

    # if order_ingredients == '에스프레소':
    #     if ((MENU['espresso']['ingredients']['water']) < 50) or \
    #         ((MENU['espresso']['ingredients']['coffee']) < 18):
    #         # print(" 죄송합니다. 자원이 충분하지 않습니다.")
    #         return False
    #     else:
    #         resources['water'] -= 50
    #         resources['coffee'] -= 18
    #         drink_cost = 1.5
    #         return True

    # elif order_ingredients == '라떼':
    #     if ((MENU['latte']['ingredients']['water']) < 200) or \
    #         ((MENU['latte']['ingredients']['coffee']) < 24) or \
    #         ((MENU['latte']['ingredients']['milk']) < 150):
    #         # print(" 죄송합니다. 자원이 충분하지 않습니다.")
    #         return False
    #     else:
    #         resources['water'] -= 200
    #         resources['milk'] -= 150
    #         resources['coffee'] -= 24
    #         drink_cost = 2.5
    #         return True

    # elif order_ingredients == '카푸치노':
    #     if ((MENU['latte']['ingredients']['water']) < 250) or \
    #         ((MENU['latte']['ingredients']['coffee']) < 24) or \
    #         ((MENU['latte']['ingredients']['milk']) < 100):
    #         # print(" 죄송합니다. 자원이 충분하지 않습니다.")
    #         return False
    #     else:
    #         resources['water'] -= 250
    #         resources['milk'] -= 100
    #         resources['coffee'] -= 24
    #         drink_cost = 30.
    #         return True
        
    # else:
    #     print(" 주문하신 메뉴가 없습니다.")

# 주문 완료 후 동전을 지급하도록 요청.
# 동전을 입력 받으면 총 금액을 계산한다.
# quarters : 0.25, dimes : 0.1, nickels : 0.05, pennies : 0.01

def process_coins():
    quarters = float(input("쿼터 동전 수량을 넣으시오 : "))
    quarters = quarters /4
    dimes = float(input("다임 동전 수량을 넣으시오 : "))
    quarters = dimes / 10
    nickels = float(input("니켈 동전 수량을 넣으시오 : "))
    quarters = nickels / 20
    pennies = float(input("페니 동전 수량을 넣으시오 : "))
    quarters = pennies

    print(f" received quarters : {quarters}")
    print(f" received dimes : {dimes}")
    print(f" received nickels : {nickels }")
    print(f" received pennies : {pennies }")

    return quarters + dimes + nickels + pennies

# 사용자가 주문한 음료의 가격만큼 동전을 넣었는지 확인
# 금액이 부족하면 " 죄송합니다. 금액이 부족합니다. 돈이 환불되었습니다." 메시지 출력
# 충분한 금액을 받았으면 수익으로 추가하고 report 실행시 반영
# 사용자가 초과 금액을 넣으면 거스름돈 제공
def is_transaction_successful(money_received, drink_cost):
    profit = 0
    print(f" money_received : {money_received}, drink_cost : {drink_cost}")
    if money_received < drink_cost:
        print(" 죄송합니다. 금액이 부족합니다. 돈이 환불되었습니다.")
    else:
        money_returned = money_received - drink_cost
        profit += drink_cost
        print(f" 거스름돈 {money_returned:.2f}이 반환 되었습니다.") 
    return profit


# 선택한 음료 제고에 필요한 자원을 차감
# 자원이 차감된 후 사용자에게 "여기 라떼가 나왔습니다. 즐기세요!" 메시지 출력
def make_coffee(drink_name, order_ingredients):
    print(f" drink_name : {drink_name}, order_ingredients : {order_ingredients}")
    if drink_name == '에스프레소':
        resources['water'] -= 50
        resources['coffee'] -= 18
        print(" 여기 에스프레소가 나왔습니다.")
    elif drink_name == '라떼':
        resources['water'] -= 200
        resources['milk'] -= 150
        resources['coffee'] -= 24
        print(" 여기 라떼가 나왔습니다.")
    elif drink_name == '카푸치노':
        resources['water'] -= 250
        resources['milk'] -= 100
        resources['coffee'] -= 24
        print(" 여기 카푸치노가 나왔습니다.")
    
    return resources