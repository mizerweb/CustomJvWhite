package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ls3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ns3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ls3(ns3 ns3Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = ns3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new ls3(this.g, lq4Var, 0);
            case 1:
                return new ls3(this.g, lq4Var, 1);
            case 2:
                return new ls3(this.g, lq4Var, 2);
            default:
                return new ls3(this.g, lq4Var, 3);
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
            case 1:
                break;
            case 2:
                break;
        }
        return ((ls3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x019a  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objB;
        uoa uoaVarC;
        hre hreVarA;
        ldh ldhVar;
        xse xseVar;
        xm xmVar;
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        ns3 ns3Var = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    ika ikaVar = (ika) ns3Var.l.getValue();
                    this.f = 1;
                    if (ikaVar.a(this) != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ch3.d0(obj);
                            return sbiVar;
                        }
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                n25 n25Var = (n25) ns3Var.j.getValue();
                this.f = 3;
                objB = ((j35) n25Var.a.getValue()).b(new m25(n25Var, null, 0), this);
                if (objB != hu4Var) {
                    objB = sbiVar;
                }
                if (objB != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
                this.f = 2;
                if (ns3Var.d(this) != hu4Var) {
                    n25 n25Var2 = (n25) ns3Var.j.getValue();
                    this.f = 3;
                    objB = ((j35) n25Var2.a.getValue()).b(new m25(n25Var2, null, 0), this);
                    if (objB != hu4Var) {
                        objB = sbiVar;
                    }
                    if (objB != hu4Var) {
                        return sbiVar;
                    }
                }
                return hu4Var;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    zgi zgiVar = (zgi) ns3Var.m.getValue();
                    this.f = 1;
                    if (zgiVar.f(this) != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                } else {
                    if (i3 == 2) {
                        ch3.d0(obj);
                        uoaVarC = ((n25) ns3Var.j.getValue()).c();
                        this.f = 3;
                        if (((ose) uoaVarC).d(this) != hu4Var) {
                        }
                        return hu4Var;
                    }
                    if (i3 != 3) {
                        if (i3 == 4) {
                            ch3.d0(obj);
                            return sbiVar;
                        }
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                hreVarA = ((n25) ns3Var.j.getValue()).a();
                this.f = 4;
                if (hreVarA.c(this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
                ika ikaVar2 = (ika) ns3Var.l.getValue();
                this.f = 2;
                if (ikaVar2.a(this) != hu4Var) {
                    uoaVarC = ((n25) ns3Var.j.getValue()).c();
                    this.f = 3;
                    if (((ose) uoaVarC).d(this) != hu4Var) {
                        hreVarA = ((n25) ns3Var.j.getValue()).a();
                        this.f = 4;
                        if (hreVarA.c(this) != hu4Var) {
                            return sbiVar;
                        }
                    }
                }
                return hu4Var;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    wae waeVar = (wae) ns3Var.e.getValue();
                    this.f = 1;
                    if (waeVar.e(this) != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                } else {
                    if (i4 == 2) {
                        ch3.d0(obj);
                        ldhVar = (ldh) ns3Var.g.getValue();
                        this.f = 3;
                        if (ldhVar.k(this) != hu4Var) {
                            xseVar = (xse) ns3Var.d.getValue();
                            this.f = 4;
                            if (xseVar.b(this) != hu4Var) {
                            }
                        }
                        return hu4Var;
                    }
                    if (i4 == 3) {
                        ch3.d0(obj);
                        xseVar = (xse) ns3Var.d.getValue();
                        this.f = 4;
                        if (xseVar.b(this) != hu4Var) {
                        }
                        return hu4Var;
                    }
                    if (i4 != 4) {
                        if (i4 == 5) {
                            ch3.d0(obj);
                            return sbiVar;
                        }
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                xmVar = (xm) ns3Var.h.getValue();
                this.f = 5;
                if (xmVar.d(this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
                um6 um6Var = (um6) ns3Var.f.getValue();
                this.f = 2;
                if (um6Var.i(this) != hu4Var) {
                    ldhVar = (ldh) ns3Var.g.getValue();
                    this.f = 3;
                    if (ldhVar.k(this) != hu4Var) {
                        xseVar = (xse) ns3Var.d.getValue();
                        this.f = 4;
                        if (xseVar.b(this) != hu4Var) {
                            xmVar = (xm) ns3Var.h.getValue();
                            this.f = 5;
                            if (xmVar.d(this) != hu4Var) {
                                return sbiVar;
                            }
                        }
                    }
                }
                return hu4Var;
            default:
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    ika ikaVar3 = (ika) ns3Var.l.getValue();
                    this.f = 1;
                    if (ikaVar3.a(this) != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                zgi zgiVar2 = (zgi) ns3Var.m.getValue();
                this.f = 2;
                if (zgiVar2.f(this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
        }
    }
}
