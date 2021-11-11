Feature: Performance Example



  @Smoke
  Scenario: The client search by "A utomation"
    Given The client is in google page
    When The client search for word Automation
    And envio 35 usuarios durante 20 segundos
    Then The client verify that results are shown properly


  @Example @Test
  Scenario: Performance con carga de usuarios en ascenso, mantener y desenso
    When envio de 1 usuario a 35 durante 20 segundos
    And envio 35 usuarios durante 20 segundos
    And envio de 35 usuarios a 1 durante 20 segundos
    And se espera la respuesta 201


  @Example
  Scenario: Performance con carga de usuarios en ascenso
    When envio de 1 usuario a 35 durante 20 segundos


  @Example
  Scenario: Performance con envio de datos constante
    When envio 8 usuarios durante 180 segundos


  @Example
  Scenario: Performance con carga de datos constante y carga alta
    When envio 20 usuarios durante 10 segundos
    And envio 50 usuarios
    And envio 20 usuarios durante 50 segundos
