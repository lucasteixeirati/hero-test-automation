Feature: Login na página The Internet

  Scenario: Login com sucesso
    Given que o usuário está na página de login
    When preenche o usuário "tomsmith" e senha "SuperSecretPassword!"
    And clica no botão de login
    Then o login deve ser realizado com sucesso

  Scenario: Login com falha
    Given que o usuário está na página de login
    When preenche o usuário "invalido" e senha "errada"
    And clica no botão de login
    Then uma mensagem de erro deve ser exibida
