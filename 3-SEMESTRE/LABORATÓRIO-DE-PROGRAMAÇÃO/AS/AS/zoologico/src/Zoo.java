public class Zoo {
    //Atributos da classe
    Animal[] animais;
    Funcionario[] funcionarios;
    int qtdFuncionarios = 0;
    int qtdAnimais = 0;

    public Zoo(int numAnimais, int numFuncionarios){
        animais = new Animal[numAnimais];
        funcionarios = new Funcionario[numFuncionarios];

    }

    //Método adicionar() adiciona um funcionário ao array de funcionarios, com o tamanho definido no construtor da classe
    public void adicionar(Funcionario funcionario){
        if(this.qtdFuncionarios <= this.funcionarios.length - 1){ //Verifica se a array de funcionários já esta cheia
            funcionarios[qtdFuncionarios] = funcionario; //Atribui um funcionário a um index do array
            qtdFuncionarios++;
            System.out.printf("Funcionário '%s' adicionado ao zoológico | Cargo: %s\n", funcionario.getNome(), funcionario.getCargo());
        }else{ //Caso a array esteja cheia, o número máximo de funcionários ja foi atingido
            System.err.println("Número máximo de fúncionarios atingido");
        }
    }

    //Método adicionar() adiciona um animal ao array de animais, com o tamanho definido no construtor da classe
    public void adicionar(Animal animal){
        if(this.qtdAnimais <= this.animais.length - 1){
            animais[qtdAnimais] = animal;
            qtdAnimais++;
            System.out.printf("Novo animal adicionado ao zoológico | Espécie: %s | Nome: %s\n", animal.getEspecie(), animal.getNome());
        }else{
            System.err.println("Número máximo de animais atingido");
        }
    }
}
