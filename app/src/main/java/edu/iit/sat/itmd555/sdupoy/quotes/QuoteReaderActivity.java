package edu.iit.sat.itmd555.sdupoy.quotes;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Simon on 2/17/2016.
 */
public class QuoteReaderActivity extends AppCompatActivity {

    private ListView mListView;

    public class QuoteAdapter extends BaseAdapter {

        private Context mContext;
        private LayoutInflater mInflator;
        private DataSource mDataSource;


        public QuoteAdapter(Context c) {
            mContext = c;
            mInflator = (LayoutInflater)
                    mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mDataSource = new DataSource();
        }

        @Override
        public int getCount() {
            return mDataSource.getDataSourceLength();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView thumbnail;
            TextView quote;

            if(convertView == null) {
                convertView = mInflator.inflate(R.layout.list_item_layout, parent,
                        false);
            }

            thumbnail = (ImageView) convertView.findViewById(R.id.thumb);
            thumbnail.setImageResource(mDataSource.getmPhotoPool().get(position));
            quote = (TextView) convertView.findViewById(R.id.text);
            quote.setText(mDataSource.getmQuotePool().get(position));
            return convertView;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quote_reader);
        mListView = (ListView) findViewById(R.id.quotes_list);
        mListView.setAdapter(new QuoteAdapter(this));

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView arg0, View arg1, int position,
                                    long arg3) {
                Intent i = new Intent(QuoteReaderActivity.this, QuoteDetail.class);
                i.putExtra("position", position);
                startActivity(i);
            }
        });

    }
}
