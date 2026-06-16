package model;

public enum Platform {
	SPOTIFY,
	APPLE_MUSIC,
	YOUTUBE,
	UNKNOWN;
	
	public static Platform fromUrl(String url) {
	    if (url.matches(".*spotify\\.com.*")) {
	        return Platform.SPOTIFY;
	    } else if (url.matches(".*music\\.apple\\.com.*")) {
	        return Platform.APPLE_MUSIC;
	    } else if (url.matches(".*(youtube\\.com|youtu\\.be).*")) {
	        return Platform.YOUTUBE;
	    } else {
	        return Platform.UNKNOWN;
	    }
	}
}


