package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;


/**
 * Created by Mohamed Elgendy on 6/5/2017.
 */

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {

    @Test
    public void testEndpointNonEmpty() throws Exception {
        EndpointAsyncTask getJokeTask = new EndpointAsyncTask();
        getJokeTask.execute();
        String joke = getJokeTask.get();
        assertNotNull(joke);
        assertTrue(joke.length() > 0);
    }
}
