"   1.
Considerando a criação das tabelas no banco de dados, existe alguma restrição quanto a ordem de execução? Se existe, defina uma sequência correta para a criação das tabelas do esquema acima.

        R= Sim, possui uma ordem correta para criação das tabelas no banco de dados, por conta das dependências entre as tabelas.
  
    A sequencia correta seria assim:

     * Cidade (codcid, nome, uf)
   
     * Filial(codfilial, nome, endereço, codcid)
   
     * Produto (codprod, descrição, preço, nomecategoria, descricaocategoria)
   
     * Empregado(codemp, nome, endereço, codcid, ct, rg, cpf, salário, codfilial)
    
     * Vende (codprod, codfilial)

    Como algumas tabelas possuem uma chave estrangeira, ela acaba se tornando dependende de outra tabela.
"

"===================================================================================================================="


"
    2. 
    Utilize o Notepad++ ou um editor de sua preferência (workbench) para criar o esquema de dados apresentado acima.

        R= 
  CREATE TABLE Empregado (
  codemp INT PRIMARY KEY,
  nome VARCHAR(50),
  endereco VARCHAR(100),
  codcid INT,
  ct VARCHAR(20),
  rg VARCHAR(20),
  cpf VARCHAR(20),
  salario DECIMAL(10,2),
  codfilial INT,
  FOREIGN KEY (codcid) REFERENCES Cidade(codcid),
  FOREIGN KEY (codfilial) REFERENCES Filial(codfilial)
);

CREATE TABLE Cidade (
  codcid INT PRIMARY KEY,
  nome VARCHAR(50),
  uf VARCHAR(2)
);

CREATE TABLE Filial (
  codfilial INT PRIMARY KEY,
  nome VARCHAR(50),
  endereco VARCHAR(100),
  codcid INT,
  FOREIGN KEY (codcid) REFERENCES Cidade(codcid)
);

CREATE TABLE Produto (
  codprod INT PRIMARY KEY,
  descricao VARCHAR(100),
  preco DECIMAL(10,2),
  nomecategoria VARCHAR(50),
  descricaocategoria VARCHAR(100)
);

CREATE TABLE Vende (
  codprod INT,
  codfilial INT,
  FOREIGN KEY (codprod) REFERENCES Produto(codprod),
  FOREIGN KEY (codfilial) REFERENCES Filial(codfilial),
  PRIMARY KEY (codprod, codfilial)
);
"


"=========================================================="


"
    3.
Defina a sintaxe SQL para resolver as seguintes questões:

Criar as tabelas vende e filial.

R= CREATE TABLE vende (
  codprod INTEGER,
  codfilial INTEGER,
  PRIMARY KEY (codprod, codfilial),
  FOREIGN KEY (codprod) REFERENCES Produto(codprod),
  FOREIGN KEY (codfilial) REFERENCES Filial(codfilial)
);

CREATE TABLE filial (
  codfilial INTEGER PRIMARY KEY,
  nome VARCHAR(50),
  endereco VARCHAR(100),
  codcid INTEGER,
  FOREIGN KEY (codcid) REFERENCES Cidade(codcid)
);


Listar o valor do produto mais caro.

R= SELECT MAX(preco) AS valor_mais_caro
FROM Produto;


Obter a média dos preços dos produtos.

R= SELECT AVG(preco) AS media_precos
FROM Produto;


Listar o nome dos produtos vendidos pela filial “f3”. (joins)

R= SELECT Produto.descricao
FROM Produto
JOIN vende ON Produto.codprod = vende.codprod
JOIN filial ON vende.codfilial = filial.codfilial
WHERE filial.nome = 'f3';


Listar os nomes e números de RG dos funcionários que moram no Rio Grande do Sul e tem salário superior a R$ 500,00. (joins)

R= SELECT Empregado.nome, Empregado.rg
FROM Empregado
JOIN Cidade ON Empregado.codcid = Cidade.codcid
WHERE Cidade.uf = 'RS' AND Empregado.salario > 500;



"