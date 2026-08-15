# Parte C — Modelado (Análisis)

## Dominio elegido: Tienda

Para este ejercicio pensé en cómo funciona una tienda normal, con sus productos, sus clientes y las ventas que se hacen. De ahí saqué tres clases que representan las partes más importantes de ese negocio.

## Clase 1: Producto

**Atributos:**
- nombre
- precio
- cantidadEnStock

**Métodos:**
- actualizarStock(): cambia la cantidad disponible cuando se vende o se recibe mercancía.
- calcularPrecioConDescuento(): calcula el precio si el producto tiene una rebaja.

**Qué abstraje:**
Un producto en la vida real puede tener muchísimos detalles, como el color, el material, el proveedor que lo fabricó, la fecha exacta en que llegó a la bodega, o incluso el peso exacto. Para lo que necesito, que es solo llevar un control básico de qué se vende y cuánto queda, no me sirve tener toda esa información. Por eso me quedé solo con el nombre, el precio y la cantidad disponible, y dejé fuera todo lo demás porque no le aporta nada al propósito del sistema.

## Clase 2: Cliente

**Atributos:**
- nombre
- correo
- historialCompras

**Métodos:**
- registrarCompra(): agrega una nueva compra al historial del cliente.
- verHistorial(): muestra todas las compras que ha hecho.

**Qué abstraje:**
Un cliente real tiene muchísima información personal, como su edad, su dirección exacta, su número de cédula, sus gustos, o incluso su estado civil. Para esta tienda, lo único que realmente importa es poder identificarlo (nombre y correo) y saber qué ha comprado antes. Toda la otra información la dejé fuera porque no es necesaria para que la tienda funcione ni para llevar el registro de ventas.

## Clase 3: Venta

**Atributos:**
- fecha
- producto
- cantidad

**Métodos:**
- calcularTotal(): calcula cuánto cuesta la venta según el precio del producto y la cantidad comprada.
- generarFactura(): crea un resumen de la compra para el cliente.

**Qué abstraje:**
Una venta real podría incluir detalles como el método de pago exacto, el empleado que atendió, la hora exacta al segundo, o el tipo de bolsa que se usó para empacar. Para este análisis, lo importante es simplemente saber qué se vendió, cuándo y en qué cantidad, porque con eso ya se puede calcular el total y generar la factura. El resto de detalles los dejé fuera porque complicarían el modelo sin aportar algo esencial a lo que quiero lograr.

## Conclusión

Al hacer este ejercicio me di cuenta de que abstraer no es simplemente "no poner mucha información", sino pensar bien qué es lo que realmente necesita mi programa para funcionar, y dejar de lado todo lo que en la vida real existe pero que no le sirve al propósito que estoy buscando.