package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rkk implements dm0 {
    public final /* synthetic */ jo7 a;

    public rkk(jo7 jo7Var) {
        this.a = jo7Var;
    }

    @Override // defpackage.dm0
    public final void a(boolean z) {
        bmk bmkVar = this.a.m;
        bmkVar.sendMessage(bmkVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
