package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i89 extends l89 {
    public final d25 a;

    public i89(d25 d25Var) {
        this.a = d25Var;
    }

    public final d25 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i89.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((i89) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (i89.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }

    public i89() {
        this(d25.b);
    }
}
