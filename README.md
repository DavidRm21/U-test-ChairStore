
# Documentación programa de venta de sillas

###### Repaso programación estructura de datos II

<br>

## Contenido
---

  - [1. Enunciado](#1-enunciado)
  - [2. Análisis del problema](#2-análisis-del-problema)
  - [3. Representación de las funcionalidades del problema.](#3-representación-de-las-funcionalidades-del-problema)
  - [4. Diseñando el diagrama de flujo](#4-diseñando-el-diagrama-de-flujo)
  - [5. Implementando en pseudocódigo](#5-implementando-en-pseudocódigo)

<br>
<br>
<br>
<br>
<br>

## 1. Enunciado
---

Se necesita desarrollar un programa que permita aplicar descuentos a la compra de sillas de acuerdo a ciertas condiciones específicas. El programa será utilizado por una tienda de sillas que vende 3 tipos de sillas: sillas de auditorio, sillas ergonómicas y sillas para invitados.

El programa deberá aplicar a la compra realizada las siguientes condiciones:

- Por la compra de 100 unidades se aplicara un descuento del 8%.
- Por la compra de 350 unidades se aplicara un descuento del 20%.
- Por la compra de 800 unidades se aplicara un descuento del 30%.

Adicionalmente, el programa deberá solicitar los datos del comprador, incluyendo su nombre, apellidos, dirección, teléfono, empresa(Si este aplica) y su número de NIT.

<br>
<br>
<br>

## 2. Análisis del problema
---

Para análizar el problema se utilizó la plataforma online de [**Jira**](https://www.atlassian.com/es/software/jira) y la técnica para la gestión de proyectos de desarrollo de software "**Historia de Usuario**" que permite describir de manera detallada el comportamiento del sistema desde el punto de vista del cliente final.

En la siguiente imagen estan los diferentes escenarios que el cliente final va a encontrar al ejecutar el programa:

![Historia de usuario I|400](./img/Hus1.jpg)

<details>
    <summary><b>💡 ¿Qué es Jira Software </b></summary>
    <p>

> Jira Software es una herramienta de gestión de proyectos de software desarrollada por Atlassian. Jira Software está diseñado específicamente para equipos de desarrollo de software, y proporciona una plataforma de seguimiento y gestión de tareas que ayuda a los equipos a planificar, realizar un seguimiento y gestionar proyectos ágiles de software.
>
> Jira Software también permite la integración con otras herramientas de desarrollo de software, como Bitbucket, GitHub, Bamboo y otras, lo que facilita la gestión de todo el ciclo de vida del desarrollo de software desde una única plataforma.
>
> Es una herramienta muy útil para equipos de desarrollo de software que buscan una plataforma de gestión de proyectos ágiles que les permita planificar, hacer un seguimiento y gestionar sus proyectos de manera efectiva y colaborativa.

</p>
</details>

<details>
    <summary><b>💡 ¿Que es historia de Usuario?</b></summary>
    <p>

> Es una técnica utilizada en el desarrollo de software para describir las necesidades y requerimientos del **usuario final**. Una historia de usuario es una descripción corta y simple de una funcionalidad o característica deseada por el usuario y que se desea implementar en el software. 
> 
>> <details>
>>    <summary><b>💡 Given-When-Then </b></summary>
>>    <p>
>>
>> Los elementos de ***Given When Then***, estos se utilizan para escribir criterios de aceptación específicos para una historia de usuario. Cada elemento tiene un propósito específico en la descripción de la funcionalidad deseada:
>>
>> 1. **Given:** (*Dado*) Describe el **contexto** o estado inicial necesario para que la funcionalidad descrita en la historia de usuario tenga lugar.
>>
>> 2. **When:** (*Cuando*) Describe la **acción o evento** que debe ocurrir para que se active la funcionalidad descrita en la historia de usuario.
>>
>> 3. **Then:** (*Entonces*)Describe el **resultado esperado** de la funcionalidad descrita en la historia de usuario.
>>
>> Ejemplo:
>> *Dado* que mi cuenta bancaria es acreedora y no he realizado ningún reintegro recientemente,
>> *Cuando* intento retirar una cantidad inferior al límite de mi tarjeta,
>> *Entonces* la retirada debería completarse sin errores ni advertencias.
>>
>> </p>
>> </details>
>
> Esto permite a los desarrolladores implementar la funcionalidad de manera precisa y asegurarse de que la funcionalidad cumpla con las expectativas del usuario.
>
> </p>
> </details>

<br>
<br>
<br>

## 3. Representación de las funcionalidades del problema.
---

Para representar las funcionalidades del problema se utilizó el [diagrama de casos de uso](https://diagramasuml.com/casos-de-uso/), donde el actor será el cliente final "empleado de caja" y se relaciona con el sistema, el cual cumple la función de calcular el valor a total y el descuento obtenido de acuerdo al número de unidades adquiridas, y posteriormente un resumen del sistema en general, con su actor, nombre del programa, propósito y eventos esperados. 

![Caso de uso|400](./img/CasoUso1.PNG) 

<details>
    <summary><b>💡 ¿Qué es un diagrama de caso de uso? UML </b></summary>
    <p>

> En un diagrama de caso de uso, se describe cómo los usuarios interactúan con el sistema para realizar tareas específicas y qué respuestas ofrece el sistema a estas interacciones.
>
>El diagrama de caso de uso es útil para entender cómo los usuarios interactúan con el sistema y cuáles son las funcionalidades más importantes que deben ser incluidas en el sistema.

</p>
</details>


<br>
<br>
<br>

## 4. Diseñando el diagrama de flujo
---

Para diseñar el diagrama de flujo utilice la herramienta [PSeInt](https://pseint.sourceforge.net/) para representar el algoritmo o flujo de trabajo de manera visual y sencilla de entender. 

En principio se declaran e inicializan las variables y los arreglos, luego se registran los datos del cliente y posteriormente se muestra el menu de categorias, al digitar la categoria requerida mostrará los productos disponibles de la tienda con su nombre y precio, seguidamente se preguntara por el item a comprar y las unidades que necesita, se le preguntará si desea continuar con la compra o finalizar con la compra, al continuar incluira más articulos y al finalizar se le mostrara los datos del cliente, los articulos comprados con su precio y unidades, el valor total, el descuento obtenido y el valor a pagar con el descuento aplicado.  

![Diagrama de flujo|400](./img/seudo.png)

<details>
    <summary><b>💡 ¿Qué es un diagrama de flujo? </b></summary>
    <p>

> Un diagrama de flujo es una representación gráfica de un proceso o algoritmo en el cual se muestran las diferentes etapas, decisiones y acciones que componen dicho proceso. Es una herramienta de diagramación utilizada en programación, análisis de procesos y otras disciplinas para visualizar y documentar el flujo de trabajo.
>
>Un diagram de flujo se compone de un inicio, proceso, decisiones, conectores, flechas y un final.
>
>>![Diagrama de flujo2|400](./img/elementosdf.jpg)
>
> Al utilizar un diagrama de flujo, se puede visualizar de manera clara y concisa el proceso o algoritmo completo, lo que facilita la identificación de errores o posibles mejoras. 

</p>
</details>

<br>
<br>
<br>

## 5. Implementando en pseudocódigo
---

El pseudocódigo a continuación es basado en el diagrama de flujo anterior pero ya no de manera visual si no de manera de un lenguaje parecido al humano y tambien al de un lenguaje programación real.

![Pseudocodigo|400](./img/pseudocodigo.jpg)


<details>
    <summary><b>💡 ¿Qué es un pseudocódigo? </b></summary>
    <p>

> El pseudocódigo es un lenguaje de programación informal que se utiliza para describir un algoritmo de programación. Es una forma de escribir código que es fácil de entender por los programadores, sin la necesidad de conocer un lenguaje de programación específico. 
>
>  El objetivo del pseudocódigo es describir de manera clara y concisa el proceso lógico que sigue un programa sin preocuparse por la sintaxis o detalles específicos del lenguaje de programación.
>
> El pseudocódigo puede ser utilizado como una herramienta de diseño y planificación antes de comenzar la implementación de un programa en un lenguaje de programación real. Además, el pseudocódigo puede ser utilizado para documentar el proceso y como una herramienta de comunicación entre diferentes miembros del equipo de desarrollo.

</p>
</details>






