package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ie5 implements se5, syh {
    public final /* synthetic */ pe5 a;

    public /* synthetic */ ie5(pe5 pe5Var) {
        this.a = pe5Var;
    }

    @Override // defpackage.se5
    public ghe e(int i, hyh hyhVar, int[] iArr) {
        z88 z88VarL = c98.l();
        for (int i2 = 0; i2 < hyhVar.a; i2++) {
            z88VarL.c(new me5(i, hyhVar, i2, this.a, iArr[i2]));
        }
        return z88VarL.h();
    }
}
