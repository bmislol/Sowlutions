class Converter{
    public Converter(){

    }

    private String[] splitWord(String str){
        String words[];

        if(str.indexOf(' ') != -1){
            words = str.split(" ");
        }
        else{
            words = str.split("-");
        }

        return words;
    }

    public String toPascalCase(String str){
        StringBuilder sb = new StringBuilder();

        String[] words = splitWord(str);

        for(String word: words){
            sb.append(word.to);
        }

        return sb.toString();
    }

    public String toKebabCase(String str){
        StringBuilder sb = new StringBuilder();

        String[] words = splitWord(str);

        for(String word: words){
            sb.append(word);
            sb.append("-");
        }

        return sb.toString();
    }

    public String toSnackCase(String str){
        if(str.contains("_")){
            return str;
        }

        StringBuilder sb = new StringBuilder();

        String[] words = splitWord(str);

        for(String word: words){
            sb.append(word);
            sb.append("_");
        }

        return sb.toString();
    }

    public String toCamelCase(String str){
        StringBuilder sb = new StringBuilder();

        String[] words = splitWord(str);

        for(String word: words){
            sb.append(word);
            sb.append("_");
        }

        return sb.toString();
    }
}