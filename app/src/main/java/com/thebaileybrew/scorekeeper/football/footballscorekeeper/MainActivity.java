package com.thebaileybrew.scorekeeper.football.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Spinner teamOneSpinner;
    Spinner teamTwoSpinner;
    int scoreTeamOne=0;
    int scoreTeamTwo=0;
    int passingYardsTeamOne=0;
    int passingYardsTeamTwo=0;
    int rushingYardsTeamOne=0;
    int rushingYardsTeamTwo=0;
    int recievingYardsTeamOne=0;
    int recievingYardsTeamTwo=0;
    Button teamOneSafetyButton;
    Button teamTwoSafetyButton;
    String teamOneSafetyButtonText;
    String teamTwoSafetyButtonText;
    String fieldgoal = "FIELDGOAL";
    String safety = "SAFETY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ToggleButton teamOneToggleButton = (ToggleButton) findViewById(R.id.team_one_toggle);
        final ToggleButton teamTwoToggleButton = (ToggleButton) findViewById(R.id.team_two_toggle);
        final Button teamOneSafety = (Button) findViewById(R.id.team_one_off_fg);
        final Button teamTwoSafety = (Button) findViewById(R.id.team_two_off_fg);


        //Team One spinner selection criteria and image dsisplay
        teamOneSpinner = (Spinner) findViewById(R.id.teamOne_spinner);
        //Created the ArrayAdapter
        ArrayAdapter<CharSequence> teamOneAdapter = ArrayAdapter.createFromResource(this, R.array.football_teams, android.R.layout.simple_spinner_dropdown_item);
        teamOneSpinner.setAdapter(teamOneAdapter);
        teamOneSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                final ImageView im = (ImageView)findViewById(R.id.team_one_spinner_team_logo);
                String s=((TextView)view).getText().toString();
                if(s.equals("Arizona Cardinals"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.arizona_cardinals));
                if(s.equals("Atlanta Falcons"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.atlanta_falcons));
                if(s.equals("Baltimore Ravens"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.baltimore_ravens));
                if(s.equals("Buffalo Bills"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.buffalo_bills));
                if(s.equals("Carolina Panthers"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.carolina_panthers));
                if(s.equals("Chicago Bears"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.chicago_bears));
                if(s.equals("Cincinnati Bengals"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.cincinnati_bengals));
                if(s.equals("Cleveland Browns"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.cleveland_browns));
                if(s.equals("Dallas Cowboys"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.dallas_cowboys));
                if(s.equals("Denver Broncos"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.denver_broncos));
                if(s.equals("Detroit Lions"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.detroit_lions));
                if(s.equals("Green Bay Packers"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.green_bay_packers));
                if(s.equals("Houston Texans"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.houston_texans));
                if(s.equals("Indianapolis Colts"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.indianapolis_colts));
                if(s.equals("Jacksonville Jaguars"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.jacksonville_jaguars));
                if(s.equals("Kansas City Chiefs"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.kansas_city_chiefs));
                if(s.equals("Los Angeles Chargers"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.los_angeles_chargers));
                if(s.equals("Los Angeles Rams"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.los_angeles_rams));
                if(s.equals("Miami Dolphins"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.miami_dolphins));
                if(s.equals("Minnesota Vikings"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.minnesota_vikings));
                if(s.equals("New England Patriots"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.new_england_patriots));
                if(s.equals("New Orleans Saints"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.new_orleans_saints));
                if(s.equals("New York Giants"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.new_york_giants));
                if(s.equals("New York Jets"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.new_york_jets));
                if(s.equals("Oakland Raiders"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.oakland_raiders));
                if(s.equals("Philadelphia Eagles"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.philadelphia_eagles));
                if(s.equals("Pittsburgh Steelers"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.pittsburgh_steelers));
                if(s.equals("San Francisco 49ers"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.san_francisco_49ers));
                if(s.equals("Seattle Seahawks"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.seattle_seahawks));
                if(s.equals("Tampa Bay Buccaneers"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.tampa_bay_buccaneers));
                if(s.equals("Tennessee Titans"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.tennessee_titans));
                if(s.equals("Washington Redskins"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.washington_redskins));
                if(s.equals("Choose Your Team"))
                    im.setImageDrawable(getResources().getDrawable(R.drawable.blank_helmet));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        //Team Two spinner selection criteria and image display
        teamTwoSpinner = (Spinner) findViewById(R.id.teamTwo_spinner);
        ArrayAdapter<CharSequence> teamTwoAdapter = ArrayAdapter.createFromResource(this, R.array.football_teams, android.R.layout.simple_spinner_dropdown_item);
        teamTwoSpinner.setAdapter(teamTwoAdapter);
        teamTwoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                final ImageView im2 = (ImageView)findViewById(R.id.team_two_spinner_team_logo);
                String s2 = ((TextView)view).getText().toString();
                if(s2.equals("Arizona Cardinals"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.arizona_cardinals));
                if(s2.equals("Atlanta Falcons"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.atlanta_falcons));
                if(s2.equals("Baltimore Ravens"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.baltimore_ravens));
                if(s2.equals("Buffalo Bills"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.buffalo_bills));
                if(s2.equals("Carolina Panthers"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.carolina_panthers));
                if(s2.equals("Chicago Bears"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.chicago_bears));
                if(s2.equals("Cincinnati Bengals"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.cincinnati_bengals));
                if(s2.equals("Cleveland Browns"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.cleveland_browns));
                if(s2.equals("Dallas Cowboys"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.dallas_cowboys));
                if(s2.equals("Denver Broncos"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.denver_broncos));
                if(s2.equals("Detroit Lions"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.detroit_lions));
                if(s2.equals("Green Bay Packers"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.green_bay_packers));
                if(s2.equals("Houston Texans"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.houston_texans));
                if(s2.equals("Indianapolis Colts"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.indianapolis_colts));
                if(s2.equals("Jacksonville Jaguars"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.jacksonville_jaguars));
                if(s2.equals("Kansas City Chiefs"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.kansas_city_chiefs));
                if(s2.equals("Los Angeles Chargers"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.los_angeles_chargers));
                if(s2.equals("Los Angeles Rams"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.los_angeles_rams));
                if(s2.equals("Miami Dolphins"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.miami_dolphins));
                if(s2.equals("Minnesota Vikings"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.minnesota_vikings));
                if(s2.equals("New England Patriots"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.new_england_patriots));
                if(s2.equals("New Orleans Saints"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.new_orleans_saints));
                if(s2.equals("New York Giants"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.new_york_giants));
                if(s2.equals("New York Jets"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.new_york_jets));
                if(s2.equals("Oakland Raiders"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.oakland_raiders));
                if(s2.equals("Philadelphia Eagles"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.philadelphia_eagles));
                if(s2.equals("Pittsburgh Steelers"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.pittsburgh_steelers));
                if(s2.equals("San Francisco 49ers"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.san_francisco_49ers));
                if(s2.equals("Seattle Seahawks"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.seattle_seahawks));
                if(s2.equals("Tampa Bay Buccaneers"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.tampa_bay_buccaneers));
                if(s2.equals("Tennessee Titans"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.tennessee_titans));
                if(s2.equals("Washington Redskins"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.washington_redskins));
                if(s2.equals("Choose Your Team"))
                    im2.setImageDrawable(getResources().getDrawable(R.drawable.blank_helmet));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        teamOneToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    teamTwoToggleButton.setChecked(false);
                    teamOneSafety.setText("SAFETY");
                    teamTwoSafety.setText("FIELDGOAL");
                } else {
                    teamTwoToggleButton.setChecked(true);
                    teamTwoSafety.setText("SAFETY");
                    teamOneSafety.setText("FIELDGOAL");

                }
            }
        });

        teamTwoToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    teamOneToggleButton.setChecked(false);
                    teamTwoSafety.setText("SAFETY");
                    teamOneSafety.setText("FIELDGOAL");
                } else {
                    teamOneToggleButton.setChecked(true);
                    teamOneSafety.setText("SAFETY");
                    teamTwoSafety.setText("FIELDGOAL");
                }
            }
        });

    }


    //Scoring for Team One
    public void touchdownClickTeamOne (View v) {
        scoreTeamOne = scoreTeamOne + 6;
        displayForTeamOne(scoreTeamOne);
    }
    public void extraPointClickTeamOne (View v) {
        scoreTeamOne = scoreTeamOne + 1;
        displayForTeamOne(scoreTeamOne);
    }
    public void conversionClickTeamOne (View v) {
        scoreTeamOne = scoreTeamOne + 2;
        displayForTeamOne(scoreTeamOne);
    }
    public void fieldgoalClickTeamOne (View v) {
        scoreTeamOne = scoreTeamOne + 3;
        displayForTeamOne(scoreTeamOne);
    }
    public void safetyClickTeamOne (View v) {
        scoreTeamOne = scoreTeamOne + 2;
        displayForTeamOne(scoreTeamOne);
    }
    public void displayForTeamOne (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_one_score);
        scoreView.setText(String.valueOf(score));
    }

    //Passing Yardage for Team One
    public void passingYardsTeamOnePlus (View v) {
        passingYardsTeamOne = passingYardsTeamOne + 1;
        passingForTeamOne(passingYardsTeamOne);
    }
    public void passingYardsTeamOneMinus (View v) {
        passingYardsTeamOne = passingYardsTeamOne - 1;
        passingForTeamOne(passingYardsTeamOne);
    }
    public void passingYardsTeamOneTenPlus (View v) {
        passingYardsTeamOne = passingYardsTeamOne + 10;
        passingForTeamOne(passingYardsTeamOne);
    }
    public void passingForTeamOne (int yards) {
        TextView passingView = (TextView) findViewById(R.id.team_one_pass_score);
        passingView.setText(String.valueOf(yards));
    }

    //Recieving Yardage for Team One
    public void recievingYardsTeamOnePlus (View v) {
        recievingYardsTeamOne = recievingYardsTeamOne + 1;
        recievingForTeamOne(recievingYardsTeamOne);
    }
    public void recievingYardsTeamOneMinus (View v) {
        recievingYardsTeamOne = recievingYardsTeamOne - 1;
        recievingForTeamOne(recievingYardsTeamOne);
    }
    public void recievingYardsTeamOneTenPlus (View v) {
        recievingYardsTeamOne = recievingYardsTeamOne + 10;
        recievingForTeamOne(recievingYardsTeamOne);
    }
    public void recievingForTeamOne (int yards) {
        TextView recievingView = (TextView) findViewById(R.id.team_one_rec_score);
        recievingView.setText(String.valueOf(yards));
    }


    //Rushing Yardage for Team One
    public void rushingYardsTeamOnePlus (View v) {
        rushingYardsTeamOne = rushingYardsTeamOne + 1;
        rushingForTeamOne(rushingYardsTeamOne);
    }
    public void rushingYardsTeamOneMinus (View v) {
        rushingYardsTeamOne = rushingYardsTeamOne - 1;
        rushingForTeamOne(rushingYardsTeamOne);
    }
    public void rushingYardsTeamOneTenPlus (View v) {
        rushingYardsTeamOne = rushingYardsTeamOne + 10;
        rushingForTeamOne(rushingYardsTeamOne);
    }
    public void rushingForTeamOne (int yards) {
        TextView rushingView = (TextView) findViewById(R.id.team_one_rush_score);
        rushingView.setText(String.valueOf(yards));
    }


    //Scoring for Team Two
    public void touchdownClickTeamTwo (View v) {
        scoreTeamTwo = scoreTeamTwo + 6;
        displayForTeamTwo(scoreTeamTwo);
    }
    public void extraPointClickTeamTwo (View v) {
        scoreTeamTwo = scoreTeamTwo + 1;
        displayForTeamTwo(scoreTeamTwo);
    }
    public void conversionClickTeamTwo (View v) {
        scoreTeamTwo = scoreTeamTwo + 2;
        displayForTeamTwo(scoreTeamTwo);
    }
    public void fieldgoalClickTeamTwo (View v) {
        scoreTeamTwo = scoreTeamTwo + 3;
        displayForTeamTwo(scoreTeamTwo);
    }
    public void safetyClickTeamTwo (View v) {
        scoreTeamTwo = scoreTeamTwo + 2;
        displayForTeamTwo(scoreTeamTwo);
    }
    public void displayForTeamTwo (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_two_score);
        scoreView.setText(String.valueOf(score));
    }


    //Passing Yardage for TeamTwo
    public void passingYardsTeamTwoPlus (View v) {
        passingYardsTeamTwo = passingYardsTeamTwo + 1;
        passingForTeamTwo(passingYardsTeamTwo);
    }
    public void passingYardsTeamTwoMinus (View v) {
        passingYardsTeamTwo = passingYardsTeamTwo - 1;
        passingForTeamTwo(passingYardsTeamTwo);
    }
    public void passingYardsTeamTwoTenPlus (View v) {
        passingYardsTeamTwo = passingYardsTeamTwo + 10;
        passingForTeamTwo(passingYardsTeamTwo);
    }
    public void passingForTeamTwo (int yards) {
        TextView passingView2 = (TextView) findViewById(R.id.team_two_pass_score);
        passingView2.setText(String.valueOf(yards));
    }

    //Recieving Yardage for Team Two
    public void recievingYardsTeamTwoPlus (View v) {
        recievingYardsTeamTwo = recievingYardsTeamTwo + 1;
        recievingForTeamTwo(recievingYardsTeamTwo);
    }
    public void recievingYardsTeamTwoMinus (View v) {
        recievingYardsTeamTwo = recievingYardsTeamTwo - 1;
        recievingForTeamTwo(recievingYardsTeamTwo);
    }
    public void recievingYardsTeamTwoTenPlus (View v) {
        recievingYardsTeamTwo = recievingYardsTeamTwo + 10;
        recievingForTeamTwo(recievingYardsTeamTwo);
    }
    public void recievingForTeamTwo (int yards) {
        TextView recievingView2 = (TextView) findViewById(R.id.team_two_rec_score);
        recievingView2.setText(String.valueOf(yards));
    }

    //Rushing Yardage for Team Two
    public void rushingYardsTeamTwoPlus (View v) {
        rushingYardsTeamTwo = rushingYardsTeamTwo + 1;
        rushingForTeamTwo(rushingYardsTeamTwo);
    }
    public void rushingYardsTeamTwoMinus (View v) {
        rushingYardsTeamTwo = rushingYardsTeamTwo - 1;
        rushingForTeamTwo(rushingYardsTeamTwo);
    }
    public void rushingYardsTeamTwoTenPlus (View v) {
        rushingYardsTeamTwo = rushingYardsTeamTwo + 10;
        rushingForTeamTwo(rushingYardsTeamTwo);
    }
    public void rushingForTeamTwo (int yards) {
        TextView rushingView2 = (TextView) findViewById(R.id.team_two_rush_score);
        rushingView2.setText(String.valueOf(yards));
    }


    public void resetAllScores (View v) {
        scoreTeamOne=0;
        scoreTeamTwo=0;
        passingYardsTeamOne=0;
        passingYardsTeamTwo=0;
        rushingYardsTeamOne=0;
        rushingYardsTeamTwo=0;
        recievingYardsTeamOne=0;
        recievingYardsTeamTwo=0;
        displayForTeamOne(scoreTeamOne);
        displayForTeamTwo(scoreTeamTwo);
        passingForTeamOne(passingYardsTeamOne);
        passingForTeamTwo(passingYardsTeamTwo);
        recievingForTeamOne(recievingYardsTeamOne);
        recievingForTeamTwo(recievingYardsTeamTwo);
        rushingForTeamOne(rushingYardsTeamOne);
        rushingForTeamTwo(rushingYardsTeamTwo);
    }



}
