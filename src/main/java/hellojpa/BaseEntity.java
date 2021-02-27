package hellojpa;

import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Setter
public abstract class BaseEntity {
	private String createdBy;
	private LocalDateTime createdAt;
	private String modifiedBy;
	private LocalDateTime modifiedAt;
}
