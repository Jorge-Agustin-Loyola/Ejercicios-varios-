# Codigo de ejemplo
print(58273 % 10)
print(58273 // 10)
# La primera instrucción imprimirá el número 3, ya que es el resto de la división de 58273
# por 10. La segunda instrucción imprimirá 5827, ya que es la parte entera del resultado
# de dividir 58273 por 10. Estas operaciones matemáticas son estrategias que se pueden
# utilizar para obtener partes de un número.


# 11
# Escribí un programa que le solicite al usuario ingresar una fecha formada por 8 números,
# donde los primeros dos representan el día, los siguientes dos el mes y los últimos cuatro
# el año (DDMMAAAA). Este dato debe guardarse en una variable con tipo int (número entero).
# Finalmente, mostrar al usuario la fecha con el formato DD / MM / AAAA.
fecha = int(input("digite la fecha DDMMAAAA"))
año = fecha % 10000
dia = fecha // 1000000
mes = (fecha // 10000) % 100
print(dia, "/", mes, "/", año)
