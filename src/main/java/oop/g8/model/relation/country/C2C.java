package oop.g8.model.relation.country;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import oop.g8.model.entity.Country;

/**
 * RelationshipEntity --> đánh dấu đây là một quan hệ StartNode --> đây là nút
 * nguồn EndNode --> đây là đích tất cả các thuộc tính còn lại sẽ là thuộc tính
 * của quan hệ Khi khởi tạo một quan hệ, có 2 trường hợp: + Nút nguồn và đích đã
 * có sẵn trong db --> chỉ tạo thêm quan hệ + Nút nguồn hoặc đích chưa có sẵn
 * --> sẽ được tạo luôn
 * 
 * @author Hoang Nam
 *
 */
@RelationshipEntity
@Data @ToString(callSuper=true, includeFieldNames=true)
@NoArgsConstructor
@AllArgsConstructor
public class C2C {

	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	private String link;

	private Date date;

	@StartNode
	private Country country;

	@EndNode
	private Country country2;

	public C2C(String type, String link, Date date, Country country, Country country2) {
		super();
		this.type = type;
		this.link = link;
		this.date = date;
		this.country = country;
		this.country2 = country2;
	}

}
