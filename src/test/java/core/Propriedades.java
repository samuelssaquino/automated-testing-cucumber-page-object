package core;

public class Propriedades {

    public static Browsers browser = Browsers.CHROME;

    public static Versao versao = Versao.CRUD_JAVASCRIPT;

    public enum Browsers {
        CHROME
    }

    //ENUM COM AS VERSÕES A SEREM TESTADAS
    public enum Versao{
        CRUD_JAVASCRIPT
    }
}
