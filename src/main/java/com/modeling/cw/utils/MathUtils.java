package com.modeling.cw.utils;

public final class MathUtils {

    /**
     * Преобразует массив битов в число [0; 0.5]
     *
     * @param binary массив битов
     * @return чттсло в диапазоне [0; 0.5]
     */
    public static double binaryToDouble(int[] binary) {
        final int correction = binary.length - 1;

        double decimal = 0;
        for (int i = 0; i < binary.length - 1; i++) {
            decimal += binary[i] * (Math.pow(2, i - correction));
        }
        return binary[correction] == 0 ? decimal : -decimal;
    }

}
