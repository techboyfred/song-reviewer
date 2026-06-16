package model;
import java.time.LocalDateTime;

public class Song {
	private int SongID;
	private String Title;
	private String Artist;
	private String link;
	private LocalDateTime dateAdded;
	private int addedByUserID;
	private Platform platform;
	
	/**
	 * @param songID
	 * @param title
	 * @param artist
	 * @param link
	 * @param dateAdded
	 * @param addedByUserID
	 */
	public Song(int songID, String title, String artist, String link, LocalDateTime dateAdded, int addedByUserID) {
		super();
		SongID = songID;
		Title = title;
		Artist = artist;
		this.link = link;
		this.dateAdded = dateAdded;
		this.addedByUserID = addedByUserID;
		this.platform = Platform.fromUrl(link);
	}
	
	/**
	 * @return the songID
	 */
	public int getSongID() {
		return SongID;
	}
	/**
	 * @param songID the songID to set
	 */
	public void setSongID(int songID) {
		SongID = songID;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		Title = title;
	}
	
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return Artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		Artist = artist;
	}
	
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	
	/**
	 * @return the dateAdded
	 */
	public LocalDateTime getDateAdded() {
		return dateAdded;
	}
	/**
	 * @param dateAdded the dateAdded to set
	 */
	public void setDateAdded(LocalDateTime dateAdded) {
		this.dateAdded = dateAdded;
	}
	
	/**
	 * @return the addedByUserID
	 */
	public int getAddedByUserID() {
		return addedByUserID;
	}
	/**
	 * @param addedByUserID the addedByUserID to set
	 */
	public void setAddedByUserID(int addedByUserID) {
		this.addedByUserID = addedByUserID;
	}

	/**
	 * @return the platform
	 */
	public Platform getPlatform() {
		return platform;
	}

	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	
	
}
