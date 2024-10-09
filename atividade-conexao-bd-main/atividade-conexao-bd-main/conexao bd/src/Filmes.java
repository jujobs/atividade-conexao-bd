package cap12;
public class Filmes {
    private String codigo, titulo, genero, produtora, dataCompra;
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDataCompra() {
        return dataCompra;
    }
    public String setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
        return dataCompra;
    }
    public String getGenero() {
        return genero;
    }
    public String setGenero(String genero) {
        this.genero = genero;
        return genero;
    }
    public String getProdutora() {
        return produtora;
    }
    public String setProdutora(String produtora) {
        this.produtora = produtora;
        return produtora;
    }
    public String getTitulo() {
        return titulo;
    }
    public String setTitulo(String titulo) {
        this.titulo = titulo;
        return titulo;
    }
}
