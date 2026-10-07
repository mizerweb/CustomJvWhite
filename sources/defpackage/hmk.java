package defpackage;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
public final class hmk extends wpe {
    public final PendingIntent a;
    public final boolean b;

    public hmk(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            ore.n("Null pendingIntent");
            throw null;
        }
        this.a = pendingIntent;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wpe) {
            hmk hmkVar = (hmk) ((wpe) obj);
            if (this.a.equals(hmkVar.a) && this.b == hmkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return qt4.r(qt4.v("ReviewInfo{pendingIntent=", this.a.toString(), ", isNoOp="), this.b, "}");
    }
}
