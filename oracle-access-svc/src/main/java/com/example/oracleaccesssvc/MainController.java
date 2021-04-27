package com.example.oracleaccesssvc;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/demo") // This means URL's start with /demo (after Application path)
public class MainController {

	@Autowired
	private TestTblService service;

	@GetMapping("/test")
	public List<TestTbl> list() {
		return service.listAll();
	}

	@GetMapping("/test/{id}")
	public ResponseEntity<TestTbl> get(@PathVariable Integer id) {
		try {
			TestTbl product = service.get(id);
			return new ResponseEntity<TestTbl>(product, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<TestTbl>(HttpStatus.NOT_FOUND);
		}
	}
}
