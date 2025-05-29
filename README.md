# Preparación PSP 3

Este repositorio contiene ejercicios y ejemplos de programación de sistemas y procesos (PSP), con foco en comunicación de red utilizando sockets UDP en Java.

---

## 🚀 Contenido del Repositorio

A continuación, se presenta un índice de los ejercicios organizados por paquetes, facilitando la navegación y el acceso a cada implementación.

### 📦 Ejercicio_UDP_Coches

Este paquete contiene clases que demuestran la serialización y deserialización de objetos `Coche` para su envío a través de sockets UDP.

* `Coche.java`: Clase que representa un coche, incluyendo métodos para su serialización (`Serializable`) y un método `toString()` para una representación legible.
* `Cliente.java`: Implementa un cliente UDP que se encarga de serializar y enviar objetos `Coche` al servidor.
* `Server.java`: Implementa un servidor UDP que recibe y deserializa objetos `Coche` enviados por el cliente.

### 📦 Ejercicio_UDP_Numeros

Este paquete incluye ejemplos de cómo enviar y recibir tipos de datos primitivos (`int`) a través de sockets UDP.

* `ClienteEnviarInt.java`: Cliente UDP que muestra cómo enviar un valor entero al servidor.
* `ServidorRecibirInt.java`: Servidor UDP que recibe y procesa el valor entero enviado por el cliente.

### 📦 Ejercicio_UDP_Productos

Este paquete se centra en la comunicación bidireccional entre cliente y servidor UDP, donde el cliente solicita información de un producto y el servidor responde con los detalles.

* `Producto.java`: Clase que representa un producto con un identificador, precio y cantidad. Incluye métodos para generar listas de productos de prueba.
* `ClienteProducto.java`: Cliente UDP que solicita información de un producto por su ID al servidor y recibe a cambio su precio total.
* `ServidorProducto.java`: Servidor UDP que gestiona un inventario de productos, recibe solicitudes por ID y responde con el precio total correspondiente.

### 📦 Ejercicio_UDP_Strings

Este paquete ofrece diferentes métodos para el envío y recepción de cadenas de texto (`String`) utilizando UDP.

* `ClienteEnviarString_A.java`: Cliente UDP que envía cadenas de texto utilizando el método `DataOutputStream.writeUTF()`.
* `ServidorRecibirString_A.java`: Servidor UDP que recibe cadenas de texto enviadas con el método `DataOutputStream.writeUTF()`.
* `ClienteEnviarString_B.java`: Cliente UDP que envía cadenas de texto directamente como un arreglo de bytes (`String.getBytes()`).
* `ServidorRecibirString_B.java`: Servidor UDP que recibe cadenas de texto enviadas directamente como bytes.

---

## ℹ️ ¿Cómo usar este repositorio?

1.  **Clona el repositorio:**
    ```bash
    git clone [https://github.com/MateoCarballo/Preparacion_PSP_3.git](https://github.com/MateoCarballo/Preparacion_PSP_3.git)
    ```
2.  **Abre el proyecto:** Importa el repositorio en tu IDE Java favorito (IntelliJ IDEA, Eclipse, VS Code, etc.).
3.  **Compila y ejecuta:** Navega a la clase `main` de cada ejercicio (generalmente en las clases `Cliente` o `Server`) y ejecútalas. Recuerda que para los ejemplos cliente/servidor, **siempre debes iniciar el servidor primero**.

---