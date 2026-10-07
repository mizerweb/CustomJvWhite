package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cai implements Comparable {
    public final long a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return p0m.b(this.a, ((cai) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cai) {
            return this.a == ((cai) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return p0m.c(10, this.a);
    }
}
