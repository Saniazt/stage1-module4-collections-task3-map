package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == '.')
                sentence = sentence.replace(".","");
            else if(sentence.charAt(i) == ',')
                sentence = sentence.replace(",","");
        }
        String[] split = sentence.toLowerCase().split("\\s");
        for (int i = 0; i < split.length; i++) {
            int count = 0;
            if(sentence.isEmpty())
                break;
            for (int j = 0; j < split.length; j++) {
                if(split[i].equals(split[j]))
                    count++;
            }
            map.put(split[i], count);
        }
        return map;
    }
}
