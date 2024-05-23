Feature: automatizacion de rest api - pom
  yo como estudiente de calidad de software
  necesito construir una peticion a una api
  para aprender a automtizar servicios

  Scenario: reemplazar informaxion de un usuario con metodo put
    Given se establece la base url "https://gorest.co.in/"
    When consulta en endpoint "public/v2/users/" por id "6920247" y se modifica el nombre "David San" y email "DavidS55@gmail.com"
    Then se valida que el status code sea 200 y que contenga el nombre "David San" y email "DavidS55@gmail.com"

