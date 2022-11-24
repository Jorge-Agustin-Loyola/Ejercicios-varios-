# Codigo de ejemplo:

for x in "hola":
    print(x)

# La repetición for utiliza el operador in para recorrer una secuencia. Este operador retorna un valor lógico:
# True si el primer operando está contenido en el segundo, False si no es así. Es posible utilizar el operador in
# de forma independiente, para saber, por ejemplo, si un string está contenido dentro de otro: "a" in "hola" dará
# como resultado True porque el string “a” está dentro de “hola”. Asimismo, se puede negar el valor lógico obtenido
# por la operación utilizando not: "a" not in "hola" dará como resultado Fase porque no es verdad que el string “a”
# no esté dentro de “hola”.

# 26
# Escribí un programa que, dada una frase por el usuario, muestre la cantidad total de vocales
# (tanto mayúsculas como minúsculas) que contiene.
"""frase = input("Escriba una frase: ")
cant_vocales = 0
for x in frase:
    if x == "a" or x == "e" or x == "i" or x == "o" or x == "u":
       cant_vocales += 1
print(f"Su frase contiene {cant_vocales} vocales")"""

# otra forma

"""vocales = "aeiou"
frase = input("digite una frase: \n")
cant_vocales = 0
for i in frase:
    if i in vocales:
        cant_vocales += 1

print(cant_vocales)"""

# 27
# Escribí un programa que muestre los primeros 10 números de la sucesión de Fibonacci.
# La sucesión comienza con los números 0 y 1 y, a partir de éstos, cada elemento es la suma de
# los dos números anteriores en la secuencia: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55…
"""n1 = 0
n2 = 1
print(n1)
print(n2)
for i in range(8):
    n3 = n1 + n2
    print(n3)
    n1 = n2
    n2 = n3"""

# 28
# Escribí un programa que, dado un número entero positivo, calcule y muestre su factorial.
# El factorial de un número se obtiene multiplicando todos los números enteros positivos
# que hay entre el 1 y ese número. El factorial de 0 es 1.
"""num = int(input("Digite un número entero positivo: "))
factorial = 1
if num != 0:
    for i in range(1, num+1):
        factorial *= i

print(factorial)"""

# 29
# Escribí un programa que permita al usuario ingresar 6 números enteros, que pueden ser positivos o
# negativos. Al finalizar, mostrar la sumatoria de los números negativos y el promedio de los positivos.
# No olvides que no es posible dividir por cero, por lo que es necesario evitar que el programa arroje
# un error si no se ingresaron números positivos.
sumaNegativos = 0
sumaPositivos = 0
cantPositivos = 0
print("Digite seis números:")

for i in range(6):
    n1 = int(input("n: "))
    if n1 < 0:
        sumaNegativos += n1
    else:
        if n1 >= 0:
            sumaPositivos += n1
            cantPositivos += 1
promedio = sumaPositivos/cantPositivos
print(f"""
        Sumatoria de números negativos: {sumaNegativos}
        promedio de números positivos: {promedio}                
""")
