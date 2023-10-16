package main.java;

public class Shein {
        private Shein() {}
        private static Shein instance = new Shein();
        public static Shein getInstance() {
            return instance;
        }
    
        private String nomeProduto;
        private String usuarioOnline;
    
        public String getNomeProduto() {
            return nomeProduto;
        }
    
        public void setNomeProduto(String nomeProduto) {
            this.nomeProduto= nomeProduto;
        }
    
        public String getUsuarioOnline() {
            return usuarioOnline;
        }
    
        public void setUsuarioOnline(String usuarioOnline) {
            this.usuarioOnline = usuarioOnline;
        }
    }



