package cl.clarochile.pdt.persistencia;

import java.io.Serializable;

import java.math.BigDecimal;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "PdtLog.findAll", query = "select o from PdtLog o") })
@Table(name = "PDT_LOG")
@IdClass(PdtLogPK.class)
public class PdtLog implements Serializable {
    private static final long serialVersionUID = -7585951909121953120L;
    @Column(name = "PDT_DESCRIPCION_EVENTO")
    private String pdtDescripcionEvento;
    @Id
    @Column(name = "PDT_FECHA_EVENTO", nullable = false)
    private Timestamp pdtFechaEvento;
    @Id
    @Column(name = "PDT_ID_PROCESO", nullable = false)
    private BigDecimal pdtIdProceso;
    @Id
    @Column(name = "PDT_SERVICIO", nullable = false, length = 20)
    private String pdtServicio;

    public PdtLog() {
    }

    public PdtLog(String pdtDescripcionEvento, Timestamp pdtFechaEvento, BigDecimal pdtIdProceso, String pdtServicio) {
        this.pdtDescripcionEvento = pdtDescripcionEvento;
        this.pdtFechaEvento = pdtFechaEvento;
        this.pdtIdProceso = pdtIdProceso;
        this.pdtServicio = pdtServicio;
    }

    public String getPdtDescripcionEvento() {
        return pdtDescripcionEvento;
    }

    public void setPdtDescripcionEvento(String pdtDescripcionEvento) {
        this.pdtDescripcionEvento = pdtDescripcionEvento;
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
