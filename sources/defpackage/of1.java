package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class of1 implements qf1 {
    public final d62 a;

    public of1(d62 d62Var) {
        this.a = d62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of1) && this.a.equals(((of1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Active(state=" + this.a + ")";
    }
}
