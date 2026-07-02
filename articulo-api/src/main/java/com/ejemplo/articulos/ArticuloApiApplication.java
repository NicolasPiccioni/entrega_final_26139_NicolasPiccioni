
package com.ejemplo.articulos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marca esta clase como el punto de entrada de Spring Boot
@SpringBootApplication
public class ArticuloApiApplication {
    public static void main(String[] args) {
        // Lanza la aplicación
        SpringApplication.run(ArticuloApiApplication.class, args);
    }
}

// Flujo simplifcado de la aplicación
// 1. El cliente hace una petición HTTP a un endpoint definido en ArticuloController
// 2. El controlador recibe la petición y llama el servicio correspondiente (ArticuloService)
// 3. El servicio realiza la lógica de negocio y llama al repositorio (ArticuloRepository) para acceder a los datos
// 4. El repositorio maneja la persistencia de los datos (En este caso, una lista en memoria) y devuelve los resultados al servicio
// 5. El servicio procesa los datos y los devuelve al controlador
// 6. El controlador construye la respuesta HTTP y lo envía de vuelta al cliente

// Arranca la aplicación de Springboot
// Inicializa el contexto de Spring.
// Escanea los componentes, que son los paquetes que busca para encontrar las clases anotadas con @Component, @Service, @Repository, @Controller, @RestController, etc
// Crea instancia de esas clases y las inyecta donde se necesiten (Por ej; El servicio en el controlador)
// Esto es lo que se llama inyección de dependencias, que es un principio de diseño que permite que las clases dependan de otras clases sin tener que crealas directamente, lo que facilita el mantenimiento y la escalabilidad de la aplicación
// Una vez que el contexto de Spring está listo, la aplicación está lista para recibir peticiones HTTP y manejar la lógica de negocio definida en los controladores, servicios y repositorios

