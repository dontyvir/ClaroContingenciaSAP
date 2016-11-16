package persistencia;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name = "PdtPersistFacade", mappedName = "PDT-Persistencia-PdtPersistFacade")
public class PdtPersistFacadeBean implements PdtPersistFacade, PdtPersistFacadeLocal {
    @Resource
    SessionContext sessionContext;
    @PersistenceContext(unitName = "Persistencia")
    private EntityManager em;

    public PdtPersistFacadeBean() {
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Object queryByRange(String jpqlStmt, int firstResult, int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }
        return query.getResultList();
    }

    public <T> T persistEntity(T entity) {
        em.persist(entity);
        return entity;
    }

    public <T> T mergeEntity(T entity) {
        return em.merge(entity);
    }

    public PdtRegEnvio persistPdtRegEnvio(PdtRegEnvio pdtRegEnvio) {
        em.persist(pdtRegEnvio);
        return pdtRegEnvio;
    }

    public PdtRegEnvio mergePdtRegEnvio(PdtRegEnvio pdtRegEnvio) {
        return em.merge(pdtRegEnvio);
    }

    public void removePdtRegEnvio(PdtRegEnvio pdtRegEnvio) {
        pdtRegEnvio =
            em.find(PdtRegEnvio.class,
                    new PdtRegEnvioPK(pdtRegEnvio.getPdtFechaEnvio(), pdtRegEnvio.getPdtIdEnvio(),
                                      pdtRegEnvio.getPdtServicio()));
        em.remove(pdtRegEnvio);
    }

    public PdtContingencia persistPdtContingencia(PdtContingencia pdtContingencia) {
        em.persist(pdtContingencia);
        return pdtContingencia;
    }

    public PdtContingencia mergePdtContingencia(PdtContingencia pdtContingencia) {
        return em.merge(pdtContingencia);
    }

    public void removePdtContingencia(PdtContingencia pdtContingencia) {
        pdtContingencia = em.find(PdtContingencia.class, pdtContingencia.getPdtContingencia());
        em.remove(pdtContingencia);
    }

    public PdtLog persistPdtLog(PdtLog pdtLog) {
        em.persist(pdtLog);
        return pdtLog;
    }

    public PdtLog mergePdtLog(PdtLog pdtLog) {
        return em.merge(pdtLog);
    }

    public void removePdtLog(PdtLog pdtLog) {
        pdtLog =
            em.find(PdtLog.class,
                    new PdtLogPK(pdtLog.getPdtFechaEvento(), pdtLog.getPdtIdProceso(), pdtLog.getPdtServicio()));
        em.remove(pdtLog);
    }

    public PdtConfigError persistPdtConfigError(PdtConfigError pdtConfigError) {
        em.persist(pdtConfigError);
        return pdtConfigError;
    }

    public PdtConfigError mergePdtConfigError(PdtConfigError pdtConfigError) {
        return em.merge(pdtConfigError);
    }

    public void removePdtConfigError(PdtConfigError pdtConfigError) {
        pdtConfigError =
            em.find(PdtConfigError.class,
                    new PdtConfigErrorPK(pdtConfigError.getPdtCodigoError(), pdtConfigError.getPdtServicio()));
        em.remove(pdtConfigError);
    }

    public PdtConfig persistPdtConfig(PdtConfig pdtConfig) {
        em.persist(pdtConfig);
        return pdtConfig;
    }

    public PdtConfig mergePdtConfig(PdtConfig pdtConfig) {
        return em.merge(pdtConfig);
    }

    public void removePdtConfig(PdtConfig pdtConfig) {
        pdtConfig = em.find(PdtConfig.class, pdtConfig.getPdtServicio());
        em.remove(pdtConfig);
    }

    public PdtEnvio persistPdtEnvio(PdtEnvio pdtEnvio) {
        em.persist(pdtEnvio);
        return pdtEnvio;
    }

    public PdtEnvio mergePdtEnvio(PdtEnvio pdtEnvio) {
        return em.merge(pdtEnvio);
    }

    public void removePdtEnvio(PdtEnvio pdtEnvio) {
        pdtEnvio =
            em.find(PdtEnvio.class,
                    new PdtEnvioPK(pdtEnvio.getPdtFechaEnvio(), pdtEnvio.getPdtIdEnvio(), pdtEnvio.getPdtServicio()));
        em.remove(pdtEnvio);
    }
}
