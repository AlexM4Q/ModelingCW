package com.modeling.cw.entities.rows;

import com.modeling.cw.utils.MathUtils;
import javafx.beans.property.SimpleIntegerProperty;

public class Register16Row extends Register4Row {

    private final SimpleIntegerProperty col15;
    private final SimpleIntegerProperty col14;
    private final SimpleIntegerProperty col13;
    private final SimpleIntegerProperty col12;
    private final SimpleIntegerProperty col11;
    private final SimpleIntegerProperty col10;
    private final SimpleIntegerProperty col9;
    private final SimpleIntegerProperty col8;
    private final SimpleIntegerProperty col7;
    private final SimpleIntegerProperty col6;
    private final SimpleIntegerProperty col5;
    private final SimpleIntegerProperty col4;

    public Register16Row() {
        super();
        this.col15 = new SimpleIntegerProperty(0);
        this.col14 = new SimpleIntegerProperty(0);
        this.col13 = new SimpleIntegerProperty(0);
        this.col12 = new SimpleIntegerProperty(0);
        this.col11 = new SimpleIntegerProperty(0);
        this.col10 = new SimpleIntegerProperty(0);
        this.col9 = new SimpleIntegerProperty(0);
        this.col8 = new SimpleIntegerProperty(0);
        this.col7 = new SimpleIntegerProperty(0);
        this.col6 = new SimpleIntegerProperty(0);
        this.col5 = new SimpleIntegerProperty(0);
        this.col4 = new SimpleIntegerProperty(0);
    }

    public void clear() {
        setCol15(0);
        setCol14(0);
        setCol13(0);
        setCol12(0);
        setCol11(0);
        setCol10(0);
        setCol9(0);
        setCol8(0);
        setCol7(0);
        setCol6(0);
        setCol5(0);
        setCol4(0);
        super.clear();
    }

    public void set(final int index, final int value) {
        switch (index) {
            case 15:
                setCol15(value);
                break;
            case 14:
                setCol14(value);
                break;
            case 13:
                setCol13(value);
                break;
            case 12:
                setCol12(value);
                break;
            case 11:
                setCol11(value);
                break;
            case 10:
                setCol10(value);
                break;
            case 9:
                setCol9(value);
                break;
            case 8:
                setCol8(value);
                break;
            case 7:
                setCol7(value);
                break;
            case 6:
                setCol6(value);
                break;
            case 5:
                setCol5(value);
                break;
            case 4:
                setCol4(value);
                break;
            default:
                super.set(index, value);
        }
    }

    public byte[] toArray() {
        final byte[] arr = new byte[16];
        arr[0] = (byte) getCol0();
        arr[1] = (byte) getCol1();
        arr[2] = (byte) getCol2();
        arr[3] = (byte) getCol3();
        arr[4] = (byte) getCol4();
        arr[5] = (byte) getCol5();
        arr[6] = (byte) getCol6();
        arr[7] = (byte) getCol7();
        arr[8] = (byte) getCol8();
        arr[9] = (byte) getCol9();
        arr[10] = (byte) getCol10();
        arr[11] = (byte) getCol11();
        arr[12] = (byte) getCol12();
        arr[13] = (byte) getCol13();
        arr[14] = (byte) getCol14();
        arr[15] = (byte) getCol15();
        return arr;
    }

    public double toDouble() {
        return MathUtils.binaryToDouble(toArray());
    }

    /**
     * @return Значение колонки 15
     */
    public int getCol15() {
        return col15.get();
    }

    /**
     * @param col15 Значение колонки 15
     */
    public void setCol15(int col15) {
        this.col15.set(col15);
    }

    public int getCol14() {
        return col14.get();
    }

    public void setCol14(int col14) {
        this.col14.set(col14);
    }

    public int getCol13() {
        return col13.get();
    }

    public void setCol13(int col13) {
        this.col13.set(col13);
    }

    public int getCol12() {
        return col12.get();
    }

    public void setCol12(int col12) {
        this.col12.set(col12);
    }

    public int getCol11() {
        return col11.get();
    }

    public void setCol11(int col11) {
        this.col11.set(col11);
    }

    public int getCol10() {
        return col10.get();
    }

    public void setCol10(int col10) {
        this.col10.set(col10);
    }

    public int getCol9() {
        return col9.get();
    }

    public void setCol9(int col9) {
        this.col9.set(col9);
    }

    public int getCol8() {
        return col8.get();
    }

    public void setCol8(int col8) {
        this.col8.set(col8);
    }

    public int getCol7() {
        return col7.get();
    }

    public void setCol7(int col7) {
        this.col7.set(col7);
    }

    public int getCol6() {
        return col6.get();
    }

    public void setCol6(int col6) {
        this.col6.set(col6);
    }

    public int getCol5() {
        return col5.get();
    }

    public void setCol5(int col5) {
        this.col5.set(col5);
    }

    public int getCol4() {
        return col4.get();
    }

    public void setCol4(int col4) {
        this.col4.set(col4);
    }

}
