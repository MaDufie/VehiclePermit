package io.turntabl.towncouncil;

public class ParkingPermissionDeniedException extends Exception {
    public ParkingPermissionDeniedException(String message) {
        super(message);
    }
}
