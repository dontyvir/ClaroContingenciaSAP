package persistencia;

import javax.ejb.Remote;

@Remote
public interface PdtPersistFacade {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    <T> T persistEntity(T entity);

    <T> T mergeEntity(T entity);

    PdtRegEnvio persistPdtRegEnvio(PdtRegEnvio pdtRegEnvio);

    PdtRegEnvio mergePdtRegEnvio(PdtRegEnvio pdtRegEnvio);

    void removePdtRegEnvio(PdtRegEnvio pdtRegEnvio);

    PdtContingencia persistPdtContingencia(PdtContingencia pdtContingencia);

    PdtContingencia mergePdtContingencia(PdtContingencia pdtContingencia);

    void removePdtContingencia(PdtContingencia pdtContingencia);

    PdtLog persistPdtLog(PdtLog pdtLog);

    PdtLog mergePdtLog(PdtLog pdtLog);

    void removePdtLog(PdtLog pdtLog);

    PdtConfigError persistPdtConfigError(PdtConfigError pdtConfigError);

    PdtConfigError mergePdtConfigError(PdtConfigError pdtConfigError);

    void removePdtConfigError(PdtConfigError pdtConfigError);

    PdtConfig persistPdtConfig(PdtConfig pdtConfig);

    PdtConfig mergePdtConfig(PdtConfig pdtConfig);

    void removePdtConfig(PdtConfig pdtConfig);

    PdtEnvio persistPdtEnvio(PdtEnvio pdtEnvio);

    PdtEnvio mergePdtEnvio(PdtEnvio pdtEnvio);

    void removePdtEnvio(PdtEnvio pdtEnvio);
}
