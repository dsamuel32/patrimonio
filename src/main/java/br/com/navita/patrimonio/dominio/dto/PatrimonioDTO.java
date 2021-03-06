package br.com.navita.patrimonio.dominio.dto;

public class PatrimonioDTO {

    private String numeroTombo;
    private String nome;
    private String descricao;
    private MarcaDTO marca;

    public PatrimonioDTO() { }

    public PatrimonioDTO(String numeroTombo, String nome, String descricao, Long idMarca, String nomeMarca) {
        this.numeroTombo = numeroTombo;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = new MarcaDTO(idMarca, nomeMarca);
    }

    public String getNumeroTombo() {
        return numeroTombo;
    }

    public void setNumeroTombo(String numeroTombo) {
        this.numeroTombo = numeroTombo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public MarcaDTO getMarca() {
        return marca;
    }

    public void setMarca(MarcaDTO marca) {
        this.marca = marca;
    }
}
