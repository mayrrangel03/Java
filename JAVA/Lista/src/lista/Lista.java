package lista;
import java.util.ArrayList;
public class Lista {
	public static void main(String[] args) {
	  ArrayList<Usuario> lista = new ArrayList<>(); //usuario é um tipo , então a lista é um arraylist do tipo usuario
	  
	  Usuario u1 = new Usuario("Mayara");
	  lista.add(u1); //adicionar o usuario u1
	  Usuario u2 = new Usuario("Camila");
	  lista.add(u2);
	  Usuario u3 = new Usuario("Sandra");
	  lista.add(u3);
	  Usuario u4 = new Usuario("Matheus");
	  lista.add(u4);
	  
	  for(Usuario u : lista) { //para cada usuario u da lista faça
		  System.out.println(u.nome);
	  }
	  
	  System.out.println(lista.get(2).nome); //mostra o usuario com o indice 2
	  
	  lista.remove(0); //remove a partir do indice 
	  lista.remove(u4);// remove a partir do objeto em si
	  for(Usuario u : lista) { //para cada usuario u da lista faça
		  System.out.println("removeu alguns e ficaram somente os :" + u.nome);
	  }
	  
	  System.out.println("TEM SANDRA? " + lista.contains(u3));
  }
}
