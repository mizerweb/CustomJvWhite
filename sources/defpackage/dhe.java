package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dhe implements vff, pd4 {
    public static final /* synthetic */ zv8[] o;
    public final /* synthetic */ c8j a;
    public xge b;
    public final gu4 c;
    public final teb d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final p3c k = qyj.S();
    public final pzf l;
    public final q8e m;
    public final r8e n;

    static {
        z8b z8bVar = new z8b(dhe.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        o = new zv8[]{z8bVar};
    }

    public dhe(xge xgeVar, dq4 dq4Var, teb tebVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.a = new c8j(ny8Var2, new skd(18));
        this.b = xgeVar;
        this.c = dq4Var;
        this.d = tebVar;
        this.e = ny8Var4;
        this.f = ny8Var3;
        this.g = ny8Var;
        this.h = ny8Var5;
        this.i = ny8Var6;
        this.j = ny8Var7;
        pzf pzfVarA = e9i.a(1, 1, 2);
        this.l = pzfVarA;
        this.m = new q8e(pzfVarA);
        this.n = new r8e(p90.a(x1d.a));
    }

    @Override // defpackage.vff
    public final zoh a() {
        return new zoh(R.string.oneme_login_neuro_avatars_title, R.string.oneme_login_neuro_avatars_description, R.string.oneme_login_neuro_avatars_continue_button);
    }

    @Override // defpackage.vff
    public final void b(cef cefVar) {
        this.l.a(cefVar);
    }

    @Override // defpackage.vff
    public final void c(eef eefVar) {
        vo8 vo8VarA = this.a.a(this.c, ((n0c) ((xhh) this.e.getValue())).b(), 2, new h99(eefVar, this, null));
        this.k.B(this, o[0], vo8VarA);
    }

    @Override // defpackage.vff
    public final r8e d() {
        return this.n;
    }

    @Override // defpackage.vff
    public final void e(udb udbVar) {
        this.l.a(new cef(udbVar.b, udbVar.a, udbVar.c));
    }

    @Override // defpackage.vff
    public final q8e f() {
        return this.m;
    }

    @Override // defpackage.pd4
    public final q8e q() {
        return this.a.d;
    }
}
