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
	
	//criada
	public String entradaTotal;

	public String getEntradaTotal() {
		return entradaTotal;
	}

	public void setEntradaTotal(String entradaTotal) {
		this.entradaTotal = entradaTotal;
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
	public void leitura() {
		
		int numSeries = 0;
		numSeries = MyIO.readInt();       
		
		String[] seriesString = new String[numSeries];
		
		for(int i = 0; i < numSeries; i++) {
			entradaTotal = MyIO.readLine();
			seriesString[i] = entradaTotal;
		}
		
		String entrada = MyIO.readLine();
		
		while(!entrada.equals("FIM")) {
			for(int j = 0; j < numSeries; j++) {
				if(seriesString[j].contains(entrada)) {
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
			entrada = MyIO.readLine();
		}
	}

	public class ArquivoTextoLeitura {

		private BufferedReader entrada;
		
		ArquivoTextoLeitura(String data) {	
			
			try {
				entrada = new BufferedReader(new FileReader(data));
			}
			catch (FileNotFoundException excecao) {
				System.out.println("Arquivo nao encontrado");
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
		
		@SuppressWarnings("finally")
		public String ler() {
			
			String textoEntrada = null;
			
			try {
				textoEntrada = entrada.readLine();
			}
			catch (EOFException excecao) { 
				textoEntrada = null;
			}
			catch (IOException excecao) {
				System.out.println("Erro de leitura: " + excecao);
				textoEntrada = null;
			}
			finally {
				return textoEntrada;
			}
		}
	}

	class Fila {

		private Serie[] fila;
		private int frente;
		private int tras;
		private int tamanho;
		
		public Fila(int tamanho) {
			
			fila = new Serie[tamanho];
			frente = 0;
			tras = 0;
			this.tamanho = tamanho;
		}
		
		public boolean filaVazia() {
		
			boolean resp;
			
			if (frente == tras)
				resp = true;
			else
				resp = false;
			return resp;
		}
		
		public boolean filaCheia() {
		
			boolean resp;
			
			if (((tras + 1) % tamanho) == (frente % tamanho))
				resp = true;
			else
				resp = false;
			return resp;
		}
		
		public void enfileirar(Serie novo) throws Exception{
			
			int posicao;
			
			if (! filaCheia()) {
				posicao = tras % tamanho;
				fila[posicao] = novo;
				tras++;
			} else
				throw new Exception("A fila está cheia! Item não enfileirado.");
		}
		
		public Serie desenfileirar() throws Exception{
			
			Serie desenfileirado;
			int posicao;
			
			if (! filaVazia()) {
				posicao = frente % tamanho;
				desenfileirado = fila[posicao];
				frente++;
				return desenfileirado;
			} else
				throw new Exception("A fila está vazia! Item não desenfileirado");
		}
		
		public void imprimir() throws Exception{
			
			int posicao;
			if (! filaVazia()) {
				for (int i = frente; i < tras; i++) {
					posicao = i % tamanho;
					System.out.print("Posição: " + posicao + ": ");
					fila[posicao].imprimir();
				}
			} else
				throw new Exception ("Fila vazia!");
		}
	}
	
	public static void main(String[] args) {
			
		ArquivoTextoLeitura arquivo;
		Fila minhaFila;
		Serie novo;
		Serie desenfileirado;
						
		arquivo = new ArquivoTextoLeitura("data.txt");
		ler();
		minhaFila = new Fila(20);
						
		String lerSerie = arquivo.ler();
		
		novo = new Serie("lerSerie");
			
		try {
				minhaFila.enfileirar(novo);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
}
