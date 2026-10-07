package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class krc implements gu4 {
    public static final String b;
    public final gu4 a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(krc.class.getName());
        if ((r5h.X0("") ? null : "") != null) {
            sb.append("#");
        }
        b = sb.toString();
    }

    public /* synthetic */ krc(gu4 gu4Var) {
        this.a = gu4Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof krc) {
            return cqk.d(this.a, ((krc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.gu4
    public final vt4 k() {
        return this.a.k();
    }

    public final String toString() {
        return "PerfScope(scope=" + this.a + ")";
    }
}
