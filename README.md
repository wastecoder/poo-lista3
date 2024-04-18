# 3ª Lista de Programação Orientada a Objeto

## Exercício 12
Foi um questionário com as questões


## Exercício 13
Crie um sistema para gestão de Alunos.<br>
O sistema deverá permitir a Criação, Atualização, Remoção e Exibição do(s) Aluno(s).<br>
A classe **Aluno** deve conter as seguintes características e comportamentos.

Características :
- id : long
- nascimento : Date
- ra : String
- nome : String

Comportamentos:
- String toString()  &nbsp; &nbsp; &nbsp; // Deve retornar um texto com os dados do aluno

Crie uma classe chamada **GestaoAlunos**, contendo as seguintes características e comportamentos.

Características:
- indice : int  &nbsp; &nbsp; &nbsp; // Indica em qual posição deve ser guardada a proxima instância de aluno
- alunos : Aluno[]  &nbsp; &nbsp; &nbsp; // Matriz com 50 alunos

Comportamentos:
- void criar()
- void atualizar()
- void excluir()
- void exibir()
- void menu()

Regras do sistema
- O comportamento criar() deve criar uma nova instância de Aluno, preencher as características desta instância com informações fornecidas pelo usuário, e deve guardar esta instância de aluno na matriz (alunos) na posição indicada pela variável indice.
- A função exibir() deve pedir ao usuário para digitar um número de RA e procure qual aluno na matriz (alunos) possui um RA idêntico. Os dados do aluno encontrado devem ser exibidos na tela.
- A função excluir() deve pedir ao usuário para digitar um RA, e em seguida deve excluir o(s) aluno(s) com este RA da matriz (alunos)
- A função atualizar() deve pedir ao usuário para digitar um RA, e em seguida deve procurar pelo primeiro aluno na matriz (alunos) que contenha este RA. A função deve em seguida solicitar ao usuário para digitar os demais dados do aluno (nome e nascimento) para trocar os valores das características do aluno encontrado na matriz pelos valores recém-informados pelo usuário.
- O método menu() deve rodar em um loop infinito, mostrando na tela as opções para o usuário:
   - (C)riar &nbsp; &nbsp; (E)xibir &nbsp; &nbsp; (R)emover &nbsp; &nbsp; (A)tualizar &nbsp; &nbsp; (S)air
   - Pegue a primeira letra digitada pelo usuário e assuma como sendo a opção escolhida
     - String textoMaiusculo = scan.nextLine().toUpperCase();
     - char letra = textoMaiusculo.charAt(0);
   - Conforme a opção escolhida o método deve invocar a função correspondente criar(), exibir(), excluir(), atualizar() ou System.exit(0) para sair do sistema.


## Exercício 14
Crie um sistema para gestão de Funcionários.<br>
O sistema deverá permitir a Criação, Atualização, Remoção e Exibição do(s) Funcionario(s).<br>
A classe **Funcionario** deve conter as seguintes características e comportamentos.

Características:
- id : long
- nome : String
- matricula : String
- admissao : Date
- demissao : Date
- salario : float
- horario : String

Comportamentos:
- void exibir()  &nbsp; &nbsp; &nbsp; // Deve mostrar os dados do funcionário na tela

Crie uma classe chamada **GestaoFuncionarios**, contendo as seguintes características e comportamentos.
Características:
- indice : int  &nbsp; &nbsp; &nbsp; // Indica em qual posição deve ser guardada a próxima instância de funcionario
- funcionarios : Funcionario[]  &nbsp; &nbsp; &nbsp; // Matriz com 50 funcionarios

Comportamentos:
- void criar()
- void atualizar()
- void excluir()
- void exibir()
- void menu()

Regras do sistema
- O comportamento **criar()** deve criar uma nova instância de **Funcionario**, preencher as características desta instância com informações fornecidas pelo usuário, e deve guardar esta instância de **Funcionario** na matriz (**funcionarios**) na posição indicada pela variável **indice**.
- A função **exibir()** deve pedir ao usuário para digitar um número de matrícula e procure qual funcionario na matriz (**funcionarios**) possui uma matrícula idêntica, aquele(s) funcionário(s) com a matrícula identica deve(m) ser exibido(s) na tela.
- A função **exluir()** deve pedir ao usuário para digitar uma matrícula, e em seguida deve exluir o(s) funcionario(s) com esta matrícula na matriz (funcionarios)
- A função **atualizar()** deve pedir ao usuário para digitar uma matrícula, e em seguida deve procurar pelo primeiro funcionario na matriz (**funcionarios**) que contenha esta matrícula. A função deve  em seguida solicitar ao usuário para digitar os demais dados do funcionario (nome, admissao, demissao, salario, horario) para trocar os valores das características do funcionario encontrado na matriz pelos valores recém-informados pelo usuário.
- O método **menu()** deve rodar em um loop inifinito, mostrando na tela as opções para o usuário:
  - (C)riar &nbsp; &nbsp; (E)xibir &nbsp; &nbsp; (R)emover &nbsp; &nbsp; (A)tualizar &nbsp; &nbsp; (S)air
  - Pegue a primeira letra digitada pelo usuário e assuma como sendo a opção escolhida
    - String textoMaiusculo = scan.nextLine().toUpperCase();
    - char letra = textoMaiusculo.charAt(0);
  - Conforme a opção escolhida o método deve invocar a função correspondente criar(), exibir(), excluir(), atualizar() ou System.exit(0) para sair do sistema.


## Exercício 15
No reino Fedora, há um Principe e um Conde que disputam pelo poder, ambos são do tipo Nobre e dessa forma herdam o comportamento governar(), porém o Principe além de Nobre ele também se comporta como um Cavaleiro. Todo o Cavaleiro sabe duelar(). A Rainha também é Nobre, porém, além disso, ela sabe fazerDiplomacia() que é a arte do Diplomata. <br>
Todo o Nobre possui um Conselheiro, e um conjunto de Soldado, o Conselheiro possui vários Bispo a sua disposição e por sua vez o Bispo herda de Padre e implementa Fiel, onde todo o Fiel sabe rezar().

P.S. Para a sua sanidade, assuma que apenas as classes podem agregar outras classes ou interfaces.

Crie:
1. Uma lista com os tipos existentes no texto, informando se são classes ou interfaces.
2. Diagrama de classe UML mostrando as relações entre os tipos detectados. Assuma que todas as relações de associação serão representadas por agregações. Não precisa implementar os métodos get e set dessas agregações, basta torná-las package ou públicas.
3. Código Java de todos os tipos em um mesmo pacote chamado edu.nobreza

