package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ue7 {
    public final te7 a;
    public final te7 b;

    public ue7(te7 te7Var, te7 te7Var2) {
        this.a = te7Var;
        this.b = te7Var2;
    }

    public final te7 a() {
        return this.a;
    }

    public final te7 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue7)) {
            return false;
        }
        ue7 ue7Var = (ue7) obj;
        return this.a.equals(ue7Var.a) && this.b.equals(ue7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Results(fts=" + this.a + ", like=" + this.b + ")";
    }
}
