package cl.clarochile.pdt.persistencia;

import java.io.Serializable;

import java.math.BigDecimal;

public class PdtConfigErrorPK implements Serializable {
    private BigDecimal pdtCodigoError;
    private String pdtServicio;

    public PdtConfigErrorPK() {
    }

    public PdtConfigErrorPK(BigDecimal pdtCodigoError, String pdtServicio) {
        this.pdtCodigoError = pdtCodigoError;
        this.pdtServicio = pdtServicio;
    }

    public boolean equals(Object other) {
        if (other instanceof PdtConfigErrorPK) {
            final PdtConfigErrorPK otherPdtConfigErrorPK = (PdtConfigErrorPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public BigDecimal getPdtCodigoError() {
        return pdtCodigoError;
    }

    public void setPdtCodigoError(BigDecimal pdtCodigoError) {
        this.pdtCodigoError = pdtCodigoError;
    }

    public String getPdtServicio() {
        return pdtServicio;
    }

    public void setPdtServicio(String pdtServicio) {
        this.pdtServicio = pdtServicio;
    }
}
