public class Operadores {
    public static void main(String[] args) {
        // String nomeCompleto = "LINGUAGEM " + "JAVA";
        // String concatenacao = "?";

        // concatenacao = 1+1+1+"1";
        // System.out.println(concatenacao); // 31
        
        // concatenacao = 1+"1"+1+1;
        // System.out.println(concatenacao); // 1111
        
        // concatenacao = 1+"1"+1+"1";
        // System.out.println(concatenacao); // 1111

        // concatenacao = "1"+1+1+1;
        // System.out.println(concatenacao); // 1111

        // concatenacao = "1"+(1+1+1);
        // System.out.println(concatenacao); // 13

        // // ternário

        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        if(a==b)
        {
            resultado = "verdadeiro";
        }
        else
        {
            resultado = "falso";
        }
        System.out.println("Resultado 1: ".concat(resultado));
        
        a = b;

        resultado = a == b ? "verdadeiro" : "falso"; 
        System.out.println("Resultado 2: ".concat(resultado));
    }

}
