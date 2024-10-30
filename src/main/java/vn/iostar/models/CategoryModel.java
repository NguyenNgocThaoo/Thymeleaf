package vn.iostar.models;

import java.io.Serializable;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer categoryId;
    private String categoryName;
    private String images;
	private int status;
	private Boolean isEdit =false;
	
}
