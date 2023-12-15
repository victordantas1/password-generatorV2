package com.vct.util;

import java.util.Random;

public class GeradorSenhas {

    private final String especiais = "@#$%";
    private final String letrasUpper = "ABCDEFGHIJKLMNOPQRSTWVWXYZ";
    private final String letrasLower = "abcdefghijklmnopqrstuvwxyz";
    private final String numeros = "0123456789";
    private final String charSet = this.getEspecias().concat(this.getLetrasLower()
                            .concat(this.getLetrasUpper().concat(this.getNumeros())));   

    public String gerar() {
        Random rand = new Random();
        String senha = "";
        for(int i = 0; i < 4; i++) {
            senha += this.getCharset().charAt(rand.nextInt(this.sizeCharSet()));
        }
        senha += this.getEspecias().charAt(rand.nextInt(this.sizeEsp()));
        senha += this.getNumeros().charAt(rand.nextInt(this.sizeNum()));
        senha += this.getLetrasLower().charAt(rand.nextInt(this.sizeLetLow()));
        senha += this.getLetrasUpper().charAt(rand.nextInt(this.sizeLetUp()));

        return senha;
    }

    

    private String getCharset() {
        return this.charSet;
    }

    private String getEspecias() {
        return this.especiais;
    }

    private String getLetrasUpper() {
        return this.letrasUpper;
    }

    private String getLetrasLower() {
        return this.letrasLower;
    }

    private String getNumeros() {
        return this.numeros;
    }

    private int sizeEsp() {
        return this.getEspecias().length();
    }

    private int sizeLetUp() {
        return this.getEspecias().length();
    }

    private int sizeLetLow() {
        return this.getEspecias().length();
    }

    private int sizeNum() {
        return this.getEspecias().length();
    }

    private int sizeCharSet() {
        return this.getCharset().length();
    }
    

}
