# Aplicación Android: Demostración de Elementos de Interfaz de Usuario

## Índice

- [Descripción de la aplicación](#descripción-de-la-aplicación)
- [Estructura de la aplicación](#estructura-de-la-aplicación)
- [Categorías de elementos demostrados](#categorías-de-elementos-demostrados)
- [Instrucciones de uso](#instrucciones-de-uso)
- [Instalación](#instalación)


---

# Descripción de la aplicación

Esta aplicación Android demuestra el uso de **Activities y Fragments** para presentar distintos **elementos de interfaz de usuario (UI)** disponibles en Android.

La aplicación cuenta con una **Activity principal** que incluye un **menú de navegación inferior**. Desde este menú el usuario puede acceder a diferentes secciones que muestran una **vista previa mediante Fragments**.

Cada Fragment incluye una breve explicación del tipo de elemento y un botón **"Abrir en nueva Activity"**, donde se presentan **ejemplos interactivos**.

Al interactuar con los elementos, la aplicación muestra un **Toast** indicando qué acción realizó el usuario.

---

# Estructura de la aplicación

La arquitectura implementada es la siguiente:

**Activity principal**
- `MainActivity`
- Contiene el menú de navegación inferior.

**Fragments**
- Home
- TextFields
- Botones
- Elementos de selección
- Listas
- Elementos de información

Cada Fragment funciona como **pantalla de introducción** para su categoría.

**Activities de demostración**

Cada categoría abre una Activity independiente donde se muestran ejemplos funcionales de los componentes.

---

# Categorías de elementos demostrados

| Tipo de elemento | Componentes incluidos | Capturas |
|------------------|----------------------|----------|
| **TextFields** | EditText | Ver sección desplegable |
| **Botones** | Button, ImageButton, FloatingActionButton | Ver sección desplegable |
| **Elementos de selección** | CheckBox, RadioButton, Switch | Ver sección desplegable |
| **Listas** | RecyclerView / ListView | Ver sección desplegable |
| **Elementos de información** | TextView, ImageView, ProgressBar | Ver sección desplegable |

---

## Capturas de pantalla

<details>
<summary>TextFields</summary>

![TextFields](images/textfields.png)

</details>

<details>
<summary>Botones</summary>

![Botones](images/botones.png)

</details>

<details>
<summary>Elementos de selección</summary>

![Seleccion](images/seleccion.png)

</details>

<details>
<summary>Listas</summary>

![Listas](images/listas.png)

</details>

<details>
<summary>Elementos de información</summary>

![Informacion](images/informacion.png)

</details>

---

# Instrucciones de uso

1. Al iniciar la aplicación se mostrará la **pantalla principal** con el menú inferior.
2. Selecciona alguna de las categorías disponibles:
   - TextFields
   - Botones
   - Elementos de selección
   - Listas
   - Elementos de información
3. Cada sección mostrará un **Fragment con explicación del tipo de elemento**.
4. Presiona el botón **"Abrir en nueva Activity"**.
5. Se abrirá una pantalla con **ejemplos interactivos** de los componentes.
6. Interactúa con los elementos para visualizar los **mensajes Toast** que indican la acción realizada.

---

# Instalación

1. Clonar el respositorio

```bash
git clone https://github.com/stebancito/DAM-T1Activities-Fragments.git
```
2. Abrir Android Studio.
3. Abrir el proyecto de la carpeta en donde se clonó el repositorio.
4. Conectar un dispositivo android o inciar un emulador.
5. Presionar **Run** en Android Studio.
6. Iniciar la aplicación.
