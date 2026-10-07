package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ik0 {
    public final String a;
    public final String b;
    public final r60 c;
    public final int d;

    public ik0(String str, String str2, r60 r60Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = r60Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ik0) {
            ik0 ik0Var = (ik0) obj;
            if (cqk.d(this.a, ik0Var.a) && this.b.equals(ik0Var.b) && this.c == ik0Var.c && this.d == ik0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return qt4.D(this.d) + ((this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("PhotoAvatar(localCroppedUri=", this.a, ", originalUri=", this.b, ", relativeCrop=");
        sbQ.append(this.c);
        sbQ.append(", source=");
        sbQ.append(p.r(this.d));
        sbQ.append(")");
        return sbQ.toString();
    }
}
