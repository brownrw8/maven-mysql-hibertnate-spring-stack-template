package com.browrw8.sdbs.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	Integer userId;
	
	@Column(name="FIRSTNAME")
	String firstname;
	
	@Column(name="LASTNAME")
	String lastname;
        
        @OneToMany
        @JoinColumn(name="USER_ID", referencedColumnName="USER_ID")
        List<Post> posts;

        
        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
        
        public List<Post> getPosts(){
            return posts;
        }
        
        public void setPosts(List<Post> posts) {
            this.posts = posts;
        }


}
