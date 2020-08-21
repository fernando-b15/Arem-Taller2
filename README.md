# Arem-Taller2

Este taller fue hecho para afianzar el uso del framework spark para desarrollar aplicaciondes web de forma mas sencilla y ligera,esta pagina web 
sera la encagada de realizar las operaciones aritmeticas como lo son la media y la desviacion estandar capturando los datos para las operaciones desde la pagina web 
y asi mismo tambien mostrar el resultado de las operaciones en la pagina web,en este taller haremos uso de la linkedlist que se implemento  en el 
derarollaro del taller 1.

# Pre-Requisitos

Para el uso de la aplicacion se requiere que el computador tenga instalados los siguientes prerequisitos:

   * Java 8
   * Maven
   * Git

# Despliegues

[![CircleCI](https://circleci.com/gh/fernando-b15/Arem-Taller2.svg?style=svg&circle-token=091a112cbc7cd06257be07fdf15ddcb667a4eb63)](https://app.circleci.com/pipelines/github/fernando-b15/Arem-Taller2/1/workflows/89b14390-02d8-4ec5-8c6e-6ee06d754e09)

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://arem-taller2.herokuapp.com/)

# Instalacion

Para comenzar la instalacion porfavor copie el siguiente comando en su linea de comandos :

~~~
git clone https://github.com/fernando-b15/Arem-Taller2
~~~

Posteriormente desde linea comandos ingrese al directorio de la aplicacion con el siguinete comando :

![image3](https://github.com/fernando-b15/Arem-Taller2/blob/master/img/clone.PNG)

~~~
cd Arem-Taller2
~~~

Ahora para realizar la compilacio y empaquetacion de la aplicacion ,ingrese el siguinete comando:

~~~
mvn package
~~~

![image1](https://github.com/fernando-b15/Arem-Taller2/blob/master/img/package.PNG)

# Pruebas

Para realizar la pruebas asociadas a la aplicacion ,ingrese el siguiente codigo

~~~
mvn test
~~~

![image2](https://github.com/fernando-b15/Arem-Taller2/blob/master/img/test.PNG)

# Documentacion

Para obtener la documentacion de la aplicacion , ingrese el siguinete codigo

~~~
mvn javadoc:javadoc
~~~

![image6](https://github.com/fernando-b15/Arem-Taller2/blob/master/img/javadoc.PNG)

para acceder a la documentacion de la apliacacion ingrese al siguiente enlace [apidocs](https://github.com/fernando-b15/Arem-Taller2/tree/master/apidocs) 

# Ejecucion

Para la ejecucion del programa desde linea de comandos windows, ingrese el siguinete codigo:

~~~
java -cp target/classes;target/dependency/* edu.escuelaing.arem.SparkWebApp
~~~

![image4](https://github.com/fernando-b15/Arem-Taller2/blob/master/img/run.PNG)

Pero si desea hacer la compilacion desde kernel linux ,ingrese el siguinete codigo: 

~~~
java  $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arem.SparkWebApp
~~~

![image5](https://github.com/fernando-b15/Arem-Taller2/blob/master/img/web1.PNG)

# Informe del taller

Para conocer mas a fondo el desarrollo del taller acceda al [Informe](https://github.com/fernando-b15/Arem-Taller2/blob/master/Arem_Taller2.pdf)

# Licencia

La aplicacion cuenta con la siguiente [MIT LICENCE](https://github.com/fernando-b15/Arem-Taller2/blob/master/LICENSE) 

# Autor

   * [Fernanado Barrera Barrera](https://github.com/fernando-b15) :guitar:

