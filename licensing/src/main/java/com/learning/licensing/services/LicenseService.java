package com.learning.licensing.services;

import com.learning.licensing.dtos.Licenses;
import com.learning.licensing.exceptions.RecordNotFoundException;
import com.learning.licensing.repositories.LicensesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class LicenseService {

    private final LicensesRepository licensesRepository;

    public Licenses findLicensesById(String licenseId) {
        return licensesRepository.findById(licenseId).orElseThrow(() -> new NoSuchElementException("data not available"));
    }

    public List<Licenses> findLicensesByOrgId(String orgId) {
        return licensesRepository.findByOrganizationId(orgId);
    }

    public Licenses saveLicenseDetails(Licenses licenses) {
        return licensesRepository.save(licenses);
    }


}
