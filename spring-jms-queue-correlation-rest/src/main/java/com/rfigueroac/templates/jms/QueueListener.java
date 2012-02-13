package com.rfigueroac.templates.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;



public class QueueListener implements MessageListener {
	private Logger logger = Logger.getLogger(QueueListener.class);

	private JmsTemplate jmsTemplate;
	private String responseDestination;


	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			final TextMessage requestMessage = (TextMessage) message;
			try {
				final String mensaje = requestMessage.getText();
				logger.debug("EchoJmsServer recibiendo: " + mensaje);
				jmsTemplate.send(responseDestination, new MessageCreator() {
					public Message createMessage(Session session)
							throws JMSException {
						TextMessage responseMessage = session
								.createTextMessage();
						responseMessage.setJMSCorrelationID(requestMessage
								.getJMSCorrelationID());
						responseMessage.setText("Enviando... "+mensaje);
						return responseMessage;
					}
				});
			} catch (final JMSException e) {
				logger.error("Error al procesar el mensaje JMS", e);
			}
		}

	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void setResponseDestination(String responseDestination) {
		this.responseDestination = responseDestination;
	}

}