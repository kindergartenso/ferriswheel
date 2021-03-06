package com.micmiu.mvc.ferriswheel.examples.web1.simple.model;


import com.micmiu.mvc.ferriswheel.core.annotation.QueryProperty;
import com.micmiu.mvc.ferriswheel.support.datatables.model.DataTablesQuery;

/**
 * @author <a href="http://www.micmiu.com">Michael Sun</a>
 */
public class RoleDataTablesQuery extends DataTablesQuery {

	private String roleName;

	@QueryProperty
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
