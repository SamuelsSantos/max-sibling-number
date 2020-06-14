# Exercício 01

Encontrar o maior irmão de um determinado dado número. 

    Dado o número **416**
    quando eu buscar seu maior irmão
    então eu devo encontrar **641**.
    
### Passos para testar

#### Empacotar
```
mvn package
```
### Testes
``` 
mvn test
```
### Executar 
```
java -cp ./target/exercise01-SNAPSHOT.jar com.challenge.Solution 416
```

### Análise do problema

    * O problema pode ser resolvido utilizando o algoritimo de permutação
    que gera as combinações e então localizar o maior membro da coleção.
    
    * Um outro jeito de resolver o problema é ordernar o número em ordem decrescente.
    
    Os dois métodos foram desenvolvidos.