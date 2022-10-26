public class imprimirDados {
    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa();
        pessoa1.SetAltura(185);
        pessoa1.SetNome("Pedro");
        pessoa1.SetAnoNascimento(2003);
        pessoa1.SetAno(2022);
        pessoa1.SetDataCompeleta("18/09/2003");

        System.out.println(pessoa1.GetNome());
        System.out.println(pessoa1.GetAltura());
        System.out.println(pessoa1.GetAnoNascimento());
        System.out.println(pessoa1.GetAno());
        System.out.println(pessoa1.GetDataCompleta());
    }
}
