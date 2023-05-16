public class Veiculo {

        private String marca;
        private String modelo;

        public Veiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }
    }

    class Carro extends Veiculo {
        private int numPassageiros;

        public Carro(String marca, String modelo, int numPassageiros) {
            super(marca, modelo);
            this.numPassageiros = numPassageiros;
        }

        public int getNumPassageiros() {
            return numPassageiros;
        }
    }

    class Main2 {
        public static void main(String[] args) {
            Veiculo veiculo = new Veiculo("Ford", "Focus");
            Carro carro = new Carro("Chevrolet", "Cruze", 5);

            System.out.println("Veículo: " + veiculo.getMarca() + ", " + veiculo.getModelo());
            System.out.println("Carro: " + carro.getMarca() + ", " + carro.getModelo() + ", " + carro.getNumPassageiros());
        }
    }

