package com.modeling.cw.entities.rows;

import javafx.beans.property.SimpleIntegerProperty;

public class Register4Row {

    private final SimpleIntegerProperty col3;
    private final SimpleIntegerProperty col2;
    private final SimpleIntegerProperty col1;
    private final SimpleIntegerProperty col0;

    public Register4Row() {
        this.col3 = new SimpleIntegerProperty(0);
        this.col2 = new SimpleIntegerProperty(0);
        this.col1 = new SimpleIntegerProperty(0);
        this.col0 = new SimpleIntegerProperty(0);
    }

    public void clear() {
        setCol0(0);
        setCol1(0);
        setCol2(0);
        setCol3(0);
    }

    public void set(final int index, final int value) {
        switch (index) {
            case 3:
                setCol3(value);
                break;
            case 2:
                setCol2(value);
                break;
            case 1:
                setCol1(value);
                break;
            case 0:
                setCol0(value);
                break;
            default:
                throw new IllegalArgumentException("Невозможно найти колонку. Индекс колонки: " + index);
        }
    }

    public int getCol3() {
        return col3.get();
    }

    public void setCol3(int col3) {
        this.col3.set(col3);
    }

    public int getCol2() {
        return col2.get();
    }

    public void setCol2(int col2) {
        this.col2.set(col2);
    }

    public int getCol1() {
        return col1.get();
    }

    public void setCol1(int col1) {
        this.col1.set(col1);
    }

    public int getCol0() {
        return col0.get();
    }

    public void setCol0(int col0) {
        this.col0.set(col0);
    }

}
