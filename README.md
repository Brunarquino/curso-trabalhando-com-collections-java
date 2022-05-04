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

[Exemplos](https://github.com/Brunarquino/curso-trabalhando-com-collections-java/tree/master/src/dio/collection/list)
[Exercicios Propostos](https://github.com/Brunarquino/curso-trabalhando-com-collections-java/tree/master/src/dio/collection/list/exerciciosPropostos)

java.util.List

- Permite elementos duplicados
- Garante ordem de inserção

**ArrayList** → deve ser usado onde mais operações de pesquisa são necessárias (na duvida escolha essa)

**LinkedList** → deve ser usado onde mais operações de inserção e exclusão são necessárias.

### Coleções com Singularidade: Set

[Exemplos](https://github.com/Brunarquino/curso-trabalhando-com-collections-java/tree/master/src/dio/collection/set)
[Exercicios Propostos](https://github.com/Brunarquino/curso-trabalhando-com-collections-java/tree/master/src/dio/collection/set/execiciosPropostos)

java.util.Set

- Não permite elementos duplicados
- Não possui índice

### Coleções de Pares: Map

[Exemplos](https://github.com/Brunarquino/curso-trabalhando-com-collections-java/tree/master/src/dio/collection/map)
[Exercicios Propostos](https://github.com/Brunarquino/curso-trabalhando-com-collections-java/tree/master/src/dio/collection/map/execiciosPropostos)

java.util.Map

- Elementos únicos (key) para cada valor (value)
- chaves com valores Unicos
- não é extensão da interface collection porém está dentro do framework collections

### Stream API

- Classe Anonima
- Function Interface
- Lambda
- Method Reference
- Stream API

[Exemplos](https://github.com/Brunarquino/curso-trabalhando-com-collections-java/tree/master/src/dio/collection/streamApi)
