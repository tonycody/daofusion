package com.anasoft.os.daofusion.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Base class for persistent entities managed within
 * the JPA persistence context.
 * 
 * <p>
 * 
 * Note that this class does NOT provide any special
 * {@link #hashCode()} and {@link #equals(Object)}
 * implementation - this is a task left to be done,
 * depending on the chosen method implementation
 * pattern.
 * 
 * @param <ID> Java type of the primary key column.
 * 
 * @see Persistable
 * 
 * @author vojtech.szocs
 */
@MappedSuperclass
public abstract class PersistentEntity<ID extends Serializable> implements Persistable<ID> {

    private static final long serialVersionUID = 2783083324474645285L;
    
    @Id
	@GeneratedValue
	private ID id;
	
	public ID getId() {
		return id;
	}
	
	protected void setId(ID id) {
		this.id = id;
	}
	
}