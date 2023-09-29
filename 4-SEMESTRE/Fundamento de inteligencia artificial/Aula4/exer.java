// exemplo de SRP não aplicado

class gerenciadorArquivo {
    void manipularArquivo(String nomeArquivo, String conteudo){
        /* ler, modificar, escrever */
    }
}

// exemplo de SRP aplicado

class gerenciadorArquivo {
    void lerArquivo(String nomeArquivo){/* ler arquivo */}
    void escreverArquivo(String nomeArquivo, String conteudo){
        /* escrever arquivo */
    }
}

// exemplo de OCP não aplicado

class Forma {
    double calcularArea(String tipoForma) {
        if (tipoForma.equals("circulo")) { /* cálculo da área do círculo */ }
        else if (tipoForma.equals("quadrado")) { /* cálculo da área do quadrado */ }
    }
}

// exemplo de OCP aplicado

abstract Forma{
    abstract double calcularArea();
}

class Circulo extends Forma{
    @Override
    double calcularArea(String tipoForma) {
        /* cálculo da área do círculo */
    }
}

class Quadrado extends Forma{
    @Override
    double calcularArea(String tipoForma) {
        /* caculo da area */
    }
}

// exemplo de LSP não aplicado

class passaro {
    void voar() { /* voar */ }
}

class avestruz extends passaro {
    void voar() { /* implementação inadequada para avestruzes */ }
};

// exemplo de LSP aplicado

class Passaro {
    void voar() { /* voar */ }
}

class Pardal extends Passaro {
    void voar() { /* voar como pardal */ }
}

class Avestruz extends Passaro {
    void voar() { throw new RuntimeException("As avestruzes não voam"); }
}

// exemplo de ISP nao aplicado

interface Trabalhador {
    void trabalhar();
    void comer();
}

class Engenheiro implements Trabalhador {
    void trabalhar() { /* trabalho de engenharia */ }
    void comer() { /* comer */ }
}

// exemplo de ISP aplicado

interface Trabalhador {
    void trabalhar();
}

class Engenheiro implements Trabalhador {
    void trabalhar() { /* trabalho de engenharia */ }
}

class Robo implements Trabalhador {
    void trabalhar() { /* tarefas do robô */ }
}

// exemplo de DIP nao aplicado

class EnviadorEmail {
    void enviarEmail(String email, String mensagem) { /* enviar e-mail */ }
}

class ServicoNotificacao {
    private EnviadorEmail enviador;
    ServicoNotificacao(EnviadorEmail enviador) { this.enviador = enviador; }
}

// exemplo de DIP aplicado

interface EnviadorMensagem {
    void enviarMensagem(String mensagem);
}

class EnviadorEmail implements EnviadorMensagem {
    void enviarMensagem(String mensagem) { /* enviar e-mail */ }
}

class ServicoNotificacao {
    private EnviadorMensagem enviador;
    ServicoNotificacao(EnviadorMensagem enviador) { this.enviador = enviador; }
}
