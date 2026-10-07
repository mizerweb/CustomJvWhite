package androidx.media3.common.util;

import defpackage.c;
import defpackage.c0a;

/* JADX INFO: loaded from: classes3.dex */
public final class StuckPlayerException extends IllegalStateException {
    public final int a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    public StuckPlayerException(int i, int i2) {
        String strK;
        if (i == 0) {
            strK = c0a.k(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            strK = c0a.k(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            strK = c0a.k(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            strK = c0a.k(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                c.t();
                throw null;
            }
            strK = c0a.k(i2, "Player stuck suppressed for ", " ms");
        }
        super(strK);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StuckPlayerException.class != obj.getClass()) {
            return false;
        }
        StuckPlayerException stuckPlayerException = (StuckPlayerException) obj;
        return this.a == stuckPlayerException.a && this.b == stuckPlayerException.b;
    }

    public final int hashCode() {
        return ((527 + this.a) * 31) + this.b;
    }
}
