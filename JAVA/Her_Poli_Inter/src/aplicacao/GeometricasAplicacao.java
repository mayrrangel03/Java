package aplicacao;

public class GeometricasAplicacao {
     static  Quadrado quadrado = new Quadrado();
     static  Retangulo retangulo = new Retangulo();
     static  Triangulo triangulo = new Triangulo();
     
	public static void main(String[] args) {
		
		System.out.println("DIGITE QUAL FORMA VOCE DESEJA CRIAR(1 - quadrado / 2- retangulo / 3- triangulo");
		int forma = MyIO.readInt();

}
}