package edu.iis.mto.bdd.trains.cucumber.steps;

import org.joda.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

public class ArrivalTimeEstimatingSteps {

	@Zakładając("^że chcę się dostać z \"(.*)\" do \"(.*)\"$")
	public void givenIWantToGet(String departure, String destination) {
		throw new PendingException();
	}
	
	@Zakładając("^następny pociąg odjeżdża o (.*) na linii \"(.*)\"$")
	public void givenNextTrainStarts(@Transform(JodaLocalTimeConverter.class) LocalTime startTime, String line) {
		throw new PendingException();
	}

	@Gdy("^zapytam o godzinę przyjazdu$")
	public void whenIAskAboutArrivalTime() {
		throw new PendingException();
	}

	@Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: (.*)$")
	public void shouldGetEstimatedArrivalTime(@Transform(JodaLocalTimeConverter.class) LocalTime estimatedArrivalTime) {
		throw new PendingException();
	}
}
