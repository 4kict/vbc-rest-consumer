package ru.vbc.restConsumer.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VerificationResult {
	public final Boolean success;
	public final String message;


	@JsonCreator
	public VerificationResult(
			@JsonProperty("success") Boolean success,
			@JsonProperty("message") String message) {
		this.success = success;
		this.message = message;
	}

	@Override
	public String toString() {
		return "VerificationResult{" +
				"success=" + success +
				", message='" + message + '\'' +
				'}';
	}
}
