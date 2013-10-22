package com.example.deviantartconnectapp.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name="ArtPieces")
public class ArtPiece extends Model {
	@Column(name="ImageUrl")
	public String image_url;

	public ArtPiece(){
		super();
	}
	
	public ArtPiece(String url){
		super();
		this.image_url = url;
	}
}
