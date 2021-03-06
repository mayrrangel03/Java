package fila;
import java.io.*;
class Serie {

	private String nome;
	private String formato;
	private String duracao;
	private String paisDeOrigem;
	private String idiomaDeOrigem;
	private String emissoraDeTelevisaoOriginal;
	private String dataDeInicioDaTransmissaoOriginal;
	private int numeroDeTemporadas;
	private int numeroDeEpisodios;
	
	//criadas
	private int episodiosVistos;
	public String entradaTotal;

	public String getEntradaTotal() {
		return entradaTotal;
	}

	public void setEntradaTotal(String entradaTotal) {
		this.entradaTotal = entradaTotal;
	}

	private BufferedReader entrada;
	Serie(String nomeArquivo) {
	try {
	entrada = new BufferedReader(new FileReader("data.txt"));
	}
	catch (FileNotFoundException excecao) {
	System.out.println("Arquivo nao encontrado");
	}
	}
	//construtor
	public Serie(String nome, String formato, String duracao, String idiomaDeOrigem, String paisDeOrigem, String emissoraDeTelevisaoOriginal,
		String dataDeInicioDaTransmissaoOriginal, int numeroDeTemporadas, int numeroDeEpisodios ) {
		this.nome = nome;
		this.formato = formato;
		this.duracao = duracao;
		this.idiomaDeOrigem = idiomaDeOrigem;
		this.paisDeOrigem = paisDeOrigem;
		this.emissoraDeTelevisaoOriginal = emissoraDeTelevisaoOriginal;
		this.dataDeInicioDaTransmissaoOriginal = dataDeInicioDaTransmissaoOriginal;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.numeroDeEpisodios = numeroDeEpisodios;
		
	}
	
	public Serie() {
	}
	
		
	//gets e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}
	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}
	public String getIdiomaDeOrigem() {
		return idiomaDeOrigem;
	}
	public void setIdiomaDeOrigem(String idiomaDeOrigem) {
		this.idiomaDeOrigem = idiomaDeOrigem;
	}
	public String getEmissoraDeTelevisaoOriginal() {
		return emissoraDeTelevisaoOriginal;
	}
	public void setEmissoraDeTelevisaoOriginal(String emissoraDeTelevisaoOriginal) {
		this.emissoraDeTelevisaoOriginal = emissoraDeTelevisaoOriginal;
	}
	public String getDataDeInicioDaTransmissaoOriginal() {
		return dataDeInicioDaTransmissaoOriginal;
	}
	public void setDataDeInicioDaTransmissaoOriginal(String dataDeInicioDaTransmissaoOriginal) {
		this.dataDeInicioDaTransmissaoOriginal = dataDeInicioDaTransmissaoOriginal;
	}
	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}
	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}
	public int getNumeroDeEpisodios() {
		return numeroDeEpisodios;
	}
	public void setNumeroDeEpisodios(int numeroDeEpisodios) {
		this.numeroDeEpisodios = numeroDeEpisodios;
	}
	
	//criados
	
	public int getEpisodiosVistos() {
		return episodiosVistos;
	}

	public void setEpisodiosVistos(int episodiosVistos) {
		this.episodiosVistos = episodiosVistos;
	}
	
	
	//clone
	public Serie clone() {
		Serie copia;
		copia = new Serie(this.nome,this.formato, this.duracao, this.paisDeOrigem, this.idiomaDeOrigem, this.emissoraDeTelevisaoOriginal, this.dataDeInicioDaTransmissaoOriginal
				,this.numeroDeTemporadas, this.numeroDeEpisodios);

		return copia;
	}
	
	//imprimir
	public void imprimir() {
		MyIO.println(getNome() + " ## " + getFormato() + " ## " + getDuracao() + " ## " + getPaisDeOrigem() + " ## "
				+ getIdiomaDeOrigem() + " ## " + getEmissoraDeTelevisaoOriginal() + " ## " + getDataDeInicioDaTransmissaoOriginal()
				+ " ## " + getNumeroDeTemporadas() + " ## " + getNumeroDeEpisodios());
		}
	
	//ler
	public void ler() {
		
		
		int numSeries = 0;
		numSeries = MyIO.readInt();       
		
		String[] seriesString = new String[numSeries];
		for(int i = 0; i < numSeries; i++) {
			try {
				entradaTotal = entrada.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			seriesString[i] = entradaTotal;
		}		
		
		while(!entradaTotal.equals("FIM")) {
			for(int j = 0; j < numSeries; j++) {
				if(seriesString[j].contains(entradaTotal)) {
					String[] textoSeparado = seriesString[j].split(";");
					setNome(textoSeparado[0]);
					setFormato(textoSeparado[1]);
					setDuracao(textoSeparado[2]);
					setPaisDeOrigem(textoSeparado[3]);
					setIdiomaDeOrigem(textoSeparado[4]);
					setEmissoraDeTelevisaoOriginal(textoSeparado[5]);
					setDataDeInicioDaTransmissaoOriginal(textoSeparado[6]);
					setNumeroDeTemporadas(Integer.parseInt(textoSeparado[7]));
					setNumeroDeEpisodios(Integer.parseInt(textoSeparado[8]));
					imprimir();
				}
			}
			try {
				entradaTotal = entrada.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		public void fecharArquivo() {
			try {
			entrada.close();
			}
			catch (IOException excecao) {
				System.out.println("Erro no fechamento do arquivo de leitura: " + excecao);
			}
		}

		public static void main(String[] args) {
			   
			Serie Netflix = new Serie();
			Netflix.ler();
		}
}
