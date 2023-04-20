# product-manager
Тестовое задание


![image](https://user-images.githubusercontent.com/23298971/233329946-aad80699-23a8-4bf1-85de-69a034ab68ca.png)

Предметная область Продажи
Есть таблица Категорий которая содержит в себе на данный момент только название категории.
Есть таблица Продуктов которая содержит в себе название, количество продукта, а так же содежрит в себе поле с указанием Id категории к которой этот продукт относится.


Для запуска приложения нужны зависимотси:
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-jdbc'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    compileOnly 'org.projectlombok:lombok'
    runtimeOnly 'com.mysql:mysql-connector-j'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test


В корне проекта есть файл RESTAPI.postman_collection.json в котором задокументировано обращение к каждому endpoint.

Endpoint

/products (GET)
Возвращает список всех продуктов

/products (POST)
Добавляет продукт 

/products (PUT)
Изменяет продукт

/product/{id} (DELETE)
Удаляет продукт по ID

/categories (GET)
Возвращает список всех категорий

/products/category/{id}
Возвращает список продуктов с указанной категоией

/categories (PUT)
Изменяет категорию

/categories (POST)
добавляет категорию

/categories/{id} (DELETE)
Удаляет категорию

