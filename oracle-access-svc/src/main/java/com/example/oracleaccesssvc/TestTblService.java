package com.example.oracleaccesssvc;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TestTblService {

	@Autowired
	private TestTblRepository repo;

	public List<TestTbl> listAll() {
		return repo.findAll();
	}

	public void save(TestTbl testTbl) {
		repo.save(testTbl);
	}

	public TestTbl get(Integer id) {
		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}