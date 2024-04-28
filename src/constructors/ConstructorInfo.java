package constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class ConstructorInfo {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        //printConstructorData(Person.class);
        Address address = createInstanceWithArguments(Address.class, "First Street", 10);
        Person person = createInstanceWithArguments(Person.class, address, "John", 20);
        System.out.println(person);
    }

    static <T> T createInstanceWithArguments(Class<T> clazz, Object... args) throws InvocationTargetException,
            InstantiationException, IllegalAccessException {
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            if (constructor.getParameterTypes().length == args.length) {
                return (T) constructor.newInstance(args);
            }
        }
        System.out.println("An appropriate constructor was not found");
        return null;
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
