# Curso Trabalhando com Collections Java

- A Collection é um objeto que agrupa múltiplos elementos, sendo eles variáveis primitivas ou objetos, dentro de uma única unidade.
- E serve para armazenar e processar conjuntos de dados de forma eficiente. Manipular a coleção de forma eficiente. (A manipulação de Arrays não é muito eficiente)

Estrutura das Collections: 

- **Interfaces:** É um contrato que quando assumido por uma classe deve ser implementado.
- **Implementações ou Classes:** são as materializações, a codificação das interfaces.
- **Algoritmos:** É uma sequência lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.

Interfaces e Implementações que o curso abordou

**Interface List:**
  - ArrayList 
  - LinkedList 

**Interface Set:**
  - HashSet 
  - LinkedHashSet 
  - TreeSet

**Interface Map: (não é extensão da interface collection, está dentro do collection framework)**
  - HashSet 
  - LinkedHashMap 
  - TreeMap


### Coleções com iterações ordenadas: List

java.util.List

- Permite elementos duplicados
- Garante ordem de inserção

**ArrayList** → deve ser usado onde mais operações de pesquisa são necessárias (na duvida escolha essa)

**LinkedList** → deve ser usado onde mais operações de inserção e exclusão são necessárias.

### Coleções com Singularidade: Set

java.util.Set

- Não permite elementos duplicados
- Não possui índice

### Coleções de Pares: Map

java.util.Map

- Elementos únicos (key) para cada valor (value)
- chaves com valores Unicos
- não é extensão da interface collection porém está dentro do framework collections

### Stream API
