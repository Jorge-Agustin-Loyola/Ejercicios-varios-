# Codigo de ejemplo
"""cantidad = 0
n = int(input("Número:"))
while n > 0 and n % 10 != 0:
    cantidad = cantidad + 1
    n = int(input("Número:"))"""

# Una condición tiene que ser un valor lógico, sin importar qué tipo de operación se deba realizar para obtenerlo.
# En el ejemplo anterior, se ejecutará el bloque mientras los números ingresados sean positivos (mayores que 0) y
# no sean múltiplos de 10. Cuando el usuario ingrese un número que incumpla alguna de las dos condiciones (un número
# negativo ó un número múltiplo de 10) el bloque deja de ejecutarse.


# 35
# Escribí un programa que solicite al usuario el ingreso de strings de longitud 1 (un solo carácter), uno por vez.
# La repetición finalizará cuando se ingrese un string que no tenga longitud 1, o cuando el string ingresado
# corresponda al dígito numérico 0. Al finalizar, mostrar el string completo que se formó con todos los caracteres
# ingresados y qué porcentaje de caracteres del total fueron la letra “a”
"""cadenaCompleta = ""
contadorA = 0
caracter = input("Digite un caracter: ")

while caracter != "0" and len(caracter) == 1:
    cadenaCompleta += caracter
    caracter = input("Digite un caracter: ")

print(cadenaCompleta)
for i in cadenaCompleta:
    if i == "a" or i == "A":
        contadorA += 1
print('porcentajes de "a": ', (contadorA*100)/len(cadenaCompleta))"""

# 36
# Escribí un programa que, dado un número entero por el usuario (guardado como int), muestre la suma de todos sus
# dígitos. Recordá que vas a necesitar obtener cada uno de los dígitos por separado para poder sumarlos entre si.

"""num = int(input("Digite un numero entero"))

suma = 0
while num != 0:
    ultimoDigito = num % 10
    suma = suma + ultimoDigito
    num = num//10
print("Suma de los digitos:", suma)"""

# 37
# Escribí un programa para solicitar al usuario que ingrese números enteros positivos (la cantidad que ingresará no
# se conoce y la decide el usuario). La lectura de números finalizará cuando el usuario ingrese el número -1. Por cada
# número ingresado, mostrar la cantidad de dígitos pares y la cantidad de dígitos impares que tiene. Al finalizar,
# mostrar cuántos números múltiplos de 3 ingresó el usuario.

"""numero = int(input("Numero (-1 para terminar el programa): "))

multiploDeTres = 0
while numero > -1:
    impares = 0
    pares = 0
    if numero % 3 == 0:
        multiploDeTres +=1
    while numero != 0:
        ultimoDigito = numero % 10
        if ultimoDigito % 2 == 0:
            pares += 1
        else:
            impares +=1
        numero //= 10
    print(f'''
           Digitos pares: {pares}
           Digitos impares: {impares} 
            ''')
    numero = int(input("Numero (-1 para terminar el programa): "))

print(f"Se ingresaron {multiploDeTres} multiplos de 3")"""

# 38
# Escribí un programa que solicite al usuario una cadena de caracteres (que puede contener letras, números o símbolos).
# Analizar la cadena para mostrar: cuántas letras del abecedario (minúsculas y mayúsculas) contiene, cuántos símbolos
# (caracteres que no son ni letras ni números), cuántos dígitos numéricos y, de los dígitos, cuántos son múltiplos de 4.

"""cadena = input("Cadena de caracteres: ")
abecedario = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNñÑoOpPqQrRsStTuUvVwWxXyYzZ"
numeros = "0123456789"
contadorLetras = 0
contadorNumeros = 0
contadorSimbolos = 0
contadormultiplo = 0
for i in cadena:
    if i in abecedario:
        contadorLetras += 1
    elif i in numeros:
        contadorNumeros += 1
        if int(i) % 4 == 0:
            contadormultiplo += 1
    else:
        if i != " ":
            contadorSimbolos += 1
print(f'''
letras: {contadorLetras}
numeros: {contadorNumeros} ; de los cuales {contadormultiplo} son multiplos de 4
simbolos: {contadorSimbolos}
''')"""

# 39
# Escribí un programa que permita al usuario ingresar números que serán leídos como string (no como int o float) hasta
# que ingrese uno que sea múltiplo de 10 ó menor que 0 (que no será procesado). Se formarán dos strings, en los cuales
# se concatenarán los números ingresados, según el siguiente criterio: en un string se concatenarán todos los números
# que el usuario ingrese cuya cantidad de dígitos sea un múltiplo de 3. En el otro, se concatenarán todos los números
# que contengan el dígito 0. Si un número cumple ambas condiciones, debe concatenarse en ambos strings. En cada string,
# después de cada número concatenado debe colocarse el carácter “-”. Al finalizar, mostrar en pantalla ambos strings.

"""num = input('digite un numero: ')
multiploDeTres = ""
contieneCero = ""
while num[len(num)-1] != "0" and num[0] != "-":

    if len(num) % 3 == 0:
        multiploDeTres += num + "-"
    for i in num:
        if i == "0":
            contieneCero += num + "-"
    num = input('Número:')
print('Números cuya cantidad de digitos son multiplos de tres: ', multiploDeTres)
print('Números que contienen el 0: ', contieneCero)"""

# 40
# Escribí un programa que permita al usuario ingresar títulos de libros por teclado, finalizando el ingreso al leerse
# el string “*” (asterisco). Cada vez que el usuario ingrese un string de longitud 1 que contenga sólo una barra “/” se
# considera que termina una línea. Por cada línea completa, informar cuántos dígitos numéricos (del 0 al 9) aparecieron
# en total (en todos los títulos de libros que componen en esa línea). Finalmente, informar cuántas líneas completas
# se ingresaron.
cadena = input('Cadena: ')
numeros = '0123456789'
digitosNumericos = 0
contadorLinea = 0
while cadena != '*':
    if cadena != '/':

        for i in cadena:
            if i in numeros:
                digitosNumericos += 1
        cadena = input('Cadena: ')
    else:
        contadorLinea += 1
        print(f"aparecen {digitosNumericos} digitos numericos en la linea")
        digitosNumericos = 0
        cadena = input('Cadena: ')
print(f"se leyeron {contadorLinea} lineas completas")