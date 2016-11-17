package persistencia;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "PdtConfig.findAll", query = "select o from PdtConfig o") })
@Table(name = "PDT_CONFIG")
public class PdtConfig implements Serializable {
    private static final long serialVersionUID = 6646079142025065841L;
    @Column(name = "PDT_ESTADO", length = 20)
    private String pdtEstado;
    @Column(name = "PDT_PERIODICIDAD")
    private BigDecimal pdtPeriodicidad;
    @Column(name = "PDT_REINTENTOS")
    private BigDecimal pdtReintentos;
    @Id
    @Column(name = "PDT_SERVICIO", nullable = false, length = 20)
    private String pdtServicio;

    public PdtConfig() {
    }

    public PdtConfig(String pdtEstado, BigDecimal pdtPeriodicidad, BigDecimal pdtReintentos, String pdtServicio) {
        this.pdtEstado = pdtEstado;
        this.pdtPeriodicidad = pdtPeriodicidad;
        this.pdtReintentos = pdtReintentos;
        this.pdtServicio = pdtServicio;
    }

    public String getPdtEstado() {
        return pdtEstado;
    }

    public void setPdtEstado(String pdtEstado) {
        this.pdtEstado = pdtEstado;
    }

    public BigDecimal getPdtPeriodicidad() {
        return pdtPeriodicidad;
    }

    public void setPdtPeriodicidad(BigDecimal pdtPeriodicidad) {
        this.pdtPeriodicidad = pdtPeriodicidad;
    }

    public BigDecimal getPdtReintentos() {
        return pdtReintentos;
    }

    public void setPdtReintentos(BigDecimal pdtReintentos) {
        this.pdtReintentos = pdtReintentos;
    }

    public String getPdtServicio() {
        return pdtServicio;
    }

    public void setPdtServicio(String pdtServicio) {
        this.pdtServicio = pdtServicio;
    }
}
