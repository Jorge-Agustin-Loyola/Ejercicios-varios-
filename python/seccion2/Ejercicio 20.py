# Escribí un programa para solicitar al usuario tres números y mostrar en pantalla al menor de los tres.

num1 = int(input("Digite un número"))
num2 = int(input("Digite otro número"))
num3 = int(input("Digite otro número"))
if num1 > num2 and num1 > num3:
    print(num1)
elif num2>num1 and num2>num3:
    print(num2)
else:
    print(num3)

# otra forma:
if num1 < num2:
    if num1 < num3
        print("menor: ", num1)
    else:
        print("menor: ", num3)
else:
    if num2<num1:
        if num2<num3:
            print("menor: ", num2)
        else:
            print("menor: ", num3)