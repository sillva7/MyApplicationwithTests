package com.example.myapplication;

import junit.extensions.ActiveTestSuite;


import androidx.test.core.app.ActivityScenario;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void onCreate() {
        firstTest();
        secondTest();
        thirdTest();
        fourthTest();
    }

    private void cleanET(){
        onView(withId(R.id.etPhrase)).perform(typeText(""));
        onView(withId(R.id.etIgnore)).perform(typeText(""));
    }
    private void firstTest(){
       // cleanET();
        onView(withId(R.id.etPhrase)).perform(replaceText("Foxminded cool 24/7"));
        onView(withId(R.id.etIgnore)).perform(replaceText("xl"));
        onView(withId(R.id.btnReverse)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText(StringRotation.reversePhrase("Foxminded cool 24/7", "xl"))));
    }
    private void secondTest(){
        //cleanET();
        onView(withId(R.id.etPhrase)).perform(replaceText("dcba hgfe"));
        onView(withId(R.id.etIgnore)).perform(replaceText("xl"));
        onView(withId(R.id.btnReverse)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText(StringRotation.reversePhrase("dcba hgfe", "xl"))));
    }
    private void thirdTest(){
        //cleanET();
        onView(withId(R.id.etPhrase)).perform(replaceText("dcb1a hgfle"));
        onView(withId(R.id.etIgnore)).perform(replaceText("xl"));
        onView(withId(R.id.btnReverse)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText(StringRotation.reversePhrase("dcb1a hgfle", "xl"))));
    }
    private void fourthTest(){
        //cleanET();
        onView(withId(R.id.etPhrase)).perform(replaceText("dcb1a hgfle"));
        onView(withId(R.id.etIgnore)).perform(replaceText("xl"));
        onView(withId(R.id.btnReverse)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText(StringRotation.reversePhrase("dcb1a hgfle", "xl"))));
    }
}