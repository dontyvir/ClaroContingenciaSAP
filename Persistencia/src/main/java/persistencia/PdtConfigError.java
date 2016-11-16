package persistencia;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "PdtConfigError.findAll", query = "select o from PdtConfigError o") })
@Table(name = "PDT_CONFIG_ERROR")
@IdClass(PdtConfigErrorPK.class)
public class PdtConfigError implements Serializable {
    @Id
    @Column(name = "PDT_CODIGO_ERROR", nullable = false)
    private BigDecimal pdtCodigoError;
    @Column(name = "PDT_REINTENTA")
    private BigDecimal pdtReintenta;
    @Id
    @Column(name = "PDT_SERVICIO", nullable = false, length = 20)
    private String pdtServicio;

    public PdtConfigError() {
    }

    public PdtConfigError(BigDecimal pdtCodigoError, BigDecimal pdtReintenta, String pdtServicio) {
        this.pdtCodigoError = pdtCodigoError;
        this.pdtReintenta = pdtReintenta;
        this.pdtServicio = pdtServicio;
    }

    public BigDecimal getPdtCodigoError() {
        return pdtCodigoError;
    }

    public void setPdtCodigoError(BigDecimal pdtCodigoError) {
        this.pdtCodigoError = pdtCodigoError;
    }

    public BigDecimal getPdtReintenta() {
        return pdtReintenta;
    }

    public void setPdtReintenta(BigDecimal pdtReintenta) {
        this.pdtReintenta = pdtReintenta;
    }

    public String getPdtServicio() {
        return pdtServicio;
    }

    public void setPdtServicio(String pdtServicio) {
        this.pdtServicio = pdtServicio;
    }
}
