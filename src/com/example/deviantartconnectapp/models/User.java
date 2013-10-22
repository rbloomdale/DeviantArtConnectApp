package com.example.deviantartconnectapp.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name="User")
public class User extends Model {
	@Column(name="ScreenName")
	protected String screen_name;
	
	@Column(name="RealName")
	protected String real_name;
	
	@Column(name="ProfileUrl")
	protected String profile_url;
	
	public User(){
		super();
	}
	
	public User(String screenName, String realName, String profileUrl){
		super();
		screen_name = screenName;
		real_name = realName;
		profile_url = profileUrl;
	}
}
