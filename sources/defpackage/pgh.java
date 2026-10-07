package defpackage;

import javax.net.ssl.SSLEngineResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class pgh {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SSLEngineResult.Status.values().length];
        try {
            iArr[SSLEngineResult.Status.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SSLEngineResult.Status.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
