package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qu0 implements ru0 {
    public final nu0 a;

    public qu0(nu0 nu0Var) {
        this.a = nu0Var;
    }

    public final nu0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu0) && this.a.equals(((qu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(report=" + this.a + ")";
    }
}
