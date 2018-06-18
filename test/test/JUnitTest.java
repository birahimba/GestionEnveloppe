package test;

import com.areyes1.jgc.nb.junit.Envelope;
import com.areyes1.jgc.nb.junit.Message;
import java.util.ArrayList;
import java.util.List;
import netbeanssamplejunitapplication.NetBeansSampleJUnitApplication;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alvinreyes
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
   
    /**
     * Test of preProcessMessages method, of class NetBeansSampleJUnitApplication.
     */
    @Test
    public void testPreProcessMessages() {
        System.out.println("preProcessMessages");
        List<Message> listOfMessage = new ArrayList<Message>();
        listOfMessage.add(new Message("NAME1","BODY1","DESC1"));
        listOfMessage.add(new Message("NAME2","BODY2","DESC2"));
        listOfMessage.add(new Message("NAME3","BODY3","DESC3"));
        NetBeansSampleJUnitApplication instance = new NetBeansSampleJUnitApplication();
        Envelope result = instance.preProcessMessages(listOfMessage);
        assertTrue(result.getMessage().size() > 0); //  there should be messages processed
       
    }

    /**
     * Test of generateListOfMessages method, of class NetBeansSampleJUnitApplication.
     */
    @Test
    public void testGenerateListOfMessages() {
        System.out.println("generateListOfMessages");
        NetBeansSampleJUnitApplication instance = new NetBeansSampleJUnitApplication();
        List<Message> result = instance.generateListOfMessages();
        assertTrue(result.size() > 0); //  there should be messages processed
    }

    /**
     * Test of postProcessMessages method, of class NetBeansSampleJUnitApplication.
     */
    @Test
    public void testPostProcessMessages() {
        System.out.println("postProcessMessages");
        List<Message> listOfMessage = new ArrayList<Message>();
        listOfMessage.add(new Message("NAME1","BODY1","DESC1"));
        listOfMessage.add(new Message("NAME2","BODY2","DESC2"));
        listOfMessage.add(new Message("NAME3","BODY3","DESC3"));
        NetBeansSampleJUnitApplication instance = new NetBeansSampleJUnitApplication();
        Envelope expResult = new Envelope();
        Envelope result = instance.postProcessMessages(listOfMessage);
        
        //  We are expecting that the composition of the class changed.
        assertFalse(expResult.equals(result));
    }
    
}
