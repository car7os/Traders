package configuracao;

import java.io.File;

public abstract class Config{

    String arquivo = "dados.db";
    String pastaWindows = "C:\\Traders\\";
    String pastaLinux = "\\Traders\\";
    String caminho;
    Boolean isPasta;
    Boolean isDados;  
    File file;
    
    public Boolean isBancodeDados(){

    File fileWindows = new File(pastaWindows);
    File fileLinux = new File(pastaLinux);

    isPasta = false;
    isDados = false;
    caminho = ".";

    
    if (fileWindows.isDirectory()){
        this.caminho = pastaWindows;
        isPasta = true;
    }
    else{
        if (fileLinux.isDirectory()){
            this.caminho = pastaLinux;
            isPasta = true;

        }
        else{
            isPasta = false;
        }
    }

    file = new File(this.caminho+arquivo);
    
    if(isPasta && file.exists()){
        isDados=true;
    }

    
    return isDados;
    }
    
    
    
    
}
