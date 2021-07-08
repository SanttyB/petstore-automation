#language: pt
@tag
Funcionalidade: Functions about Pet

  @add-newpet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu esteja na home e queira adicionar um novo pet na store
    Quando eu inserir os dados cadastrais necessários "<categoryName>", "<name>", "<photoUrls>", "<tagName>", "<status>"
    E clicar em insert
    Então terei o pet cadastrado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | categoryName | name     | photoUrls      | tagName | status    |
      | CN001.CT001 | Inserção do pet 1  | pequeno      | pintcher | www.???.com.br | Alfa    | pending   |
      | CN001.CT002 | Inserção do pet 2  | grande       | stella   | www.???.com.br | Beta    | available |
      | CN001.CT003 | Inserção do pet 3  | de fresco    | danielly | www.???.com.br | Delta   | sold      |
      | CN001.CT004 | Inserção do pet 4  | de raça      | becca    | www.???.com.br | Alfa    | pending   |
      | CN001.CT005 | Inserção do pet 5  | viralata     | laika    | www.???.com.br | Beta    | available |

  @upload-image
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu esteja na home e queira adicionar uma foto do pet
    Quando eu inserir os dados necessários <petId> , "<photoUrls>"
    E clicar em enviar
    Então terei a imagem adicionada com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | petId | photoUrls         |
      | CN001.CT001 | Imagem do pet 1    |    11 | c:\\Certo.png     |
      | CN001.CT002 | Imagem do pet 2    |    20 | c:\\Aula0707.png  |
      | CN001.CT003 | Imagem do pet 3    |    50 | c:\\AHH1.png      |
      | CN001.CT004 | Imagem do pet 4    |    12 | c:\\DockerM4.png  |
      | CN001.CT005 | Imagem do pet 5    |    35 | c:\\Triplica1.png |

  @update-pet-in-store
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu esteja na home e desejo atualizar as informações do pet
    Quando eu inserir o id do pet que sera atualizado <petId>
    E inserir os dados que serão alterados "<name>", "<status>"
    E clicar em update
    Então o perfil do pet atualizado na store

    Exemplos: 
      | Cenario     | DescricaoDoCenario   | petId | name     | status    |
      | CN001.CT001 | Atualização do pet 1 |    11 | scooby   | sold      |
      | CN001.CT002 | Atualização do pet 2 |    20 | monica   | available |
      | CN001.CT003 | Atualização do pet 3 |    15 | pintcher | sold      |
      | CN001.CT004 | Atualização do pet 4 |    12 | lalamove | pending   |
      | CN001.CT005 | Atualização do pet 5 |    35 | neguinho | available |

  @find-pet-by-id
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira buscar um determinado pet
    Quando eu inserir o id do pet <petId>
    E clicar no botão search
    Então terei o pet e suas informações encontradas com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario    | petId |
      | CN001.CT001 | Busca por id do pet 1 |    15 |
      | CN001.CT002 | Busca por id do pet 2 |    20 |
      | CN001.CT003 | Busca por id do pet 3 |    50 |
      | CN001.CT004 | Busca por id do pet 4 |    35 |
      | CN001.CT005 | Busca por id do pet 5 |    11 |

  @find-pet-by-status
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu esteja na home e queira saber determinado status de alguns pets
    Quando eu inserir o status desejado "<status>"
    E clicar em search
    Então terei o retorno dos pets que estão nesse status

    Exemplos: 
      | Cenario     | DescricaoDoCenario        | status    |
      | CN001.CT001 | Busca por status do pet 1 | pending   |
      | CN001.CT002 | Busca por status do pet 2 | available |
      | CN001.CT003 | Busca por status do pet 3 | sold      |
      | CN001.CT004 | Busca por status do pet 4 | pending   |
      | CN001.CT005 | Busca por status do pet 5 | available |

  @delete-pet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira excluir um pet
    Quando eu inserir id do pet  <petId>
    E clicar no botao execute
    Então terei o pet excluido com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | petId |
      | CN001.CT001 | exclusão do pet 1  |    12 |
      | CN001.CT002 | exclusão do pet 2  |    35 |
      | CN001.CT003 | exclusão do pet 3  |    20 |
      | CN001.CT004 | exclusão do pet 4  |    15 |
      | CN001.CT005 | exclusão do pet 5  |    11 |

  @update-pet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu esteja na home e queira atualizar as informações de um pet
    Quando eu inserir os dados que desejo atualizar <petId> , <categoryId>, "<categoryName>", "<name>", "<photoUrls>", <tagId>, "<tagName>", "<status>"
    E clicar em done
    Então terei as informações do pet atualizadas com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario   | petId | categoryId | categoryName | name     | photoUrls      | tagId | tagName | status    |
      | CN001.CT001 | Atualização do pet 1 |    11 |          1 | pequeno      | pintcher | www.???.com.br |  1133 | Alfa    | sold      |
      | CN001.CT002 | Atualização do pet 2 |    12 |          3 | grande       | stella   | www.???.com.br |  5987 | Beta    | available |
      | CN001.CT003 | Atualização do pet 3 |    15 |          4 | de fresco    | danielly | www.???.com.br |  1456 | Delta   | sold      |
      | CN001.CT004 | Atualização do pet 4 |    20 |          6 | de raça      | becca    | www.???.com.br |  3657 | Alfa    | pending   |
      | CN001.CT005 | Atualização do pet 5 |    35 |          2 | viralata     | laika    | www.???.com.br |  2000 | Beta    | available |
