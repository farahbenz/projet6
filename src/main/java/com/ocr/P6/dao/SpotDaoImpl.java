package com.ocr.P6.dao;

import com.ocr.P6.model.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SpotDaoImpl implements SpotDaoCustom {

    @Autowired
    EntityManager em;

    @Override
    public List<Spot> findSpotByRegion(String nom, String type) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Spot> cq = cb.createQuery(Spot.class);

        Root<Spot> spot = cq.from(Spot.class);
        List<Predicate> predicates = new ArrayList<>();

        if (nom != null && !nom.isEmpty()) {
            predicates.add(cb.equal(spot.get("nom"), nom));
        }
        if (type != null && !type.isEmpty()) {
            predicates.add(cb.equal(spot.get("type"), type));
        }

        cq.where(predicates.toArray(new Predicate[0]));

        return em.createQuery(cq).getResultList();
    }
}
