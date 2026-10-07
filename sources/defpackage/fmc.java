package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class fmc extends mdh implements qf7 {
    public final /* synthetic */ Notification e;
    public final /* synthetic */ t84 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ sfe j;
    public final /* synthetic */ y02 k;
    public final /* synthetic */ x02 l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmc(Notification notification, t84 t84Var, int i, boolean z, boolean z2, sfe sfeVar, y02 y02Var, x02 x02Var, boolean z3, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = notification;
        this.f = t84Var;
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = sfeVar;
        this.k = y02Var;
        this.l = x02Var;
        this.m = z3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new fmc(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        fmc fmcVar = (fmc) create((gu4) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        fmcVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        ch3.d0(obj);
        if (this.e == null) {
            int i = this.g;
            x02 x02Var = this.l;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ParallelCallNotifier", zo5.i(i, "cancel id=", " for ", x02Var.s()), null);
            }
            ((c95) ((ny8) this.f.g).getValue()).d(this.g);
            return sbiVar;
        }
        boolean z = this.h && this.i;
        if (this.j.a && !z) {
            ((c95) ((ny8) this.f.g).getValue()).d(this.g);
        }
        this.j.a = z;
        int i2 = this.g;
        x02 x02Var2 = this.l;
        boolean z2 = this.m;
        boolean z3 = this.h;
        boolean z4 = this.i;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            StringBuilder sbA = nbh.A(i2, "post id=", " for ", x02Var2.s(), " (held=");
            qt4.B(" ringing=", " silenced=", sbA, z2, z3);
            a4cVar2.c(je9Var, "ParallelCallNotifier", qt4.r(sbA, z4, ")"), null);
        }
        ((c95) ((ny8) this.f.g).getValue()).g(this.g, this.e);
        if (this.h) {
            this.k.h().m(this.l.s());
        }
        return sbiVar;
    }
}
