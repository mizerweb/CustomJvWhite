package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vt8 extends pu8 {
    public final boolean a;
    public final fif b;
    public final String c;

    public vt8(Object obj, boolean z, fif fifVar) {
        this.a = z;
        this.b = fifVar;
        this.c = obj.toString();
        if (fifVar == null || fifVar.isInline()) {
            return;
        }
        ore.p("Failed requirement.");
        throw null;
    }

    @Override // defpackage.pu8
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vt8.class != obj.getClass()) {
            return false;
        }
        vt8 vt8Var = (vt8) obj;
        return this.a == vt8Var.a && cqk.d(this.c, vt8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.pu8
    public final String toString() {
        boolean z = this.a;
        String str = this.c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        m5h.a(sb, str);
        return sb.toString();
    }
}
