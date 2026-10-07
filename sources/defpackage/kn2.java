package defpackage;

import one.me.sdk.vendor.rustore.appupdate.aidlproxy.RuStoreAppUpdateException;

/* JADX INFO: loaded from: classes3.dex */
public final class kn2 {
    public final jn2 a;
    public final long b;
    public final RuStoreAppUpdateException c;

    public kn2(jn2 jn2Var, long j, RuStoreAppUpdateException ruStoreAppUpdateException) {
        this.a = jn2Var;
        this.b = j;
        this.c = ruStoreAppUpdateException;
    }

    public final long a() {
        return this.b;
    }

    public final RuStoreAppUpdateException b() {
        return this.c;
    }

    public final jn2 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn2)) {
            return false;
        }
        kn2 kn2Var = (kn2) obj;
        return this.a == kn2Var.a && this.b == kn2Var.b && cqk.d(this.c, kn2Var.c);
    }

    public final int hashCode() {
        int iG = qt4.g(this.a.hashCode() * 31, 31, this.b);
        RuStoreAppUpdateException ruStoreAppUpdateException = this.c;
        return iG + (ruStoreAppUpdateException == null ? 0 : ruStoreAppUpdateException.hashCode());
    }

    public final String toString() {
        return "RuStoreCheckResult(result=" + this.a + ", durationMs=" + this.b + ", error=" + this.c + ")";
    }

    public /* synthetic */ kn2(jn2 jn2Var, long j) {
        this(jn2Var, j, null);
    }
}
