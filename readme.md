### imcmonitor

Trata-se de um sistema de gerenciamento de imc (indice de massa corporal) para coach de academia da área de esportes e saúde controlarem atletas.

#### Apresentação

##### Cenário de apresentação 1

O usuário do sistema (personal trainer) controla o IMC de seus alunos da academia. 

A partir da tela home o personal pode incluir um novo aluno ou adicionar uma nova avaliação para um aluno já cadastrado no sistema.

Para incluir um novo aluno o personal preenche o nome que é obrigatório e clica em cadastrar. Caso o nome já exista o sistema apresenta uma mensagem do tipo alerta indicando que operação não foi concluída.

Para incluir uma nova avaliação, o personal seleciona, obrigatoriamente, da listagem um aluno do cadastrado no sistema, preenche seu peso, sua altura e então clica em incluir avaliação.

A partir desta tela, o usuário também pode sair do sistema. 


##### Cenário de apresentação 2

O sistema também vai permitir um acesso pelo aluno da academia. 

No caso, após logado no sistema, o aluno poderá consultar suas próprias avaliações cadastradas no sistema (incluídas pelo personal trainer da academia)


##### Cenário de apresentação 3

Ao ser cadastrado no sistema, um aluno pode indicar (não obrigatoriamente) também seu número de telefone celular.

Durante a inclusão de uma nova avaliação, caso o aluno tenha o telefone cadastrado, o sistema envia, automaticamente, uma mensagem do tipo SMS para o aluno, informando sua nova avaliação registrada.


##### Cenário de apresentação 4

Como controle da lista de alunos, o sistema deve permitir o bloqueio ou a a remoção de um aluno cadastrado (ativo) no @imcmonitor da academia. 

Um aluno, ou vários, selecionados da listagem, podem ser bloqueados no sistema. Um usuário bloqueado fica privado de acesso para consultas, não podendo mais logar para realizar consultas. Um aluno bloqueado também não permite a inclusão de novas avaliações de IMC pelo personal trainer. Neste processo, o aluno, caso contenha informação de contato (telefone) registrado, recebe automaticamente um SMS notificando-o sobre seu bloqueio no sistema. Para os bloqueios, um aluno pode ser posteriormente reativado no sistema, caso necessário. Está ação é realizada a partir de seu nome, que não é removido da listagem de alunos cadastrados.

Após selecionado da listagem, um aluno bloqueado no sistema, pode ser removido do sistema. Uma vez confirmada a operação (solicitação de confirmação diretamente na tela) o usuário é definitivamente desligado do sistema. Nesta operação, um aluno não é notificado e deve ter seu nome removido da listagem de alunos cadastrados.


##### Cenário de apresentação 5

Na listagem de avaliações cadastradas, além de ser inserida e consultada, uma avaliação também pode ser removida pelo personal trainer. 


#### Historico e evolucao

- [x] entidade simples (Atleta)
- [x] encapsulamento simples com get/set (privando acesso aos atributos)
- [x] teste unitario, simples
- [x] teste unitario, com codigo e manipulacao de Exception
- [x] organização de pastas (inicial) e testes
- [ ] manipulação de Coleções de dados (ArrayList, Map, Set, Resultset, XML, Json, cvs, )







<sup>_@imcmonitor (211) é um projeto de atividade de laboratorio_<sup>
