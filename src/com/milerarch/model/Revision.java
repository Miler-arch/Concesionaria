package com.milerarch.model;

import java.util.List;

public class Revision {
    //PK
    private String codigo;
    private String filtro;
    private String aceite;
    private String frenos;


    public Revision(String codigo, String filtro, String aceite, String frenos) {
        this.codigo = codigo;
        this.filtro = filtro;
        this.aceite = aceite;
        this.frenos = frenos;
    }

    public Revision() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }


    @Override
    public String toString() {
        return "Revision{" +
                "codigo='" + codigo + '\'' +
                ", filtro='" + filtro + '\'' +
                ", aceite='" + aceite + '\'' +
                ", frenos='" + frenos + '\'' +
                '}';
    }

    public void setMatricula(String matricula) {
    }

    public void addRevision(Revision bateria) {
    }

    public void deleteRevision(String s) {
    }

    public void updateRevision(Revision revision) {
    }

    public List<Revision> getALLRevisiones() {
        return null;
    }
}
