package fila;

public class main {
	  public static void main(String[] args) {
		    Fila minhaFila;
				Serie novo;
				Serie desenfileirado;
				
				minhaFila = new Fila(4);
				
				novo = new Serie(14);
				try {
					minhaFila.enfileirar(novo);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				novo = new Serie(10);
				try {
					minhaFila.enfileirar(novo);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				novo = new Serie(21);
				try {
					minhaFila.enfileirar(novo);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				novo = new Serie(3);
				try {
					minhaFila.enfileirar(novo);
				} catch (Exception e) {
					System.out.println(e.getMessage());   // Exibe essa mensagem
				}
				
				try {
					minhaFila.imprimir();    // 14 - 10 - 21
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				try {
					desenfileirado = minhaFila.desenfileirar();
					System.out.print("Desenfileirado: ");
					desenfileirado.imprimir();    // 14
				} catch (Exception e) {
					System.out.println(e.getMessage());	
				}
				
				try {
					desenfileirado = minhaFila.desenfileirar();
					System.out.print("Desenfileirado: ");
					desenfileirado.imprimir();    // 10
				} catch (Exception e) {
					System.out.println(e.getMessage());	
				}
				
				novo = new Serie(3);
				try {
					minhaFila.enfileirar(novo);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				novo = new Serie(20);
				try {
					minhaFila.enfileirar(novo);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				try {
					minhaFila.imprimir();    // 21 - 3 - 20
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} 
}