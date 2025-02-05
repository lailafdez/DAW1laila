public class PosNeg extends Exception {

    private int positivo;
    private int negativo;

    public PosNeg (int positivo, int negativo) {
        super("Error en el numero ");
        this.negativo = negativo;
        this.positivo = positivo;
    }

    @Override
    public String toString() {
        return "Numero = " + positivo + negativo;
    }

    public void imprimirPositivo (int numPos) throws PosNeg {
      this.positivo = this.positivo + numPos;
      if (this.positivo < 0) {
        throw new PosNeg(this.positivo, numPos);
      }
    }

    public void imprimirNegativo (int numNeg) throws PosNeg {
        this.negativo = this.negativo + numNeg;
        if (this.negativo > 0) {
            throw new PosNeg(this.negativo, numNeg);
        }
    }
}