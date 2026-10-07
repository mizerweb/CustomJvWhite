package defpackage;

import one.me.qrscanner.QrScannerWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class je5 implements se5, t65 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ je5(ve5 ve5Var, pe5 pe5Var, boolean z, int[] iArr) {
        this.b = ve5Var;
        this.c = pe5Var;
        this.a = z;
        this.d = iArr;
    }

    @Override // defpackage.se5
    public ghe e(int i, hyh hyhVar, int[] iArr) {
        ve5 ve5Var = (ve5) this.b;
        pe5 pe5Var = (pe5) this.c;
        int[] iArr2 = (int[]) this.d;
        ve5Var.getClass();
        ke5 ke5Var = new ke5(ve5Var, pe5Var);
        int i2 = iArr2[i];
        z88 z88VarL = c98.l();
        for (int i3 = 0; i3 < hyhVar.a; i3++) {
            z88VarL.c(new le5(i, hyhVar, i3, pe5Var, iArr[i3], this.a, ke5Var, i2));
        }
        return z88VarL.h();
    }

    @Override // defpackage.t65
    public Object t() {
        return new QrScannerWidget(this.a, (Long) this.b, (k0e) this.c, (ha9) this.d);
    }

    public /* synthetic */ je5(boolean z, Long l, k0e k0eVar, ha9 ha9Var) {
        this.a = z;
        this.b = l;
        this.c = k0eVar;
        this.d = ha9Var;
    }
}
