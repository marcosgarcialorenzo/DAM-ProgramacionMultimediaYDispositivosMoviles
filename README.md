# DAM - Programación Multimedia y Dispositivos Móviles

Proyecto de Android Studio para la asignatura de **Programación Multimedia y Dispositivos Móviles**. El repositorio reúne la aplicación principal y varias prácticas Android independientes.

## Módulos

| Módulo | Descripción |
|---|---|
| `app` | Aplicación principal del proyecto. |
| `RA2:practica1` | Práctica con animación y navegación entre pantallas. |
| `RA2:practica2` | Práctica Android independiente. |
| `RA2:practica3` | Práctica con animación, navegación, mensajes Toast y diálogos. |

Cada módulo es una aplicación Android independiente y se puede compilar por separado.

## Tecnologías

- Java 11
- Android Gradle Plugin
- AndroidX AppCompat y Activity
- Material Components
- ConstraintLayout
- SDK mínimo: Android 7.0 (API 24)
- SDK de compilación: API 37

## Requisitos

- Android Studio compatible con la versión de Android Gradle Plugin configurada en el proyecto.
- JDK 11 o una versión compatible con Android Studio y Gradle.
- Android SDK, incluida la API 37.

## Compilar

En Windows, desde la raíz del repositorio:

```bat
gradlew.bat :app:assembleDebug
gradlew.bat :RA2:practica1:assembleDebug
gradlew.bat :RA2:practica2:assembleDebug
gradlew.bat :RA2:practica3:assembleDebug
```

Para compilar todos los módulos:

```bat
gradlew.bat assembleDebug
```

Los APK de depuración se generan dentro de la carpeta `build/outputs/apk/debug/` de cada módulo.

## Abrir en Android Studio

1. Clona o descarga este repositorio.
2. Abre en Android Studio la carpeta raíz, donde se encuentra `settings.gradle.kts`.
3. Espera a que termine la sincronización de Gradle.
4. Selecciona el módulo que quieras ejecutar y lánzalo en un emulador o dispositivo Android.
