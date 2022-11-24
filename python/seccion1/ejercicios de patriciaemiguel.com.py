# Codigo de ejemplo
"""
cadena = ""
cadena = cadena + "Buen"
cadena = cadena + " dia."
print(cadena)
"""
# Ejercicio 8

# Escribir un programa que solicite al usuario el ingreso de dos palabras, las
# cuales se guardarán en dos variables distintas. A continuación, almacená en una
# variable la concatenacion de la primera palabra, más un espacio, más la segunda
# palabra. Mostrar este resultado en la pantalla.

"""
primeraPalabra = input("Primera palabra: ")
segundaPalabra = input("Segunda palabra: ")
print(primeraPalabra + " " + segundaPalabra)
"""
# codigo de ejemplo
"""
frase = "Estoy programando"
print(frase[0])
i = 4
print(frase[i])
"""
# El operador [ ] (corchetes) permite obtener un carácter a partir de un string. La posición del carácter se indica
# entre los corchetes, ya sea ingresando directamente el número, con una variable que contenga un número o con una
# operación que de como resultado un número. Siempre, el primer carácter de un string estará ubicado en la posición 0.
"""
print(len(frase))
ultimo_caracter = frase[len(frase)-1] # menos uno porque empieza acontar desde cero
print(ultimo_caracter)
"""
# Mediante len() podemos obtener la cantidad de caracteres que contiene un string. Este valor siempre será un número
# entero (tipo int) y puede guardarse en una variable, imprimirse, usarse en una operación aritmética, etc
"""
"""
# Ejercicio 9
# Escribí un programa que solicite al usuario el ingreso de un texto y almacene ese texto en una variable.
# A continuación, mostrar en pantalla la primera letra del texto ingresado. Luego, solicitar al usuario que ingrese
# un número positivo menor a la cantidad de caracteres que tiene el texto que ingresó (por ejemplo, si escribió
# la palabra “HOLA”, tendrá que ser un número entre 0 y 4) y almacenar este número en una variable llamada indice.
# Mostrar en pantalla el carácter del texto ubicado en la posición dada por indice.
texto = input("Dijite un texto:\n")
print(f"La primera letra del texto es: {texto[0]}")
indice = int(input(f"digite un numero positivo menor a {len(texto)}\n"))
print(f'El caracter en esa posición es: {texto[indice]}')