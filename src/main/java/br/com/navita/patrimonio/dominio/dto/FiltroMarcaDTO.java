package br.com.navita.patrimonio.dominio.dto;

public class FiltroMarcaDTO extends FiltroPaginacaoDTO {

    private Long id;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.upperCase(this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
