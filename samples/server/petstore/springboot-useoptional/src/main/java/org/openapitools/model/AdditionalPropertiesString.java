package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * AdditionalPropertiesString
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class AdditionalPropertiesString {

  private Optional<String> name = Optional.empty();

  public AdditionalPropertiesString name(String name) {
    this.name = Optional.ofNullable(name);
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  public void setName(Optional<String> name) {
    this.name = name;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, String> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public AdditionalPropertiesString putAdditionalProperty(String key, String value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, String>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, String> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public String getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPropertiesString additionalPropertiesString = (AdditionalPropertiesString) o;
    return Objects.equals(this.name, additionalPropertiesString.name) &&
    Objects.equals(this.additionalProperties, additionalPropertiesString.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesString {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
  
  public static class Builder {

    private AdditionalPropertiesString instance;

    public Builder() {
      this(new AdditionalPropertiesString());
    }

    protected Builder(AdditionalPropertiesString instance) {
      this.instance = instance;
    }

    protected Builder copyOf(AdditionalPropertiesString value) { 
      this.instance.setName(value.name);
      return this;
    }

    public AdditionalPropertiesString.Builder name(String name) {
      this.instance.name(name);
      return this;
    }
    
    public AdditionalPropertiesString.Builder additionalProperties(Map<String, String> additionalProperties) {
      this.instance.additionalProperties = additionalProperties;
      return this;
    }

    /**
    * returns a built AdditionalPropertiesString instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public AdditionalPropertiesString build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field (except for the default values).
  */
  public static AdditionalPropertiesString.Builder builder() {
    return new AdditionalPropertiesString.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public AdditionalPropertiesString.Builder toBuilder() {
    AdditionalPropertiesString.Builder builder = new AdditionalPropertiesString.Builder();
    return builder.copyOf(this);
  }

}

