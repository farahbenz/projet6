package com.ocr.P6.dao;

import com.ocr.P6.model.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class RechercheDao {

    @Autowired
    SpotDao spotDao;

    public RechercheDao() {
    }


//    List<Spot> findSpotByRegion(String region) {
//        CriteriaBuilder cb = spotDao.getCriteriaBuilder();
//        CriteriaQuery<Spot> cq = cb.createQuery(Spot.class);
//
//        Root<Spot> spot = cq.from(Spot.class);
//        Predicate regionNamePredicate = cb.equal(spot.get("region"), region);
//        cq.where(regionNamePredicate);
//        TypedQuery<Spot> query = spotDao.createQuery(cq);
//        return query.getResultList();
//    }

}
