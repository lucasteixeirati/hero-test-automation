Feature: JavaScript Alerts

  Scenario: Aceitar alerta simples
    Given que estou na página de JavaScript Alerts
    When clico no botão de alerta simples
    And aceito o alerta
    Then vejo a mensagem "You successfully clicked an alert"

  Scenario: Confirmar alerta
    Given que estou na página de JavaScript Alerts
    When clico no botão de confirmação
    And aceito o alerta
    Then vejo a mensagem "You clicked: Ok"

  Scenario: Cancelar alerta
    Given que estou na página de JavaScript Alerts
    When clico no botão de confirmação
    And cancelo o alerta
    Then vejo a mensagem "You clicked: Cancel"

  Scenario: Enviar texto no prompt
    Given que estou na página de JavaScript Alerts
    When clico no botão de prompt
    And envio o texto "Lucas" no alerta
    Then vejo a mensagem "You entered: Lucas"

  Scenario: Cancelar prompt
    Given que estou na página de JavaScript Alerts
    When clico no botão de prompt
    And cancelo o alerta
    Then vejo a mensagem "You entered: null"
