package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class co2 implements do2 {
    public final long a;
    public final omg b;
    public final ynh c;
    public final Integer d;
    public final int e;
    public final long f;

    public co2(long j, omg omgVar) {
        this.a = j;
        this.b = omgVar;
        this.c = omgVar.b;
        this.d = omgVar.d;
        this.e = omgVar.l;
        this.f = omgVar.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co2)) {
            return false;
        }
        co2 co2Var = (co2) obj;
        return this.a == co2Var.a && this.b.equals(co2Var.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.f;
    }

    @Override // defpackage.do2
    public final ynh getName() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.e;
    }

    public final String toString() {
        return "StickerSet(setId=" + this.a + ", model=" + this.b + ")";
    }

    @Override // defpackage.do2
    public final boolean y() {
        return this.b.f == 1;
    }
}
