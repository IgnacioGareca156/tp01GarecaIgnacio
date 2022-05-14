package ar.edu.unju.edm.model;

public class EsPar {
    private int numPar;

    public EsPar(){

    }

    public EsPar(int numPar) {
        this.numPar = numPar;
    }

    public int getNumPar() {
        return numPar;
    }

    public void setNumPar(int numPar) {
        this.numPar = numPar;
    }

    public boolean verifacarPar(int numPar){
        boolean trueFalse = false;
        if(numPar % 2 == 0){
            trueFalse = true;
        }
        return trueFalse;
    }

    public String comprobarPar(int numPar){
        String numParTrue = "";

        if(numPar % 2 == 0){
            numParTrue = "Es un numero par";
        }
        else{
            numParTrue = "No es un numero par";
        }

        return numParTrue;
    }
  }
