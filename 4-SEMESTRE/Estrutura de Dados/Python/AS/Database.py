import mysql.connector

class Database:
    def __init__(self, db_config):
        self.db_config = db_config
        self.criar_banco()

    def criar_banco(self):
        conn = mysql.connector.connect(**self.db_config)
        cursor = conn.cursor()

        cursor.execute(
            '''CREATE TABLE IF NOT EXISTS contatoslorenzoBryan (
            id INTEGER PRIMARY KEY,
            nome TEXT,
            perfil_linkedin TEXT
            )'''
        )

        cursor.execute(
            '''CREATE TABLE IF NOT EXISTS conexoes (
            id INTEGER PRIMARY KEY,
            contato1_id INTEGER,
            contato2_id INTEGER,
            FOREIGN KEY (contato1_id) REFERENCES contatos(id) ON DELETE CASCADE,
            FOREIGN KEY (contato2_id) REFERENCES contatos(id) ON DELETE CASCADE
            )'''
        )

        conn.commit()
        conn.close()

    def adicionar_contato(self, id, nome, perfil_linkedin):
        conn = mysql.connector.connect(**self.db_config)
        cursor = conn.cursor()

        cursor.execute('INSERT INTO contatos (id, nome, perfil_linkedin) VALUES (%s, %s, %s)', (id, nome, perfil_linkedin))
        conn.commit()
        conn.close()

        print('sucesso')

    # def listar_contatos(self):
    #     conn = mysql.connector.connect('linkedin_network.db')
    #     cursor = conn.cursor()

    #     cursor.execute('SELECT * FROM contatos')
    #     contatos = cursor.fetchall()

    #     conn.close()
    #     return contatos
