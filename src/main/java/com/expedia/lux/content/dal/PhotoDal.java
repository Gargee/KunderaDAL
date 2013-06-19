package com.expedia.lux.content.dal;

import java.util.List;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.expedia.lux.content.common.KunderaQueries;
import com.expedia.lux.content.dao.ContentKunderDaoImpl;
import com.expedia.lux.content.dto.ChangeRequest;
import com.expedia.lux.content.dto.MediaCategory;
import com.expedia.lux.content.dto.MediaCategoryGroup;

@Repository
public class PhotoDal {
	@Autowired
	ContentKunderDaoImpl cKDao;
	@Autowired
	KunderaQueries kqueries;

	// return all category group(including category group ID, category group
	// name),

	public List GetMediaCategoryGroup() {

		Query q = cKDao.getEntityManager().createQuery(
				kqueries.selectMediaGroup);
		List<MediaCategoryGroup> results = q.getResultList();
		for (MediaCategoryGroup mcg : results) {
			System.out.println(mcg);
			System.out.println("The category group name is :"
					+ mcg.getmcategoryname() + "The CategoryId is"
					+ mcg.getmcategoryid());

		}

		return results;

	}

	// return all category(including category name, rank ID) for given category
	// group ID

	public void GetMediaCategory(int mcategoryid) {
		Query q = cKDao.getEntityManager().createQuery(
				kqueries.withFirstCompositeColClause);
		q.setParameter("mcategoryid", mcategoryid);
		List<MediaCategory> results = q.getResultList();
		for (MediaCategory m : results) {
			System.out.println("The rankid is  " + m.getKey().getPhotorankid());
			System.out.println("The Category Name is "
					+ m.getMcg().getmcategoryname());

		}

	}

	// Insert into the ChangeRequest Table

	public void SetChangeRequest(ChangeRequest cr) {
		cKDao.getEntityManager().persist(cr);

	}
//insert into the 
}