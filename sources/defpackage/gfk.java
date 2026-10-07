package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum gfk {
    /* JADX INFO: Fake field, exist only in values array */
    inappropriate_fallback(0),
    unexpected_message(10),
    /* JADX INFO: Fake field, exist only in values array */
    bad_record_mac(20),
    /* JADX INFO: Fake field, exist only in values array */
    user_canceled(22),
    handshake_failure(40),
    bad_certificate(42),
    /* JADX INFO: Fake field, exist only in values array */
    unsupported_certificate(43),
    /* JADX INFO: Fake field, exist only in values array */
    certificate_revoked(44),
    /* JADX INFO: Fake field, exist only in values array */
    certificate_expired(45),
    certificate_unknown(46),
    illegal_parameter(47),
    /* JADX INFO: Fake field, exist only in values array */
    unknown_ca(48),
    /* JADX INFO: Fake field, exist only in values array */
    access_denied(49),
    decode_error(50),
    decrypt_error(51),
    /* JADX INFO: Fake field, exist only in values array */
    user_canceled(70),
    /* JADX INFO: Fake field, exist only in values array */
    inappropriate_fallback(71),
    internal_error(80),
    /* JADX INFO: Fake field, exist only in values array */
    inappropriate_fallback(86),
    /* JADX INFO: Fake field, exist only in values array */
    user_canceled(90),
    missing_extension(109),
    unsupported_extension(110),
    /* JADX INFO: Fake field, exist only in values array */
    unrecognized_name(112),
    /* JADX INFO: Fake field, exist only in values array */
    bad_certificate_status_response(113),
    /* JADX INFO: Fake field, exist only in values array */
    unknown_psk_identity(115),
    /* JADX INFO: Fake field, exist only in values array */
    certificate_required(116),
    /* JADX INFO: Fake field, exist only in values array */
    no_application_protocol(120);

    public final byte a;

    gfk(int i) {
        this.a = (byte) i;
    }
}
