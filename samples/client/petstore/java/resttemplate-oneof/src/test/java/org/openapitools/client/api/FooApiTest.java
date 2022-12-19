/*
 * ByRefOrValue
 * This tests for a oneOf interface representation 
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.Foo;
import org.openapitools.client.model.FooRefOrValue;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FooApi
 */
@Ignore
public class FooApiTest {

    private final FooApi api = new FooApi();

    
    /**
     * Create a Foo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFooTest() {
        Foo foo = null;
        FooRefOrValue response = api.createFoo(foo);

        // TODO: test validations
    }
    
    /**
     * GET all Foos
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllFoosTest() {
        List<FooRefOrValue> response = api.getAllFoos();

        // TODO: test validations
    }
    
}
