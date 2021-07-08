#language: pt
@tag
Funcionalidade: Functions about Users

  @sucesseful-create
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu esteja na home e desejo criar um usuário
    Quando eu preencher os dados cadastrais necessários corretamente "<username>", "<firstName>","<lastName>","<email>","<password>","<phone>"
    E clicar em send
    Então terei meu usuário cadastrado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario   | username       | firstName | lastName           | email                   | password     | phone        |
      | CN001.CT001 | Criação do Usuário 1 | cavalinho      | junior    | ponei santos       | cavaludo@outlook.com    | cavalo154    |  11991302587 |
      | CN001.CT002 | Criação do Usuário 2 | juli.ana       | juliana   | silveira valério   | poneisfofos@outlook.com | vv2215       |    119923695 |
      | CN001.CT003 | Criação do Usuário 3 | simas.turbo    | muito     | tempo              | val.e.ria@hotmail.com   | cxc3333      |    119913114 |
      | CN001.CT004 | Criação do Usuário 4 | patybaby       | patricia  | matos da silva     | paty_fofa@outlook.com   | ptpt123      | 119913025578 |
      | CN001.CT005 | Criação do Usuário 5 | oswaldo.player | oswaldo   | estranho dos anjos | oswal@gmail.com         | fortinite111 |   1199130365 |

  @sucesseful-createArray
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira criar uma lista de usuários
    Quando eu preencher os dados dos usuarios corretamente  "<firstName>","<lastName>","<email>","<password>","<phone>"
    E clicar na celula send
    Então terei minha lista de usuários criada com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario   | username        | firstName | lastName                 | email                     | password    | phone        |
      | CN001.CT001 | Criação do Usuário 1 | vassourapunk    | pedro     | pietro silva             | vassourapk@outlook.com    | carvalho133 |  11914527587 |
      | CN001.CT002 | Criação do Usuário 2 | nicolau.qq      | nicolau   | queiroz quixote          | nico_lau@outlook.com      | loii123     |    119923695 |
      | CN001.CT003 | Criação do Usuário 3 | lindomar.azul   | lindomar  | vieira costa             | azul_lindomar@hotmail.com | marlindo223 |   1199446914 |
      | CN001.CT004 | Criação do Usuário 4 | bicicletinha123 | priscila  | carvalho da silva        | pri_bic@outlook.com       | bibi1147    | 119913025578 |
      | CN001.CT005 | Criação do Usuário 5 | luquinas557     | lucas     | marques lemos dos santos | luquina@gmail.com         | bbb2021     |  11991468865 |

  @sucesseful-find
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu esteja na home
    E queira buscar os dados de um usuário
    Quando eu inserir o nome do usuário "<username>"
    E clicar no botão send
    Então terei o retorno dos dados cadastrados do usuário

    Exemplos: 
      | Cenario     | DescricaoDoCenario | username       |
      | CN001.CT001 | Busca de Usuário 1 | cavalinho      |
      | CN001.CT002 | Busca de Usuário 2 | juli.ana       |
      | CN001.CT003 | Busca de Usuário 3 | simas.turbo    |
      | CN001.CT004 | Busca de Usuário 4 | patybaby       |
      | CN001.CT005 | Busca de Usuário 5 | oswaldo.player |

  @sucesseful-login
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu esteja na home e queria efetuar login no sistema
    Quando eu inserir o usuário e a senha "<username>", "<password>"
    E clicar no botão enviar
    Então terei meu login efetuado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | username       | password     |
      | CN001.CT001 | Login de Usuário 1 | cavalinho      | cavalo154    |
      | CN001.CT002 | Login de Usuário 2 | juli.ana       | vv2215       |
      | CN001.CT003 | Login de Usuário 3 | simas.turbo    | cxc3333      |
      | CN001.CT004 | Login de Usuário 4 | patybaby       | ptpt123      |
      | CN001.CT005 | Login de Usuário 5 | oswaldo.player | fortinite111 |

  @logout-user
  Cenário: fazer logout
    Dado que eu esteja logado no sistema
    E queira efetuar logout do mesmo
    Quando eu clicar no botão de logout
    Então serei deslogado do sistema

  @delete-user
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu esteja logado na home
    E queira deletar um usuário
    Quando eu inserir o nome do usuário no campo de exclusão "<username>"
    E clicar no botão execute
    Então o usuário será deletado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | username       |
      | CN001.CT001 | Deletar Usuário 1  | juli.ana       |
      | CN001.CT002 | Deletar Usuário 2  | cavalinho      |
      | CN001.CT003 | Deletar Usuário 3  | simas.turbo    |
      | CN001.CT004 | Deletar Usuário 4  | patybaby       |
      | CN001.CT005 | Deletar Usuário 5  | oswaldo.player |

  @update-user
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira alterar os dados de algum usuário
    Quando eu inserir o nome do usuário no primeiro campo "<username>"
    E clicar em execute
    E inserir os dados que desejo atualizar  <id> , "<username>","<firstName>","<lastName>","<email>","<password>","<phone>", <userStatus>
    E clicar no botão salvar
    Então terei os dados do meu usuário atualizado

    Exemplos: 
      | Cenario     | DescricaoDoCenario     | id | username        | firstName | lastName          | email                   | password             | phone        | userStatus |
      | CN001.CT001 | Alteração do Usuário 1 | 11 | simas.turbo     | pedro     | pietro silva      | vassourapk@outlook.com  | chiclete541          |  11914527587 |          0 |
      | CN001.CT002 | Alteração do Usuário 2 | 17 | borboletasanta  | nicolau   | queiroz quixote   | nico_lau@outlook.com    | loii123              |    119923695 |          0 |
      | CN001.CT003 | Alteração do Usuário 3 | 50 | simas.turbo     | lindomar  | vieira costa      | simas_turbo@hotmail.com | marlindo223          |   1199446914 |          0 |
      | CN001.CT004 | Alteração do Usuário 4 | 64 | bicicletinha123 | patricia  | coelho dos santos | pri_bic@outlook.com     | patri_moca@gmail.com | 119913025578 |          0 |
      | CN001.CT005 | Alteração do Usuário 5 | 13 | luquinas557     | roberto   | joaquim pereira   | jopereira@gmail.com     | google123            |  11991468865 |          0 |
