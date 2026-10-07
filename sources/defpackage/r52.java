package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r52 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ s52 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public r52(s52 s52Var, int i) {
        this.c = i;
        int i2 = 4;
        this.d = s52Var;
        switch (i) {
            case 1:
                super(i2, null);
                break;
            default:
                super(i2, q52.SMALL);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        s52 s52Var = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    s52.B(s52Var, (q52) obj2);
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    kbc kbcVarH = (kbc) obj2;
                    if (kbcVarH == null) {
                        kbcVarH = pq3.j.h(s52Var);
                    }
                    s52Var.onThemeChanged(kbcVarH);
                }
                break;
        }
    }
}
