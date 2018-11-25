package com.modeling.cw.utils;

public final class MathUtils {

    /**
     * Преобразует массив битов в число
     *
     * @param binary массив битов
     * @return число в диапазоне
     */
    public static double binaryToDouble(final byte[] binary) {
        final int correction = binary.length - 1;

        double decimal = 0;
        for (int i = 0; i < binary.length - 1; i++) {
            decimal += binary[i] * Math.pow(2, i - correction);
        }
        return binary[correction] == 0 ? decimal : -decimal;
    }

}
