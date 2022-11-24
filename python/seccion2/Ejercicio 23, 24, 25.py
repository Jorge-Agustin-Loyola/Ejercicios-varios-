"""for x in range(0, 10):
    print(x)

for x in range(10):
    print(x)"""

# Las dos repeticiones anteriores imprimirán lo mismo: los números del 0 al 9. En la primera se indica que
# se debe comenzar en el 0 y terminar en el 9 (el rango siempre terminará en el número dado como final, menos 1).
# En la segunda, al obviar el número en que se debe comenzar, automáticamente se toma al 0 como inicio del rango.
# Si quisiéramos, podríamos indicar que el rango comience en otro número que no sea el 0.

# 23
# Escribí un programa que le solicite al usuario un número entero y muestre todos los números correlativos entre el 1
# y el número ingresado por el usuario.
"""
n =int(input("Digite un número: "))
for i in range(1,n+1):
    print(i)"""

# 24
# Escribí un programa que muestre la sumatoria de todos los números entre el 0 y el 100.
"""suma = 0
for i in range(0, 101):
    suma += i

print(suma)"""

# 25
# Escribí un programa que, dado un número por el usuario, muestre todos sus divisores positivos. Recordá que un
# divisor es aquel que divide al número de forma exacta (con resto 0).
n = int(input("digite un número: "))
for i in range(1, n+1):
    if n % i == 0:
        print(i)

