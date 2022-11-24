# Código de ejemplo

# La repetición while ejecutará el bloque siempre que la condición sea True. En el ejemplo anterior, se repetirá el
# bloque mientras los strings ingresados tengan longitud 1 (un único carácter) y la repetición finalizará cuando se
# ingrese un string con longitud diferente a 1 (ya sea un string vacío o uno que tenga más de 1 carácter).

"""cantidad=0
caracter=input("Carácter:")
while len(caracter) != 1:
    cantidad=cantidad+1
    caracter=input("Carácter:")"""

# En este segundo ejemplo se repetirá el bloque mientras los strings ingresados tengan longitud diferente de 1 y
# la repetición finalizará cuando se ingrese un único carácter.

# 34
# Escribí un programa que pregunte al usuario si desea analizar calificaciones de alumnos y, sólo si responde “S”
# comenzará el procesamiento de los datos, hasta que el usuario ingrese algo diferente de “S”. Por cada alumno,
# permitir ingresar su calificación. Si es mayor a 4 el alumno está aprobado. Finalmente, mostrar “Porcentaje de
# alumnos aprobados: x %” (donde x es el porcentaje de aprobados sobre el total de calificaciones procesadas).
# También se debe imprimir “Promedio de los aprobados: y” (donde y es la calificación promedio, sólo de los alumnos
# aprobados).
condicionWhile = input('Digite "S" si quiere comenzar procesamiento de datos: ')
cantAprobados = 0
sumaAprobados = 0
cantCalificaciones = 0
porcentajeAprobados = 0
promedioAprobados = 0

while condicionWhile == "S" or condicionWhile == "s":
    calificacion = float(input("Digite calificacion: "))
    cantCalificaciones += 1
    if calificacion > 4:
        cantAprobados += 1
        sumaAprobados += calificacion
        porcentajeAprobados = (cantAprobados * 100) / cantCalificaciones
        promedioAprobados = sumaAprobados / cantAprobados
    condicionWhile = input('Digite "S" para agregar otra calificacion o cualquier otra tecla para salir: ')
if cantAprobados > 0:
    print(f'''
            Porcentaje de alumnos aprobados: {porcentajeAprobados}
            Calificacion promedio entre los aprobados: {promedioAprobados}
    ''')
else:
    print("No hay datos para analizar o no hay alumnos aprobados")
