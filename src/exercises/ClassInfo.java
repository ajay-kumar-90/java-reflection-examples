package exercises;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClassInfo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<String> stringClass = String.class;
        Map<String, Integer> mapObject = new HashMap<>();
        Class<? extends Map> hashMapClass = mapObject.getClass();
        Class<?> squareClass = Class.forName("exercises.Square");
        printClassInfo(stringClass, hashMapClass, squareClass);
        Drawable circleObject = new Drawable() {
            @Override
            public int getNumberOfCorners() {
                return 0;
            }
        };
        printClassInfo(Collection.class, boolean.class, int[][].class, Color.class, circleObject.getClass());
    }
    static void printClassInfo(Class<?>... classes) {
        for (Class<?> clazz : classes) {
            System.out.printf("class name : %s, class package name: %s%n", clazz.getSimpleName(), clazz.getPackageName());
            Class<?>[] implementedInterfaces = clazz.getInterfaces();
            for (Class<?> implementedInterface : implementedInterfaces) {
                System.out.printf("class %s implements : %s%n", clazz.getSimpleName(), implementedInterface.getSimpleName());
            }
            System.out.println("Is Array : " + clazz.isArray());
            System.out.println("Is Primitive : " + clazz.isPrimitive());
            System.out.println("Is enum : " + clazz.isEnum());
            System.out.println("Is Interface : " + clazz.isInterface());
            System.out.println("Is Anonymous : " + clazz.isAnonymousClass());

            System.out.println();
            System.out.println();
        }
    }
}