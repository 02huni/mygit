from coffee.coffee import (
    ask_order,
    print_report,
    is_resource_sufficient,
    process_coins,
    is_transaction_successful,
    make_coffee,
)

MENU = {
    "espresso": {
        "ingredients": {
            "water": 50,
            "coffee": 18,
        },
        "costs": 1.5,
    },
    "latte": {
        "ingredients": {
            "water": 200,
            "milk": 150,
            "coffee": 24,
        },
        "costs": 2.5,
    },
    "cappuccino": {
        "ingredients": {
            "water": 250,
            "milk": 100,
            "coffee": 24,
        },
        "costs": 3.0,
    },
}

profit = 0
drink_cost = 0
resources = {
    "water": 300,
    "milk": 200,
    "coffee": 100,
}


def main():
    pass


if __name__ == "__main__":
    main()
    count = 0
    while True:
        if count > 1: break
        order = ask_order()
        if order == 'off':
            break
        elif order == 'report':
            print_report(profit)

        if order == 'espresso':
            order_ingredients = MENU["espresso"]['ingredients']
        elif order == 'latte':
            order_ingredients = MENU["latte"]['ingredients']
        elif order == 'cappuccino':
            order_ingredients = MENU["cappuccino"]['ingredients']

        if not is_resource_sufficient(order_ingredients):
            print(" 죄송합니다. 자원이 충분하지 않습니다.")

        fee = process_coins()
        print(f"fee : {fee:.2f}")
        print(f"fee : {fee:.2f}")

        profit += is_transaction_successful(fee, MENU[order]['costs'])

        make_coffee(order, order_ingredients)
        count += 1






