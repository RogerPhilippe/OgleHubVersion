/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Roger Philippe
 */
public class Auxiliar {

    private int versao;
    private String versionar, versionamento, alteracoes;

    //Ler arquivo propriedades
    public Propriedades lerProp() throws IOException {
        Properties prop = getProp();
        versao = Integer.parseInt(prop.getProperty("versao"));
        versionar = prop.getProperty("versionar");
        versionamento = prop.getProperty("versionamento");
        alteracoes = prop.getProperty("alteracoes");
        Propriedades propriedades = new Propriedades(versao, versionar, versionamento, alteracoes);
        return propriedades;
    }

    public static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(Utils.getInstance().getAppPath("asset") + "\\dados.properties");
        //FileInputStream file = new FileInputStream("dados.properties");
        props.load(file);
        return props;

    }

    //Escrever no properties
    public void escreverProp(int versao, String versionar, String versionamento, String alteracoes) {
        //Ler
        File file = new File(Utils.getInstance().getAppPath("asset") + "\\dados.properties");
        //File file = new File("dados.properties");
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(file);
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Alterar
        properties.setProperty("versao", String.valueOf(versao));
        properties.setProperty("versionar", versionar);
        properties.setProperty("versionamento", versionamento);
        properties.setProperty("alteracoes", alteracoes);

        //Salvar
        try {
            FileOutputStream fos = new FileOutputStream(file);
            properties.store(fos, "Alteração properties:");
            fos.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

}
