package com.wso2telco.tip.balance.conf;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

/**
 * Created by yasith on 1/18/17.
 */
public class ApplicationConfiguration extends Configuration {

    /** The redis. */
    @JsonProperty
    private Object redis;

    /** The remote. */
    @JsonProperty
    private Object remote;

    /**
     * Gets the redis.
     *
     * @return the redis
     */
    public Object getRedis() {
        return redis;
    }

    /**
     * Gets the remote.
     *
     * @return the remote
     */
    public Object getRemote() {
        return remote;
    }

}
