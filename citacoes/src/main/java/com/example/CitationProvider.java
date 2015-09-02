package com.example;

import java.util.ArrayList;
import java.util.Random;


public class CitationProvider {

    private ArrayList<EntCitacao> citacoes  = new ArrayList<EntCitacao>();
    EntCitacao ent = new EntCitacao();
    public CitationProvider()
    {

    }


    public void addCitation(String autor, String conteudo)
    {
        ent.autor=autor;
        ent.frase=conteudo;
        ent.citacao="Autor:"+autor+" - Citação:"+conteudo;
        this.citacoes.add(ent);
    }

    public String getCitation()
    {
        Random rand = new Random();
        int indiceLista = rand.nextInt(citacoes.size());
        return this.citacoes.get(indiceLista).citacao;
    }
}
