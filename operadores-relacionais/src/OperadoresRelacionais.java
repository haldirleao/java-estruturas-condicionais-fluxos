public class OperadoresRelacionais {
    public static void main(String[] args) throws Exception {

        // Similaridade. Simbologia:
        // == : igualdade
        // != : diferença

        // Tamanho. Simbologia:
        // > : Maior
        // >= : Maior ou igual
        // < : Menor
        // <= : Menor ou igual

        // Crie um projeto para realizar as comparações dadas na videoaula. Acrescente
        // outros exemplos.

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 25.0d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println(
                (String.valueOf(i1 == i2))
                        + (String.valueOf(i1 != i2))
                        + (String.valueOf(i1 > i2))
                        + (String.valueOf(i1 <= i2)));

        System.out.println(
                (String.valueOf(f1 == f2))
                        + (String.valueOf(f1 != f2))
                        + (String.valueOf(f1 > f2))
                        + (String.valueOf(f1 <= f2)));

        System.out.println("Unicode char " + c1 + ": \\u" + Integer.toHexString(c1 | 0x10000).substring(1));
        System.out.println("Unicode char " + c2 + ": \\u" + Integer.toHexString(c2 | 0x10000).substring(1));

        System.out.println(
                (String.valueOf(c1 == c2))
                        + (String.valueOf(c1 != c2))
                        + (String.valueOf(c1 > c2))
                        + (String.valueOf(c1 <= c2)));

        System.out.println(s1 == s2); // Cuidado ao comparar igualdades entre Strings.
        System.out.println(s1 == s3);
        System.out.println(s1 != s2);
        // System.out.println(s1 >= s2); // Erro. Operadores de tamanho não podem ser
        // usados
        // com String.

        System.out.println(b1 == b2);
        System.out.println(b1 != b2);
        // System.out.println(b1 <= b2); // Erro. Estes operadores não podem ser usados
        // com Boolean.

        System.out.println(i2 > f1); // OK comparar tipos númericos distintos.
        System.out.println(d1 == h1);
        System.out.println(l1 == i2);
        System.out.println(l2 >= i1);
        System.out.println(y1 != h1);

        // System.out.println(s2 != c1); // Operandos incompatíveis, logo não há como
        // comparar.
        // System.out.println(s3 != i1); //

    }
}
