Feature: Escenarios asociados a la funcionalidad

  @Automation
  Scenario: Se listan los usuario del servicio
    Given   Se tiene una configuracion para el servicio
    When    Se consume el servicio de listas

    Then    Se listan conrrectamente los usuarios