package e2018;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class FileTranslator {

    public void translateDocument(String filename, String language,
                                  HashMap<String, HashMap<String, String>> translations) throws
            LanguageNotFoundException, FileNotFoundException{
        if (!translations.containsKey(language)){
            throw new LanguageNotFoundException();
        }
        ArrayList<String> docLines = retrieveContents(filename);
        ArrayList<String> translatedLines = new ArrayList<>();
        // for each line in the document, translate each word and add the line
        // to 'translatedLines'
        for (String line : docLines){
            for (String word : line.split(" ")){
                translatedLines.add(translations.get(language).get(word));
            }
        }
        writeTranslation(String.format("%s-%s.%s", filename.split(".")[0], language,
                filename.split(".")[1]), translatedLines);
    }

    public abstract ArrayList<String> retrieveContents(String filename) throws FileNotFoundException;
    public abstract void writeTranslation(String filename, ArrayList<String> contents);
}
