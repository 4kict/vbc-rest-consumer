package ru.vbc.restConsumer.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class DocWithSignDto {
	public final String docPath;
	public final byte[]sign;

	@JsonCreator
	public DocWithSignDto(
			@JsonProperty("docPath") String docPath,
			@JsonProperty("sign") byte[] sign) {
		this.docPath = docPath;
		this.sign = sign;
	}

	@Override
	public String toString() {
		return "DocWithSignDto{" +
				"docPath='" + docPath + '\'' +
				", sign=" + Arrays.toString(sign) +
				'}';
	}
}
