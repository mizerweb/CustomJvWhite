package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nqc implements tqc, xxj, wxj {
    public final String a;

    public nqc(String str) {
        this.a = str;
    }

    @Override // defpackage.xxj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.wxj
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqc) && cqk.d(this.a, ((nqc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CancelMetric()";
    }
}
