class Converter{
    private int index;

    public Converter(){
    }

    private String[] splitWord(String str){
        index = 0;

        String words[];

        if(str.indexOf(' ') != -1){
            words = str.split(" ");
        }
        else{
            words = str.split("_");
        }

        return words;
    }

    public String toPascalCase(String str){
        StringBuilder sb = new StringBuilder();

        String[] words = splitWord(str);

        for(String word: words){
            sb.append(word.substring(0,1).toUpperCase() + word.substring(1));
        }

        return sb.toString();
    }

    public String toKebabCase(String str){
        StringBuilder sb = new StringBuilder();

        String[] words = splitWord(str);

        for(String word: words){
            sb.append(word);

            if(index < words.length){
                sb.append("-");

                index++;
            }
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
            
            if(index < words.length){
                sb.append("_");

                index++;
            }
        }

        return sb.toString();
    }
}