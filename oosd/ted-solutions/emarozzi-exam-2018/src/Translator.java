import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Translator {


    public void translateDocument(String filename, String language,
                                  HashMap<String, HashMap<String, String>> translations)
    {

        ArrayList<String> input;
        try
        {
            input = retrieveContents(filename);
        } catch (FileNotFoundException e)
        {
            throw e;
        }


        ArrayList<String> output = new ArrayList<String>();
        if(!translations.containsKey(language))
        {
            System.out.println("LanguageNotFoundException: " + language + " language could not be found.");
            return;
        }

        HashMap<String, String> dict = translations.get(language);

        for( String line : input)
        {
            String outputLine = "";
            String[] words;
            line.toLowerCase();

            words = line.split(" ");
            int i;
            for(i = 0; i < words.length; i++)
            {
                if(dict.containsKey(words[i]))
                {
                    words[i] = dict.get(words[i]);
                }

                outputLine += words[i];

            }

            line = outputLine;

        }
        String[] filenameArr = filename.split(".");
        String outputName = filenameArr[0] + "-" + language + "." + filenameArr[1];


        writeTranslation(outputName, input);



    }

}
