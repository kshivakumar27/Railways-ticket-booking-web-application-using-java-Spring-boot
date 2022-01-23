package com.ltts.projecttrain.model;
//import javax.persistence.Entity;
//import javax.persistence.Id;

import javax.persistence.Entity;

import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Train {
	  @Id
      private int id;
      private String name;
      private String trainnames;
      private String timings;
      private String paymenttype;
      
      

  	
  	public Train() {
  		super();
  	}

      
      
      
      
	public Train(int id, String name, String trainnames, String timings, String paymenttype) {
		super();
		this.id = id;
		this.name = name;
		this.trainnames = trainnames;
		this.timings = timings;
		this.paymenttype = paymenttype;
	}
	
	
	



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrainnames() {
		return trainnames;
	}
	public void setTrainnames(String trainnames) {
		this.trainnames = trainnames;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", trainnames=" + trainnames + ", timings=" + timings
				+ ", paymenttype=" + paymenttype + "]";
	}
      
	
	
	
	
}
