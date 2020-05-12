package com.nscooper.mizuho.price.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;

public class JmsMessageListener implements MessageListener {
	
	private static Logger logger = Logger.getLogger(JmsMessageListener.class);

	@Override
	public void onMessage(Message message) {

		/* Receive the text message */
		if (message instanceof TextMessage) {

			try {
				String text = ((TextMessage) message).getText();
				logger.debug("Message received from the topic is: " + text);


			} catch (JMSException e) {
				logger.error("Error : " + e.getLocalizedMessage());
			}

		} else {
			/* ignore non text message */
			logger.info("Only react to text messages sent to topic. Message of type:"
					+ message.getClass().getSimpleName() + " ignored!");
		}
	}

}