package restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.LinkedList;
import java.util.List;

@Controller
public class RestfulController {

	@RequestMapping("getList")
	public @ResponseBody List getStudentList() {
		List<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		return list;
	}

}