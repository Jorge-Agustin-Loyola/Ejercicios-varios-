"""cadena = input("Frase:")
for caracter in cadena:
    print(caracter)"""

# Cuando se recorre un string mediante un for que itera por cada uno de sus caracteres, asignar un nuevo valor
# a la variable iteradora (en este caso, caracter) no modifica el string original. Esto es, la instrucción caracter="a"
# dentro del for no modificaría en nada el string almacenado en la variable cadena.c

# 30
# Escribí un programa que permita al usuario ingresar una frase y luego un caracter (string de longitud 1) y luego
# muestre la frase ingresada, pero con todas las ocurrencuas del caracter indicado.
"""frase = input("frase:")
caracter = input("caracter:")
for i in frase:
    if i == caracter:
        i = "*"
        print(i)
    else:
        print(i)"""


# otra forma print en horizontal
"""frase = input("frase:")
caracter = input("caracter:")
nuevaCadena = ""
for i in frase:
    if i == caracter:
        nuevaCadena += "*"
    else:
        nuevaCadena += i
print(nuevaCadena)"""

# 31
# escribí un programa que, dada una frase por el usuario, la muestre invertida, sin utilizar una rebanada
# con paso negativo.
frase = input("Frase: ")
nuevaCadena = ""
contadorAtras = len(frase)-1

"""for i in range(len(frase)):
    nuevaCadena += frase[contadorAtras]
    contadorAtras -= 1

print(nuevaCadena)
print(len(frase))"""

# otra forma con while

i = len(frase)-1
while i >= 0:
    nuevaCadena = nuevaCadena + frase[i]

    i = i-1
print(nuevaCadena)