# Instruções para Agentes de IA - Codebase Java Educacional

## Visão Geral do Projeto

Este é um **repositório educacional** de Java com exercícios progressivos e conceitos fundamentais. Organizado em três áreas principais:

- **`introducao/`**: Conceitos fundamentais (Classes, Herança, Interfaces, Loops, Vetores, Casting)
- **`exercicios/`**: Exercícios organizados por nível de dificuldade (lv1, lv2, lv3)
- **`aleatorio/`**: Exemplos práticos com padrões como getters/setters e Scanner

## Padrões de Código Observados

### Estrutura de Arquivos
- **Nomeação lowercase**: Arquivos como `olaMundo.java`, `calculadora.java` (não CamelCase padrão Java)
- **Pacotes**: Usar `package` declarado (ex: `package exercicios.lv1;`, `package introducao;`)
- **Main method**: Todos os arquivos exercícios implementam `public static void main(String[] args)`

### Padrões de Entrada/Saída
- **Scanner**: Usado para entrada de usuário
  ```java
  Scanner sc = new Scanner(System.in);
  // ... código ...
  sc.close(); // Sempre fechar recursos
  ```
- **Loops de repetição**: Uso comum de `while (true)` com `break` para menus interativos
- **Validação de entrada**: Verificar com `equals()`, `equalsIgnoreCase()`, ou condicionais

### Exemplo - Padrão de Menu (exercicios/lv2/)
Os exercícios de nível 2 implementam loops aninhados para menus:
```java
while (true) {
    // entrada do usuário
    if (validacao) {
        // executar operação
        break;
    } else {
        // mensagem de erro ou re-prompt
    }
}
// pergunta se deseja continuar
if (resposta.equalsIgnoreCase("n")) break;
```

### Uso de Classes e Herança (introducao/)
- **Encapsulamento**: Usar `protected` em classes pai, `private` para dados sensíveis
- **Interfaces**: Como contrato em `Interface.java` (ContaBancaria interface implementada por ContaPoupanca, ContaCorrente)
- **Métodos estáticos**: Frequentemente para funções utilitárias (ex: `TransferenciaPix.transferir()`)

## Convenções Específicas

### Variáveis
- Nomes curtos em exercícios (`n1`, `n2`, `sc`, `p`) - aceito em código educacional
- Getters/Setters: `get/set` prefixes (ex: `getNome()`, `setEmail()`)

### Formatação
- Usar `System.out.printf()` para valores numéricos formatados
  ```java
  System.out.printf("%.2f °C = %.2f °F\n", celsius, fahrenheit);
  ```
- Separadores visuais com `System.out.println("---")` em menus

### Imports
- `java.util.Scanner` é o import mais comum
- Não há uso de frameworks externos (projeto puro Java)

## Diretrizes para Contribuições

1. **Novos exercícios**: Colocar em `exercicios/lv*` com `main()` implementado
2. **Conceitos novos**: Adicionar exemplo em `introducao/` com nome descritivo
3. **Padrão de entrada**: Quando houver interação com usuário, usar Scanner com loops estruturados
4. **Fechar recursos**: Sempre chamar `sc.close()` ao finalizar uso de Scanner
5. **Comentários**: Minimizar - código deve ser auto-explicativo em exercícios educacionais

## Compilação e Execução

- **Compilação**: `javac` sobre pacotes individuais
- **Execução**: `java` com package path (ex: `java exercicios.lv1.olaMundo`)
- Cada classe pode ter seu próprio `main()` - não há múltiplos entry points

## Notas para Agentes de IA

- Este é um projeto **educacional** - priorizar clareza sobre eficiência
- **Não importar bibliotecas externas** sem justificativa educacional
- **Documentar "por quê"** em exemplos de conceitos (Herança, Interfaces)
- Preservar o padrão de nomeação lowercase dos arquivos (diferente de convenções Java padrão)
- Exercícios devem ser **autossuficientes** - cada arquivo executável independentemente
