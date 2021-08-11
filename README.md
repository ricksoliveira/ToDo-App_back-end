# To Do App (Back-End)

### What is `To Do App (Back-End)` ?

This is the back-end of an application made with `Spring Boot`.

The project of the **front-end** of this application can be found **[here](https://github.com/ricksoliveira/ToDo-App_front-end)**.

To Do app is a simple Task List to keep our lives more organized. 😉

<br/>

## What do you need to use it?

> - **Java** (at least Java version 8)
> - **Any IDE** (recommended IntelliJ)

<br/>

## How to install

To install this project all you have to do is to clone this repository with the command:

> ```
> 	git clone https://github.com/ricksoliveira/ToDo-App_back-end.git
> ```

Or you can just download it as a `ZIP` file and open as a project  within your IDE.

<br/>

## How to execute it

> 1. Load the **maven** dependencies in the `pom.xml` file.
>
> 2. Run the `main` class and wait for the spring boot to load.
>
> 3. By default this application creates a file in your **C:/ drive** with the following path:
>
>    > ```
>    > 	/databases/todoapp/taskstododb
>    > ```
>
>    - You can change this directory by changing the path at the file `application.properties`
>
> 4. Open your web browser and go to the address: `localhost:8081/h2`, or just [Click here](localhost:8081/h2).
>
> 5. Make sure your settings are as the following image:
>
> ![image](https://user-images.githubusercontent.com/68413884/128966540-54d0ae40-6218-41e7-a925-23b4b62c83f7.png)
>
> 6. Click **Test Connection** and check if it shows **Test Successful** as shown in the image:
>    - *In case of the test fails, check again if the **JDBC URL** is the same path as in the `application.properties` file*
>
> ![image](https://user-images.githubusercontent.com/68413884/127176507-93a82063-3fa4-41b5-a9b6-1797dd30a8c5.png)
>
> 7. Click **Connect** and you should be redirected to the database home screen:
>
> ![image](https://user-images.githubusercontent.com/68413884/128966592-90576a91-3f0c-4710-b5b3-0ce18790344b.png)


<br/>

## How to use the application

> 1. To use this application, you have to run the front-end alongside, you can access the repository **[here](https://github.com/ricksoliveira/ToDo-App_front-end)**.
>
> 2. Follow the steps on the **README**.
>
> 3. After you successfully connected to the database and the Angular server compiled successfully as well, you can click the Add Task button on the upper left corner:
>
> ![image](https://user-images.githubusercontent.com/68413884/128967096-cdd234c5-be84-49e9-a45c-1f49ac11c5a9.png)
>
> 4. Create a new task and click Submit:
>
> ![image](https://user-images.githubusercontent.com/68413884/128967145-cf3857d8-0f05-428a-b1e9-e61136631f4e.png)
>
> ![image](https://user-images.githubusercontent.com/68413884/128967461-907c7e83-57c6-47ad-a8af-a7bb62c26f0f.png)
>
> - If nothing appears, reload the page.

<br/>

## Authors

- **Henrique Servidoni de Oliveira** - [LinkedIn](https://www.linkedin.com/in/ricksoliveira/)


## Thanks !

> Special thanks to [**DIO**](https://web.digitalinnovation.one/home) and [**Santander**](https://www.santander.com.br) for the full-stack scholarship opportunity.
