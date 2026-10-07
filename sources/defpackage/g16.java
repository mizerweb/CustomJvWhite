package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g16 implements i16 {
    public final hb9 a;

    public g16(hb9 hb9Var) {
        this.a = hb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g16) && cqk.d(this.a, ((g16) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Photo(item=" + this.a + ")";
    }
}
