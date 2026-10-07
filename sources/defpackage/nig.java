package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class nig implements k0g {
    public final long a;

    public nig(long j) {
        this.a = j;
        if (j >= 0) {
            return;
        }
        c.o(nbh.s(j, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    @Override // defpackage.k0g
    public final xx6 a(gjg gjgVar) {
        return e9i.I(new j3(e9i.M0(gjgVar, new mig(this, null)), 16, new yh8(2, null, 2)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nig) && this.a == ((nig) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        c79 c79Var = new c79(2);
        long j = this.a;
        if (j < BuildConfig.MAX_TIME_TO_UPLOAD) {
            c79Var.add("replayExpiration=" + j + "ms");
        }
        return x05.i(new StringBuilder("SharingStarted.WhileSubscribed("), ww3.z1(yab.j(c79Var), null, null, null, null, 63), ')');
    }
}
