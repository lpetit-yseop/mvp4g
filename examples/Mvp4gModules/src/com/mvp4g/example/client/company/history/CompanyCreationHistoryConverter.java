package com.mvp4g.example.client.company.history;

import com.mvp4g.client.annotation.History;
import com.mvp4g.client.history.HistoryConverter;
import com.mvp4g.example.client.company.CompanyEventBus;

@History( convertParams = false )
public class CompanyCreationHistoryConverter implements HistoryConverter<CompanyEventBus> {

	public void convertFromToken( String eventType, String param, CompanyEventBus eventBus ) {
		eventBus.goToCreation();
	}

}