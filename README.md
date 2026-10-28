# padrao-template-method

Inspeção de quartos de um Hotel: o quarto recebe notas de limpeza e conforto, e cada categoria tem seu próprio critério de aprovação (Standard: média ≥ 6; Suíte: média ≥ 8).

`getInfo()` é o método-template: define o algoritmo fixo e chama o passo abstrato `verificarAprovacao()` e o gancho `getTipo()`.

Diagrama de classes:

```mermaid
classDiagram
    class Quarto {
        <<abstract>>
        -int numero
        #String nome
        -float notaLimpeza
        -float notaConforto
        +calcularMedia() float
        +verificarAprovacao()* String
        +getTipo() String
        +getInfo() String
    }
    class QuartoStandard {
        +verificarAprovacao() String
    }
    class QuartoSuite {
        +verificarAprovacao() String
        +getTipo() String
    }

    Quarto <|-- QuartoStandard
    Quarto <|-- QuartoSuite
```

O arquivo `diagrama_classe_template_method.mdj` contém o mesmo diagrama para abrir no StarUML.
# padrao-templatemethod
