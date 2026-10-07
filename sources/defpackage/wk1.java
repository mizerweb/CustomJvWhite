package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wk1 extends n1g {
    public final /* synthetic */ int g;
    public final List h;
    public final List i;

    public /* synthetic */ wk1(int i, List list, List list2) {
        this.g = i;
        this.h = list;
        this.i = list2;
    }

    @Override // defpackage.n1g
    public final int B() {
        int i = this.g;
        List list = this.i;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return list.size();
    }

    @Override // defpackage.n1g
    public final int C() {
        switch (this.g) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.h.size();
    }

    @Override // defpackage.n1g
    public final boolean f(int i, int i2) {
        int i3 = this.g;
        List list = this.i;
        List list2 = this.h;
        switch (i3) {
            case 0:
                return cqk.d(list2.get(i), list.get(i2));
            case 1:
                return cqk.d(list2.get(i), list.get(i2));
            case 2:
                return list2.get(i) == list.get(i2);
            default:
                return cqk.d(ww3.u1(i, list2), ww3.u1(i2, list));
        }
    }

    @Override // defpackage.n1g
    public final boolean g(int i, int i2) {
        int i3 = this.g;
        List list = this.i;
        List list2 = this.h;
        switch (i3) {
            case 0:
                return ((zl1) list2.get(i)).c == ((zl1) list.get(i2)).c;
            case 1:
                return cqk.d(((q37) list2.get(i)).a, ((q37) list.get(i2)).a);
            case 2:
                return ((ax8) list2.get(i)).c == ((ax8) list.get(i2)).c;
            default:
                ckd ckdVar = (ckd) ww3.u1(i, list2);
                ckd ckdVar2 = (ckd) ww3.u1(i2, list);
                return cqk.d(ckdVar != null ? Long.valueOf(ckdVar.a()) : null, ckdVar2 != null ? Long.valueOf(ckdVar2.a()) : null);
        }
    }
}
