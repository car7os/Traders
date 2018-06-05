package sistema;

public class Propriedades {

    
    public String getValor(String chave){
        
            PropertiesLoader loader = new PropertiesLoader();

            return (String)loader.getValor(chave);
    }

    
}
