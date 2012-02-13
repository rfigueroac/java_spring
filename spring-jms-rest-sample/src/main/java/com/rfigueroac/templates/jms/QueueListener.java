package com.rfigueroac.templates.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;
import org.springframework.jms.core.JmsTemplate;

/**
 * 
 * @author lshimokawa
 * 
 */
public class QueueListener implements MessageListener {
	private static final Logger logger = Logger.getLogger(QueueListener.class);

	private JmsTemplate jmsTemplate;
	private String responseDestination;

	public void onMessage(final Message message) {
		if (message instanceof TextMessage) {
			final TextMessage textMessage = (TextMessage) message;
			try {
				logger.debug("QueueListener:" + textMessage.getText());
				System.out.println("QueueListener:" + textMessage.getText());
			} catch (final JMSException e) {
				e.printStackTrace();
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