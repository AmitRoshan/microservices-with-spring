package com.learning.licensing.repositories;

import com.learning.licensing.dtos.Licenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicensesRepository extends JpaRepository<Licenses, String> {

    List<Licenses> findByOrganizationId(String orgId);
}
