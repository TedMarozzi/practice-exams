package Words;

import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class WordCount {


    public void main(String[] args) throws Exception {
        String language = "English";
        Map<String, Map<String, String>> map = Collections.emptyMap();
        File codedData = new File("/home/ubuntu/data");
        BufferedReader br = new BufferedReader(new FileReader(codedData));
        String decoded, coded;
        Map<String, Integer> freq = Collections.emptyMap();

        while ((coded = br.readLine()) != null)
        {
            decoded = decode(coded, language, map);
            if(freq.containsKey(decoded))
            {
                int tmp = freq.get(decoded) + 1;
                freq.put(decoded, tmp);
            }
            else
            {
                freq.put(decoded, 1);
            }

        }

        for (Map.Entry<String,Integer> entry : freq.entrySet()) {
            System.out.println("Word = " + entry.getKey() +
                    ", Frequency = " + entry.getValue());
        }


    }



    public String decode(String message, String language, Map<String, Map<String, String>> map) throws Exception {
        int i = 0, j = 4;
        Map<String, String> dictionary;

        if(!map.containsKey(language))
        {
            System.out.println("LanguageNotFoundException: '" + language + "' not found");
            throw LanguageNotFoundException;
        }

        dictionary = map.get(language);



        String code, output = "", outputWord;
        while(message.length() >= j) {
            code = message.substring(i, j);

            if(!map.containsKey(code))
            {
                System.out.println("CodeNotFoundException: '" + code + "' not found in "
                    + language + " dictionary");
                throw CodeNotFoundException;
            }
            outputWord = dictionary.get(code);

            output += outputWord;


            i+=4;
            j+=4;
        }

        System.out.println(outputWord);

        return output;

    }

}
