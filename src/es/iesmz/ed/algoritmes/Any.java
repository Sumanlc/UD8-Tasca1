package es.iesmz.ed.algoritmes;

import java.util.HashSet;
import java.util.Set;

public class Any {
    private long any;

    public Any(long any) {
        this.any = any;
    }

    public int digitsDiferents() {
        String anyStr = Long.toString(any);
        Set<Character> digits = new HashSet<>();
        for (char c : anyStr.toCharArray()) {
            digits.add(c);
        }
        return digits.size();
    }
}

