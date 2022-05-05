class Item {
    
    private final int valor;

    private Item proximo;

    public int getValor() {
        return valor;
    }

    public Item(int valor) {
        this.valor = valor;
    }

    public Item getProximo() {
        return this.proximo;
    }

    public void setProximo(Item proximo) {
        this.proximo = proximo;
    }

    public String toString() {
        return "" + this.valor;
    }



}