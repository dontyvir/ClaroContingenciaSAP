package cl.clarochile.pdt.persistencia;

import java.io.Serializable;

import java.math.BigDecimal;

import java.sql.Timestamp;

public class PdtEnvioPK implements Serializable {
    private Timestamp pdtFechaEnvio;
    private BigDecimal pdtIdEnvio;
    private String pdtServicio;

    public PdtEnvioPK() {
    }

    public PdtEnvioPK(Timestamp pdtFechaEnvio, BigDecimal pdtIdEnvio, String pdtServicio) {
        this.pdtFechaEnvio = pdtFechaEnvio;
        this.pdtIdEnvio = pdtIdEnvio;
        this.pdtServicio = pdtServicio;
    }

    public boolean equals(Object other) {
        if (other instanceof PdtEnvioPK) {
            final PdtEnvioPK otherPdtEnvioPK = (PdtEnvioPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Timestamp getPdtFechaEnvio() {
        return pdtFechaEnvio;
    }

    public void setPdtFechaEnvio(Timestamp pdtFechaEnvio) {
        this.pdtFechaEnvio = pdtFechaEnvio;
    }

    public BigDecimal getPdtIdEnvio() {
        return pdtIdEnvio;
    }

    public void setPdtIdEnvio(BigDecimal pdtIdEnvio) {
        this.pdtIdEnvio = pdtIdEnvio;
    }

    public String getPdtServicio() {
        return pdtServicio;
    }

    public void setPdtServicio(String pdtServicio) {
        this.pdtServicio = pdtServicio;
    }
}
