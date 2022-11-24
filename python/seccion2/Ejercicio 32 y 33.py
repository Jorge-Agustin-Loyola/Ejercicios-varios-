# Código de ejemplo

"""suma = 0
numero = int(input("Número:"))
while numero != 0:
    suma = suma + numero
    numero = int(input("Número:"))
print("Suma de todos los números ingresados:", suma)"""

# Una repetición while necesita una condición (en este ejemplo: numero!=0), que es un valor lógico para saber si
# continúa repitiendo el bloque o no. Si el valor es True, se ejecuta el bloque correspondiente al while; si es False,
# no se ejecuta y continúa el programa con la instrucción siguiente al bloque. El código del ejemplo permite ingresar
# números y cada uno se acumula sumándolo en la variable suma, para luego pedir al usuario un nuevo número.
# Cuando se ingresa el 0, el bloque del while no se ejecuta y pasa directamente a la siguiente instrucción,
# que en este caso es un print que muestra la suma de todos los números ingresados.
# Código de ejemplo

"""numero = int(input("Número:"))
while numero != 0:
    print("Tu número es:", numero)"""

# La repetición anterior contiene un error y es que, si el número ingresado por el usuario es diferente de cero,
# se producirá un bucle infinito que mostrará “Tu número es: [número del usuario]” infinitas veces, sin continuar
# con el resto del programa. Esto es así porque, en las repeticiones while, una vez ejecutado el bloque, se vuelve
# a evaluar la condición y, si es True, vuelve a ejecutar el bloque y nuevamente a evaluar la condición. En el caso
# de ingresar un valor distinto de 0 en la variable numero, si no se permite cambiar ese valor la condición siempre
# comparará el mismo número con el 0 y siempre será True, por lo que nunca dejará de repetir la instrucción print
# dentro del bloque. Para evitarlo, es necesario permitir cambiar el valor de la variable numero:

"""numero = int(input("Número:"))
while numero != 0:
    print("Tu número es:", numero)
    numero = int(input("Número:"))"""

# 32
# Escribí un programa que permita al usuario ingresar los montos de las compras de un cliente (se desconoce la cantidad
# de datos que cargará, la cual puede cambiar en cada ejecución), cortando el ingreso de datos cuando el usuario
# ingrese el monto 0. Si ingresa un monto negativo, no se debe procesar y se debe pedir que ingrese un nuevo monto.
# Al finalizar, informar el total a pagar teniendo que cuenta que, si las ventas superan el monto total de 1000, se le
# debe aplicar un 10% de descuento.
"""monto = float(input("digite un monto: "))
suma = 0
while monto != 0:
    if monto < 0:
        print("Monto negativo no sera procesado")
    else:
        suma += monto

    monto = float(input("digite un nuevo monto: "))
if suma > 1000:
    suma = suma*0.9

print(f"total a pagar: {suma}")"""

# 33
# Escribí un programa que permita al usuario ingresar una cantidad de números positivos indefinida
# (la cantidad que ingresará no se conoce y puede cambiar en cada ejecución), finalizando cuando ingresa el número 0
# (que no se tendrá en cuenta). Una vez terminada la lectura de números, informar cuál fue el mayor de los números
# ingresados.
num = float(input("Digite un numero"))
mayor = num
while num != 0:
    if num > mayor:
        mayor = num
    num = float(input("Digite un numero"))
print(f"El mayor es: {mayor}")





























