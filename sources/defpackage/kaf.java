package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kaf implements vnd {
    public final tnh a;
    public final cf7 b;
    public final noh c;
    public final int d;
    public final int e;

    public kaf(tnh tnhVar, noh nohVar, int i) {
        skd skdVar = new skd(27);
        nohVar = (i & 4) != 0 ? q9i.k.g() : nohVar;
        int i2 = (i & 8) != 0 ? np0.q : np0.r;
        this.a = tnhVar;
        this.b = skdVar;
        this.c = nohVar;
        this.d = i2;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kaf)) {
            return false;
        }
        kaf kafVar = (kaf) obj;
        return cqk.d(this.a, kafVar.a) && cqk.d(this.b, kafVar.b) && cqk.d(this.c, kafVar.c) && this.d == kafVar.d;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a.c) * 31)) * 31)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.e;
    }

    public final String toString() {
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ", itemViewType=" + gll.d(this.d) + ")";
    }
}
