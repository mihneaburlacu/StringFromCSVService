package com.Mihnea.impl;

import com.Mihnea.DTO.NewStringRequest;
import com.Mihnea.DTO.NewStringResponse;
import com.Mihnea.intf.NewStringInterace;

import java.util.*;

public class NewString implements NewStringInterace {
    public NewString() {
        super();
    }

    @Override
    public NewStringResponse service(NewStringRequest request) {
        NewStringResponse responseNewString = new NewStringResponse();
        //String[] lines = request.getInputString().split(System.lineSeparator());
        String[] lines = request.getInputString().split("\n");
        Map<String, Set<String>> map = new HashMap<String, Set<String>>();
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for(String s : lines) {
            if(index != 0) {
                String firstCharacter = "" + s.charAt(0);
                if(!map.containsKey(firstCharacter)) {
                    Set<String> set = new HashSet<String>();
                    set.add(s);
                    map.put(firstCharacter, set);
                }
                else {
                    map.get(firstCharacter).add(s);
                }
            }

            index++;
        }

        for(String s : map.keySet()) {
            sb.append(s + ": \n");
            for(String text : map.get(s)) {
                sb.append(text + "\n");
            }
        }
        responseNewString.setOutputString(sb.toString());

        return responseNewString;
    }
}
