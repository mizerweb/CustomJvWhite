package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ka6 extends t4d {
    public final lif l;
    public final ifh m;

    public ka6(String str, int i) {
        super(str, null, i);
        this.l = lif.f;
        this.m = new ifh(new t86(i, str, this));
    }

    @Override // defpackage.t4d, defpackage.fif
    public final lvb d() {
        return this.l;
    }

    @Override // defpackage.t4d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fif)) {
            return false;
        }
        fif fifVar = (fif) obj;
        return fifVar.d() == lif.f && this.a.equals(fifVar.i()) && cqk.d(wk8.f(this), wk8.f(fifVar));
    }

    @Override // defpackage.t4d, defpackage.fif
    public final fif h(int i) {
        return ((fif[]) this.m.getValue())[i];
    }

    @Override // defpackage.t4d
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        bw bwVar = new bw(this);
        int iHashCode2 = 1;
        while (bwVar.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) bwVar.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.t4d
    public final String toString() {
        return ww3.z1(new s18(2, this), ", ", this.a.concat("("), ")", null, 56);
    }
}
