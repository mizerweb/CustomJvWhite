package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fc4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc4 b;
    public final /* synthetic */ dc4 c;

    public /* synthetic */ fc4(gc4 gc4Var, dc4 dc4Var, int i) {
        this.a = i;
        this.b = gc4Var;
        this.c = dc4Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        dc4 dc4Var = this.c;
        gc4 gc4Var = this.b;
        switch (i) {
            case 0:
                cf7 onAnimationEnded = gc4Var.getOnAnimationEnded();
                if (onAnimationEnded != null) {
                    onAnimationEnded.invoke(dc4Var);
                }
                break;
            case 1:
                cf7 onAnimationEnded2 = gc4Var.getOnAnimationEnded();
                if (onAnimationEnded2 != null) {
                    onAnimationEnded2.invoke(dc4Var);
                }
                break;
            default:
                gc4Var.K0();
                cf7 onAnimationEnded3 = gc4Var.getOnAnimationEnded();
                if (onAnimationEnded3 != null) {
                    onAnimationEnded3.invoke(dc4Var);
                }
                break;
        }
        return sbiVar;
    }
}
