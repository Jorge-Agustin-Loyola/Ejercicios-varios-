# Código de ejemplo

a = int(input())
print(a > 100 and a != 1000)

# Primero se calcularán los valores lógicos (True o False) de las dos comparaciones:
# a > 100 y a != 1000 (lo cual dependerá del número guardado en la variable a).
# A continuación, se utilizará la tabla de verdad de la operación AND para calcular
# el resultado.

# 13
# Escribí un programa que le solicite al usuario su edad y la guarde en una variable.
# Que luego solicite la cantidad de artículos comprados en una tienda y la guarde
# en otra variable. Finalmente, mostrar en pantalla un valor de verdad (True o False)
# que indique si el usuario es mayor de 18 años de edad y además compró más de 1 artículo.

edad = int(input("digite su edad: "))
n_articulos = int(input("¿cuantos articulos compro? "))
print(f"Es mayor de edad y compro mas de un articulo: ", (edad > 18 and n_articulos > 1))
