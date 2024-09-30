package br.com.reserva.avaliacao.restaurante.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;


@Configuration
public class DbConfig {

    @Value("${api.datasource.host}")
    private String host;

    @Value("${api.datasource.port}")
    private String port;

    @Value("${api.datasource.database}")
    private String database;

    @Value("${api.datasource.username}")
    private String username;

    @Value("${api.datasource.password}")
    private String password;

    @Bean
    public MongoDatabaseFactory getMongoDataSource() {
        String uri = String.format("mongodb://%s:%s@%s:%s/%s", username, password, host, port, database);
        return new SimpleMongoClientDatabaseFactory(uri);
    }

       @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(getMongoDataSource());
    }
}

