package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class soi extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ gpi g;
    public final /* synthetic */ Long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ soi(gpi gpiVar, Long l, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = gpiVar;
        this.h = l;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Long l = this.h;
        gpi gpiVar = this.g;
        switch (i) {
            case 0:
                return new soi(gpiVar, l, lq4Var, 0);
            default:
                return new soi(gpiVar, l, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((soi) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        String str;
        a4c a4cVar;
        je9 je9Var;
        String str2;
        a4c a4cVar2;
        je9 je9Var2;
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    gpi gpiVar = this.g;
                    this.f = 1;
                    if (gpi.B(gpiVar, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                Object value = this.g.t1.a.getValue();
                jpi jpiVar = value instanceof jpi ? (jpi) value : null;
                if (jpiVar == null) {
                    str = this.g.p;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "onPhotoLoadError retry: story changed, skip retry", null);
                        }
                    }
                } else {
                    lsg lsgVar = (lsg) this.g.F.a.getValue();
                    if (cqk.d(lsgVar != null ? new Long(lsgVar.c()) : null, this.h)) {
                        a8j.x(this.g.r1, new aqi(jpiVar.a));
                    } else {
                        str = this.g.p;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "onPhotoLoadError retry: story changed, skip retry", null);
                            }
                        }
                    }
                }
                return sbiVar;
            default:
                sbi sbiVar2 = sbi.a;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    gpi gpiVar2 = this.g;
                    this.f = 1;
                    if (gpi.B(gpiVar2, this) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                Object value2 = this.g.t1.a.getValue();
                kpi kpiVar = value2 instanceof kpi ? (kpi) value2 : null;
                if (kpiVar == null) {
                    str2 = this.g.p;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9Var2 = je9.d;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "onVideoPlaybackError retry: story changed, skip retry", null);
                        }
                    }
                } else {
                    lsg lsgVar2 = (lsg) this.g.F.a.getValue();
                    if (cqk.d(lsgVar2 != null ? new Long(lsgVar2.c()) : null, this.h)) {
                        gpi gpiVar3 = this.g;
                        a8j.x(gpiVar3.r1, new dqi(kpiVar.c, ((Boolean) gpiVar3.z.a.getValue()).booleanValue()));
                    } else {
                        str2 = this.g.p;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9Var2 = je9.d;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str2, "onVideoPlaybackError retry: story changed, skip retry", null);
                            }
                        }
                    }
                }
                return sbiVar2;
        }
    }
}
