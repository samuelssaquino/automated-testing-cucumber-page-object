package core;

import static core.DriverFactory.getDriver;

public class Version {
    //SELECIONA A VERSÃO A SER TESTADA
    public static void getUrlVersion() {

        if (Propriedades.versao == Propriedades.Versao.CRUD_JAVASCRIPT) {
            getDriver().get("https://samuelssaquino.github.io/crud-javascript/");
        }
    }
}
