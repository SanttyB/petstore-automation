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
    E clicar em execute
    Então terei o retorno da chamada com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | id | petId | quantity | shipDate                 | status   | complete |
      | CN001.CT001 | Chamada do store 1 |  1 |    16 |       15 | 2021-06-27T09:04:20.844Z | placed   | true     |
      | CN001.CT002 | Chamada do store 2 |  2 |    34 |       50 | 2021-07-08T14:01:40.854Z | unplaced | true     |
      | CN001.CT003 | Chamada do store 3 |  3 |    41 |      100 | 2021-04-01T13:14:25.869F | unplaced | true     |
      | CN001.CT004 | Chamada do store 4 |  4 |     9 |        3 | 2020-12-31T09:08:50.415B | placed   | false    |
      | CN001.CT005 | Chamada do store 5 |  5 |    50 |       32 | 2021-01-15T11:17:30.547A | placed   | false    |

  @find-purchase
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira buscar uma compra
    Quando eu inserir os dados necessários corretamente <petId>
    E clicar em search
    Então Terei o retorno da compra com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | petId |
      | CN001.CT001 | Busca da compra 1  |    16 |
      | CN001.CT002 | Busca da compra 2  |    34 |
      | CN001.CT003 | Busca da compra 3  |    41 |
      | CN001.CT004 | Busca da compra 4  |     9 |
      | CN001.CT005 | Busca da compra 5  |    50 |

  @delete-purchase
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira deletar uma compra
    Quando eu inserir os dados corretamente <id>
    E clicar em done
    Então terei a compra excluida com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario   | id |
      | CN001.CT001 | exclusão da compra 1 |  1 |
      | CN001.CT002 | exclusão da compra 2 |  2 |
      | CN001.CT003 | exclusão da compra 3 |  3 |
      | CN001.CT004 | exclusão da compra 4 |  4 |
      | CN001.CT005 | exclusão da compra 5 |  5 |
