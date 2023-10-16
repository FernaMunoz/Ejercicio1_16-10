# Evidencia1
Codigo
Nombre: Fernanda Muñoz
Explicacion del codigo 

Primero el usuario va a ingresar su nombre, el destino al que quiere ir y la distancia de este, el cual esta en kilometros por hora


![image](https://github.com/FernaMunoz/Evidencia1/assets/142464144/754ce60f-8dd2-4344-adf4-1311eeada780)


Despues hay un menu de opciones, donde estan los vehiculos a escoger, los cuales son, entre un auto, motocicleta o una bicicleta.


![image](https://github.com/FernaMunoz/Evidencia1/assets/142464144/3d86b7f9-061e-4dfe-8a2f-f2c150bf2846)


Ahora con las opciones pasamos al metodo tiempoRecorrido, de la clase TiempoVehiculo, que ahi se haran todos los calculos de cuanto tiempo recorre los vehiculos para llegar a su destino, para asi decidir cual tarda menos en llegar.

En este metodo, estan las velocidades de cada uno de los vehiculos, mediante la opcion que escogamos tendra que resolver el tiempo que tarda en recorrer el destino con la velocidad del vehiculo.
Se sabe que para calcular la veñlocidad es el desplazamiento dividido por el tiempo, siendo el tiempo nuestra incognita la ecuacion queda:

Tiempo = desplazamiento(distancia) / velocidad del vehiculo(km/h)

Para cada vehiculo tendra una velocidad especifica


![image](https://github.com/FernaMunoz/Evidencia1/assets/142464144/ca09ec5c-1b9c-4149-86b4-9e78c2349ecc)


Un ejemplo: Si el usuario anota la distancia y escoge auto, con esta opcion se calculara el tiempo con la distancia/velocidadAuto y ahi te dara el resultado del tiempo que tardara si viaja en auto.

Por lo tanto el metodo tiempoRecorrido sirve para hacer los calculos del tiempo para cada vehiculo, osea retorna el tiempo en horas.


![image](https://github.com/FernaMunoz/Evidencia1/assets/142464144/0a4ed856-1d9f-4b57-b0e0-da4c48895741)


Volviendo al menu esta el metodo getVehiculo, este es un método privado que toma un número de opción y devuelve una cadena que representa el vehículo seleccionado. Se utiliza para mostrar el nombre del vehículo en el mensaje de salida.

Por ultimo, como parte final con todas las variables y calculos realizados se mostrara un mensaje que contiene:

"Hola " + nombre + " , el tiempo de viaje aproximado para llegar a: " + destino + " en " + vehiculo +(mediante el metodo getVehiculo) ", es de: " + tiempo (Con el metodo tiempoRecorrido)


![image](https://github.com/FernaMunoz/Evidencia1/assets/142464144/146e5a2b-b912-499f-b315-2a77f840e69c)


Relaciones de dependencia:

En el menu se llama al metodo tiempoRecorrido se utilizan las variables de opcion y distancia que estan en el menu.
Por lo que al tener estas variables se puede calcular el tiempo donde este va de nuevo al menu, ya que este lo llama.


![image](https://github.com/FernaMunoz/Evidencia1/assets/142464144/cca32541-84ac-4258-ada2-b869a2c16095)


![image](https://github.com/FernaMunoz/Evidencia1/assets/142464144/3253debb-2cca-4c55-be9b-dcec315ea8f8)


![image](https://github.com/FernaMunoz/Evidencia1/assets/142464144/da0d279b-c6c0-418e-8a54-03725af367b5)



Codigo funcionando:
Ejemplo: Opcion auto


![image](https://github.com/FernaMunoz/Evidencia1/assets/142464144/58178959-15b1-4bac-9c4e-b48ee274b301)


![image](https://github.com/FernaMunoz/Evidencia1/assets/142464144/0d1c43e1-92a7-46f1-b004-354ed33aace9)


El codigo cuenta con las pruebas unitarias en una rama aparte

Actualización: agregue que preguntara en bucle
do 
while true





