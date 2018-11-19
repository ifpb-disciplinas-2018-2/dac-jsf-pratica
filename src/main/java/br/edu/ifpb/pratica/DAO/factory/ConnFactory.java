
package br.edu.ifpb.pratica.DAO.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernanda
 */
public class ConnFactory {
    
    private Connection connection;

    public ConnFactory() {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(
                    "jdbc:postgresql://host-banco:5432/dac",
                    "postgres", "postegres"
            );
        } catch (Exception ex) {
            Logger.getLogger(ConnFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
