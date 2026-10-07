package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y47 {
    public static final y47 b = new y47(q1f.b);
    public final p1f a;

    public y47(p1f p1fVar) {
        this.a = p1fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y47) && cqk.d(this.a, ((y47) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FoldersCounters(counters=" + this.a + ")";
    }
}
