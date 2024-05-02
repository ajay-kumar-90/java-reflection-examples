package fields;

import java.lang.reflect.Field;

public class FieldInfo {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Movie movie = new Movie("Lord of the Rings", 2001, true, Category.ADVENTURE, 12.99);
        printDeclaredFieldsInfo(movie.getClass(), movie);
        Field minPriceStaticField = Movie.class.getDeclaredField("MINIMUM_PRICE");
        minPriceStaticField.setAccessible(true);
        System.out.println("static MINIMUM_PRICE value :%f".formatted(minPriceStaticField.get(null)));
    }
    static <T> void printDeclaredFieldsInfo(Class<? extends T> clazz, T instance) throws IllegalAccessException {
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println("Field name: %s type : %s".formatted(field.getName(), field.getType().getName()));
            System.out.println("Is synthetic field : %s".formatted(field.isSynthetic()));
            System.out.println("field value is : %s".formatted(field.get(instance)));
            System.out.println();
        }
    }
}
