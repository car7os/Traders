package sistema;

import java.io.File;
import java.util.Properties;


class ArquivoPropriedades {


   private String arquivo = "traders.properties";
    private String pastaWindows = "C:\\Traders\\";
    private String pastaLinux = "\\Traders\\";
    private String caminho;
    private File file;
    
    protected Boolean isArquivoPropriedades(){

    File fileWindows = new File(pastaWindows);
    File fileLinux = new File(pastaLinux);
    Boolean pasta = false;
    Boolean dados = false;
    caminho = "ERROR: Pasta não encontrada.";

    if (fileWindows.isDirectory()){
        this.caminho = pastaWindows;
        pasta = true;
    }
    else{
        if (fileLinux.isDirectory()){
            this.caminho = pastaLinux;
            pasta = true;
        }
        else{
            pasta = false;
        }
    }

    file = new File(this.caminho+arquivo);
    
    if(pasta && file.exists()){
        dados=true;
    }

    return dados;
    }
    
    protected String getCaminho(){
        isArquivoPropriedades();
        return this.caminho;
    }
    
    protected String getArquivo(){
        return this.arquivo;
    }
    
    protected String getCaminhoComArquivo(){
        isArquivoPropriedades();
        return file.getPath();
    }

}
