Informe del Proceso de Subida a GitHub
========================================
Descripción de la Actividad
Se creó un archivo de manera local con un código sencillo en Java ('Hola Mundo') y se subió mediante línea de comandos a GitHub.

Pasos Realizados
--------------------
1. Creación del archivo local
Se generó un archivo llamado 'CD1_Carlos_Acosta_NRC.txt' con el siguiente contenido:
print("Hola Mundo")

2. Configuración de Git
Inicialización de un repositorio local:
git init

Configuración del nombre de usuario y correo:
git config --global user.name "Carlos Acosta"
git config --global user.email "carlosac101@hotmail.com"

3. Subida del archivo al repositorio
Se agregó el archivo al área de preparación:
git add CD1_Carlos_Morillo_NRC.txt

Se realizó un commit con un mensaje descriptivo:
git commit -m "Primera versión del archivo Hola Mundo"

Se conectó el repositorio local a un repositorio remoto en GitHub:
git remote add origin https://github.com/tu_usuario/nombre_repositorio.git

Se subió el archivo al repositorio remoto:
git push -u origin main

Evidencias
--------------------
Se subieron los siguientes archivos al repositorio de GitHub:
1. CD1_Carlos_Acosta_NRC.txt (archivo de código).
2. informe.txt (este informe).

Link al repositorio
[Repositorio en GitHub](https://github.com/tu_usuario/nombre_repositorio)

---
Fecha de Entrega: 20 de Noviembre del 2024.
