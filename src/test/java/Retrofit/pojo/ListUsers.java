package Retrofit.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListUsers {
    private Integer page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private List <Data> data;
    private Support support;

    public Integer getPage() {
        return page;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public List<Data> getData() {
        return data;
    }

    public Support getSupport() {
        return support;
    }

    @Override
    public String toString() {
        return "ListUsers{" +
                "page=" + page +
                ", per_page=" + per_page +
                ", total=" + total +
                ", total_pages=" + total_pages +
                ", data=" + data +
                ", support=" + support +
                '}';
    }
}
