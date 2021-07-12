#language: pt
@tag
Funcionalidade: Functions about Store of Pets

  @pet-inventories-by-status
  Cenário: Retornar inventários de pets por status
    Dado que eu queira buscar os inventario dos pets
    Quando eu clicar no botão inventory
    Então terei o inventário completo dos pets

  @place-order-pet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira fazer uma chamada de um determinado animal
    Quando eu inserir as informações necessárias <id>, <petId>, <quantity>, "<shipDate>", "<status>", "<complete>"
    E clicar em executar
    Então terei o retorno da chamada com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | id | petId | quantity | shipDate                 | status   | complete |
      | CN001.CT001 | Chamada do store 1 |  1 |    16 |       15 | 2021-06-27T09:04:20.844Z | placed   | true     |
      | CN001.CT002 | Chamada do store 2 |  2 |    34 |       50 | 2021-07-08T14:01:40.854Z | unplaced | true     |
      | CN001.CT003 | Chamada do store 3 |  3 |     6 |      100 | 2021-07-08T14:01:40.854Z | placed   | true     |
      | CN001.CT004 | Chamada do store 4 |  4 |     4 |        3 | 2020-12-31T08:08:50.415Z | placed   | true     |
      | CN001.CT005 | Chamada do store 5 |  5 |     3 |       32 | 2021-01-15T11:17:30.547Z | placed   | true     |

  @find-purchase
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira buscar uma compra
    Quando eu inserir os dados necessários corretamente <petId>
    E clicar  no botão search
    Então Terei o retorno da compra com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | petId |
      | CN001.CT001 | Busca da compra 1  |     1 |
      | CN001.CT002 | Busca da compra 2  |     3 |
      | CN001.CT003 | Busca da compra 3  |     6 |
      | CN001.CT004 | Busca da compra 4  |     5 |
      | CN001.CT005 | Busca da compra 5  |    10 |

  @delete-purchase
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira deletar uma compra
    Quando eu inserir os dados corretamente <id>
    E clicar no execute 
    Então terei a compra excluida com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario   | id |
      | CN001.CT001 | exclusão da compra 1 |  2 |
      | CN001.CT002 | exclusão da compra 2 |  6 |
      | CN001.CT003 | exclusão da compra 3 |  3 |
      | CN001.CT004 | exclusão da compra 4 |  5 |
      | CN001.CT005 | exclusão da compra 5 | 10 |
