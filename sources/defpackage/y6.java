package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y6 {
    public final r3f a;

    public /* synthetic */ y6(r3f r3fVar) {
        this.a = r3fVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y6) {
            return cqk.d(this.a, ((y6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccountScope(raw=" + this.a + ")";
    }
}
