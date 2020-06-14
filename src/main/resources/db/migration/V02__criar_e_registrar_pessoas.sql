CREATE TABLE pessoa(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(45) NOT NULL, 
	ativo BOOLEAN NOT NULL,
	logradouro VARCHAR(30),
	numero VARCHAR(5),
	complemento VARCHAR(20),
	bairo VARCHAR(20),
	cidade VARCHAR(20),
	estado VARCHAR(20)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

