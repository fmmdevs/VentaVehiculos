Proyecto de Venta de Vehículos
Este proyecto consiste en el desarrollo de una aplicación para la venta de vehículos. Se han definido varias clases que permitirán modelar los diferentes tipos de vehículos que se manejarán en el sistema.

Clase Vehiculo
La clase abstracta Vehiculo es la clase base para todos los tipos de vehículos y tiene los siguientes atributos:

marca y modelo: ambos de tipo String.
añoFabricacion, kms y potencia: de tipo entero.
precio: de tipo real.
combustible: de tipo TipoCombustible (enumerado).
medidas: de tipo Medidas.
La clase Vehiculo proporciona los siguientes métodos:

Constructor por defecto, con parámetros y de copia.
Getters y Setters.
hashCode y equals.
toString.
getPotenciaKW(): devuelve la potencia del vehículo en kilovatios (1 kW = 1.34 CV).
El enumerado TipoCombustible contiene las opciones de diésel, gasolina, híbrido, eléctrico y GLP.

Clase Medidas
La clase Medidas tiene los atributos alto, ancho y largo, junto con los siguientes métodos:

Constructor por defecto, con parámetros y de copia.
Getters y Setters.
hashCode y equals.
toString.
Clase Moto
La clase Moto hereda de la clase Vehiculo y tiene un atributo adicional numRuedas. Esta subclase proporciona los siguientes métodos:

Constructor por defecto, con parámetros y de copia.
Redefinición de los métodos necesarios de la clase padre.
Clase Turismo
La clase Turismo hereda de la clase Vehiculo y tiene un atributo adicional tipoCarroceria. Esta subclase proporciona los siguientes métodos:

Constructor por defecto, con parámetros y de copia.
Redefinición de los métodos necesarios de la clase padre.
Clase Industrial
La clase Industrial hereda de la clase Vehiculo y tiene un atributo adicional tamañoCaja en metros cúbicos. Esta subclase proporciona los siguientes métodos:

Constructor por defecto, con parámetros y de copia.
Redefinición de los métodos necesarios de la clase padre.
Implementación de la interfaz Camperizable, que permite convertir un vehículo industrial en un camper.
Clase Usuario
La clase Usuario tiene los atributos nombre, apellido, provincia y fechaNacimiento. Un usuario puede guardar en la aplicación su coche para ponerlo a la venta (miCoche) y puede tener un vector de hasta 3 coches que le interesan (favoritos). Esta clase proporciona los siguientes métodos:

Constructor por defecto, con parámetros y de copia.
Getters y Setters.
hashCode y equals.
toString.
Conclusiones
Este proyecto establece las bases para una aplicación de venta de vehículos, donde se han definido las clases necesarias para modelar los diferentes tipos de vehículos y los usuarios del sistema. Con estas clases, se puede almacenar la información relevante de los vehículos y realizar operaciones relacionadas con la venta y búsqueda de coches.
