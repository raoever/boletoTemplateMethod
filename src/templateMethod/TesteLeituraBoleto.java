package templateMethod;

public class TesteLeituraBoleto {
    public static void main(String[] args) {
        final ProcessadorBoletos processador1 = new ProcessadorBoletos(new LeituraRetornoBradesco());
            String nomeArquivo1="";
            try {
                nomeArquivo1 = TesteLeituraBoleto.class.getResource("/bradesco-1.csv").getPath();
                System.out.println("Lendo arquivo " + nomeArquivo1 + "\n" +"Bradesco:");
                processador1.processar(nomeArquivo1);
            } catch (Exception e) {
                System.out.println("Erro ao ler o arquivo");
            }

        final ProcessadorBoletos processador2 = new ProcessadorBoletos(new LeituraRetornoBancoBrasil());
        String nomeArquivo2="";
        try {
            nomeArquivo2 = TesteLeituraBoleto.class.getResource("/banco-brasil-1.csv").getPath();
            System.out.println("Lendo arquivo " + nomeArquivo2 + "\n" + "Brasil:");
            processador2.processar(nomeArquivo2);
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo");
        }


    }
}
