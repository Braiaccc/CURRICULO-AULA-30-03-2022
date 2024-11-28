class DatabaseConnection:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(DatabaseConnection, cls).__new__(cls)
            # Inicializa a conexão com o banco de dados aqui
            cls._instance.connection = cls._initialize_connection()
        return cls._instance

    @staticmethod
    def _initialize_connection():
        # Simulação de uma conexão com o banco de dados
        return "Conexão com o banco de dados estabelecida."

    def get_connection(self):
        return self.connection

# Testando a implementação do Singleton
if __name__ == "__main__":
    db1 = DatabaseConnection()
    db2 = DatabaseConnection()

    print(db1.get_connection())  # Conexão com o banco de dados estabelecida.
    print(db2.get_connection())  # Conexão com o banco de dados estabelecida.

    # Verificando se ambas as instâncias são iguais
    print(db1 is db2)  # True