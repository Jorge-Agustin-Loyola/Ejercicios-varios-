# escribr un programa que, dado un numero entero, muedtre su valor absoluto. Recordá que, para los numeros positivos
# su valor absoluto es igual al numero ( el valor absoluto de 52 es 52), mientras que, para kis negativos, su valor
# absoluto es el numero mulltiplicado por -1 (el valor absoluto de -52 es 52)
num = int(input("digite un número"))
if num < 0:
    num = num * (-1)
print(num)
