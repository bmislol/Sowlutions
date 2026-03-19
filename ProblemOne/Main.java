class Main{
    public static void main(String[] args){
        Converter conv = new Converter();

        String input = "hello world this is a longer test";

        System.out.println(conv.toPascalCase(input));
        System.out.println(conv.toKebabCase(input));
        System.out.println(conv.toSnackCase(input));
        System.out.println(conv.toCamelCase(input));

        System.out.println();

        input = "hello_world_this_is_a_longer_test";

        System.out.println(conv.toPascalCase(input));
        System.out.println(conv.toKebabCase(input));
        System.out.println(conv.toSnackCase(input));
        System.out.println(conv.toCamelCase(input));
    }
}