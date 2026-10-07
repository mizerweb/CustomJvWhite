package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e44 implements f44 {
    public final rt2 a;
    public final CharSequence b;
    public final String c;
    public final long d;

    static {
        e44.class.hashCode();
    }

    public e44(rt2 rt2Var, CharSequence charSequence, String str) {
        this.a = rt2Var;
        this.b = charSequence;
        this.c = str;
        this.d = rt2Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e44)) {
            return false;
        }
        e44 e44Var = (e44) obj;
        return this.d == e44Var.d && cqk.d(this.b, e44Var.b) && this.c.equals(e44Var.c);
    }

    @Override // defpackage.f44
    public final long getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + mw7.f(qt4.g(e44.class.getName().hashCode() * 31, 31, this.d), 31, this.b);
    }
}
