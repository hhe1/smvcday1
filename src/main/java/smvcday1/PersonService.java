package smvcday1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Value("${db}")
	private String db;

	@Value("${name}")
	private String name;

	@Value("${port}")
	private String port;

	public void say() {
		System.out.println("person service say");
		System.out.println("db=" + db);
		System.out.println("name=" + name);
		System.out.println("port=" + port);
	}

}
