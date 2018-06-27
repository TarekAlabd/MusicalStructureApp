package com.example.android.musicalstructureapp;

/**
 * {@link Title} represents the title of the album.
 * it contains the singer's name.
 */

public class Title {
    //String value for album name
    private String mAlbumName;

    //String value for singer name
    private String mSingerName;

    /**
     * Constructs a new TextView for initial values for albumName and singerName
     */

    public Title (String albumName, String singerName){
        mAlbumName = albumName;
        mSingerName = singerName;
    }

    /**
     * Gets the String value in the TextView
     *
     *@return current text in the TextView
     */
    public String getAlbumName() {return mAlbumName;}

    /**
     * Gets the String value in the TextView
     *
     *@return current text in the TextView
     */
    public String getSingerName() {return mSingerName;}


}
