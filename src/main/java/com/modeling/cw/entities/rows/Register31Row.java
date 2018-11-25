package com.modeling.cw.entities.rows;

import javafx.beans.property.SimpleIntegerProperty;

public class Register31Row extends Register16Row {

    private final SimpleIntegerProperty col30;
    private final SimpleIntegerProperty col29;
    private final SimpleIntegerProperty col28;
    private final SimpleIntegerProperty col27;
    private final SimpleIntegerProperty col26;
    private final SimpleIntegerProperty col25;
    private final SimpleIntegerProperty col24;
    private final SimpleIntegerProperty col23;
    private final SimpleIntegerProperty col22;
    private final SimpleIntegerProperty col21;
    private final SimpleIntegerProperty col20;
    private final SimpleIntegerProperty col19;
    private final SimpleIntegerProperty col18;
    private final SimpleIntegerProperty col17;
    private final SimpleIntegerProperty col16;

    public Register31Row() {
        this.col30 = new SimpleIntegerProperty(0);
        this.col29 = new SimpleIntegerProperty(0);
        this.col28 = new SimpleIntegerProperty(0);
        this.col27 = new SimpleIntegerProperty(0);
        this.col26 = new SimpleIntegerProperty(0);
        this.col25 = new SimpleIntegerProperty(0);
        this.col24 = new SimpleIntegerProperty(0);
        this.col23 = new SimpleIntegerProperty(0);
        this.col22 = new SimpleIntegerProperty(0);
        this.col21 = new SimpleIntegerProperty(0);
        this.col20 = new SimpleIntegerProperty(0);
        this.col19 = new SimpleIntegerProperty(0);
        this.col18 = new SimpleIntegerProperty(0);
        this.col17 = new SimpleIntegerProperty(0);
        this.col16 = new SimpleIntegerProperty(0);
    }

    public void clear() {
        setCol30(0);
        setCol29(0);
        setCol28(0);
        setCol27(0);
        setCol26(0);
        setCol25(0);
        setCol24(0);
        setCol23(0);
        setCol22(0);
        setCol21(0);
        setCol20(0);
        setCol19(0);
        setCol18(0);
        setCol17(0);
        setCol16(0);
        super.clear();
    }

    public void set(final byte[] execute) {
        setCol0(execute[0]);
        setCol1(execute[1]);
        setCol2(execute[2]);
        setCol3(execute[3]);
        setCol4(execute[4]);
        setCol5(execute[5]);
        setCol6(execute[6]);
        setCol7(execute[7]);
        setCol8(execute[8]);
        setCol9(execute[9]);
        setCol10(execute[10]);
        setCol11(execute[11]);
        setCol12(execute[12]);
        setCol13(execute[13]);
        setCol14(execute[14]);
        setCol15(execute[15]);
        setCol16(execute[16]);
        setCol17(execute[17]);
        setCol18(execute[18]);
        setCol19(execute[19]);
        setCol20(execute[20]);
        setCol21(execute[21]);
        setCol22(execute[22]);
        setCol23(execute[23]);
        setCol24(execute[24]);
        setCol25(execute[25]);
        setCol26(execute[26]);
        setCol27(execute[27]);
        setCol28(execute[28]);
        setCol29(execute[29]);
        setCol30(execute[30]);
    }

    public int getCol30() {
        return col30.get();
    }

    public void setCol30(int col30) {
        this.col30.set(col30);
    }

    public int getCol29() {
        return col29.get();
    }

    public void setCol29(int col29) {
        this.col29.set(col29);
    }

    public int getCol28() {
        return col28.get();
    }

    public void setCol28(int col28) {
        this.col28.set(col28);
    }

    public int getCol27() {
        return col27.get();
    }

    public void setCol27(int col27) {
        this.col27.set(col27);
    }

    public int getCol26() {
        return col26.get();
    }

    public void setCol26(int col26) {
        this.col26.set(col26);
    }

    public int getCol25() {
        return col25.get();
    }

    public void setCol25(int col25) {
        this.col25.set(col25);
    }

    public int getCol24() {
        return col24.get();
    }

    public void setCol24(int col24) {
        this.col24.set(col24);
    }

    public int getCol23() {
        return col23.get();
    }

    public void setCol23(int col23) {
        this.col23.set(col23);
    }

    public int getCol22() {
        return col22.get();
    }

    public void setCol22(int col22) {
        this.col22.set(col22);
    }

    public int getCol21() {
        return col21.get();
    }

    public void setCol21(int col21) {
        this.col21.set(col21);
    }

    public int getCol20() {
        return col20.get();
    }

    public void setCol20(int col20) {
        this.col20.set(col20);
    }

    public int getCol19() {
        return col19.get();
    }

    public void setCol19(int col19) {
        this.col19.set(col19);
    }

    public int getCol18() {
        return col18.get();
    }

    public void setCol18(int col18) {
        this.col18.set(col18);
    }

    public int getCol17() {
        return col17.get();
    }

    public void setCol17(int col17) {
        this.col17.set(col17);
    }

    public int getCol16() {
        return col16.get();
    }

    public void setCol16(int col16) {
        this.col16.set(col16);
    }
}
