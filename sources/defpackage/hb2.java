package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hb2 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb2 b;

    public /* synthetic */ hb2(kb2 kb2Var, int i) {
        this.a = i;
        this.b = kb2Var;
    }

    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        kb2 kb2Var = this.b;
        switch (i) {
            case 0:
                zh2 zh2Var = (zh2) obj;
                se2 se2Var = kb2Var.c;
                if (zh2Var instanceof vh2) {
                    if (((vh2) zh2Var).a.equals(se2Var.a)) {
                        kb2.a(kb2Var, zh2Var);
                        return sbiVar;
                    }
                    ore.k("Check failed.");
                } else {
                    if (!(zh2Var instanceof xh2)) {
                        return sbiVar;
                    }
                    if (cqk.d(((xh2) zh2Var).a, se2Var.a)) {
                        kb2.a(kb2Var, zh2Var);
                        return sbiVar;
                    }
                    ore.k("Check failed.");
                }
                return null;
            default:
                kb2.a(kb2Var, wh2.a);
                return sbiVar;
        }
    }
}
