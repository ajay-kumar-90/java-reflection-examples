package arrays;

import java.lang.reflect.Array;

public class ArrayInfo {
    public static void main(String[] args) {
        int [] oneDimensionalArray = {1,2};
        double[][] twoDimensionalArray = {{1.5,2.5},{3.5,4.5}};
        //inspectArrayObject(twoDimensionalArray);
        inspectArrayValues(twoDimensionalArray);
    }
    static void inspectArrayObject(Object arrayObject) {
        Class<?> clazz = arrayObject.getClass();
        System.out.println("Is Array : %s".formatted(clazz.isArray()));
        Class<?> arrayComponentType = clazz.getComponentType();
        System.out.println("This is an array of type : %s".formatted(arrayComponentType.getTypeName()));
    }

    static void inspectArrayValues(Object arrayObject) {
        int arrayLength = Array.getLength(arrayObject);
        System.out.print("[");
        for (int i = 0; i < arrayLength; i++) {
            Object element = Array.get(arrayObject, i);
            if (element.getClass().isArray()) {
                inspectArrayValues(element);
            } else {
                System.out.print(element);
            }
            if (i !=arrayLength-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
