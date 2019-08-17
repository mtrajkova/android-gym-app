package com.gymity.project.repository;

import com.gymity.project.model.Gym;
import com.gymity.project.model.TakenOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TakenOffersRepository extends JpaRepository<TakenOffer, Long> {
    ArrayList<TakenOffer> findAllByUserId(Long id);
    ArrayList<TakenOffer> findAllByUserIdAndOfferGym(Long id, Gym gym);
}
