public class Main {
    public short bird = 32767;
    public char mammal = (short)83;
    // public char fish = (short)-1;
    public long max = 3123456789L;
    
    public int octal = 017;
    public int hexa = 0xff;
    public byte bi = 0b110;

    public float ff;
    public double dd;

    public float otherFloat = 10.0f;

    public double notAtStart = 1_000.00;
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.bird);
        System.out.println(main.mammal);
        System.out.println(main.max);
        System.out.println(main.octal);
        System.out.println(main.hexa);
        System.out.println(main.bi);

        System.out.println(main.ff);
        System.out.println(main.dd);
        System.gc();
    }
}