package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Bit {

    public int xor(int[] nums) {
        return IntStream.of(nums).reduce(0, (result, num) -> result ^ num);
    }

    public int xor(int a, int b) {
        return a ^ b;
    }

}
