package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.PropertyMappingContext;

import java.lang.reflect.Field;

public class PrimitiveConverter<S,D> implements PropertyConverter<S,D> {

    @Override
    public void convert(final PropertyMappingContext<S, D> context) {
        final Field destField;
        try {
            destField = context.getDestination().getClass().getDeclaredField(context.getPropertyName());
        } catch (NoSuchFieldException ex) {
            return;
        }

        try {
            final Field srcField = context.getSource().getClass().getDeclaredField(context.getPropertyName());
            final Class<?> srcType = srcField.getType();
            if (srcType.equals(byte.class) || srcType.equals(Byte.class)) {

            } else if (srcType.equals(boolean.class) || srcType.equals(Boolean.class)) {

            } else if (srcType.equals(short.class) || srcType.equals(Short.class)) {

            } else if (srcType.equals(int.class) || srcType.equals(Integer.class)) {

            } else if (srcType.equals(long.class) || srcType.equals(Long.class)) {

            } else if (srcType.equals(float.class) || srcType.equals(Float.class)) {

            } else if (srcType.equals(double.class) || srcType.equals(Double.class)) {

            } else {
                // TODO throw exception
            }
        } catch (NoSuchFieldException ex) {
            // TODO handle this
            ex.printStackTrace();
        }
    }

    // TODO delete everything below here

    private static class MyObj {
        int num1;
        long num2;
        Integer num3;
        Long num4;
    }

    public static void main(String[] args) {
        final MyObj myObj = new MyObj();
        myObj.num1 = 1;
        myObj.num2 = 2;
        myObj.num3 = 3;
        myObj.num4 = 4L;
    }

}
