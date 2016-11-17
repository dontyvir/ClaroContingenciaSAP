package persistencia;

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
@NamedQueries({ @NamedQuery(name = "PdtEnvio.findAll", query = "select o from PdtEnvio o") })
@Table(name = "PDT_ENVIO")
@IdClass(PdtEnvioPK.class)
public class PdtEnvio implements Serializable {
    private static final long serialVersionUID = -4639253233914754357L;
    @Column(name = "PDT_ESTADO", length = 20)
    private String pdtEstado;
    @Column(name = "PDT_FECHA_ACTUALIZACION")
    private Timestamp pdtFechaActualizacion;
    @Id
    @Column(name = "PDT_FECHA_ENVIO", nullable = false)
    private Timestamp pdtFechaEnvio;
    @Id
    @Column(name = "PDT_ID_ENVIO", nullable = false)
    private BigDecimal pdtIdEnvio;
    @Column(name = "PDT_MENSAJE")
    private String pdtMensaje;
    @Column(name = "PDT_NEGOCIO", nullable = false, length = 20)
    private String pdtNegocio;
    @Column(name = "PDT_ORIGEN", length = 20)
    private String pdtOrigen;
    @Column(name = "PDT_REINTENTO")
    private BigDecimal pdtReintento;
    @Column(name = "PDT_RESPUESTA")
    private String pdtRespuesta;
    @Id
    @Column(name = "PDT_SERVICIO", nullable = false, length = 20)
    private String pdtServicio;

    public PdtEnvio() {
    }

    public PdtEnvio(String pdtEstado, Timestamp pdtFechaActualizacion, Timestamp pdtFechaEnvio, BigDecimal pdtIdEnvio,
                    String pdtMensaje, String pdtNegocio, String pdtOrigen, BigDecimal pdtReintento,
                    String pdtRespuesta, String pdtServicio) {
        this.pdtEstado = pdtEstado;
        this.pdtFechaActualizacion = pdtFechaActualizacion;
        this.pdtFechaEnvio = pdtFechaEnvio;
        this.pdtIdEnvio = pdtIdEnvio;
        this.pdtMensaje = pdtMensaje;
        this.pdtNegocio = pdtNegocio;
        this.pdtOrigen = pdtOrigen;
        this.pdtReintento = pdtReintento;
        this.pdtRespuesta = pdtRespuesta;
        this.pdtServicio = pdtServicio;
    }

    public String getPdtEstado() {
        return pdtEstado;
    }

    public void setPdtEstado(String pdtEstado) {
        this.pdtEstado = pdtEstado;
    }

    public Timestamp getPdtFechaActualizacion() {
        return pdtFechaActualizacion;
    }

    public void setPdtFechaActualizacion(Timestamp pdtFechaActualizacion) {
        this.pdtFechaActualizacion = pdtFechaActualizacion;
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

    public String getPdtNegocio() {
        return pdtNegocio;
    }

    public void setPdtNegocio(String pdtNegocio) {
        this.pdtNegocio = pdtNegocio;
    }

    public String getPdtOrigen() {
        return pdtOrigen;
    }

    public void setPdtOrigen(String pdtOrigen) {
        this.pdtOrigen = pdtOrigen;
    }

    public BigDecimal getPdtReintento() {
        return pdtReintento;
    }

    public void setPdtReintento(BigDecimal pdtReintento) {
        this.pdtReintento = pdtReintento;
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
