package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.entity.BestellingStatus;

import java.util.List;

public interface BestellingStatusService {
    BestellingStatus getBestellingStatusById(Long bestellingstatusid);
    public List<BestellingStatus> getBestellingStatussen();
    BestellingStatus addBestellingStatus(BestellingStatus bestellingStatus);
}
