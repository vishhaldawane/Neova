package com.java.Container;

public class song {

	private String title;
	private String album;
	private String artist;
	private int year;
	public song(String title, String album, String artist, int year) {
		super();
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
	}
	@Override
	public String toString() {
		return "song [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}

}
