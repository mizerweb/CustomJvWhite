package defpackage;

import one.me.sdk.uikit.qr.QrCodeGenerator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wtl {
    public static final long a() {
        return qe7.P(System.currentTimeMillis(), lw5.MILLISECONDS);
    }

    public static int[] b(int i, int i2, String str) {
        Object poeVar;
        try {
            poeVar = QrCodeGenerator.nativeRenderSvg(str, i, i2);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        return (int[]) poeVar;
    }
}
