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
@NamedQueries({ @NamedQuery(name = "PdtRegEnvio.findAll", query = "select o from PdtRegEnvio o") })
@Table(name = "PDT_REG_ENVIO")
@IdClass(PdtRegEnvioPK.class)
public class PdtRegEnvio implements Serializable {
    private static final long serialVersionUID = 5299415815146774909L;
    @Id
    @Column(name = "PDT_FECHA_ENVIO", nullable = false)
    private Timestamp pdtFechaEnvio;
    @Id
    @Column(name = "PDT_ID_ENVIO", nullable = false)
    private BigDecimal pdtIdEnvio;
    @Column(name = "PDT_MENSAJE")
    private String pdtMensaje;
    @Column(name = "PDT_RESPUESTA")
    private String pdtRespuesta;
    @Id
    @Column(name = "PDT_SERVICIO", nullable = false, length = 20)
    private String pdtServicio;

    public PdtRegEnvio() {
    }

    public PdtRegEnvio(Timestamp pdtFechaEnvio, BigDecimal pdtIdEnvio, String pdtMensaje, String pdtRespuesta,
                       String pdtServicio) {
        this.pdtFechaEnvio = pdtFechaEnvio;
        this.pdtIdEnvio = pdtIdEnvio;
        this.pdtMensaje = pdtMensaje;
        this.pdtRespuesta = pdtRespuesta;
        this.pdtServicio = pdtServicio;
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

    public String getPdtMensaje() {
        return pdtMensaje;
    }

    public void setPdtMensaje(String pdtMensaje) {
        this.pdtMensaje = pdtMensaje;
    }

    public String getPdtRespuesta() {
        return pdtRespuesta;
    }

    public void setPdtRespuesta(String pdtRespuesta) {
        this.pdtRespuesta = pdtRespuesta;
    }

    public String getPdtServicio() {
        return pdtServicio;
    }

    public void setPdtServicio(String pdtServicio) {
        this.pdtServicio = pdtServicio;
    }
}
