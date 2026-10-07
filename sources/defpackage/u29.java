package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u29 implements w29 {
    public final e39 a;

    public u29(e39 e39Var) {
        this.a = e39Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u29) && cqk.d(this.a, ((u29) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Event(value=" + this.a + ")";
    }
}
