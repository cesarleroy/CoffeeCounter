# Contador de Café ☕
Aplicación Android desarrollada con **Jetpack Compose** para la Unidad 2 del curso de formación de Android.

## Características
* **Manejo de Estado (State)**: Uso de `remember` y `mutableStateOf` para gestionar y actualizar el contador numérico en tiempo real.
* **State Hoisting**: Separación arquitectónica de la lógica (el estado del contador) y la interfaz gráfica (UI) siguiendo las mejores prácticas.
* **UI Dinámica y Condicionales**: Interfaz reactiva que cambia la imagen, oculta el botón de "Añadir taza" y despliega un mensaje de advertencia en color rojo al llegar al límite de 10 tazas.
* **Diseño Armonizado**: Implementación de una paleta de colores personalizada y transiciones suaves de imágenes utilizando `Crossfade`.

## 📄 Archivo kotlin
La lógica principal de la interfaz y la implementación de **Jetpack Compose** se encuentra en el siguiente archivo:
* [MainActivity.kt](app/src/main/java/com/example/coffeecounter/MainActivity.kt)

## 📄 Aplicación
La aplicación completa (ya compilada) se encuentra en el siguiente archivo:
* [APK](./assets/coffee-counter.apk)

## 📸 Vista Previa
> ![Preview](./assets/CoffeeCounter_Preview.gif)

## 🛠️ Tecnologías
* Kotlin
* Jetpack Compose (State, Animations, Layouts)
* Material Design 3

---
*Programación de Dispositivos Móviles 5CV51*

*Carmona González César Leroy - IPN UPIICSA*