# Código de ejemplo

"""def cantidad_digitos(numero):
    cantidad = 0
    while numero != 0:
        cantidad = cantidad+1
        numero = numero//10
    return cantidad


mayor = -1
n = int(input("Número positivo:"))
while cantidad_digitos(n) % 3 != 0:
    if n > mayor:
        mayor = n
    n = int(input("Número positivo:"))
print("Mayor número ingresado:", mayor)"""

# Las funciones son también útiles para pensar los programas en partes más pequeñas. En el ejemplo de arriba, la
# repetición lee números hasta que se ingresa uno cuya cantidad de dígitos es múltiplo de 3. Cuando finaliza la
# repetición, de todos los números ingresados se muestra cuál fue el mayor. Pero para poder armar la condición de
# esta repetición es necesario calcular la cantidad de dígitos de un número, lo cual se delega en una función que
# es llamada en cada iteración, cuando se evalúa la condición.

# 45
# Escribí un programa que permita al usuario ingresar números enteros hasta que ingrese uno cuyo dígito inicial sea el
# 9 (el cual no se procesará). Una vez terminada la repetición, mostrar cuántos de los números que el usuario ingresó
# tienen sólo dos divisores (para esto es posible reutilizar parte de la estrategia elaborada en el ejercicio 25).

# función contar divisores


def divisores(num):
    cant_divisores = 0
    for i in range(1,num+1):
        if num % i == 0:
            cant_divisores += 1
    if cant_divisores == 2:
        return True
# principal


num = input('digite un número: ')
num_con_dos_divisores = 0
while num[0] != "9":
    num = int(num)
    if divisores(num):
        num_con_dos_divisores += 1
    num = input('digite un número: ')
print('Tienen solo dos divisore: ', num_con_dos_divisores)



