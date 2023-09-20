package guru.qa;

public class Main {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        byte varByte = 127;
        short varShort = 32767;
        int varInt = 90090055;
        long varLong = 9223372036764685100l;
        float varFloat = 1.1f;
        double varDouble = 1.1;
        char varChar = 'b';
        boolean varBoolean = true;

        System.out.println(ANSI_GREEN + "Приведение типов:" + ANSI_RESET);
        System.out.println("Byte + Short = " + (varByte + varShort));
        System.out.println("Short + Int = " + (varShort + varInt));
        System.out.println("Int + Long = " + (varInt + varLong));

        System.out.println(ANSI_YELLOW + "\nВыход за пределы типов данных:"+ ANSI_RESET);
        System.out.println("значение, если за пределами Byte = " + (byte)(varByte + 1));
        System.out.println("значение, если за пределами Short = " + (short)(varShort + 1));

        System.out.println(ANSI_BLUE+"\nКомбинация типов данных:"+ANSI_RESET);
        System.out.println("Short + Double = " + (varShort + varDouble));
        System.out.println("Long + Float = " + (varLong + varFloat));
        System.out.println("Char + Double = " + (varChar + varDouble));
        System.out.println("True or True = " + (varBoolean || varBoolean));

        System.out.println(ANSI_CYAN+"\nЛогические операторы:"+ANSI_RESET);
        int i = 15;

        if ((i > 0) && (i <= 10))
            System.out.println("i в диапазоне от 0 до 10\n");
        else if ((i > 10) && (i <= 20))
            System.out.println("i в диапазоне от 10 до 20 \n");
        else
            System.out.println("Вне диапазонов поиска");
    }
}


