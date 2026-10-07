package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class plf extends ilf {
    public final String l;
    public final long m;
    public final azg n;
    public final List o;

    public plf(olf olfVar) {
        super(olfVar);
        this.l = olfVar.h;
        this.m = olfVar.i;
        this.n = olfVar.j;
        this.o = olfVar.k;
    }

    @Override // defpackage.ilf
    public final rfa C() {
        f70 f70Var = new f70();
        ntg ntgVar = new ntg(this.n, this.m, null, 0L);
        c60 c60Var = new c60();
        c60Var.C = ntgVar;
        c60Var.a = y60.p;
        e70 e70VarA = c60Var.a();
        c79 c79VarW = yab.w();
        c79VarW.add(e70VarA);
        f70Var.a = yab.j(c79VarW);
        c46 c46VarC = f70Var.c();
        rfa rfaVar = new rfa();
        rfaVar.g = this.l;
        rfaVar.n = c46VarC;
        rfaVar.b(this.o);
        return rfaVar;
    }

    @Override // defpackage.ilf
    public final String D() {
        return "ServiceTaskSendStoriesReplyMessage";
    }
}
