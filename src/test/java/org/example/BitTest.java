package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BitTest {

    private final Bit bit = new Bit();

    @Test
    @DisplayName("같은 입력값으로 연산결과는 0(false)이다.")
    void same_input_result_false() {
        // given
        int a = 5;
        int b = 5;

        // when
        int result = bit.xor(a, b);

        // then
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("다른 입력값으로 연산결과는 1(true)이다.")
    void diff_input_result_true() {
        // given
        int a = 5;
        int b = 4;

        // when
        int result = bit.xor(a, b);

        // then
        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("한 번만 등장하는 엘리멘트가 결과값이 된다.")
    void only_one_element_result() {
        // given
        int[] nums = {4, 1, 5, 1, 5, 4, 7};

        // when
        int result = bit.xor(nums);

        // then
        Assertions.assertEquals(7, result);
    }

    @Test
    @DisplayName("해밍결과의 값은 비트가 다른 자리의 문자 개수가 된다.")
    void hamming_distance() {
        // 햐
        int a = 1;
        int b = 6;

        int xor = bit.xor(a, b);

        Assertions.assertEquals(3, Integer.bitCount(xor));
    }

}