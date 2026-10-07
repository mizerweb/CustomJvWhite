package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gqd extends frd {
    public final int a;
    public final cf7 b;
    public final noh c;
    public final int d;

    public gqd(int i, noh nohVar, int i2) {
        this(i, new skd(4), (i2 & 4) != 0 ? q9i.k.g() : nohVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqd)) {
            return false;
        }
        gqd gqdVar = (gqd) obj;
        return this.a == gqdVar.a && cqk.d(this.b, gqdVar.b) && cqk.d(this.c, gqdVar.c);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 4L;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.d;
    }

    public final String toString() {
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ")";
    }

    public gqd(int i, cf7 cf7Var, noh nohVar) {
        this.a = i;
        this.b = cf7Var;
        this.c = nohVar;
        this.d = 4;
    }
}
