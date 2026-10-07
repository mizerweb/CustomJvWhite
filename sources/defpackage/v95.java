package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class v95 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public v95(long j, long j2) {
        StringBuilder sbS = qt4.s(j, "File was not written completely. Expected: ", ", found: ");
        sbS.append(j2);
        super(sbS.toString());
    }
}
