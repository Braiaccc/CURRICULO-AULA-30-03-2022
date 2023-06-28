abstract class FormaGeometrica {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

class Triangulo extends FormaGeometrica {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        double s = (ladoA + ladoB + ladoC) / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}

abstract class Pagamento {
    public abstract void realizarPagamento();
    public abstract void emitirRecibo();
}

class CartaoCredito extends Pagamento {
    @Override
    public void realizarPagamento() {
        // Implementação específica para pagamento com cartão de crédito
    }

    @Override
    public void emitirRecibo() {
        // Implementação específica para emissão de recibo para pagamento com cartão de crédito
    }
}

class CartaoDebito extends Pagamento {
    @Override
    public void realizarPagamento() {
        // Implementação específica para pagamento com cartão de débito
    }

    @Override
    public void emitirRecibo() {
        // Implementação específica para emissão de recibo para pagamento com cartão de débito
    }
}

class Dinheiro extends Pagamento {
    @Override
    public void realizarPagamento() {
        // Implementação específica para pagamento em dinheiro
    }

    @Override
    public void emitirRecibo() {
        // Implementação específica para emissão de recibo para pagamento em dinheiro
    }
}

abstract class Animal {
    public abstract void comer();
    public abstract void dormir();
    public abstract void mover();
}

abstract class Arquivo {
    public abstract void abrir();
    public abstract void fechar();
}

class ArquivoTexto extends Arquivo {
    @Override
    public void abrir() {
        // Implementação específica para abrir um arquivo de texto
    }

    @Override
    public void fechar() {
        // Implementação específica para fechar um arquivo de texto
    }
}

class ArquivoImagem extends Arquivo {
    @Override
    public void abrir() {
        // Implementação específica para abrir um arquivo de imagem
    }

    @Override
    public void fechar() {
        // Implementação específica para fechar um arquivo de imagem
    }
}

class ArquivoAudio extends Arquivo {
    @Override
    public void abrir() {
        // Implementação específica para abrir um arquivo de áudio
    }

    @Override
    public void fechar() {
        // Implementação específica para fechar um arquivo de áudio
    }
}

abstract class Produto {
    public abstract double calcularPreco();
    public abstract void exibirDetalhes();
}

class Livro extends Produto {
    @Override
    public double calcularPreco() {
        // Implementação específica para calcular o preço de um livro
        return 0.0;
    }

    @Override
    public void exibirDetalhes() {
        // Implementação específica para exibir os detalhes de um livro
    }
}

class Roupa extends Produto {
    @Override
    public double calcularPreco() {
        // Implementação específica para calcular o preço de uma roupa
        return 0.0;
    }

    @Override
    public void exibirDetalhes() {
        // Implementação específica para exibir os detalhes de uma roupa
    }
}

class Eletronico extends Produto {
    @Override
    public double calcularPreco() {
        // Implementação específica para calcular o preço de um eletrônico
        return 0.0;
    }

    @Override
    public void exibirDetalhes() {
        // Implementação específica para exibir os detalhes de um eletrônico
    }
}

abstract class Funcionario {
    public abstract double calcularSalario();
    public abstract void realizarTarefa();
}

class Gerente extends Funcionario {
    @Override
    public double calcularSalario() {
        // Implementação específica para calcular o salário de um gerente
        return 0.0;
    }

    @Override
    public void realizarTarefa() {
        // Implementação específica para realizar as tarefas de um gerente
    }
}

abstract class Jogador {
    public abstract void atacar();
    public abstract void defender();
}

class Atacante extends Jogador {
    @Override
    public void atacar() {
        // Implementação específica para um atacante atacar
    }

    @Override
    public void defender() {
        // Implementação específica para um atacante defender
    }
}

class MeioCampo extends Jogador {
    @Override
    public void atacar() {
        // Implementação específica para um meio-campo atacar
    }

    @Override
    public void defender() {
        // Implementação específica para um meio-campo defender
    }
}

class Goleiro extends Jogador {
    @Override
    public void atacar() {
        // Implementação específica para um goleiro atacar
    }

    @Override
    public void defender() {
        // Implementação específica para um goleiro defender
    }
}
abstract class Impressora {
    public abstract void imprimir();
    public abstract void escanear();
}

class ImpressoraJatoTinta extends Impressora {
    @Override
    public void imprimir() {
        // Implementação específica para uma impressora jato de tinta imprimir
    }

    @Override
    public void escanear() {
        // Implementação específica para uma impressora jato de tinta escanear
    }
}

class ImpressoraLaser extends Impressora {
    @Override
    public void imprimir() {
        // Implementação específica para uma impressora a laser imprimir
    }

    @Override
    public void escanear() {
        // Implementação específica para uma impressora a laser escanear
    }
}

class ImpressoraMatricial extends Impressora {
    @Override
    public void imprimir() {
        // Implementação específica para uma impressora matricial imprimir
    }

    @Override
    public void escanear() {
        // Implementação específica para uma impressora matricial escanear
    }
}

abstract class Transporte {
    public abstract void carregar();
    public abstract void descarregar();
}

class Caminhao extends Transporte {
    @Override
    public void carregar() {
        // Implementação específica para um caminhão carregar
    }

    @Override
    public void descarregar() {
        // Implementação específica para um caminhão descarregar
    }
}

class Trem extends Transporte {
    @Override
    public void carregar() {
        // Implementação específica para um trem carregar
    }

    @Override
    public void descarregar() {
        // Implementação específica para um trem descarregar
    }
}

class Navio extends Transporte {
    @Override
    public void carregar() {
        // Implementação específica para um navio carregar
    }

    @Override
    public void descarregar() {
        // Implementação específica para um navio descarregar
    }
}

class Pendrive extends DispositivoArmazenamento {
    @Override
    public void lerDados() {
        // Implementação específica para ler dados de um pendrive
    }

    @Override
    public void gravarDados() {
        // Implementação específica para gravar dados em um pendrive
    }
}

class DiscoRigido extends DispositivoArmazenamento {
    @Override
    public void lerDados() {
        // Implementação específica para ler dados de um disco rígido
    }

    @Override
    public void gravarDados() {
        // Implementação específica para gravar dados em um disco rígido
    }
}

class CartaoMemoria extends DispositivoArmazenamento {
    @Override
    public void lerDados() {
        // Implementação específica para ler dados de um cartão de memória
    }

    @Override
    public void gravarDados() {
        // Implementação específica para gravar dados em um cartão de memória
    }
}

