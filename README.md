# 3� Lista de Programa��o Orientada a Objeto

## Exerc�cio 12
Foi um question�rio com as quest�es


## Exerc�cio 13
Crie um sistema para gest�o de Alunos.<br>
O sistema dever� permitir a Cria��o, Atualiza��o, Remo��o e Exibi��o do(s) Aluno(s).<br>
A classe **Aluno** deve conter as seguintes caracter�sticas e comportamentos.

Caracter�sticas :
- id : long
- nascimento : Date
- ra : String
- nome : String

Comportamentos:
- String toString()  &nbsp; &nbsp; &nbsp; // Deve retornar um texto com os dados do aluno

Crie uma classe chamada **GestaoAlunos**, contendo as seguintes caracter�sticas e comportamentos.

Caracter�sticas:
- indice : int  &nbsp; &nbsp; &nbsp; // Indica em qual posi��o deve ser guardada a proxima inst�ncia de aluno
- alunos : Aluno[]  &nbsp; &nbsp; &nbsp; // Matriz com 50 alunos

Comportamentos:
- void criar()
- void atualizar()
- void excluir()
- void exibir()
- void menu()

Regras do sistema
- O comportamento criar() deve criar uma nova inst�ncia de Aluno, preencher as caracter�sticas desta inst�ncia com informa��es fornecidas pelo usu�rio, e deve guardar esta inst�ncia de aluno na matriz (alunos) na posi��o indicada pela vari�vel indice.
- A fun��o exibir() deve pedir ao usu�rio para digitar um n�mero de RA e procure qual aluno na matriz (alunos) possui um RA id�ntico. Os dados do aluno encontrado devem ser exibidos na tela.
- A fun��o excluir() deve pedir ao usu�rio para digitar um RA, e em seguida deve excluir o(s) aluno(s) com este RA da matriz (alunos)
- A fun��o atualizar() deve pedir ao usu�rio para digitar um RA, e em seguida deve procurar pelo primeiro aluno na matriz (alunos) que contenha este RA. A fun��o deve em seguida solicitar ao usu�rio para digitar os demais dados do aluno (nome e nascimento) para trocar os valores das caracter�sticas do aluno encontrado na matriz pelos valores rec�m-informados pelo usu�rio.
- O m�todo menu() deve rodar em um loop infinito, mostrando na tela as op��es para o usu�rio:
   - (C)riar &nbsp; &nbsp; (E)xibir &nbsp; &nbsp; (R)emover &nbsp; &nbsp; (A)tualizar &nbsp; &nbsp; (S)air
   - Pegue a primeira letra digitada pelo usu�rio e assuma como sendo a op��o escolhida
     - String textoMaiusculo = scan.nextLine().toUpperCase();
     - char letra = textoMaiusculo.charAt(0);
   - Conforme a op��o escolhida o m�todo deve invocar a fun��o correspondente criar(), exibir(), excluir(), atualizar() ou System.exit(0) para sair do sistema.


## Exerc�cio 14
Crie um sistema para gest�o de Funcion�rios.<br>
O sistema dever� permitir a Cria��o, Atualiza��o, Remo��o e Exibi��o do(s) Funcionario(s).<br>
A classe **Funcionario** deve conter as seguintes caracter�sticas e comportamentos.

Caracter�sticas:
- id : long
- nome : String
- matricula : String
- admissao : Date
- demissao : Date
- salario : float
- horario : String

Comportamentos:
- void exibir()  &nbsp; &nbsp; &nbsp; // Deve mostrar os dados do funcion�rio na tela

Crie uma classe chamada **GestaoFuncionarios**, contendo as seguintes caracter�sticas e comportamentos.
Caracter�sticas:
- indice : int  &nbsp; &nbsp; &nbsp; // Indica em qual posi��o deve ser guardada a pr�xima inst�ncia de funcionario
- funcionarios : Funcionario[]  &nbsp; &nbsp; &nbsp; // Matriz com 50 funcionarios

Comportamentos:
- void criar()
- void atualizar()
- void excluir()
- void exibir()
- void menu()

Regras do sistema
- O comportamento **criar()** deve criar uma nova inst�ncia de **Funcionario**, preencher as caracter�sticas desta inst�ncia com informa��es fornecidas pelo usu�rio, e deve guardar esta inst�ncia de **Funcionario** na matriz (**funcionarios**) na posi��o indicada pela vari�vel **indice**.
- A fun��o **exibir()** deve pedir ao usu�rio para digitar um n�mero de matr�cula e procure qual funcionario na matriz (**funcionarios**) possui uma matr�cula id�ntica, aquele(s) funcion�rio(s) com a matr�cula identica deve(m) ser exibido(s) na tela.
- A fun��o **exluir()** deve pedir ao usu�rio para digitar uma matr�cula, e em seguida deve exluir o(s) funcionario(s) com esta matr�cula na matriz (funcionarios)
- A fun��o **atualizar()** deve pedir ao usu�rio para digitar uma matr�cula, e em seguida deve procurar pelo primeiro funcionario na matriz (**funcionarios**) que contenha esta matr�cula. A fun��o deve  em seguida solicitar ao usu�rio para digitar os demais dados do funcionario (nome, admissao, demissao, salario, horario) para trocar os valores das caracter�sticas do funcionario encontrado na matriz pelos valores rec�m-informados pelo usu�rio.
- O m�todo **menu()** deve rodar em um loop inifinito, mostrando na tela as op��es para o usu�rio:
  - (C)riar &nbsp; &nbsp; (E)xibir &nbsp; &nbsp; (R)emover &nbsp; &nbsp; (A)tualizar &nbsp; &nbsp; (S)air
  - Pegue a primeira letra digitada pelo usu�rio e assuma como sendo a op��o escolhida
    - String textoMaiusculo = scan.nextLine().toUpperCase();
    - char letra = textoMaiusculo.charAt(0);
  - Conforme a op��o escolhida o m�todo deve invocar a fun��o correspondente criar(), exibir(), excluir(), atualizar() ou System.exit(0) para sair do sistema.


## Exerc�cio 15
No reino Fedora, h� um Principe e um Conde que disputam pelo poder, ambos s�o do tipo Nobre e dessa forma herdam o comportamento governar(), por�m o Principe al�m de Nobre ele tamb�m se comporta como um Cavaleiro. Todo o Cavaleiro sabe duelar(). A Rainha tamb�m � Nobre, por�m, al�m disso, ela sabe fazerDiplomacia() que � a arte do Diplomata. <br>
Todo o Nobre possui um Conselheiro, e um conjunto de Soldado, o Conselheiro possui v�rios Bispo a sua disposi��o e por sua vez o Bispo herda de Padre e implementa Fiel, onde todo o Fiel sabe rezar().

P.S. Para a sua sanidade, assuma que apenas as classes podem agregar outras classes ou interfaces.

Crie:
1. Uma lista com os tipos existentes no texto, informando se s�o classes ou interfaces.
2. Diagrama de classe UML mostrando as rela��es entre os tipos detectados. Assuma que todas as rela��es de associa��o ser�o representadas por agrega��es. N�o precisa implementar os m�todos get e set dessas agrega��es, basta torn�-las package ou p�blicas.
3. C�digo Java de todos os tipos em um mesmo pacote chamado edu.nobreza

