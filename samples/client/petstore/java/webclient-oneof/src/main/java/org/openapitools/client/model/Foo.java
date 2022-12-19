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
import org.openapitools.client.model.Entity;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Foo
 */
@JsonPropertyOrder({
  Foo.JSON_PROPERTY_FOO_PROP_A,
  Foo.JSON_PROPERTY_FOO_PROP_B
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "@type", // ignore manually set @type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the @type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true)

public class Foo extends Entity implements FooRefOrValue {
  public static final String JSON_PROPERTY_FOO_PROP_A = "fooPropA";
  private String fooPropA;

  public static final String JSON_PROPERTY_FOO_PROP_B = "fooPropB";
  private String fooPropB;

  public Foo() {

  }

  public Foo fooPropA(String fooPropA) {
    
    this.fooPropA = fooPropA;
    return this;
  }

   /**
   * Get fooPropA
   * @return fooPropA
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOO_PROP_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFooPropA() {
    return fooPropA;
  }


  @JsonProperty(JSON_PROPERTY_FOO_PROP_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFooPropA(String fooPropA) {
    this.fooPropA = fooPropA;
  }


  public Foo fooPropB(String fooPropB) {
    
    this.fooPropB = fooPropB;
    return this;
  }

   /**
   * Get fooPropB
   * @return fooPropB
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOO_PROP_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFooPropB() {
    return fooPropB;
  }


  @JsonProperty(JSON_PROPERTY_FOO_PROP_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFooPropB(String fooPropB) {
    this.fooPropB = fooPropB;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Foo foo = (Foo) o;
    return Objects.equals(this.fooPropA, foo.fooPropA) &&
        Objects.equals(this.fooPropB, foo.fooPropB) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fooPropA, fooPropB, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Foo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fooPropA: ").append(toIndentedString(fooPropA)).append("\n");
    sb.append("    fooPropB: ").append(toIndentedString(fooPropB)).append("\n");
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

