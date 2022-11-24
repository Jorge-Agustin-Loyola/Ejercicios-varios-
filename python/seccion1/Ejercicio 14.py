# 14
# Escribí un programa que, dada una cadena de texto por el usuario, imprima True
# si la cantidad de caracteres en la cadena es un número impar, o False si no lo es

texto = input("Digite un texto: \n")
print(f"cantidad de caracteres que tiene el texto: {len(texto)}")
print("Es par el numero de caracteres: ", len(texto) % 2 == 0)

