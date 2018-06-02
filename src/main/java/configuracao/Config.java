package configuracao;

import java.io.File;

public class Config{

    private String arquivo = "dados.db";
    private String pastaWindows = "C:\\Traders\\";
    private String pastaLinux = "\\Traders\\";
    private String caminho;
    private File file;
    
    protected Boolean isDados(){

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
        isDados();
        return this.caminho;
    }
    
    protected String getArquivo(){
        return this.arquivo;
    }
    
    protected String getCaminhoComArquivo(){
        isDados();
        return file.getPath();
    }
    
}