package br.com.reserva.avaliacao.restaurante.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.sql.SQLException;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

@Configuration
public class DbConfig {

    @Value("${api.datasource.url}")
    private String jdbcUrl;

    @Value("${api.datasource.uid}")
    private String uid;

    @Value("${api.datasource.pwd}")
    private String pwd;

    @Value("${api.datasource.connectionPoolName}")
    private String connectionPoolName;

    @Value("${api.datasource.minPoolSize}")
    private int minPoolSize;

    @Value("${api.datasource.maxPoolSize}")
    private int maxPoolSize;

    @Value("${api.datasource.initialPoolSize}")
    private int initialPoolSize;

    @Value("${api.datasource.inactiveConnectionTimeout}")
    private int inactiveConnectionTimeout;

    @Value("${api.datasource.connectionWaitTimeout}")
    private int connectionWaitTimeout;

    @Value("${api.datasource.timeoutCheckInterval}")
    private int timeoutCheckInterval;

    @Value("${api.datasource.timeToLiveConnectionTimeout}")
    private int timeToLiveConnectionTimeout;

    @Value("${api.datasource.queryTimeout}")
    private int queryTimeout;

    @Value("${api.datasource.abandonedConnectionTimeout}")
    private int abandonedConnectionTimeout;

    @Value("${api.datasource.sessionName}")
    private String sessionName;

    // @Value("${api.datasource.schema}")
    // private String schema;

    @Bean
    public DataSource getOracleDataSource() throws SQLException {

        PoolDataSource pds = PoolDataSourceFactory.getPoolDataSource();

        pds.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
        pds.setURL(jdbcUrl);
		pds.setUser(uid);
		pds.setPassword(pwd);
		pds.setConnectionPoolName(connectionPoolName);
		pds.setMinPoolSize(minPoolSize);
		pds.setMaxPoolSize(maxPoolSize);
		pds.setInitialPoolSize(initialPoolSize);
		pds.setTimeToLiveConnectionTimeout(timeToLiveConnectionTimeout);
		pds.setQueryTimeout(queryTimeout);
		pds.setInactiveConnectionTimeout(inactiveConnectionTimeout);
		pds.setAbandonedConnectionTimeout(abandonedConnectionTimeout);
		pds.setConnectionWaitTimeout(connectionWaitTimeout);
		pds.setTimeoutCheckInterval(timeoutCheckInterval);
		pds.setConnectionProperty("v$session.program", sessionName);
        
        return pds;
    }
}
