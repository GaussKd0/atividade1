public class pessoa
{
    private String Nome;
    private int ano;
    private int Altura;
    private int ano_nascimento;
    private String dataCompelta;


    public String GetDataCompleta(){

        return this.dataCompelta;
    }

    public String GetNome(){
         
        return this.Nome;
    }

    public int GetAno(){

        return this.ano -this.ano_nascimento;
    }

    public int GetAltura(){

        return this.Altura;
    }

    public int GetAnoNascimento(){

        return this.ano_nascimento;
    }

    public void SetNome(String Nome){

        this.Nome = Nome;
    }

    public void SetAno(int ano){
        
        this.ano = ano;
    }

    public void SetAltura(int Altura){
        
        this.Altura = Altura;
    }

    public void SetAnoNascimento(int ano_nascimento){
        
        this.ano_nascimento = ano_nascimento;
    }
    public void SetDataCompeleta(String datacompleta){
        
        this.dataCompelta = datacompleta;
    }

}