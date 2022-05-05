package arquivotexto;

public class Aplicacao {

	public static void main(String[] args) {
		ArquivoTextoEscrita arqEscrita;
		ArquivoTextoLeitura  arqEntrada;
		String nomeArquivo;
		String entrada;
		MyIO.println("Informe o nome do arquivo onde estão os dados serão gravados");
        nomeArquivo = MyIO.readLine();
        arqEscrita = new ArquivoTextoEscrita(nomeArquivo);
        
        MyIO.println("Informe o texto que deve ser gravado");
        MyIO.println("Digite SAIR para parar");
        entrada = MyIO.readLine();
        while(! entrada.equals("SAIR")) {
        	arqEscrita.escrever(entrada); //escrevo no artigo e leio o proximo
        	entrada = MyIO.readLine();
        }
        
        arqEscrita.fecharArquivo();
        
        arqEntrada = new ArquivoTextoLeitura(nomeArquivo);
        entrada = arqEntrada.ler();
        while(entrada != null) {
        	MyIO.println(entrada);
        	entrada = arqEntrada.ler();
        }
        
}
}