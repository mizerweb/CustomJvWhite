package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fqd extends frd {
    public final int a;
    public final int b;
    public final ayb c;
    public final zxb d;
    public final int e;

    public fqd(int i, int i2, int i3) {
        ayb aybVar = ayb.g;
        zxb zxbVar = (i3 & 8) != 0 ? zxb.PRIMARY : zxb.SECONDARY;
        this.a = i;
        this.b = i2;
        this.c = aybVar;
        this.d = zxbVar;
        this.e = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqd)) {
            return false;
        }
        fqd fqdVar = (fqd) obj;
        return this.a == fqdVar.a && this.b == fqdVar.b && this.c == fqdVar.c && this.d == fqdVar.d;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 2L;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("MainButtonAction(title=", this.a, ", action=", this.b, ", size=");
        sbP.append(this.c);
        sbP.append(", appearance=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
