package edu.iit.sat.itmd555.sdupoy.quotes;

import java.util.ArrayList;

/**
 * Created by Simon on 2/17/2016.
 */
public class DataSource {
    private ArrayList<Integer> mPhotoPool;
    private ArrayList<Integer> mQuotePool;
    private ArrayList<Integer> mPhotoHdPool;

    public ArrayList<Integer> getmPhotoHdPool() {
        return mPhotoHdPool;
    }

    public ArrayList<Integer> getmPhotoPool() {
        return mPhotoPool;
    }

    public ArrayList<Integer> getmQuotePool() {
        return mQuotePool;
    }

    private void setupPhotoPool() {
        mPhotoPool.add(R.drawable.gandhimini_1);
        mPhotoPool.add(R.drawable.slatermini_2);
        mPhotoPool.add(R.drawable.marleymini_3);
        mPhotoPool.add(R.drawable.churchillmini_4);
        mPhotoPool.add(R.drawable.lennonmini_5);
        mPhotoPool.add(R.drawable.jordanmini_6);
        mPhotoPool.add(R.drawable.notoriousmini_7);
        mPhotoPool.add(R.drawable.allenmini_8);
        mPhotoPool.add(R.drawable.einsteinmini_9);
        mPhotoPool.add(R.drawable.shakespearemini_10);
    }
    private void setupQuotePool() {
        mQuotePool.add(R.string.quote_1);
        mQuotePool.add(R.string.quote_2);
        mQuotePool.add(R.string.quote_3);
        mQuotePool.add(R.string.quote_4);
        mQuotePool.add(R.string.quote_5);
        mQuotePool.add(R.string.quote_6);
        mQuotePool.add(R.string.quote_7);
        mQuotePool.add(R.string.quote_8);
        mQuotePool.add(R.string.quote_9);
        mQuotePool.add(R.string.quote_10);

    }
    private void setupPhotoHDPool() {
        mPhotoHdPool.add(R.drawable.gandhi_1);
        mPhotoHdPool.add(R.drawable.slater_2);
        mPhotoHdPool.add(R.drawable.marley_3);
        mPhotoHdPool.add(R.drawable.churchill_4);
        mPhotoHdPool.add(R.drawable.lennon_5);
        mPhotoHdPool.add(R.drawable.jordan_6);
        mPhotoHdPool.add(R.drawable.notorious_7);
        mPhotoHdPool.add(R.drawable.allen_8);
        mPhotoHdPool.add(R.drawable.einstein_9);
        mPhotoHdPool.add(R.drawable.shakespeare_10);
    }

    public int getDataSourceLength() {
        return mPhotoPool.size();
    }


    public DataSource() {
        mPhotoPool = new ArrayList();
        mQuotePool = new ArrayList();
        mPhotoHdPool = new ArrayList();

        setupPhotoPool();
        setupQuotePool();
        setupPhotoHDPool();

    }

}
