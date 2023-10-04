package org.mathschool;

import org.assertj.core.api.Assertions;
import org.mathschool.foobar.FooBar;

import static org.mathschool.foobar.FooBar.fooBar;

public class Main {
    public static void main(String[] args) {

        String inputString = args[0];
        System.out.println("Input  : " + inputString.replaceAll(" ",""));
        System.out.println("Output : " + fooBar(inputString.replaceAll(" ","")));
    }
}