package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bsc {
    public final gm0 a;

    public bsc(gm0 gm0Var) {
        this.a = gm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bsc) && cqk.d(this.a, ((bsc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PerfettoConfig(trackType=" + this.a + ")";
    }

    public /* synthetic */ bsc() {
        this(wyh.k);
    }
}
