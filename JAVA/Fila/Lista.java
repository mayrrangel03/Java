public class Lista {
    
    private Item primeiro;
    private Item ultimo;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public void add(int valor) {
        Item item = new Item(valor);
        if (primeiro == null) {
            primeiro = item;
            primeiro.setProximo(null);
            ultimo = item;
        } else {
            ultimo.setProximo(item);
            ultimo = item;
        }

        this.tamanho++;
    }

    public String toString() {
        String result = "";
        Item corrente = primeiro;
        while (corrente != null) {
            result += corrente.getValor() + " , ";
            corrente = corrente.getProximo();
        }
        return result;
    }

    public static void main(String args[]) {
        Lista lista = new Lista();
        lista.add(4);
        lista.add(8);
        lista.add(23);
        System.out.println(lista);
    }

}
