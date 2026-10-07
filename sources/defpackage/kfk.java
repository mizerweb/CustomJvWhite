package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum kfk {
    secp256r1(23),
    secp384r1(24),
    secp521r1(25),
    x25519(29),
    x448(30),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe2048(np0.n),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe3072(257),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe4096(258),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe6144(259),
    /* JADX INFO: Fake field, exist only in values array */
    ffdhe8192(260);

    public final short a;

    kfk(int i) {
        this.a = (short) i;
    }
}
