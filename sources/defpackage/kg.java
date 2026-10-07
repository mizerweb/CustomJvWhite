package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class kg {
    public final int a;
    public final long b;
    public final ne2 c;
    public final Throwable d;

    public kg(int i, ne2 ne2Var, Exception exc, int i2) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        ne2Var = (i2 & 4) != 0 ? null : ne2Var;
        exc = (i2 & 8) != 0 ? null : exc;
        this.a = i;
        this.b = jElapsedRealtimeNanos;
        this.c = ne2Var;
        this.d = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg)) {
            return false;
        }
        kg kgVar = (kg) obj;
        return this.a == kgVar.a && this.b == kgVar.b && cqk.d(this.c, kgVar.c) && cqk.d(this.d, kgVar.d);
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.D(this.a) * 31, 31, this.b);
        ne2 ne2Var = this.c;
        int iHashCode = (iG + (ne2Var == null ? 0 : Integer.hashCode(ne2Var.a))) * 31;
        Throwable th = this.d;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingInfo(reason=" + tt2.p(this.a) + ", closingTimestamp=" + ((Object) ith.a(this.b)) + ", errorCode=" + this.c + ", exception=" + this.d + ')';
    }
}
