# Sección 3
# Funciones

# Código de ejemplo

"""def promedio(x, y, z):
    return (x+y+z)/3


n1 = int(input("Primer número:"))
n2 = int(input("Segundo número:"))
n3 = int(input("Tercer número:"))
print("El promedio de los tres es:", promedio(n1, n2, n3))"""
# La función suma definida en el ejemplo recibe tres parámetros y retorna el promedio.
# Una función termina donde termina su bloque ó cuando se ejecuta una instrucción return, aunque esté en cualquier
# parte del bloque. Al retornar, el programa continúa desde el punto en donde se había llamado a la función.
# Una función puede recibir 0 o más parámetros, sin límite, pero no puede retornar más de un resultado a la vez.
# Puede también no retornar nada (por ejemplo, una función que sólo muestra algo en pantalla).

# 41
# Escribí una función llamada esPar que reciba como parámetro un número y retorne True si el número es par ó False
# si es impar. Utilizar esta función en un programa que solicite al usuario el ingreso de 10 números y que luego
# muestre, por separado, la suma de todos los pares y la suma de todos los impares.

"""# funcion


def espar(num):
    return num % 2 == 0


# Principal


sumaPares = 0
sumaImpares = 0

for i in range(10):
    num = int(input('Digite un número: '))
    if espar(num):
        sumaPares += num
    else:
        sumaImpares += num

print('suma pares: ', sumaPares)
print('Suma impares: ', sumaImpares)"""


# 42
# Escribí una función llamada sumatoriaDigitos que reciba como parámetro un número y retorne la suma de todos sus
# dígitos, reutilizando la estrategia utilizada en el ejercicio 36. Finalmente, escribir un algoritmo que solicite
# al usuario ingresar varios números hasta que ingrese el número 100, con el cual cortará la repetición. Por cada
# número, mostrar la suma de sus dígitos, para lo cual se llamará a la función sumatoriaDigitos.


# Funcion


def sumatoriadigitos(num):
    sumaDigitos = 0
    while num != 0:
        ultimoDigito = +num % 10
        sumaDigitos += ultimoDigito
        num = num // 10
    return print('suma de los digitos', sumaDigitos)


# principal

num = int(input("numero: "))
while num != 100:
    sumatoriadigitos(num)
    num = int(input("numero: "))




