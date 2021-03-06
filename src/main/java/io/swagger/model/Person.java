package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-19T13:26:03.188Z")

public class Person   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("dateOfBirth")
  private LocalDate dateOfBirth = null;

  @JsonProperty("lastTimeOnline")
  private OffsetDateTime lastTimeOnline = null;

  @JsonProperty("avatarBase64PNG")
  private String avatarBase64PNG = "data:image/png;base64,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";

  public Person firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Person lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Person username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="[a-z0-9]{8,64}") @Size(min=8,max=64) 
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Person dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Person lastTimeOnline(OffsetDateTime lastTimeOnline) {
    this.lastTimeOnline = lastTimeOnline;
    return this;
  }

  /**
   * Get lastTimeOnline
   * @return lastTimeOnline
  **/
  @ApiModelProperty(readOnly = true, value = "")

  @Valid

  public OffsetDateTime getLastTimeOnline() {
    return lastTimeOnline;
  }

  public void setLastTimeOnline(OffsetDateTime lastTimeOnline) {
    this.lastTimeOnline = lastTimeOnline;
  }

  public Person avatarBase64PNG(String avatarBase64PNG) {
    this.avatarBase64PNG = avatarBase64PNG;
    return this;
  }

  /**
   * Get avatarBase64PNG
   * @return avatarBase64PNG
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public String getAvatarBase64PNG() {
    return avatarBase64PNG;
  }

  public void setAvatarBase64PNG(String avatarBase64PNG) {
    this.avatarBase64PNG = avatarBase64PNG;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.firstName, person.firstName) &&
        Objects.equals(this.lastName, person.lastName) &&
        Objects.equals(this.username, person.username) &&
        Objects.equals(this.dateOfBirth, person.dateOfBirth) &&
        Objects.equals(this.lastTimeOnline, person.lastTimeOnline) &&
        Objects.equals(this.avatarBase64PNG, person.avatarBase64PNG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, username, dateOfBirth, lastTimeOnline, avatarBase64PNG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    lastTimeOnline: ").append(toIndentedString(lastTimeOnline)).append("\n");
    sb.append("    avatarBase64PNG: ").append(toIndentedString(avatarBase64PNG)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

