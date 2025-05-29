# Preparación PSP 3

Este repositorio contiene ejercicios y ejemplos de programación de sistemas y procesos (PSP), con foco en comunicación de red utilizando sockets UDP en Java.

---

## 🚀 Contenido del Repositorio

A continuación, se presenta un índice de los ejercicios organizados por paquetes, facilitando la navegación y el acceso a cada implementación.

### 📦 [Ejercicio_UDP_Coches](https://github.com/MateoCarballo/Preparacion_PSP_3/tree/main/Ejercicio_UDP_Coches)

Este paquete contiene clases que demuestran la serialización y deserialización de objetos `Coche` para su envío a través de sockets UDP.

* [`Coche.java`](https://github.com/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Coches/Coche.java): Clase que representa un coche, incluyendo métodos de serialización (`Serializable`) y un `toString()` vistoso para su representación.
* [`Cliente.java`](https://github.com/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Coches/Cliente.java): Implementa un cliente UDP que serializa y envía objetos `Coche` al servidor.
* [`Server.java`](https://github.com/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Coches/Server.java): Implementa un servidor UDP que recibe y deserializa objetos `Coche` enviados por el cliente.

### 📦 [Ejercicio_UDP_Numeros](https://github.com/MateoCarballo/Preparacion_PSP_3/tree/main/Ejercicio_UDP_Numeros)

Este paquete incluye ejemplos de cómo enviar y recibir tipos de datos primitivos (`int`) a través de sockets UDP.

* [`ClienteEnviarInt.java`](https://github.com/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Numeros/ClienteEnviarInt.java): Cliente UDP que demuestra el envío de un valor entero al servidor.
* [`ServidorRecibirInt.java`](https://github.com/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Numeros/ServidorRecibirInt.java): Servidor UDP que recibe y procesa el valor entero enviado por el cliente.

### 📦 [Ejercicio_UDP_Productos](https://github.com/MateoCarballo/Preparacion_PSP_3/tree/main/Ejercicio_UDP_Productos)

Este paquete se centra en la comunicación bidireccional entre cliente y servidor UDP, donde el cliente solicita información de un producto y el servidor responde con los detalles.

* [`Producto.java`](https://github.com/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Productos/Producto.java): Clase que representa un producto con ID, precio y cantidad. Incluye métodos para generar listas de productos de prueba.
* [`ClienteProducto.java`](https://github.Bcom/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Productos/ClienteProducto.java): Cliente UDP que solicita información de un producto por ID al servidor y recibe su precio total.
* [`ServidorProducto.java`](https://github.com/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Productos/ServidorProducto.java): Servidor UDP que gestiona un inventario de productos, recibe solicitudes por ID y responde con el precio total.

### 📦 [Ejercicio_UDP_Strings](https://github.com/MateoCarballo/Preparacion_PSP_3/tree/main/Ejercicio_UDP_Strings)

Este paquete ofrece diferentes métodos para el envío y recepción de cadenas de texto (`String`) utilizando UDP.

* [`ClienteEnviarString_A.java`](https://github.com/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Strings/ClienteEnviarString_A.java): Cliente UDP que envía cadenas de texto utilizando `DataOutputStream.writeUTF()`.
* [`ServidorRecibirString_A.java`](https://github.com/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Strings/ServidorRecibirString_A.java): Servidor UDP que recibe cadenas de texto enviadas con `DataOutputStream.writeUTF()`.
* [`ClienteEnviarString_B.java`](https://github.com/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Strings/ClienteEnviarString_B.java): Cliente UDP que envía cadenas de texto directamente como bytes (`String.getBytes()`).
* [`ServidorRecibirString_B.java`](https://github.com/MateoCarballo/Preparacion_PSP_3/blob/main/Ejercicio_UDP_Strings/ServidorRecibirString_B.java): Servidor UDP que recibe cadenas de texto enviadas directamente como bytes.

---

## ℹ️ ¿Cómo usar este repositorio?

1.  **Clona el repositorio:**
    ```bash
    git clone [https://github.com/MateoCarballo/Preparacion_PSP_3.git](https://github.com/MateoCarballo/Preparacion_PSP_3.git)
    ```
2.  **Abre el proyecto:** Importa el repositorio en tu IDE Java favorito (IntelliJ IDEA, Eclipse, VS Code, etc.).
3.  **Compila y ejecuta:** Navega a la clase `main` de cada ejercicio (generalmente en las clases `Cliente` o `Server`) y ejecútalas. Recuerda que para los ejemplos cliente/servidor, **siempre debes iniciar el servidor primero**.

---