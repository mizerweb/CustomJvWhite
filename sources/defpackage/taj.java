package defpackage;

import one.me.calls.impl.service.VoIpCallService;

/* JADX INFO: loaded from: classes2.dex */
public final class taj extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ VoIpCallService f;
    public final /* synthetic */ y02 g;
    public final /* synthetic */ x02 h;
    public final /* synthetic */ dz4 i;
    public final /* synthetic */ be1 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taj(VoIpCallService voIpCallService, y02 y02Var, x02 x02Var, dz4 dz4Var, be1 be1Var, boolean z, boolean z2, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = voIpCallService;
        this.g = y02Var;
        this.h = x02Var;
        this.i = dz4Var;
        this.j = be1Var;
        this.k = z;
        this.l = z2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new taj(this.f, this.g, this.h, this.i, this.j, this.k, this.l, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((taj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        hu4 hu4Var = hu4.a;
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            VoIpCallService voIpCallService = this.f;
            String str = voIpCallService.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, qv1.i("updateNotificationWithActiveState(), localAccountId=", (ha9) voIpCallService.e.f), null);
                }
            }
            o02 o02Var = this.f.e;
            u92 u92VarJ = this.g.j();
            if (!o02Var.a) {
                o02Var.a = true;
                ny8 ny8Var = u92VarJ.d;
                ((g5c) ny8Var.getValue()).p();
                ((g5c) ny8Var.getValue()).o();
            }
            this.f.e.i();
            VoIpCallService voIpCallService2 = this.f;
            String strS = this.h.s();
            dz4 dz4Var = this.i;
            be1 be1Var = this.j;
            this.e = 1;
            y02 y02VarP = voIpCallService2.e().p(strS);
            if (y02VarP == null) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, "CallServiceTag", c0a.o("VoIpCallService createCallNotification: no live session (id=", strS, "). Stop service."), null);
                    }
                }
                obj = null;
            } else {
                obj = ((hs1) y02VarP.getAccessor().c(729)).a(strS, dz4Var, be1Var, this);
            }
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        es1 es1Var = (es1) obj;
        if (es1Var != null) {
            be1 be1Var2 = this.j;
            dz4 dz4Var2 = this.i;
            VoIpCallService voIpCallService3 = this.f;
            VoIpCallService.a(voIpCallService3, es1Var.a, es1Var.b, this.k, cqk.d(be1Var2, be1.n) || (dz4Var2.h && !dz4Var2.g), this.l);
            o02 o02Var2 = voIpCallService3.e;
            if (!o02Var2.b) {
                o02Var2.b = true;
            }
        }
        return sbi.a;
    }
}
