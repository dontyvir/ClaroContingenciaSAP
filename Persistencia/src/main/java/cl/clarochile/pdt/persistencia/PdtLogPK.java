package persistencia;

import java.io.Serializable;

import java.math.BigDecimal;

import java.sql.Timestamp;

public class PdtLogPK implements Serializable {
    private Timestamp pdtFechaEvento;
    private BigDecimal pdtIdProceso;
    private String pdtServicio;

    public PdtLogPK() {
    }

    public PdtLogPK(Timestamp pdtFechaEvento, BigDecimal pdtIdProceso, String pdtServicio) {
        this.pdtFechaEvento = pdtFechaEvento;
        this.pdtIdProceso = pdtIdProceso;
        this.pdtServicio = pdtServicio;
    }

    public boolean equals(Object other) {
        if (other instanceof PdtLogPK) {
            final PdtLogPK otherPdtLogPK = (PdtLogPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Timestamp getPdtFechaEvento() {
        return pdtFechaEvento;
    }

    public void setPdtFechaEvento(Timestamp pdtFechaEvento) {
        this.pdtFechaEvento = pdtFechaEvento;
    }

    public BigDecimal getPdtIdProceso() {
        return pdtIdProceso;
    }

    public void setPdtIdProceso(BigDecimal pdtIdProceso) {
        this.pdtIdProceso = pdtIdProceso;
    }

    public String getPdtServicio() {
        return pdtServicio;
    }

    public void setPdtServicio(String pdtServicio) {
        this.pdtServicio = pdtServicio;
    }
}
