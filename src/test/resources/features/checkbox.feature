Feature: Validação de checkboxes

  Scenario: Selecionar um checkbox desmarcado
    Given que estou na página de checkboxes
    When eu marco o primeiro checkbox
    Then o primeiro checkbox deve estar selecionado

  Scenario: Desmarcar um checkbox marcado
    Given que estou na página de checkboxes
    When eu desmarco o segundo checkbox
    Then o segundo checkbox deve estar desmarcado
