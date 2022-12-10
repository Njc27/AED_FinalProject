package DBConn;

//import Business.ConfigureASystem;
//import Business.EcoSystem;
import Business.ConfigureASystem;
import Business.Organization;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author namithajc
 */

public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), FILENAME);
        return db;
    }

    public synchronized void storeSystem(Organization system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public Organization retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<Organization> systems = conn.query(Organization.class); // Change to the object you want to save
        Organization system;
        if (systems.size() == 0){
            system = ConfigureASystem.initialize();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
