package ru.vbc.restConsumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vbc.restConsumer.api.DocWithSignDto;
import ru.vbc.restConsumer.feings.SignCheckClient;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}


@RestController
class SomeRest {

	@Autowired
	SignCheckClient signCheckerClient;

	@RequestMapping("/ok")
	public String signOk() {
		DocWithSignDto docWithSignDto = new DocWithSignDto("my/path/file", "1".getBytes());
		return signCheckerClient.check(docWithSignDto).toString();
	}


	@RequestMapping("/fail")
	public String signFail() {
		DocWithSignDto docWithSignDto = new DocWithSignDto("my/path/file", "2".getBytes());
		return signCheckerClient.check(docWithSignDto).toString();
	}


}