public class GerenciamentoCampeonato 
    {
        public static void main(String[] args) {
            // Criando as equipes
            Equipe equipe1 = new Equipe("SK Gaming");
            Equipe equipe2 = new Equipe("Astralis");

            // Registrando vitórias, derrotas e empates das equipes
            equipe1.registrarVitoria();
            equipe1.registrarVitoria();
            equipe1.registrarDerrota();
            equipe2.registrarVitoria();
            equipe2.registrarEmpate();

            // Imprimindo informações das equipes
            System.out.println("Equipe 1: " + equipe1.getNome());
            System.out.println("Vitórias: " + equipe1.getVitorias());
            System.out.println("Derrotas: " + equipe1.getDerrotas());
            System.out.println("Empates: " + equipe1.getEmpates());

            System.out.println("Equipe 2: " + equipe2.getNome());
            System.out.println("Vitórias: " + equipe2.getVitorias());
            System.out.println("Derrotas: " + equipe2.getDerrotas());
            System.out.println("Empates: " + equipe2.getEmpates());
        }
    }

