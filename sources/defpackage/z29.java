package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z29 extends e39 {
    public final l49 a;

    public z29(l49 l49Var) {
        this.a = l49Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z29) && cqk.d(this.a, ((z29) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotProcessedResult(result=" + this.a + ")";
    }
}
