package sistema;


public class DataBase {

    private String usuario;
    private String senha;
    private String host;
    private String arquivoSQLite;
    private String tipo;
    Boolean SQLite = false;
    Boolean MySQL = false;
    
    
public DataBase(){
    

    Propriedades propriedades = new Propriedades();
    this.usuario = propriedades.getValor("DataBase.user");
    this.senha = propriedades.getValor("DataBase.psswrd");
    this.host = propriedades.getValor("DataBase.host");
    this.arquivoSQLite = propriedades.getValor("DataBase.sqlite");
    this.tipo = propriedades.getValor("DataBase.DB");
    
    if (this.tipo.equals("SQLite")){
        SQLite = true;
    }else{
        if (this.tipo.equals("MySQL")){
        MySQL = true;
        }
    }
    
    
}





    
}
