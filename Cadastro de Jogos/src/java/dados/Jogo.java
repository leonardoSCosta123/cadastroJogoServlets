package dados;
public class Jogo{
    private Integer codigo;
    private String titulo;
    private String genero;
    private Integer ano;
    private Double preco;
    private String classificacaoEtaria;
    private String requisitosMinimos;
    public Jogo(Integer codigo,String titulo,String genero,Integer ano,Double preco,String classificacaoEtaria,String requisitosMinimos){
        this.codigo=codigo;
        this.titulo=titulo;
        this.genero=genero;
        this.ano=ano;
        this.preco=preco;
        this.classificacaoEtaria=classificacaoEtaria;
        this.requisitosMinimos=requisitosMinimos;
    }
    public Integer getCodigo(){
        return codigo;
    }
    public void setCodigo(Integer codigo){
        this.codigo=codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public Integer getAno(){
        return ano;
    }
    public void setAno(Integer ano){
        this.ano=ano;
    }
    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco=preco;
    }
    public String getClassificacaoEtaria(){
        return classificacaoEtaria;
    }
    public void setClassificacaoEtaria(String classificacaoEtaria){
        this.classificacaoEtaria=classificacaoEtaria;
    }
    public String getRequisitosMinimos(){
        return requisitosMinimos;
    }
    public void setRequisitosMinimos(String requisitosMinimos){
        this.requisitosMinimos=requisitosMinimos;
    }
}