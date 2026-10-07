package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oo2 extends a8h implements Comparable {
    public long j;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        oo2 oo2Var = (oo2) obj;
        if (d(4) != oo2Var.d(4)) {
            return d(4) ? 1 : -1;
        }
        long j = this.f - oo2Var.f;
        if (j == 0) {
            j = this.j - oo2Var.j;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
