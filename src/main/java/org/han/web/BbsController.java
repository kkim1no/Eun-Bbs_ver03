package org.han.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/han/*")
public class BbsController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(BbsController.class);

}
