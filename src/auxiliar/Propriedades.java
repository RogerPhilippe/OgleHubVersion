package auxiliar;

/**
 *
 * @author Roger Philippe
 */
public class Propriedades {
    private int versao;
    private String versionar, versionamento, alteracoes;
    
    public Propriedades(){
    }

    public Propriedades(int versao, String versionar, String versionamento, String alteracoes) {
        this.versao = versao;
        this.versionar = versionar;
        this.versionamento = versionamento;
        this.alteracoes = alteracoes;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public String getVersionar() {
        return versionar;
    }

    public void setVersionar(String versionar) {
        this.versionar = versionar;
    }

    public String getVersionamento() {
        return versionamento;
    }

    public void setVersionamento(String versionamento) {
        this.versionamento = versionamento;
    }

    public String getAlteracoes() {
        return alteracoes;
    }

    public void setAlteracoes(String alteracoes) {
        this.alteracoes = alteracoes;
    }
    
    
}
