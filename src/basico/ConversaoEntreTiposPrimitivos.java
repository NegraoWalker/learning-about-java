package basico;

public class ConversaoEntreTiposPrimitivos {
    public static void main(String[] args) {
        byte var1 = 25;
        short var2 = 1000;
        int var3 = 2000000;
        long var4 = 7800000000L;
        float var5 = 1.756f;
        double var6 = 68.833;
        char var7 = 'A';

        short conversaoDeByteParaShort = var1;
        System.out.println(conversaoDeByteParaShort);

        short conversaoIntParaShort = (short) var3;
        System.out.println(conversaoIntParaShort);

        long conversaoFloatParaLong = (long) var5;
        System.out.println(conversaoFloatParaLong);

        double conversaLongParaDouble = (double) var4;
        System.out.println(conversaLongParaDouble);
    }
}
