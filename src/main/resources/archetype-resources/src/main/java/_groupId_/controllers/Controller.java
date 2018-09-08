package ${groupId}.controllers;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/${project.version}")
public class Controller {

	private Logger LOGGER = Logger.getLogger(Controller.class);

	@Autowired
	private IServiceTest service;

	@RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
	public String test(@PathVariable(value = "id") String id) throws Exception {
		return service.test(id);
	}
}