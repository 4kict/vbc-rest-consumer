package ru.vbc.restConsumer.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface SignCheckService {
	@RequestMapping(path = "/verifySignature", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	VerificationResult check(@RequestBody DocWithSignDto docWithSignDto);
}
