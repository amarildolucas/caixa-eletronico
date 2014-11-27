Caixa Eletrónico
================

Simulador de algumas operações feitas num Caixa Eletrónico.

1) Crie um programa em Java para simular algumas operações em um Caixa Eletrônico. O programa deverá ter as seguintes características:
a) Deverá ser apresentado um menu inicial com opções para Sacar, Repor, Consultar Saldo e Fim. Caso o usuário selecione uma opção inválida, o programa deverá apresentar uma mensagem.
b) Para sacar, o usuário deverá informar a quantia desejada. Caso o usuário informe uma quantia inválida (valor menor ou igual a zero), o programa deverá apresentar uma mensagem. Caso seja possível realizar o saque, o programa deverá apresentar a quantidade de notas de R$5, R$10, R$20, R$50 ou R$100 que serão usadas para formar a quantia desejada. 

Atenção: só é possível realizar o saque caso a quantidade de notas existentes no caixa seja suficiente para formar a quantia desejada.
c) Para repor, o usuário deverá informar a quantidade de notas de R$5, R$10, R$20, R$50 e R$100 que serão repostas no caixa. Caso o usuário informe uma quantia inválida (valor menor que zero), o programa deverá apresentar uma mensagem.
d) Ao selecionar a opção Consultar Saldo, o programa deverá apresentar uma estatística mostrando o saldo atual do caixa eletrônico, a quantidade total de saques realizada, o valor total de saques realizados e a quantidade de notas de R$5, R$10, R$20, R$50 e R$100 existentes no caixa.
e) Ao iniciar o programa, o caixa eletrônico deverá estar vazio.Para verificar como deve ser implementada a interface e os detalhes do comportamentoesperado, execute o programa trabalhoA2.exe.
Atenção: Caso haja algum erro do tipo "java não encontrado" é porque o path usado para buscar os programas não está incluindo o diretório onde está instalada a JVM. Configure seu sistema corretamente para poder executar o programa.
Do ponto de vista da solução apresentada, espera-se que sejam criadas pelo menos duas classes:
* Uma para representar o comportamento do Caixa Eletrônico em si, com métodos parareposição, saque, consulta de saldo, total de saques, etc.;
* Outra para representar a interface com o usuário, onde será apresentado o menu, aentrada de dados com as mensagens de erro, a apresentação dos resultados, etc.
* Na classe do Caixa Eletrônico não pode haver comandos de entrada e saída com ousuário. 
