# Laboratorio: Interfaces e Inyección de Dependencias (Cafetería)

Este proyecto corresponde a un laboratorio práctico de refactorización en **Java**. El objetivo principal es resolver el problema de **acoplamiento fuerte** en un sistema de automatización para una cafetería, aplicando **Interfaces** e **Inyección de Dependencias (DI)** para lograr una arquitectura flexible, extensible y mantenible.

---

## 🎯 Objetivos del Laboratorio

* **Identificar Acoplamiento Fuerte:** Reconocer por qué instanciar clases concretas directamente dentro de otras clases limita la extensibilidad del sistema.
* **Diseñar Contratos con Interfaces:** Crear abstracciones (`EquipoCocina`) que definan el comportamiento común de los dispositivos.
* **Aplicar Inyección de Dependencias (DI):** Inyectar dependencias a través del constructor para desacoplar el orquestador principal (`PreparadorBebidas`) de implementaciones específicas.
* **Polimorfismo:** Implementar múltiples dispositivos con comportamientos propios sin alterar el código del preparador.
* **Escalabilidad:** Extender el sistema para manejar una colección dinámica de dispositivos (`PreparadorBebidasV2`).

---

## 📂 Estructura del Proyecto

El proyecto está compuesto por los siguientes archivos organizados por etapas de desarrollo:

```text
.
├── EquipoCocina.java              # Interfaz base (Contrato)
├── Cafetera.java                  # Implementación 1 (Refactorizada)
├── Licuadora.java                 # Implementación 2 (Refactorizada)
├── MaquinaTe.java                 # Implementación 3 (Nueva)
├── Exprimidor.java                # Implementación 4 (Nueva)
├── PreparadorBebidas.java         # Preparador refactorizado con DI por constructor
├── PreparadorBebidasV2.java       # Preparador avanzado con soporte para N equipos (List)
├── TestAnalisis.java              # Pruebas de la problemática original
├── TestPreparadorBebidas.java     # Pruebas de variabilidad con DI
└── TestPreparadorBebidasV2.java   # Pruebas con la lista dinámica de equipos
```

---

## 🛠️ Descripción de Componentes

### 1. Interfaz Base (`EquipoCocina.java`)
Define los métodos obligatorios que cualquier equipo de cocina debe cumplir:
* `void encender()`
* `void apagar()`
* `void preparar()`
* `void ajustarIntensidad()`

### 2. Implementaciones Concretas
Cada clase implementa `@Override` de la interfaz `EquipoCocina` con su propio comportamiento interno:
* **`Cafetera`**: Maneja nivel de intensidad del café.
* **`Licuadora`**: Maneja niveles de velocidad de licuado.
* **`MaquinaTe`**: Calienta agua y prepara distintas intensidades de té.
* **`Exprimidor`**: Procesa frutas a distintas velocidades.

### 3. Preparadores (Orquestadores)
* **`PreparadorBebidas`**: Recibe dos objetos de tipo `EquipoCocina` a través de su constructor, eliminando el uso de `new` internamente.
* **`PreparadorBebidasV2`**: Acepta una lista `List<EquipoCocina>` para coordinar un número indefinido de electrodomésticos en paralelo.

---

## ⚙️ Instrucciones de Compilación y Ejecución

Puedes compilar y ejecutar el proyecto mediante la terminal o tu IDE preferido (Eclipse, IntelliJ IDEA, VS Code).

### Compilación desde Terminal
Ubícate en la carpeta donde se encuentran los archivos `.java` y ejecuta:

```bash
javac *.java
```

### Ejecución de Pruebas

#### 1. Diagnóstico del problema inicial
```bash
java TestAnalisis
```

#### 2. Prueba con Inyección de Dependencias (3 Configuraciones distintas)
```bash
java TestPreparadorBebidas
```

#### 3. Prueba de la versión escalable con múltiples equipos
```bash
java TestPreparadorBebidasV2
```

---

## 📋 Lista de Entregables

1. `TestAnalisis.java`
2. `EquipoCocina.java`
3. `Cafetera.java`
4. `Licuadora.java`
5. `PreparadorBebidas.java`
6. `MaquinaTe.java`
7. `Exprimidor.java`
8. `TestPreparadorBebidas.java`
9. `PreparadorBebidasV2.java`
10. `TestPreparadorBebidasV2.java`

---

## 💡 Conceptos Clave Aprendidos

* **Inversión de Control (IoC):** La responsabilidad de instanciar los componentes concretos se delega al código cliente/creador y no al componente que los utiliza.
* **Principio Abierto/Cerrado (OCP):** El sistema está abierto a la extensión (podemos agregar más equipos como `CafeteraEspecial`, `FreidoraAire`, etc.) pero cerrado a la modificación (`PreparadorBebidas` no necesita cambiar para usarlos).