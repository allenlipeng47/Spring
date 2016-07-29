package restful.controller1;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

@Controller
public class Controller1 {

	private int curr = 0;
	List<Integer> list = new ArrayList<Integer>();

	@RequestMapping("/getList")
	public @ResponseBody List getStudentList() {
		List<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		return list;
	}

	@RequestMapping("curr")
	public @ResponseBody Callable getCurr() throws Exception{
		return new Callable<List>() {
			@Override
			public List call() throws Exception {
				Thread.sleep(2000);
				list.add(++curr);
				return list;
			}
		};
	}

	@RequestMapping("thread")
	public @ResponseBody String getThreadId() {
		return String.valueOf(Thread.currentThread().getId());
	}

	@RequestMapping("bean")
	public @ResponseBody String getBean() {
		return this.toString();
	}

	@RequestMapping("session")
	public @ResponseBody String getSession() {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		return attr.getSessionId();
	}

}