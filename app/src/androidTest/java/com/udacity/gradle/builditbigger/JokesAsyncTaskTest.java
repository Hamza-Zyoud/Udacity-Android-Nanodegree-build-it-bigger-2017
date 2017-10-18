package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

/**
 * Created by dell on 10/14/2017.
 */
@RunWith(AndroidJUnit4.class)
public class JokesAsyncTaskTest {
    private Context instrumentationContext;

    @Before
    public void setup() {
        instrumentationContext = InstrumentationRegistry.getTargetContext();
    }
    @Test
    public void testDoInBackground() throws Exception {
        JokesAsyncTask asyncTask=new JokesAsyncTask();
        asyncTask.execute(instrumentationContext);
        try{
            String joke=asyncTask.get();
            Log.d("JokesAsyncTask",joke);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        }catch (InterruptedException | ExecutionException e){
            Log.e("JokesAsyncTask",Log.getStackTraceString(e));
        }

    }

}