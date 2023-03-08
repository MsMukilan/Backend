package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.main.Laptop;
import com.example.demo.repository.lsRepository;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/")
public class lsController {
	@Autowired
	lsRepository repo;
	
	@GetMapping("/")
	public List<Laptop> getAllEmp(){
		return repo.findAll();
	}
	
	@PostMapping("/")
	public Laptop createEmployee(@RequestBody Laptop x) {
		return repo.save(x);
	}
	
	@GetMapping("/{id}")
	public Optional<Laptop> getEmpbyId(@PathVariable int id){
		Optional<Laptop> temp=repo.findById(id);
		return temp;
	}
	
	@PutMapping("/{id}")
	public String updateEmployee(@PathVariable int id,@RequestBody Laptop upd) {
		if(repo.existsById(id)) {
			Laptop t=new Laptop();
			t.setId(id);
			t.setLaptopName(upd.getLaptopName());
			t.setColor(upd.getColor());
			t.setPrice(upd.getPrice());
			repo.save(t);
		}
		return " ";
	}
	@DeleteMapping("/{id}")
	public String removeEmp(@PathVariable int id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
		}
		return " ";
	}
	
}