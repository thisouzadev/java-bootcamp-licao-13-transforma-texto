package com.trybe.acc.java.transformatexto;

public class Texto {
  String frase = "Lorem+ipsum+dolort sit ammet";

  public String transformaTexto(String frase) {
    frase = frase.replace('+', ' ');
    if (frase.indexOf('a') % 2 == 0) {
      frase = frase.toUpperCase();
    } else {
      String[] fraseArray = frase.split(" ", 2);
      return fraseArray[0];
    }
    return frase;
  }
}
