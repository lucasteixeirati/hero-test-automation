Feature: Seleção de opções no Dropdown

  Scenario: Selecionar Option 1
    Given que estou na página de dropdown
    When seleciono a opção "Option 1"
    Then a opção "Option 1" deve estar selecionada

  Scenario: Selecionar Option 2
    Given que estou na página de dropdown
    When seleciono a opção "Option 2"
    Then a opção "Option 2" deve estar selecionada
