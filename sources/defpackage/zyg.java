package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zyg extends azg {
    public final long a;

    public zyg(long j) {
        this.a = j;
    }

    @Override // defpackage.azg
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyg) && this.a == ((zyg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "User(id=", ")");
    }
}
