package com.netology.tabbedapplication;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TabsTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void tabsTest() {
        ViewInteraction tabView1 = onView(withContentDescription("Tab 1"));
        tabView1.check(matches(isDisplayed()));

        ViewInteraction textView1 = onView(withText("Page: 1"));
        textView1.check(matches(isDisplayed()));

        ViewInteraction tabView2 = onView(withContentDescription("Tab 2"));
        tabView2.check(matches(isDisplayed()));
        tabView2.perform(click());

        ViewInteraction textView2 = onView(withText("Page: 2"));
        textView2.check(matches(isDisplayed()));
    }
}
