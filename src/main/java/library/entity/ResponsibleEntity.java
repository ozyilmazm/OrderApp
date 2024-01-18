package library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

/**
 * Base model for all entity classes which needs auditing for creator and updater log of the entity
 */
@Getter
@MappedSuperclass
@EqualsAndHashCode(of = {"createdBy", "modifiedBy"}, callSuper = true)
public abstract class ResponsibleEntity extends AbstractEntity {
    @Column(name = "created_by", nullable = false, updatable = false)
    @CreatedBy
    private String createdBy;

    @Column(name = "modified_by")
    @LastModifiedBy
    private String modifiedBy;
}
