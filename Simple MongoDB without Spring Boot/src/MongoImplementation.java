import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.ErrorCategory;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoCollection;

import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoImplementation {

    public static void main(String[] args) {

        MongoDatabase database = null;
        try {
            final MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
            // Connect to Database "trainingdb"
            database = mongoClient.getDatabase("trainingdb");
           // MongoCollection collection = database.getCollection("employee");

            System.out.println("Successful database connection established. \n");

        } catch (Exception exception) {
            System.err.println(exception.getClass().getName() + ": " + exception.getMessage());
        }


        MongoCollection collection = database.getCollection("employee");
        Employee emp = new Employee();

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(emp);
        Document doc = new Document();
        //Document ekta = new Document();


        for(int i=0;i<employeeList.size();i++){
            //insert the data...
            doc.append("_id", i)
                    .append("firstName", emp.getFirstName())
                    .append("lastName", emp.getLastName())
                    .append("email", emp.getEmail());


            try {
                collection.insertOne(doc);
               // collection.insertOne(ekta);

                //System.out.println("Successfully inserted documents. \n");
            } catch (MongoWriteException mwe) {
                if (mwe.getError().getCategory().equals(ErrorCategory.DUPLICATE_KEY)) {
                    System.out.println("Document with that id already exists");
                }
            }
        }



        System.out.println("Print all the documents.");

        MongoCursor cursor = collection.find().iterator();
        try {
            while (cursor.hasNext()) {
                System.out.println(cursor.next());
            }

        } finally {
            cursor.close();
        }

    }

}
