public class Contato {
    //Criação de variáveis
    private String nome;
    private String sexo;
    private String telefone;
    private String email;
    private static int contadorCodigo = 0;
    private int codigo;

    //Criação dos construtores
    public Contato(String nome, String sexo, String telefone, String email) {
        this.codigo = contadorCodigo ++;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
    }
    //Criação dos métodos getters and setters    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static int getContadorCodigo() {
        return contadorCodigo;
    }
    public static void setContadorCodigo(int contadorCodigo) {
        Contato.contadorCodigo = contadorCodigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //Criação da formatação toString    
    public String imprimir() {
        return "Código: " + codigo + "\nNome: " + nome + "\nSexo: " + sexo + "\nTelefone: " + telefone + "\nEmail: " + email + "\n";
    }
}

