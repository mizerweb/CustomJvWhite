package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tfk implements jgk {
    public final uu0 a;

    public tfk(uu0 uu0Var) {
        this.a = uu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfk) && this.a.equals(((tfk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(report=" + this.a + ')';
    }
}
