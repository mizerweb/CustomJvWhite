package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ifk {
    server_name(0),
    /* JADX INFO: Fake field, exist only in values array */
    max_fragment_length(1),
    /* JADX INFO: Fake field, exist only in values array */
    status_request(5),
    supported_groups(10),
    signature_algorithms(13),
    /* JADX INFO: Fake field, exist only in values array */
    use_srtp(14),
    /* JADX INFO: Fake field, exist only in values array */
    heartbeat(15),
    application_layer_protocol_negotiation(16),
    /* JADX INFO: Fake field, exist only in values array */
    server_certificate_type(18),
    /* JADX INFO: Fake field, exist only in values array */
    client_certificate_type(19),
    /* JADX INFO: Fake field, exist only in values array */
    server_certificate_type(20),
    /* JADX INFO: Fake field, exist only in values array */
    padding(21),
    pre_shared_key(41),
    early_data(42),
    supported_versions(43),
    /* JADX INFO: Fake field, exist only in values array */
    post_handshake_auth(44),
    psk_key_exchange_modes(45),
    certificate_authorities(47),
    /* JADX INFO: Fake field, exist only in values array */
    signature_algorithms_cert(48),
    /* JADX INFO: Fake field, exist only in values array */
    post_handshake_auth(49),
    /* JADX INFO: Fake field, exist only in values array */
    signature_algorithms_cert(50),
    key_share(51);

    public final short a;

    ifk(int i) {
        this.a = (short) i;
    }
}
