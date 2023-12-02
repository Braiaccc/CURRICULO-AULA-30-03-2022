from Database import Database

class Linkedin:
    def __init__(self, db_config):
        self.db = Database(db_config)
        self.db.criar_banco()

    def adicionar_contato(self, contato):
        self.db.adicionar_contato(contato.id, contato.nome, contato.perfil_linkedin)