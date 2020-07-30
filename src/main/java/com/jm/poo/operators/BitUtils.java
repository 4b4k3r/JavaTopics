package com.jm.poo.operators;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BitUtils {
    public static String sumOne(String b1, boolean isNegative) {
        int[] bitArray1 = Stream.of(b1.split("")).mapToInt(Integer::parseInt).toArray();

        int onBit = isNegative ? 0 : 1;
        int ofBit = isNegative ? 1 : 0;
        int pendingBit = onBit;

        for (int i = bitArray1.length - 1; i >= 0; i--) {
            if (pendingBit == onBit && bitArray1[i] == onBit) {
                bitArray1[i] = ofBit;
            } else if (pendingBit == onBit && bitArray1[i] == ofBit) {
                bitArray1[i] = onBit;
                pendingBit = ofBit;
            }
        }

        StringBuilder str = new StringBuilder();

        for (int a : bitArray1) {
            str.append(a);
        }

        return str.toString();
    }

    public static int length(String bits) {
        int length = IntStream.rangeClosed(0, 4).filter(a -> (bits.length() + a) % 4 == 0).findFirst().orElse(0);
        return (length + bits.length()) == 0 ? 4 : (length + bits.length());
    }
}
