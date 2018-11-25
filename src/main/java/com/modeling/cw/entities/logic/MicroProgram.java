package com.modeling.cw.entities.logic;

public class MicroProgram {

    /**
     * Множимое
     */
    private final byte[] aBinary;
    /**
     * Множитель
     */
    private final byte[] bBinary;
    /**
     * Произведение
     */
    private final byte[] cBinary;
    /**
     * Произведение
     */
    private final byte[] amBinary;
    /**
     * Произведение
     */
    private final byte[] bmBinary;
    /**
     * Счетчик
     */
    private int ch;

    public MicroProgram(final byte[] aBinary, final byte[] bBinary) {
        this.aBinary = aBinary;
        this.bBinary = bBinary;
        this.cBinary = new byte[31];
        this.amBinary = new byte[aBinary.length];
        this.bmBinary = new byte[bBinary.length];
    }

    public byte[] execute() {
        if (x0()) {
            if (x1()) {
                y1();
                y2();
                y3();
                y4();
                y5();

                do {
                    if (x2()) {
                        if (x5()) {
                            y9();
                        }
                    } else if (x3()) {
                        if (x5()) {
                            y10();
                        } else {
                            y9();
                        }
                    } else if (x4()) {
                        if (!x5()) {
                            y11();
                        } else {
                            y12();
                        }
                    } else {
                        if (!x5()) {
                            y12();
                        }
                    }

                    y6();
                    y7();
                    y8();
                } while (!x6());

                y13();

                if (x7()) {
                    y14();
                }

                if (x8()) {
                    y15();
                }

                if (x7()) {
                    y16();
                }
            }
        } else {
            y1();
        }

        return cBinary;
    }

    private boolean x0() {
        for (int a : aBinary) {
            if (a == 1) {
                return false;
            }
        }

        return true;
    }

    private boolean x1() {
        for (int b : bBinary) {
            if (b == 1) {
                return false;
            }
        }

        return true;
    }

    private boolean x2() {
        return bmBinary[14] == 0 && bmBinary[15] == 0;
    }

    private boolean x3() {
        return bmBinary[14] == 1 && bmBinary[15] == 0;
    }

    private boolean x4() {
        return bmBinary[14] == 0 && bmBinary[15] == 1;
    }

    private boolean x5() {
        return bmBinary[13] == 1;
    }

    private boolean x6() {
        return ch == 0;
    }

    private boolean x7() {
        return cBinary[31] == 1;
    }

    private boolean x8() {
        return cBinary[14] == 1;
    }

    private void y1() {
        for (int i = 0; i < cBinary.length; i++) {
            cBinary[i] = 0;
        }
    }

    private void y2() {
        ch = 0;
    }

    private void y3() {
        System.arraycopy(bBinary, 1, bmBinary, 0, bmBinary.length - 1);
    }

    private void y4() {

    }

    private void y5() {
        for (int i = 0; i < amBinary.length; i++) {
            amBinary[i] = 0;
        }
    }

    private void y6() {
    }

    private void y7() {
        System.arraycopy(bmBinary, 2, bmBinary, 0, bmBinary.length - 2);
        bmBinary[bmBinary.length - 1] = 0;
        bmBinary[bmBinary.length - 2] = 0;
    }

    private void y8() {
        ch--;
    }

    private void y9() {
        for (int i = 0; i < cBinary.length; i++) {
            cBinary[i] = (byte) ((cBinary[i] + amBinary[i]) % 2);
        }
    }

    private void y10() {
        for (int i = 0; i < cBinary.length - 1; i++) {
            cBinary[i] = (byte) ((cBinary[i] + amBinary[i + 1]) % 2);
        }
        cBinary[cBinary.length - 1] = 0;
    }

    private void y11() {
        System.arraycopy(bmBinary, 1, bmBinary, 0, bmBinary.length);
    }

    private void y12() {
        System.arraycopy(bmBinary, 1, bmBinary, 0, bmBinary.length);
    }

    private void y13() {
        System.arraycopy(bmBinary, 1, bmBinary, 0, bmBinary.length);
    }

    private void y14() {
        System.arraycopy(bmBinary, 1, bmBinary, 0, bmBinary.length);
    }

    private void y15() {
        System.arraycopy(bmBinary, 1, bmBinary, 0, bmBinary.length);
    }

    private void y16() {
        System.arraycopy(bmBinary, 1, bmBinary, 0, bmBinary.length);
    }


}
