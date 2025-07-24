 
def main():
    pass

def get_order():
    # get the menu from order
    order = input(" 어떤 음료를 원하시나요? (에스프레소/라떼/카푸치노) : ")
    if order == '에스프레소':        order = 'espresso'     # change from Korean to English
    elif order == '라떼':        order = 'latte'        # change from Korean to English
    elif order == '카푸치노':        order = 'cappuccino'    # change from Korean to English
    return order

def is_resource_sufficient(order_ingredients):
    if order == 'espresso':
        if order_ingredients['water'] > resources['water']:     # compare current water resource is enough
            print(" 죄송합니다. 물이 충분하지 않습니다.")
        elif order_ingredients['coffee'] > resources['coffee']:     # compare current coffee resource is enough
            print(" 죄송합니다. 커피가 충분하지 않습니다.")
        else:
            return True
        return False
    elif order == 'latte':
        if order_ingredients['water'] > resources['water']:     # compare current water resource is enough
            print(" 죄송합니다. 물이 충분하지 않습니다.")
        elif order_ingredients['coffee'] > resources['coffee']: # compare current coffee resource is enough
            print(" 죄송합니다. 커피가 충분하지 않습니다.")
        elif order_ingredients['milk'] > resources['milk']:     # compare current milk resource is enough
            print(" 죄송합니다. 우유가 충분하지 않습니다.")
        else:            return True
        return False
    elif order == 'cappuccino':
        if order_ingredients['water'] > resources['water']:     # compare current water resource is enough
            print(" 죄송합니다. 물이 충분하지 않습니다.")
        elif order_ingredients['coffee'] > resources['coffee']: # compare current coffee resource is enough
            print(" 죄송합니다. 커피가 충분하지 않습니다.")
        elif order_ingredients['milk'] > resources['milk']:     # compare current milk resource is enough
            print(" 죄송합니다. 우유가 충분하지 않습니다.")
        else:
            return True
        return False

def coins_calc():
    qt = float(input(" 동전을 넣으시오. (쿼터: quarters) : "))
    dt = float(input(" 동전을 넣으시오. (다임: dimes) : "))
    nt = float(input(" 동전을 넣으시오. (니켈: nickels) : "))
    pt = float(input(" 동전을 넣으시오. (페니: pennies) : "))
    m = qt*0.25 + dt*0.1 + nt*0.05 + pt*0.01
    return m

def process_control(money_received, drink_cost):
    if money_received >= drink_cost:        # compare money received and menu cost
        remained = money_received - drink_cost  # get the difference
        print(f" 거스름돈 ${remained:.2f}을 돌려드립니다.")
        return remained
    else:
        print(" 죄송합니다. 금액이 부족합니다. 돈이 환불되었습니다.")
        return False

def make_coffee(drink_name, order_ingredients):
    if drink_name == 'espresso':
        resources['water'] -= order_ingredients['water']
        resources['coffee'] -= order_ingredients['coffee']
        print(" 여기 에스프레소가 나왔습니다. 즐기세요! ")
    elif drink_name == 'latte':
        resources['water'] -= order_ingredients['water']
        resources['milk'] -= order_ingredients['milk']
        resources['coffee'] -= order_ingredients['coffee']
        print(" 여기 라떼가 나왔습니다. 즐기세요 ! ")
    elif drink_name == 'cappuccino':
        resources['water'] -= order_ingredients['water']
        resources['milk'] -= order_ingredients['milk']
        resources['coffee'] -= order_ingredients['coffee']
        print(" 여기 카푸치노가 나왔습니다. 즐기세요 ! ")
    else:
        print(" 메뉴가 없습니다.")

if __name__ =="__main__":
    main()
    
    MENU = {
        'espresso' : {
            'ingredients' : {
                'water' : 50,
                'coffee' : 18,
            },
            'costs' : 1.5,
        },
        'latte' : {
            'ingredients' : {
                'water' : 200,
                'milk' : 150,
                'coffee' : 24,
                },
            'costs' : 2.5
            },
            'cappuccino' : {
                'ingredients' : {
                'water' : 250,
                'milk' : 100,
                'coffee' : 24,
            },
            'costs' : 3.0,
        }
    }

    profit = 0.

    resources = {
        'water' : 300,
        'milk' : 200,
        'coffee' : 100,
    }

    while True:
        order = get_order()

        if order=='espresso' or order=='latte' or order=='cappuccino':
            order_ingredients = MENU[order]['ingredients']
        
            status = is_resource_sufficient(order_ingredients)
            if status == False:                break

            received_money = coins_calc()

            drink_cost = MENU[order]['costs']
            earned = process_control(received_money, drink_cost)
            profit += earned
            make_coffee(order, order_ingredients)

        elif order == 'off':            break
        elif order == 'report':
            print(f" - 물    : {resources['water']}ml ")
            print(f" - 우유  : {resources['milk']}ml ")
            print(f" - 커피  : {resources['coffee']}g ")
            print(f" - 돈    : ${profit}")



