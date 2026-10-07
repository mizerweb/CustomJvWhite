package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g01 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l01 b;
    public final /* synthetic */ long c;

    public /* synthetic */ g01(l01 l01Var, long j, int i) {
        this.a = i;
        this.b = l01Var;
        this.c = j;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        long j = this.c;
        l01 l01Var = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((ju6) ((rs6) l01Var.a.getValue())).g(j).delete());
            default:
                return rx8.R(((ju6) ((rs6) l01Var.a.getValue())).g(j));
        }
    }
}
