package com.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.jokes.JokeCreator;

/**
 * Created by Mohamed Elgendy on 5/5/2017.
 */


/** An endpoint class we are exposing */
@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.com",
                ownerName = "backend.com",
                packagePath=""
        )
)

public class MyJokeEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "getRandomJoke")
    public MyJoke getRandomJoke() {
        return new MyJoke(JokeCreator.getJoke());
    }
}
