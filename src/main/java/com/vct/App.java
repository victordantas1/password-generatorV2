package com.vct;

import com.vct.util.GeradorSenhas;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        GeradorSenhas senhas = new GeradorSenhas();
        System.out.println(senhas.gerar());
    }
}
