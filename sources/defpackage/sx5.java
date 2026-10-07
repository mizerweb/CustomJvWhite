package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class sx5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[hfk.values().length];
        a = iArr;
        try {
            iArr[hfk.TLS_AES_128_GCM_SHA256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[hfk.TLS_AES_256_GCM_SHA384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[hfk.TLS_CHACHA20_POLY1305_SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[hfk.TLS_AES_128_CCM_SHA256.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[hfk.TLS_AES_128_CCM_8_SHA256.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
