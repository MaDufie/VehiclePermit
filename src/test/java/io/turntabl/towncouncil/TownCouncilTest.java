package io.turntabl.towncouncil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TownCouncilTest {

    @Mock
    VerificationService mockVerificationService;

    @Mock
    PermitIssuerService mockPermitIssuerService;
    @BeforeEach
    void setUp() {
    }

    @Test
    void validateOwner() {
    }
}