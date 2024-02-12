package test.client1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Users1PostRequest
 */

@JsonTypeName("_users1_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-12T15:21:48.334248+01:00[Europe/Berlin]")
public class Users1PostRequest {

  private Optional<Integer> id = Optional.empty();

  private Optional<String> name = Optional.empty();

  public Users1PostRequest id(Integer id) {
    this.id = Optional.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  public void setId(Optional<Integer> id) {
    this.id = id;
  }

  public Users1PostRequest name(String name) {
    this.name = Optional.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  public void setName(Optional<String> name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Users1PostRequest users1PostRequest = (Users1PostRequest) o;
    return Objects.equals(this.id, users1PostRequest.id) &&
        Objects.equals(this.name, users1PostRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Users1PostRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

