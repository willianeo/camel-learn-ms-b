package com.in28minutes.microservices.camel_microservice_b.routes.b.activemq;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
class MyCurrencyExchangeTransformer {
	
	Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeTransformer.class);
	
	public CurrencyExchange processMessage(CurrencyExchange currencyExchange) {
		currencyExchange
			.setConversionMultiple(currencyExchange.getConversionMultiple().multiply(BigDecimal.TEN));
		logger.info("Do some processing with currencyExchange.getConversionMultiple() value which is {}", currencyExchange.getConversionMultiple());
		return currencyExchange;
	}
}