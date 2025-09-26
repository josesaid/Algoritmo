package com.mx.josesaid;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

/**
 * @author josesaidolanogarcia
 */
public class CassandraExample {
    private static final Logger log = LoggerFactory.getLogger(CassandraExample.class);

    public static void main(String[] args) {
        try (CqlSession session = CqlSession.builder()
                .addContactPoint(new InetSocketAddress("localhost", 9042))
                // Cassandra usa "datacenter1" por defecto
                .withLocalDatacenter("datacenter1")
                .build()) {

            // Crear Keyspace
            session.execute("CREATE KEYSPACE IF NOT EXISTS test WITH replication = " +
                    "{'class': 'SimpleStrategy', 'replication_factor': 1}");

            // Usar Keyspace
            session.execute("USE test");

            // Crear tabla
            session.execute("CREATE TABLE IF NOT EXISTS users (id UUID PRIMARY KEY, name text)");

            // Insertar datos
            session.execute("INSERT INTO users (id, name) VALUES (uuid(), 'Said Olano')");

            // Leer datos
            ResultSet rs = session.execute("SELECT * FROM users");

            // Imprimir resultados
            for (Row row : rs) {
                log.info("User: {} - {}", row.getUuid("id"), row.getString("name"));
            }

        } catch (Exception e) {
            log.error("Error al ejecutar ejemplo Cassandra", e);
        }
    }
}
