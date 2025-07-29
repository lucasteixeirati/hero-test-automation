
# 📘 Projeto de Automação de Testes - HerokuApp

Este projeto realiza a automação de testes funcionais no site [The Internet](https://the-internet.herokuapp.com/), utilizando Java, Maven, Cucumber, Selenium WebDriver e o padrão de projeto Page Object.

---

## 📁 Estrutura do Projeto

```
hero-test/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       ├── java/
│       │   ├── pages/         # Page Objects
│       │   ├── steps/         # Step Definitions + Hooks
│       │   ├── util/          # DriverFactory
│       │   └── runner/        # Classe Runner (RunCucumberTest)
│       └── resources/
│           └── features/      # Arquivos .feature do Cucumber
├── pom.xml
└── README.md
```

---

## 🔧 Tecnologias Utilizadas

- Java 11 ou superior
- Maven
- Selenium WebDriver
- Cucumber (BDD)
- JUnit 4
- WebDriverManager (Bonigarcia)

---

## 🧪 Funcionalidades Testadas

O projeto contempla a automação dos seguintes componentes da aplicação:

- [x] Checkboxes
- [x] Dropdown
- [ ] File Upload
- [x] JavaScript Alerts
- [ ] Dynamic Controls
- [ ] Drag and Drop
- [ ] Broken Images

---

## ▶️ Como Executar os Testes

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/hero-test.git
cd hero-test
```

2. **Compile o projeto e baixe as dependências:**

```bash
mvn clean install
```

3. **Execute os testes:**

```bash
mvn test
```

---

## 📄 Gerar Relatório HTML

1. **Execute os testes gerando saída JSON:**

Edite o plugin Cucumber no `RunCucumberTest` (se ainda não tiver):

```java
@CucumberOptions(
    plugin = {
        "pretty",
        "json:target/cucumber-report.json",
        "html:target/report.html"
    },
    ...
)
```

2. **Gere o relatório com o Maven Cucumber Reporting:**

```bash
mvn net.masterthought:maven-cucumber-reporting:generate   -DcucumberOutput=target/cucumber-report.json
```

---

## 📋 Requisitos

- Java 11+
- Maven 3.6+
- Navegador Google Chrome
- Git

---

## ✍️ Autor

**Lucas Teixeira**  
Analista de Qualidade e Testes de Software  
💼 [LinkedIn](https://www.linkedin.com/in/lucas-teixeira-67b08b47/)
