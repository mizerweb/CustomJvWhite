package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yo1 extends fp1 {
    public final e61 a;

    public yo1(e61 e61Var) {
        this.a = e61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yo1) && this.a.equals(((yo1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonAction(state=" + this.a + ")";
    }
}
