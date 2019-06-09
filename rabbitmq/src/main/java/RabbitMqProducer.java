import com.rabbitmq.client.AMQP;
import com.rabbitmq.jms.admin.RMQConnectionFactory;
import com.rabbitmq.jms.admin.RMQDestination;
import com.rabbitmq.jms.client.AmqpConnectionFactoryPostProcessor;
import com.rabbitmq.jms.client.AmqpPropertiesCustomiser;

import javax.jms.*;

public class RabbitMqProducer {
    public static final String TEXT_PLAIN = "text/plain";

    public static void main(String[] args) throws JMSException {

        RMQConnectionFactory connectionFactory = new RMQConnectionFactory();
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setVirtualHost("/");
        connectionFactory.setHost("localhost");
        connectionFactory.setPort(5672);
        Connection connection = connectionFactory.createConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue("TEST-QUEUE");
        //RMQDestination destination = new RMQDestination("TEST-QUEUE-TEXT-ONLY",true,false);
        //((RMQDestination)destination).setDeclared(false);
        //((RMQDestination)destination).setAmqp(true);
        MessageProducer producer = session.createProducer(destination);
        String payload = "Hi, I am text message 3";
        TextMessage msg = session.createTextMessage(payload);
        System.out.println("Sending text '" + payload + "'");
        producer.send(msg);
    }
}
