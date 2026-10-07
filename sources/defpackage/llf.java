package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class llf extends ilf {
    public final String l;
    public final u8b m;
    public final int n;

    public llf(klf klfVar) {
        super(klfVar);
        this.l = klfVar.h;
        this.m = klfVar.i;
        this.n = klfVar.j;
    }

    @Override // defpackage.ilf
    public final rfa C() {
        f70 f70Var = new f70();
        u8b u8bVar = this.m;
        if (u8bVar == null) {
            ore.p("Required value was null.");
            return null;
        }
        o5d o5dVar = new o5d(0L, this.l, u8bVar, this.n, null, -1);
        c60 c60Var = new c60();
        c60Var.x = o5dVar;
        c60Var.a = y60.o;
        f70Var.a = Collections.singletonList(c60Var.a());
        c46 c46VarC = f70Var.c();
        rfa rfaVar = new rfa();
        rfaVar.n = c46VarC;
        return rfaVar;
    }

    @Override // defpackage.ilf
    public final String D() {
        return "ServiceTaskSendPollMessage";
    }
}
