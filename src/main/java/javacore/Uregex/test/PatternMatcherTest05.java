package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo que não for incluso no \w
        // []
        // ? Zero ou uma ocorrencia
        // 0 ou mais ocorrencias
        // + uma ou mais ocorrencias
        // {n, m} de n até m
        //  () agrupamento
        // | 0(v|c)0 | ovo ou oco
        // $  representa fim da linha
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "[a-zA-Z0-9\\._-]+@([a-zA-Z])+\\.([a-zA-Z])+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail";
        System.out.println("#@!zoro@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+"\n");
        }
        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);
    }
}
