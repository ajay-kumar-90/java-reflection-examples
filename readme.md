# Reflection API Gateway

# 3 ways to get `Class<?>` object

1. ### instance-object.getClass()
2. ### ClassType.class
3. ### Class.forName("package.ClassName")

## Note: The Class<?> object used to get basic data for a given class type

# Constructor Discovery
1. ### Get Constructor Array from `Class<?>`: `clazz.getDeclaredConstructors()`
2. ### Get parameter type from `Constructor<?>`: `constructor.getParameterTypes()`
