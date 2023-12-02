from Database import Database
from Contatos import Contatos
from Linkedin import Linkedin


db_config = {
    'user':'turma6ntop',
    'password':'turma6ntop',
    'host':'db4free.net',
    'database':'linkedin6n',
    'port': 3306
}

contato = Contatos(25, "lorenzoebryan", "@lorenzoebryan")
linkedin = Linkedin(db_config)

linkedin.adicionar_contato(contato)