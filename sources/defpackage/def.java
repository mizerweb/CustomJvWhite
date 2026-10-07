package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class def extends eef {
    public final String b;
    public final String c;
    public final r60 d;
    public final int e;

    public def(String str, String str2, r60 r60Var, int i) {
        super(str);
        this.b = str;
        this.c = str2;
        this.d = r60Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof def) {
            def defVar = (def) obj;
            if (cqk.d(this.b, defVar.b) && this.c.equals(defVar.c) && this.d == defVar.d && this.e == defVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return qt4.D(this.e) + ((this.d.hashCode() + zo5.d(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("Photo(localCroppedUri=", this.b, ", originalUri=", this.c, ", relativeCrop=");
        sbQ.append(this.d);
        sbQ.append(", source=");
        sbQ.append(p.r(this.e));
        sbQ.append(")");
        return sbQ.toString();
    }
}
