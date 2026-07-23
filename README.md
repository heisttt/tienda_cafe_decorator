# Sistema de pedidos para una tienda de café

## Descripción del problema

Una tienda de café ofrece diferentes bebidas base, como espresso, americano y latte. Durante la toma de pedidos, los clientes pueden personalizar sus bebidas agregando ingredientes o complementos, por ejemplo:

* Leche adicional.
* Chocolate.
* Canela.
* Shot extra de café.

Cada complemento modifica la descripción y el precio final de la bebida.

Una posible solución sería crear una clase diferente para cada combinación disponible, como `LatteConChocolate`, `LatteConLeche`, `LatteConChocolateYCanela` o `EspressoConLecheYShotExtra`. Sin embargo, esta solución produciría una gran cantidad de clases y dificultaría agregar nuevos ingredientes.

Además, utilizar múltiples condicionales dentro de una sola clase haría que el código sea difícil de mantener y violaría el principio de responsabilidad única.

## Solución propuesta

Para resolver el problema se aplicará el patrón de diseño estructural **Decorator**.

Este patrón permite agregar nuevas responsabilidades a un objeto de manera dinámica. En este caso, cada ingrediente adicional envolverá a una bebida existente y agregará su propia descripción y costo.

Por ejemplo, para registrar un latte con chocolate y canela se puede realizar la siguiente composición:

```java
Bebida bebida = new Latte();
bebida = new Chocolate(bebida);
bebida = new Canela(bebida);
```

Cada decorador recibe una bebida y modifica el resultado de sus métodos `getDescripcion()` y `getPrecio()`.

## Objetivo

Implementar un sistema que permita:

1. Crear bebidas base.
2. Agregar uno o varios ingredientes.
3. Obtener la descripción completa de la bebida.
4. Calcular automáticamente su precio final.
5. Incorporar nuevos ingredientes sin modificar las clases existentes.

## Patrón aplicado

El patrón **Decorator** está formado por los siguientes elementos:

### Component

La interfaz `Bebida` define las operaciones comunes:

* `getDescripcion()`
* `getPrecio()`

### Concrete Component

Son las bebidas que pueden venderse sin ingredientes adicionales:

* `Espresso`
* `Americano`
* `Latte`

### Decorator

La clase abstracta `IngredienteDecorator` implementa la interfaz `Bebida` y mantiene una referencia a otra bebida.

### Concrete Decorator

Son los ingredientes que modifican una bebida:

* `Leche`
* `Chocolate`
* `Canela`
* `ShotExtra`

### Cliente

La clase `Pedido` utiliza los objetos de tipo `Bebida` para registrar las bebidas solicitadas y calcular el total del pedido.

## Ejemplo de funcionamiento

Un cliente solicita un latte con chocolate y un shot extra.

Precios utilizados:

* Latte: S/ 8.00
* Chocolate: S/ 2.00
* Shot extra: S/ 2.50

Resultado:

```text
Bebida: Latte + Chocolate + Shot extra
Precio final: S/ 12.50
```

El sistema calcula el precio recorriendo la cadena de objetos decoradores hasta llegar a la bebida base.

## Beneficios de la solución

El patrón Decorator evita crear una clase para cada combinación de bebida e ingredientes.

También permite agregar nuevos complementos sin modificar las bebidas existentes. Por ejemplo, se podría incorporar un decorador llamado `Caramelo` sin cambiar las clases `Latte`, `Espresso` o `Americano`.

La solución respeta el principio abierto/cerrado, porque las clases están abiertas a extensión, pero cerradas a modificación.

## Conclusión

El patrón Decorator permite modelar correctamente la personalización de bebidas en una tienda de café. La solución es flexible, reutilizable y facilita agregar nuevas bebidas o ingredientes sin generar una gran cantidad de clases ni modificar el código existente.
