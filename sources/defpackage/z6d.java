package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z6d extends a7d {
    public final tnh a;

    public z6d(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6d) && this.a.equals(((z6d) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("Text(title=", this.a, ")");
    }
}
