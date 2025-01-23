package projeto.entities;

    
    public class cadastroItem{
	
        private String nomeItem;
        private String finalidade;
        private String cor;
        private String marca;
        private int quantidade;
        private int local;

        public cadastroItem(){
            
        }
        
        public cadastroItem(String nomeItem, String finalidade, String cor, String marca, int quantidade, int local) {
            this.nomeItem = nomeItem;
            this.finalidade = finalidade;
            this.cor = cor;
            this.marca = marca;
            this.quantidade = quantidade;
            this.local = local;
        } 

        public String getItem() {
            return nomeItem;
        }
    
        public void setItem(String nomeItem) {
            this.nomeItem = nomeItem;
        }
    
        public String getFinalidade() {
            return finalidade;
        }
    
        public void setFinalidade(String finalidade) {
            this.finalidade = finalidade;
        }
    
        public String getCor() {
            return cor;
        }
    
        public void setCor(String cor) {
            this.cor = cor;
        }
    
        public String getMarca() {
            return marca;
        }
    
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public int getQuantidade() {
            return quantidade;
        }
    
        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    
        public int getLocal() {
            return local;
        }
    
        public void setLocal(int local) {
            this.local = local;
        }

        public String toString() {
            return " | Item : " + getItem() + "\n" +
                   " | Finalidade : " + getFinalidade() + "\n" +
                   " | Cor : " + getCor() + "\n" +
                   " | Marca : " + getMarca() + "\n" +
                   " | Qtde : " + getQuantidade() + "\n" +
                   " | Local: " + getLocal();            
        }
    }

