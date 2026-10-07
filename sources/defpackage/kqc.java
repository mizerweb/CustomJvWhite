package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kqc implements tqc, xxj, vxj {
    public final String a;
    public final b9b b;

    public kqc(b9b b9bVar, String str) {
        this.a = str;
        this.b = b9bVar;
    }

    @Override // defpackage.xxj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.vxj
    public final p1f c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqc)) {
            return false;
        }
        kqc kqcVar = (kqc) obj;
        return cqk.d(this.a, kqcVar.a) && this.b.equals(kqcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddProperties(props=" + this.b + ")";
    }
}
