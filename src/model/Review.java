package model;
import java.time.LocalDateTime;

public class Review {
	private int ReviewID;
	private int SongID;
	private Integer UserID;
	private String ReviewerName;
	private String ReviewText;
	private int Rating;
	private boolean isAnonymous;
	private LocalDateTime dateReviewed;
	
	/**
	 * @param reviewID
	 * @param songID
	 * @param userID
	 * @param reviewerName
	 * @param reviewText
	 * @param rating
	 * @param isAnonymous
	 * @param dateReviewed
	 */
	public Review(int reviewID, int songID, Integer userID, String reviewerName, String reviewText, int rating,
			boolean isAnonymous, LocalDateTime dateReviewed) {
		super();
		ReviewID = reviewID;
		SongID = songID;
		UserID = userID;
		ReviewerName = reviewerName;
		ReviewText = reviewText;
		Rating = rating;
		this.isAnonymous = isAnonymous;
		this.dateReviewed = dateReviewed;
	}

	/**
	 * @return the reviewID
	 */
	public int getReviewID() {
		return ReviewID;
	}
	/**
	 * @param reviewID the reviewID to set
	 */
	public void setReviewID(int reviewID) {
		ReviewID = reviewID;
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
	 * @return the userID
	 */
	public Integer getUserID() {
		return UserID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(Integer userID) {
		UserID = userID;
	}
	
	/**
	 * @return the reviewerName
	 */
	public String getReviewerName() {
		return ReviewerName;
	}
	/**
	 * @param reviewerName the reviewerName to set
	 */
	public void setReviewerName(String reviewerName) {
		ReviewerName = reviewerName;
	}
	
	/**
	 * @return the reviewText
	 */
	public String getReviewText() {
		return ReviewText;
	}
	/**
	 * @param reviewText the reviewText to set
	 */
	public void setReviewText(String reviewText) {
		ReviewText = reviewText;
	}
	
	/**
	 * @return the rating
	 */
	public int getRating() {
		return Rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		Rating = rating;
	}
	
	/**
	 * @return the isAnonymous
	 */
	public boolean isAnonymous() {
		return isAnonymous;
	}
	/**
	 * @param isAnonymous the isAnonymous to set
	 */
	public void setAnonymous(boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}
	
	/**
	 * @return the dateReviewed
	 */
	public LocalDateTime getDateReviewed() {
		return dateReviewed;
	}
	/**
	 * @param dateReviewed the dateReviewed to set
	 */
	public void setDateReviewed(LocalDateTime dateReviewed) {
		this.dateReviewed = dateReviewed;
	}
	
}
