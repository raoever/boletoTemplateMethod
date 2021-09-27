package templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorBoletos {
    private LeituraRetorno leituraRetorno;

    public ProcessadorBoletos(LeituraRetorno leituraRetorno){
        this.leituraRetorno = leituraRetorno;
    }
    public final List<Boleto> processar (String nomeArquivo){
        List<Boleto> boletos = new ArrayList<>();
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(nomeArquivo));
            String line;
            while((line =  reader.readLine()) != null){
                String [] vetor = line.split(";");
                Boleto boleto = leituraRetorno.processarLinhaArquivo(vetor);
                boletos.add(boleto);
                System.out.println(boleto);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return boletos;
    }
}
