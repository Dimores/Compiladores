## Projeto Exemplo - Netbeans

- Este é um exemplo de projeto Scanner-Parser feito no Netbeans
- Pertence a disciplina Compiladores
- Contem a *gramática melhorada:*
	- `expr` - `term` - `factor` 

## Folder Structure

- `src`: A pasta contém os códigos dos nossos analisadores. Está subdividade no pacote `scanner` e `parser`
- `tools`: A pasta não pertence ao projeto propriamente, so coloquei ela la para facilitar a execução do script de geração do scanner e do parser

- O `java-cup-11b-runtime.jar` foi adicionado como uma biblioteca do projeto.
- Ao clonar o projeto e a lib não tiver sido carregada, adicione ela novamente
  - clique com o botao direito sobre `Libraries` > `add jar` > na pasta tools do projeto escolha o arquivo `java-cup-11b-runtime.jar`
