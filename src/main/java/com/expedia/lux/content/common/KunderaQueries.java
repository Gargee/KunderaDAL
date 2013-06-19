package com.expedia.lux.content.common;

import org.springframework.stereotype.Component;

@Component
public   class KunderaQueries {
	
	public final String withFirstCompositeColClause = "select m from MediaCategory m where m.key.mcategoryid=:mcategoryid";
	public final String selectMediaGroup = "select m from MediaCategoryGroup m";
	
}
