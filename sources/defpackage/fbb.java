package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fbb implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fbb(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        pc5 pc5Var;
        AtomicReference atomicReference = gbb.a;
        abb abbVar = cqk.e;
        if (abbVar == null) {
            abbVar = null;
        }
        qg7 qg7Var = abbVar.f;
        int iD = qt4.D(this.a);
        if (iD == 0) {
            pc5Var = (pc5) gbb.i.getValue();
        } else {
            if (iD != 1) {
                ore.o();
                return null;
            }
            pc5Var = (pc5) gbb.j.getValue();
        }
        ndh ndhVar = new ndh(qg7Var, pc5Var, (xt4) gbb.d.getValue(), (xt4) gbb.e.getValue(), (gu4) gbb.f.getValue(), this.b, this.c);
        ndhVar.f();
        return ndhVar;
    }
}
