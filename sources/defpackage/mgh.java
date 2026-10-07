package defpackage;

import javax.net.ssl.SSLEngineResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class mgh {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
        int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
        try {
            iArr2[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
