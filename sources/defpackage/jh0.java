package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jh0 extends fc6 {
    public final Object a;
    public final vhd b;
    public final ni0 c;

    public jh0(Object obj, vhd vhdVar, ni0 ni0Var) {
        if (obj == null) {
            ore.n("Null payload");
            throw null;
        }
        this.a = obj;
        this.b = vhdVar;
        this.c = ni0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fc6)) {
            return false;
        }
        jh0 jh0Var = (jh0) ((fc6) obj);
        if (!this.a.equals(jh0Var.a) || !this.b.equals(jh0Var.b)) {
            return false;
        }
        ni0 ni0Var = jh0Var.c;
        ni0 ni0Var2 = this.c;
        if (ni0Var2 == null) {
            return ni0Var == null;
        }
        return ni0Var2.equals(ni0Var);
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        ni0 ni0Var = this.c;
        return (ni0Var == null ? 0 : ni0Var.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + "}";
    }
}
