package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStoryTextView;
    Button mButtonTop, mButtonBottom;
    int mStoryIndexTop = 1, mStoryIndexBottom = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        //mStoryIndexTop = 1;
        //mStoryIndexBottom = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mStoryIndexTop == 1 && mStoryIndexBottom == 1){

                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    //Log.d("mStoryIndex First IF", "Value: " + mStoryIndexTop);

                }else if(mStoryIndexTop == 2 && mStoryIndexBottom == 1){

                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    //Log.d("mStoryIndex Second IF", "Value: " + mStoryIndex);

                }else if (mStoryIndexTop == 1 && mStoryIndexBottom == 2){

                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);

                }else if(mStoryIndexTop == 2 && mStoryIndexBottom == 2){

                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    //Log.d("mStoryIndex Second IF", "Value: " + mStoryIndex);

                }
                mStoryIndexTop = mStoryIndexTop + 1;
                //Log.d("mStoryIndex Last", "Value: " + mStoryIndexTop + " & " + mStoryIndexBottom);

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mStoryIndexBottom == 1 && mStoryIndexTop == 1){

                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    //Log.d("mStoryIndex First IF", "Value: " + mStoryIndex);

                }else if (mStoryIndexTop == 1 && mStoryIndexBottom == 2){

                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    //mButtonTop.setText(R.string.T2_Ans1);
                    //mButtonBottom.setText(R.string.T2_Ans2);
                    //Log.d("mStoryIndex Second IF", "Value: " + mStoryIndex);

                }else if (mStoryIndexTop == 2 && mStoryIndexBottom == 1){

                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);

                }else if(mStoryIndexTop == 2 && mStoryIndexBottom == 2){

                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    //Log.d("mStoryIndex Second IF", "Value: " + mStoryIndex);

                }

                mStoryIndexBottom = mStoryIndexBottom + 1;
                //Log.d("mStoryIndex Last", "Value: " + mStoryIndexTop + " & " + mStoryIndexBottom);
            }
        });


    }
}
