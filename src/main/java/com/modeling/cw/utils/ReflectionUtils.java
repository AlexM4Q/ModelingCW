package com.modeling.cw.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ReflectionUtils {

    public static void setCol(final Object object, final int number, final int value) {
        final Class<?> clazz = object.getClass();
        try {
            final Method setCol = clazz.getMethod("setCol" + number, int.class);
            setCol.invoke(object, value);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static int getCol(final Object object, final int number) {
        final Class<?> clazz = object.getClass();
        try {
            final Method getCol = clazz.getMethod("getCol" + number);
            return (int) getCol.invoke(object);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        throw new IllegalArgumentException("Невозможно получить значение. Номер колонки: " + number);
    }

}
