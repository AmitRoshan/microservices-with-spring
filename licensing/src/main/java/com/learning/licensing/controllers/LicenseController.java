package com.learning.licensing.controllers;

import com.learning.licensing.dtos.Licenses;
import com.learning.licensing.services.LicenseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licensing")
@AllArgsConstructor
public class LicenseController {

    private final LicenseService licenseService;

    @GetMapping("/getLicense/{licenseId}")
    public Licenses getLicense(@PathVariable String licenseId){
        return licenseService.findLicensesById(licenseId);
    }

    @GetMapping("/getLicensesByOrgID/{orgId}")
    public List<Licenses> getLicensesByOrgId(@PathVariable String orgId){
        return licenseService.findLicensesByOrgId(orgId);
    }

    @PostMapping("/saveLicenseDetails")
    public Licenses saveLicenseDetails(@RequestBody Licenses licenses){
        return licenseService.saveLicenseDetails(licenses);
    }
}
