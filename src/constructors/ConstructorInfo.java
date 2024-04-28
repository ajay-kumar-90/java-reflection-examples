package constructors;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

public class ConstructorInfo {
    public static void main(String[] args) {
        printConstructorData(Person.class);
    }

    private static void printConstructorData(Class<?> clazz) {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        System.out.printf("class %s has %d declared constructors%n", clazz.getSimpleName(), constructors.length);
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            List<String> parameterTypeNames = Arrays.stream(parameterTypes).map(Class::getSimpleName).toList();
            System.out.println(parameterTypeNames);
        }
    }
}
