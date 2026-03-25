# AluguelFerramentas

## Descrição

Este é um projeto Java desenvolvido em NetBeans para gerenciar o aluguel de ferramentas. A aplicação permite realizar operações CRUD (Criar, Ler, Atualizar, Deletar) em duas entidades principais: Amigos e Ferramentas. É uma aplicação desktop utilizando interface gráfica Swing e banco de dados MySQL.

## Funcionalidades Principais

### Gerenciamento de Amigos
- **Cadastrar Amigo**: Adicionar um novo amigo com nome e número de telefone.
- **Listar Amigos**: Visualizar todos os amigos cadastrados em uma tabela.
- **Editar Amigo**: Atualizar informações de um amigo existente.
- **Excluir Amigo**: Remover um amigo do sistema.

### Gerenciamento de Ferramentas
- **Cadastrar Ferramenta**: Adicionar uma nova ferramenta com modelo, marca e preço.
- **Listar Ferramentas**: Visualizar todas as ferramentas cadastradas em uma tabela.
- **Editar Ferramenta**: Atualizar informações de uma ferramenta existente.
- **Excluir Ferramenta**: Remover uma ferramenta do sistema.

## Estrutura do Projeto

- **DAO (Data Access Object)**: Classes responsáveis pela interação com o banco de dados.
  - `AmigoDAO.java`: Operações CRUD para a entidade Amigo.
  - `FerramentaDAO.java`: Operações CRUD para a entidade Ferramenta.
- **Model**: Classes que representam as entidades do sistema.
  - `Amigo.java`: Modelo para Amigo (nome, telefone, ID).
  - `Ferramenta.java`: Modelo para Ferramenta (modelo, marca, preço, ID).
- **View**: Interfaces gráficas do usuário.
  - `Telaprincipal.java`: Tela principal com navegação para gerenciar amigos e ferramentas.
  - Subpastas `Amigos/` e `Ferramentas/` contendo telas específicas para cada entidade.

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Framework GUI**: Swing (NetBeans Form Editor)
- **Banco de Dados**: MySQL
- **Driver JDBC**: MySQL Connector/J 8.0.33
- **IDE**: NetBeans
- **Build Tool**: Ant

## Pré-requisitos

- Java JDK 8 ou superior instalado.
- MySQL Server instalado e rodando.
- NetBeans IDE (opcional, mas recomendado para desenvolvimento).
- MySQL Connector/J JAR (incluído no classpath do projeto).

## Configuração do Banco de Dados

1. Crie um banco de dados MySQL chamado `db_aluguelferramentas`.
2. Crie as tabelas necessárias:

   ```sql
   CREATE TABLE tb_amigo (
       ID INT PRIMARY KEY,
       nome VARCHAR(255),
       nmrtelefone VARCHAR(20)
   );

   CREATE TABLE tb_ferramenta (
       ID INT PRIMARY KEY,
       modelo VARCHAR(255),
       marca VARCHAR(255),
       preco DOUBLE
   );
   ```

3. Atualize as credenciais de conexão no código (DAO classes) se necessário. Atualmente configurado para:
   - Host: localhost
   - Porta: 3306
   - Usuário: root
   - Senha: Sacul122@DB

## Como Executar

1. Clone ou baixe o projeto.
2. Abra o projeto no NetBeans.
3. Certifique-se de que o MySQL Connector/J está no classpath (verificado em `project.properties`).
4. Execute o build do projeto (Clean and Build).
5. Execute a classe `Principal.java` ou o JAR gerado.

Alternativamente, via linha de comando com Ant:

```bash
ant clean
ant compile
ant jar
java -jar dist/AluguelFerramentas.jar
```

## Estrutura de Arquivos

```
AluguelFerramentas/
├── build.xml
├── manifest.mf
├── nbproject/
│   ├── build-impl.xml
│   ├── genfiles.properties
│   ├── project.properties
│   └── project.xml
├── src/
│   ├── DAO/
│   │   ├── AmigoDAO.java
│   │   └── FerramentaDAO.java
│   ├── Model/
│   │   ├── Amigo.java
│   │   └── Ferramenta.java
│   ├── Principal/
│   │   └── Principal.java
│   └── View/
│       ├── Telaprincipal.java
│       ├── Amigos/
│       │   ├── CadastrarAmigos.java
│       │   ├── GerenciarAmigos.java
│       │   ├── Mensagens.java
│       │   └── TabelaAmigos.java
│       └── Ferramentas/
│           ├── CadastrarFerramenta.java
│           ├── GerenciarFerramentas.java
│           ├── Mensagens.java
│           └── TabelaFerramentas.java
└── test/
```

## Contribuição

Para contribuir com o projeto:
1. Faça um fork do repositório.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto é distribuído sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

## Autor

Lucas</content>
<parameter name="filePath">c:\Users\lucas\OneDrive\Documentos\Projeto CRUD\AluguelFerramentas\README.md