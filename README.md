# PicoPlacaPredictorMaven
Proyecto que notifica si tienes pico y placa de acuerdo a cadenas de caracteres

Este proyecto es un "Java Project" con maven

El código fuente se encuentra en la carpeta "codigo"
* Herramientas utilizadas
	Eclipse Luna/Jboss Studio (Puede utilizarse cualquier Eclipse que permita insertar el JDK 1.8)
	Maven 3.0.5 (o superior)
	
* Requerimientos
	Jdk 1.8 Mínimo (Desarrollo y ejecución)
	Eclipse Luna Mínimo (Desarrollo)
	Maven 3.0.5 (Empaquetado)
	

-----------------------Crear archivo ".jar" con Maven-----------------------------------

Prerrequisito:
	Tener configurado e instalado MAVEN
	
1.- Abrir una consola de línea de comandos y colocarse en el directorio raíz del proyecto
     
	   #>cd \PicoPlacaPredictorMaven\codigo 
	   
2.- Luego ejecutar la siguiente sentencia
       
	   \PicoPlacaPredictorMaven\codigo#> maven clean
	   
	   \PicoPlacaPredictorMaven\codigo#> maven install
	   
3.- El archivo "PicoPlacaPredictorMaven-0.0.1-SNAPSHOT.jar" se genera dentro del directorio "target"

4.- Para ejecutar las pruebas de junit utilizamos la siguiente sentencia
		
		\PicoPlacaPredictorMaven\codigo#> maven test

-----------------Ejecución de archivos ".jar"  desde la línea de comandos---------------

Para su ejecución se crearon archivos ".jar" los cuales se encuentran en la carpeta "executable"

* Ejecutar el ".jar"
  - Abrir una consola de línea de comandos 
  - En la ventana de línea de comando ejecutar :
  
		(Si tiene configuradao el JAVA_HOME)
		
	    #>  java -jar C:\PicoPlacaPredictorMaven\target\PicoPlacaPredictorMaven-0.0.1-SNAPSHOT.jar
		
		(Si no tiene configurado el JAVA_HOME, pero si instalado el JDK 1.8)
		
		\Java\jdk1.8.0_40\bin> java -jar C:\PicoPlacaPredictorMaven\target\PicoPlacaPredictorMaven-0.0.1-SNAPSHOT.jar

		
Opcional en el repositorio se encuentra un directorio "executable" donde se encuentra el jar "PicoPlacaPredictorMaven-0.0.1-SNAPSHOT.jar"

-----------------------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------------------------------

#PicoPlacaPredictorMaven
Project that notifies you if you have pico and plate according to strings

This project is a "Java Project" with maven

The source code is in the folder "code"
* Used tools
Eclipse Luna / Jboss Studio (You can use any Eclipse that allows you to insert the JDK 1.8)
Maven 3.0.5 (or higher)

* Requirements
Jdk 1.8 Minimum (Development and execution)
Eclipse Moon Minimum (Development)
Maven 3.0.5 (Packaging)


----------------------- Create ".jar" file with Maven ------------------- ----------------

Prerequisite:
Have MAVEN configured and installed

1.- Open a command line console and place it in the root directory of the project
     
		#>cd \PicoPlacaPredictorMaven\codigo 

2.- Then execute the following sentence
       
		\PicoPlacaPredictorMaven\codigo#> maven clean
	   
	    \PicoPlacaPredictorMaven\codigo#> maven install

3.- The file "PicoPlacaPredictorMaven-0.0.1-SNAPSHOT.jar" is generated inside the directory "target"

4.- To execute the tests of junit we use the following sentence

	   \PicoPlacaPredictorMaven\codigo#> maven test

----------------- Running ".jar" files from the command line ---------------

For its execution ".jar" files were created which are in the folder "executable"

* Execute the ".jar"
  - Open a command line console
  - In the command line window run:
  
(If you have JAVA_HOME configured)

		#>  java -jar C:\PicoPlacaPredictorMaven\target\PicoPlacaPredictorMaven-0.0.1-SNAPSHOT.jar

(If you do not have JAVA_HOME configured, but JDK 1.8 is installed)

		\Java\jdk1.8.0_40\bin> java -jar C:\PicoPlacaPredictorMaven\target\PicoPlacaPredictorMaven-0.0.1-SNAPSHOT.jar


Optional in the repository is an "executable" directory where the jar "PicoPlacaPredictorMaven-0.0.1-SNAPSHOT.jar"