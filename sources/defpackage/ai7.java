package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ai7 implements fi7 {
    public final int a;
    public final String b;
    public final kb9 c;

    public ai7(int i, String str, kb9 kb9Var) {
        this.a = i;
        this.b = str;
        this.c = kb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai7)) {
            return false;
        }
        ai7 ai7Var = (ai7) obj;
        return this.a == ai7Var.a && cqk.d(this.b, ai7Var.b) && cqk.d(this.c, ai7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = nbh.A(this.a, "OpenFullScreenMedia(uiPosition=", ", albumId=", this.b, ", item=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
