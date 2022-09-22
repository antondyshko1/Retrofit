package Retrofit.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserRequest {
    @JsonProperty("job")
    public String job;

    @JsonProperty("name")
    public String name;

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CreateUserRequest{" +
                "job='" + job + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
