package com.estrutura.pilha;

public class No {
    private int dado;
    private No reNo = null;

    public No(int dado) {
        this.dado = dado;
    }

    public No() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return reNo;
    }

    public void setRefNo(No reNo) {
        this.reNo = reNo;
    }

    @Override
    public String toString() {
        return "No1{" +
                "dado=" + dado +
                '}';
    }
}
