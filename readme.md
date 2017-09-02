Каталог книг
============

О проекте
---------

Необходимо написать приложение: каталог книг.

Предметная область:
*   Книга содержит: название, дату выпуска, автора, описание
*   Автор содержит имя
*   Пользователь может просматривать / редактировать / удалять / добавлять книги
*   Пользователь может просматривать / редактировать / удалять / добавлять авторов
*   Пользователь может искать книги по названию, году, автору
*   Пользователь может искать авторов по имени
*   Регистрация пользователей по емэйлу и паролю
*   Логин
*   Логаут
*   Любой зарегистрированный пользователь может сделать любое действие с книгой или автором (просматривать / редактировать / удалять / добавлять)

Техническая сторона:
*   Проект должен быть на github.com
*   Использовать технологии gradle, jdk8, postgresql, SpringBoot, liquibase, junit, Mockito, angular
*   Должно быть разделение на бекенд и фронтенд
*   Для аутентификации использовать session token

Before build
------------

*   install gradle 4.x
*   install JDK8
*   install git
*   `git clone https://github.com/arkbalmer/myFirstGradle.git`
*   install PostgreSQL 9.6 (use port 5433)
*   create new DB user `book_user`, pass: `redred`
*   create DataBase `book_db` owned by `book_user`

Build and Run
-------------

    gradle build
    gradle update
    java -jar build/libs/myGradleBuild-1.0-SNAPSHOT.jar

DataBase Rollback
-----------------

    gradle rollbackCount -PliquibaseCommandValue=1
