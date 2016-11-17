package cl.clarochile.pdt.persistencia;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "PdtContingencia.findAll", query = "select o from PdtContingencia o") })
@Table(name = "PDT_CONTINGENCIA")
public class PdtContingencia implements Serializable {
    private static final long serialVersionUID = 6343409637452133923L;
    @Id
    @Column(name = "PDT_CONTINGENCIA", nullable = false)
    private String pdtContingencia;

    public PdtContingencia() {
    }

    public PdtContingencia(String pdtContingencia) {
        this.pdtContingencia = pdtContingencia;
    }

    public String getPdtContingencia() {
        return pdtContingencia;
    }

    public void setPdtContingencia(String pdtContingencia) {
        this.pdtContingencia = pdtContingencia;
    }
}
