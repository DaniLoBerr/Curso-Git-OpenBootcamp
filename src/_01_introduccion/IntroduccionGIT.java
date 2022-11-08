package _01_introduccion;

public class IntroduccionGIT {

    /**
     *
     * GIT
     *
     * GIT es un sistema de control de versiones, es decir, es una herramienta
     * que gestiona los cambios en el código fuente de un proyecto a lo
     * largo del tiempo.
     *
     * TIPOS DE CONTROL DE VERSIONES
     *  Local, centralizado y distribuido
     *
     *      -Local. Consiste en ir copiando los archivos del proyecto en diferentes
     *    directorios cada uno con la fecha y hora en la que se produjeron los
     *    cambios.
     *      No es recomendable utilizar este tipo de control de versiones ya que
     *    es propenso a que se produzcan errores, además de que es muy difícil de
     *    gestionar: Demasiadas carpetas, dificultad a la hora de buscar un cambio
     *    específico, dificultad a la hora de trabajar con otras personas, etc.
     *      Con el tiempo, los programadores desarrollaron un sistema de control
     *    de versiones local un poco más desarrollado, el RCS. Este basaba
     *    su funcionamiento en el almcenamiento de conjuntos de parches, es decir,
     *    las diferencias entre archivos, de una versión a otra en un formato
     *    especial en el disco.
     *      -Centralizado. Tras los locales, surgen los centralizados. RCS evoluciona
     *    a CVS. Después surge SVN (Subversion). Este tipo de control de versiones
     *    nos permite trabajar en equipo. Estos sistemas tienen un único servidor
     *    que contiene todos los archivos versionados y varios desarrolladores
     *    pueden acceder a ellos a través de internet.
     *      -Distribuido. Tras los centralizados surgen los distribuidos. Aparece GIT.
     *      También Mercurial y Bazaar. Soluciona los problemas que se puedan generar
     *      de tener todo el control de versiones en un único servidor y de depender
     *      de la conexión a internet.
     *          Con este tipo de sistema, el desarrollador se descarga el repositorio
     *      completo del proyecto y no solo se descargar una copia de los archivos,
     *      por lo que se debilita la dependencia del servidor único. También
     *      permite varios flujos de trabajo dentro de un mismo proyecto gracias
     *      a la capacidad de crear numerosos repositorios.
     *          Podemos trabajar con repositorios locales y después enviarlos a un servidor
     *      remoto en el que trabajar con varias personas.
     *
     * PROVEEDORES DE HOSTING DE CONTROL DE VERSIONES
     *
     *  Github, Gitlab, Bitbucket, Sourceforge*
     *
     *  *(Sourceforge, además de permitirnos crear repositorios git como los demás, nos
     *  permite crear repositorios Mercurial y SVN. También nos permite alojamiento web
     *  para proyectos open source: nos "regala" una base de datos MySQL).
     *
     *      Crear repositorios en cada una:
     *
     *  GITHUB
     *
     *  - Opción de elegir una licencia, recomendación del profe: MIT License o BSD-3.
     *
     *  - Creación de un repositorio remoto desde la terminal:
     *
     *          …or create a new repository on the command line
     *              echo "# sdscd" >> README.md - Crea un archivo readme
     *              git init - Inicializa un repositorio o lo reinicia
     *              git add README.md  - Añade el archivo readme al repositorio
     *              git commit -m "first commit" - Confirma estos cambios
     *              git branch -M main - Cambia el nombre de la rama "master" por "main"
     *              git remote add origin https://github.com/DaniLoBerr/sdscd.git - Añade la dirección donde se guardará el repositorio remoto y le da el nombre de "origin"
     *              git push -u origin main - Envía los cambios confirmados a la rama "main" en este caso del repositorio remoto "origin" en este caso SOLO SE HACE LA PRIMERA VEZ, O CADA VEZ QUE QUERAMOS CREAR UNA RAMA.
     *
     *          …or push an existing repository from the command line
     *              git remote add origin https://github.com/DaniLoBerr/sdscd.git
     *              git branch -M main
     *              git push -u origin main
     *
     *  - COMANDO cat .git/config: Muestra en pantalla el contenido del fichero donde se
     *  encuentra la información sobre la configuración de nuestro repo.
     *  - COMANDO vi .git/config: Editas el contenido del fichero. Puedes cambiar ahí
     *  la dirección de tu repo remoto por ejemplo, o eliminarla.
     *
     *  - Instalación de nueva "shell": zsh. Complemento -> OhMyZsh.
     *
     *  - Cuando veamos la palabra "Upstream" se refiere al servidor al que nos estamos conectando.
     *
     *  - Autenticación a la hora de hacer un push. Si no tuviéramos el doble factor de autenticación activado,
     *  podríamos hacer el push simplemente con nuestro nombre de usuario y contraseña de Github, pero es
     *  altamente recomendable tenerlo activado. Con él, nos pedirá un token de acceso personal.
     *      - Note: Para qué es el token.
     *      - Expiratión: Caducidad del token.
     *      - Scopes: Permisos que se conceden al token.
     *
     *  - COMANDO git push: nos pide usuario y contraseña (token)
     *  - ATAJO COMANDO git push: git push https://<token>@<direccion-repo>
     *
     *  - Cuando realizamos un push con git, se muestra nuestro nombre y nuestro e-mail
     *  en los datos de los commits realizados, por lo que GitHub nos da la opción de
     *  ocultarlos utilizando un email de github anónimo.
     *
     *  - También nos permite activar un doble factor de autenticación a la hora de hacer los
     *  push vía APP o SMS.
     *
     *  - Se pueden escribir comentarios en el código de los commits de los repositorios de GitHub,
     *  es algo habitual a la hora de trabajar con proyectos.
     */
}
