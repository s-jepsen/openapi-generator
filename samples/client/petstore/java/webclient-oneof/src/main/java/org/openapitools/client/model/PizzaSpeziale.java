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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.Pizza;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PizzaSpeziale
 */
@JsonPropertyOrder({
  PizzaSpeziale.JSON_PROPERTY_TOPPINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "@type", // ignore manually set @type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the @type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true)

public class PizzaSpeziale extends Pizza {
  public static final String JSON_PROPERTY_TOPPINGS = "toppings";
  private String toppings;

  public PizzaSpeziale() {

  }

  public PizzaSpeziale toppings(String toppings) {
    
    this.toppings = toppings;
    return this;
  }

   /**
   * Get toppings
   * @return toppings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToppings() {
    return toppings;
  }


  @JsonProperty(JSON_PROPERTY_TOPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToppings(String toppings) {
    this.toppings = toppings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PizzaSpeziale pizzaSpeziale = (PizzaSpeziale) o;
    return Objects.equals(this.toppings, pizzaSpeziale.toppings) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toppings, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PizzaSpeziale {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    toppings: ").append(toIndentedString(toppings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

