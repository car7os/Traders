package configuracao;

import java.io.File;

public abstract class Config{

    String arquivo = "dados.db";
    
    String pastaWindows = "C:\\Traders\\";
    String pastaLinux = "\\Traders\\";
    
    String caminhoWindows = pastaWindows+arquivo;
    String caminhoLinux = pastaLinux+arquivo;
    
    String caminho = "ERROR: Sistema não inicializado";
    
    String status = "";
    
    
    public Boolean isArquivo(){

    Boolean isDados = false;
        
    File fileWindows = new File(caminhoWindows);
    File fileLinux = new File(caminhoLinux);
    
    if (fileWindows.exists()){
        isDados = true;
        this.caminho = caminhoWindows;
        this.status = "SUCESS: Sistema Operacional Windows";
    }
    else{
        if (fileLinux.exists()){
            isDados = true;
            this.caminho = caminhoLinux;
            this.status = "SUCESS: Sistema Operacional Linux";

        }
        else{
            isDados = false;
            this.status = "ERROR: O Sistema Operacional Não é Windows nem Unix";
        }
    }

    
    return isDados;
    }
    
    
    public String statusDB(){
        return this.status;
    }
    
}
