package sistema;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

class PropertiesLoader {
    
    private Properties props;
    private String nomeDoProperties;

    protected PropertiesLoader(){
        try {
        
        ArquivoPropriedades arquivo = new ArquivoPropriedades();
        arquivo.isArquivoPropriedades();
        
        nomeDoProperties = arquivo.getArquivo();
        
            props = new Properties();
            //InputStream in = this.getClass().getResourceAsStream(nomeDoProperties);
            File file = new File(arquivo.getCaminhoComArquivo());
            InputStream in;
            in = new FileInputStream(file);
            
            try{
                    props.load(in);
                    in.close();
            }
            catch(IOException e){e.printStackTrace();}
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PropertiesLoader.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    protected String getValor(String chave){
            return (String)props.getProperty(chave);
    }
}