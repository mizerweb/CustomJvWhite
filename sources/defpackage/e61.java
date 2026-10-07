package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e61 {
    public static final e61 e = new e61(4, false, false, false);
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;

    public e61(int i, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
    }

    public static e61 a(e61 e61Var, int i, int i2) {
        boolean z = e61Var.a;
        boolean z2 = e61Var.b;
        if ((i2 & 4) != 0) {
            i = e61Var.c;
        }
        return new e61(i, z, z2, (i2 & 8) != 0 ? e61Var.d : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e61)) {
            return false;
        }
        e61 e61Var = (e61) obj;
        return this.a == e61Var.a && this.b == e61Var.b && this.c == e61Var.c && this.d == e61Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + c0a.f(this.c, nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("ButtonActionState(isMe=", this.a, ", isPinned=", this.b, ", action=");
        sbB.append(v0h.q(this.c));
        sbB.append(", isSpeakerMode=");
        sbB.append(this.d);
        sbB.append(")");
        return sbB.toString();
    }
}
