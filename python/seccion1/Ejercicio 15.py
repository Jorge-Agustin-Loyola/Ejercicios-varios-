# Código de ejemplo

print("animal" > "piedra")
print("bailar" > "bebida")
print("animal" < "piedra")
print("bailar" < "bebida")

# Ambas comparaciones arrojan True porque el string “animal” es menor que “piedra” y el string “bailar” es menor
# que “bebida”. El orden está dado por cómo aparecen las letras en el alfabeto. En el caso de “animal” y “piedra”,
# la “a” es menor que la “p”. En el caso de “bailar” y “bebida”, como la primera letra es la misma se evalúa la
# segunda, y en este caso “a” es menor que “e”.

# 15
# Escribí un programa que le pida al usuario ingresar dos palabras y las guarde en dos variables, y que luego
# imprima True si la primera palabra es menor que la segunda o False si no lo es

palabra_1 = input("digite la palabra 1: ")
palabra_2 = input("digite la palabra 2: ")
print("alafabeticamente la palabra 1 es menor que la 2: ", (palabra_1 < palabra_2))
