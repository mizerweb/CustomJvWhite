package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class elf extends ilf {
    public static final /* synthetic */ int o = 0;
    public final vc9 l;
    public final float m;
    public final boolean n;

    public elf(dlf dlfVar) {
        super(dlfVar);
        this.l = dlfVar.h;
        this.m = dlfVar.i;
        this.n = false;
    }

    @Override // defpackage.ilf
    public final rfa C() {
        f70 f70Var = new f70();
        long jF = ((s7f) m()).f();
        k60 k60Var = new k60();
        k60Var.a = this.l;
        k60Var.g = this.m;
        k60Var.b = 0L;
        k60Var.c = jF;
        k60Var.d = jF;
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        k60Var.f = ((ek5) njfVar.U.getValue()).a();
        l60 l60VarA = k60Var.a();
        c60 c60Var = new c60();
        c60Var.v = l60VarA;
        c60Var.a = y60.m;
        if (this.n) {
            c60Var.i = u60.e;
        }
        f70Var.a = Collections.singletonList(c60Var.a());
        c46 c46VarC = f70Var.c();
        rfa rfaVar = new rfa();
        rfaVar.g = null;
        rfaVar.n = c46VarC;
        return rfaVar;
    }

    @Override // defpackage.ilf
    public final String D() {
        return "ServiceTaskSendLocationMessage";
    }

    @Override // defpackage.ilf
    public final long G(rt2 rt2Var, long j, String str) {
        long jG = super.G(rt2Var, j, str);
        if (this.n) {
            gm0.n("elf", "specifyLocation, start TaskLocationRequest to define location");
            x().d(new rkf(((s7f) m()).g(), j, false));
        }
        return jG;
    }
}
