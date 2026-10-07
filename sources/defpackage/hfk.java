package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum hfk {
    TLS_AES_128_GCM_SHA256(4865),
    TLS_AES_256_GCM_SHA384(4866),
    TLS_CHACHA20_POLY1305_SHA256(4867),
    TLS_AES_128_CCM_SHA256(4868),
    TLS_AES_128_CCM_8_SHA256(4869);

    public final short a;

    hfk(int i) {
        this.a = (short) i;
    }
}
