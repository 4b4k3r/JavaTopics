package com.jm.poo.operators;

/**
 * Bitwise have only four bit operators called Bitwise 'Bitwise operators'
 */
public class Bitwise {
    public static void main(String[] args) {
        System.out.println("AND operation '&'");
        and(12, 25);
        System.out.println("OR operation '|'");
        or(15, 20);
        System.out.println("XOR operation '^'");
        xor(15, 20);
        System.out.println("Complement 1 '~'");
        complement1(220);
        System.out.println("Complement 2 = -(n+1)");
        complement2(220);
    }

    /**
     * AND operation specify :
     *
     * If both bits in same position are equals then return 1 (1==1 = 1)
     * if firstNumberBits[n] == 1 && secondNumberBits[n] == 1 then newNumberBits[n] = 1
     *
     * If one of both bits in same position is zero then return 0 (1!=1 = 0)
     * if firstNumberBits[n] == 0 || secondNumberBits[n] == 0 then newNumberBits[n] = 0
     *
     * @param n1 First number to compare
     * @param n2 Second number to compare
     */
    private static void and(Integer n1, Integer n2) {
        printFormatted(n1, n2, n1 & n2, Integer.max(BitUtils.length(Integer.toBinaryString(n1)), BitUtils.length(Integer.toBinaryString(n2))));
    }

    /**
     * OR operation specify :
     *
     * If one of both bits in same position is 1 then return 1
     * if firstNumberBits[n] == 1 || secondNumberBits[n] == 1 then newNumberBits[n] = 1
     *
     * @param n1 First number to compare
     * @param n2 Second number to compare
     */
    private static void or(Integer n1, Integer n2) {
        printFormatted(n1, n2, n1 | n2, Integer.max(BitUtils.length(Integer.toBinaryString(n1)), BitUtils.length(Integer.toBinaryString(n2))));
    }

    /**
     * XOR operation specify :
     *
     * If both bits in same position are the same then return 1 (no matter if there are 0 and 0 or 1 and 1)
     * if firstNumberBits[n] == secondNumberBits[n] == 1 then newNumberBits[n] = 1
     *
     * @param n1 First number to compare
     * @param n2 Second number to compare
     */
    private static void xor(Integer n1, Integer n2) {
        printFormatted(n1, n2, n1 ^ n2, Integer.max(BitUtils.length(Integer.toBinaryString(n1)), BitUtils.length(Integer.toBinaryString(n2))));
    }


    /**
     * Complement method specify -(n)-1
     *
     * Invert the bit values of the number and return it as negative value
     * ej
     *
     * 35 = 00100011 (In Binary)
     *
     * Bitwise complement Operation of 35
     * ~ 00100011
     *   ________
     *   11011100  = 220 (In decimal)
     *
     *   as negative will be -221
     *
     *   Why ?
     *   because the negative line starts at -1 and not at 0 as it is the positive line
     *
     * @param n1 to get a complement
     */
    private static void complement1(Integer n1) {
        Integer length = Integer.min(BitUtils.length(Integer.toBinaryString(n1)), BitUtils.length(Integer.toBinaryString(~n1)));
        String format = "%" + length + "s=%s";
        String val1 = Integer.toBinaryString(n1);
        String val2 = Integer.toBinaryString(~n1);
        System.out.println("After  = " + String.format(format, val1.substring(val1.length() - length), n1).replace(" ", "0"));
        System.out.println("Before = " + String.format(format, val2.substring(val2.length() - length), ~n1).replace(" ", "0"));
    }

    /**
     * 2 Complement method specify -(n+1)
     *
     * Invert the bit values of the number and return it as negative value
     * ej
     *
     * 35 = 00100011 (In Binary)
     *
     * Bitwise complement Operation of 35
     * ~ 00100011
     *   ________
     *   11011100  = 220 (In decimal)
     *
     *   as negative will be -221
     *
     *   Why ?
     *   because the negative line starts at -1 and not at 0 as it is the positive line
     *
     * @param n1 to get a complement
     */
    private static void complement2(Integer n1) {
        String fotmat = "\n%6s\t|%10s\t|%40s";
        System.out.format(fotmat, "Decimal", "Binary", "2 complement");
        System.out.format(fotmat, "-", "-", "-");
        int length = Integer.min(BitUtils.length(Integer.toBinaryString(n1)), BitUtils.length(Integer.toBinaryString(~n1)));
        String firstComplement = Integer.toBinaryString(~n1);
        firstComplement = firstComplement.substring(firstComplement.length() - length);
        String secondComplement = BitUtils.sumOne(firstComplement, false);
        int finalValue = -Integer.parseInt(secondComplement, 2);
        System.out.format(fotmat, n1, Integer.toBinaryString(n1), "-("+firstComplement+"+1) = -"+secondComplement+" = "+finalValue+"(decimal)");
    }

    private static void printFormatted(Integer n1, Integer n2, Integer result, Integer length) {
        String format = "%" + length + "s=%s";
        System.out.println(String.format(format, Integer.toBinaryString(n1), n1).replace(" ", "0"));
        System.out.println(String.format(format, Integer.toBinaryString(n2), n2).replace(" ", "0"));
        System.out.println(String.format(format, "", "").replaceAll("[ =]", "-"));
        System.out.println(String.format(format, Integer.toBinaryString(result), result).replace(" ", "0") + "\n");
    }
}
