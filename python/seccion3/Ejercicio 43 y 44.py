# Código de ejemplo

# funcion


'''def mayor_de_dos(x, y):
    if x > y:
        return x
    else:
        return y


# funcion
def mayor_de_tres(x, y, z):
    if mayor_de_dos(x, y) == x:
        if mayor_de_dos(x, z) == x:
            return x
        else:
            return z
    else:
        if mayor_de_dos(y, z) == y:
            return y
        else:
            return z


n1 = int(input("Primer número:"))
n2 = int(input("Segundo número:"))
n3 = int(input("Tercer número:"))
print(mayor_de_tres(n1, n2, n3))'''

# Un programa puede tener una cantidad ilimitada de funciones y éstas pueden llamarse desde cualquier parte del
# programa, incluso desde dentro de otras funciones. También es posible llamar a una misma función más de una vez,
# incluso pasándole diferentes datos como argumentos.
# Cada función tiene su propio espacio de memoria, por lo que las variables creadas dentro de ella no existen dentro
# del resto del programa. Es por esto que podrían utilizarse los mismos nombres para variables en diferentes funciones,
# pero representarán datos diferentes. Además, aunque el valor de los parámetros se modifique, ésto no modificará los
# valores de los argumentos en la llamada a la función. Es por esto que se suele decir que los parámetros son datos
# “de entrada” y el valor de retorno es un dato “de salida”.

# 43
# Escribí un programa que permita al usuario ingresar números enteros. La repetición terminará cuando el usuario
# ingrese un número para el cual la suma de sus dígitos sea mayor que 1000 ó múltiplo de 5. Finalmente, mostrar
# cuántos números impares ingresó el usuario antes de cortar la repetición. Reutilizar las funciones esPar y
# sumatoriaDigitos implementadas en los ejercicios anteriores.


# funcion sumatoria de digitos


'''def suma_digitos(num):
    total_digitos = 0
    while num != 0:
        ultimo_digito = num % 10
        total_digitos += ultimo_digito
        num //= 10
    return total_digitos < 10

# codicion


def condicion(num):
    return num % 5 != 0 and suma_digitos(num)


# funcion es_par


def es_impar(num):
    return num % 2 != 0


# Principal
num = int(input('Digite un número entero: '))
cant_impar = 0
while condicion(num):
    if es_impar(num):
        cant_impar += 1
    num = int(input('Digite un número entero: '))
print('Cantidad de impares: ', cant_impar)'''

# 44
# Escribí una función que reciba un string y retorne True si es un palíndromo (esto es, si se lee igual de izquierda
# a derecha o de derecha a izquierda), False en caso contrario. Utilizar esta función en un programa que permita al
# usuario ingresar palabras hasta que ingrese la palabra “fin” (suponer que todas las palabras son en minúsculas o
# todas en mayúsculas, de forma consistente). Al finalizar, mostrar la cantidad de palíndromos ingresados.

# Función paliandromo


def paliandromo(palabra):
    palabra_al_revez = ""
    for i in range(1, len(palabra)+1):
        palabra_al_revez = palabra_al_revez + palabra[len(palabra)-i]

    if palabra_al_revez == palabra:
        return True
    else:
        return False

# ota forma de para definir si es poliandromo o no


"""def palindromo(palabra):
    if len(palabra) == 1:
        return True
    else:
        i = 0
        d = len(palabra)-1
        while d > i:
            if palabra[i] != palabra[d]:
                return False
            i = i+1
            d = d-1
        return True"""
# principal


palabra = input("Palabra: ")
cant_paliandromo = 0
while palabra != 'fin':
    if paliandromo(palabra):
        cant_paliandromo += 1
    palabra = input('Palabra:')
print("Cantidad de palabrs paliandromas: ", cant_paliandromo)

































