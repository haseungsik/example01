package com.osstem.denjob.api;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public @ResponseBody Object greeting(@RequestParam(value="name", defaultValue="World") String name) {
		HashMap<String,String> map  = new HashMap();
		map.put("kye",name);
		return map;
	}

}
