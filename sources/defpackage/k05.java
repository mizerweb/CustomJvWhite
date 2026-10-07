package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k05 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public ozh f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ rre k;
    public final /* synthetic */ cf7 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k05(boolean z, boolean z2, rre rreVar, lq4 lq4Var, cf7 cf7Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = z;
        this.j = z2;
        this.k = rreVar;
        this.l = cf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                k05 k05Var = new k05(this.i, this.j, this.k, lq4Var, this.l, 0);
                k05Var.h = obj;
                return k05Var;
            default:
                k05 k05Var2 = new k05(this.i, this.j, this.k, lq4Var, this.l, 1);
                k05Var2.h = obj;
                return k05Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        pzh pzhVar = (pzh) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((k05) create(pzhVar, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0168  */
    /* JADX WARN: Code duplicated, block: B:87:0x0173  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0181  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        pzh pzhVar;
        Object objB;
        pzh pzhVar2;
        ozh ozhVar;
        Object objD;
        Object objB2;
        Object obj2;
        jl8 jl8Var;
        pzh pzhVar3;
        Object objB3;
        pzh pzhVar4;
        ozh ozhVar2;
        Object objD2;
        Object objB4;
        Object obj3;
        int i = this.e;
        ozh ozhVar3 = ozh.b;
        ozh ozhVar4 = ozh.a;
        boolean z = this.i;
        hu4 hu4Var = hu4.a;
        boolean z2 = this.j;
        rre rreVar = this.k;
        cf7 cf7Var = this.l;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    pzhVar = (pzh) this.h;
                    if (!z) {
                        return cf7Var.invoke(((f5e) pzhVar).c());
                    }
                    if (z2) {
                        ozhVar3 = ozhVar4;
                    }
                    if (!z2) {
                        this.h = pzhVar;
                        this.f = ozhVar3;
                        this.g = 1;
                        objB = pzhVar.b(this);
                        if (objB == hu4Var) {
                            return hu4Var;
                        }
                        ozh ozhVar5 = ozhVar3;
                        pzhVar2 = pzhVar;
                        ozhVar = ozhVar5;
                    }
                    j05 j05Var = new j05(null, cf7Var, 0);
                    this.h = pzhVar;
                    this.f = null;
                    this.g = 3;
                    objD = pzhVar.d(ozhVar3, j05Var, this);
                    if (objD == hu4Var) {
                        return hu4Var;
                    }
                    if (!z2) {
                        return objD;
                    }
                    this.h = objD;
                    this.g = 4;
                    objB2 = pzhVar.b(this);
                    if (objB2 == hu4Var) {
                        return hu4Var;
                    }
                    obj2 = objD;
                    if (((Boolean) objB2).booleanValue()) {
                        return obj2;
                    }
                    jl8 jl8Var2 = rreVar.f;
                    if (jl8Var2 != null) {
                    }
                    jl8Var.c.g(jl8Var.f, jl8Var.g);
                    return obj2;
                }
                if (i2 == 1) {
                    ozhVar = this.f;
                    pzhVar2 = (pzh) this.h;
                    ch3.d0(obj);
                    objB = obj;
                } else if (i2 == 2) {
                    ozhVar = this.f;
                    pzhVar2 = (pzh) this.h;
                    ch3.d0(obj);
                    pzh pzhVar5 = pzhVar2;
                    ozhVar3 = ozhVar;
                    pzhVar = pzhVar5;
                    j05 j05Var2 = new j05(null, cf7Var, 0);
                    this.h = pzhVar;
                    this.f = null;
                    this.g = 3;
                    objD = pzhVar.d(ozhVar3, j05Var2, this);
                    if (objD == hu4Var) {
                        return hu4Var;
                    }
                    if (!z2) {
                        return objD;
                    }
                    this.h = objD;
                    this.g = 4;
                    objB2 = pzhVar.b(this);
                    if (objB2 == hu4Var) {
                        return hu4Var;
                    }
                    obj2 = objD;
                } else if (i2 == 3) {
                    pzhVar = (pzh) this.h;
                    ch3.d0(obj);
                    objD = obj;
                    if (!z2) {
                        return objD;
                    }
                    this.h = objD;
                    this.g = 4;
                    objB2 = pzhVar.b(this);
                    if (objB2 == hu4Var) {
                        return hu4Var;
                    }
                    obj2 = objD;
                } else {
                    if (i2 != 4) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj4 = this.h;
                    ch3.d0(obj);
                    obj2 = obj4;
                    objB2 = obj;
                }
                if (((Boolean) objB2).booleanValue()) {
                    return obj2;
                }
                jl8 jl8Var3 = rreVar.f;
                jl8Var = jl8Var3 != null ? jl8Var3 : null;
                jl8Var.c.g(jl8Var.f, jl8Var.g);
                return obj2;
                if (!((Boolean) objB).booleanValue()) {
                    jl8 jl8Var4 = rreVar.f;
                    if (jl8Var4 == null) {
                        jl8Var4 = null;
                    }
                    this.h = pzhVar2;
                    this.f = ozhVar;
                    this.g = 2;
                    if (jl8Var4.c(this) == hu4Var) {
                        return hu4Var;
                    }
                }
                pzh pzhVar6 = pzhVar2;
                ozhVar3 = ozhVar;
                pzhVar = pzhVar6;
                j05 j05Var3 = new j05(null, cf7Var, 0);
                this.h = pzhVar;
                this.f = null;
                this.g = 3;
                objD = pzhVar.d(ozhVar3, j05Var3, this);
                if (objD == hu4Var) {
                    return hu4Var;
                }
                if (!z2) {
                    return objD;
                }
                this.h = objD;
                this.g = 4;
                objB2 = pzhVar.b(this);
                if (objB2 == hu4Var) {
                    return hu4Var;
                }
                obj2 = objD;
                if (((Boolean) objB2).booleanValue()) {
                    return obj2;
                }
                jl8 jl8Var5 = rreVar.f;
                if (jl8Var5 != null) {
                }
                jl8Var.c.g(jl8Var.f, jl8Var.g);
                return obj2;
            default:
                int i3 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    pzhVar3 = (pzh) this.h;
                    if (!z) {
                        return cf7Var.invoke(((f5e) pzhVar3).c());
                    }
                    if (z2) {
                        ozhVar3 = ozhVar4;
                    }
                    if (!z2) {
                        this.h = pzhVar3;
                        this.f = ozhVar3;
                        this.g = 1;
                        objB3 = pzhVar3.b(this);
                        if (objB3 == hu4Var) {
                            return hu4Var;
                        }
                        ozh ozhVar6 = ozhVar3;
                        pzhVar4 = pzhVar3;
                        ozhVar2 = ozhVar6;
                    }
                    j05 j05Var4 = new j05(null, cf7Var, 1);
                    this.h = pzhVar3;
                    this.f = null;
                    this.g = 3;
                    objD2 = pzhVar3.d(ozhVar3, j05Var4, this);
                    if (objD2 == hu4Var) {
                        return hu4Var;
                    }
                    if (!z2) {
                        return objD2;
                    }
                    this.h = objD2;
                    this.g = 4;
                    objB4 = pzhVar3.b(this);
                    if (objB4 == hu4Var) {
                        return hu4Var;
                    }
                    obj3 = objD2;
                    if (((Boolean) objB4).booleanValue()) {
                        return obj3;
                    }
                    jl8 jl8Var6 = rreVar.f;
                    if (jl8Var6 != null) {
                    }
                    jl8Var.c.g(jl8Var.f, jl8Var.g);
                    return obj3;
                }
                if (i3 == 1) {
                    ozhVar2 = this.f;
                    pzhVar4 = (pzh) this.h;
                    ch3.d0(obj);
                    objB3 = obj;
                } else if (i3 == 2) {
                    ozhVar2 = this.f;
                    pzhVar4 = (pzh) this.h;
                    ch3.d0(obj);
                    pzh pzhVar7 = pzhVar4;
                    ozhVar3 = ozhVar2;
                    pzhVar3 = pzhVar7;
                    j05 j05Var5 = new j05(null, cf7Var, 1);
                    this.h = pzhVar3;
                    this.f = null;
                    this.g = 3;
                    objD2 = pzhVar3.d(ozhVar3, j05Var5, this);
                    if (objD2 == hu4Var) {
                        return hu4Var;
                    }
                    if (!z2) {
                        return objD2;
                    }
                    this.h = objD2;
                    this.g = 4;
                    objB4 = pzhVar3.b(this);
                    if (objB4 == hu4Var) {
                        return hu4Var;
                    }
                    obj3 = objD2;
                } else if (i3 == 3) {
                    pzhVar3 = (pzh) this.h;
                    ch3.d0(obj);
                    objD2 = obj;
                    if (!z2) {
                        return objD2;
                    }
                    this.h = objD2;
                    this.g = 4;
                    objB4 = pzhVar3.b(this);
                    if (objB4 == hu4Var) {
                        return hu4Var;
                    }
                    obj3 = objD2;
                } else {
                    if (i3 != 4) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj5 = this.h;
                    ch3.d0(obj);
                    obj3 = obj5;
                    objB4 = obj;
                }
                if (((Boolean) objB4).booleanValue()) {
                    return obj3;
                }
                jl8 jl8Var7 = rreVar.f;
                jl8Var = jl8Var7 != null ? jl8Var7 : null;
                jl8Var.c.g(jl8Var.f, jl8Var.g);
                return obj3;
                if (!((Boolean) objB3).booleanValue()) {
                    jl8 jl8Var8 = rreVar.f;
                    if (jl8Var8 == null) {
                        jl8Var8 = null;
                    }
                    this.h = pzhVar4;
                    this.f = ozhVar2;
                    this.g = 2;
                    if (jl8Var8.c(this) == hu4Var) {
                        return hu4Var;
                    }
                }
                pzh pzhVar8 = pzhVar4;
                ozhVar3 = ozhVar2;
                pzhVar3 = pzhVar8;
                j05 j05Var6 = new j05(null, cf7Var, 1);
                this.h = pzhVar3;
                this.f = null;
                this.g = 3;
                objD2 = pzhVar3.d(ozhVar3, j05Var6, this);
                if (objD2 == hu4Var) {
                    return hu4Var;
                }
                if (!z2) {
                    return objD2;
                }
                this.h = objD2;
                this.g = 4;
                objB4 = pzhVar3.b(this);
                if (objB4 == hu4Var) {
                    return hu4Var;
                }
                obj3 = objD2;
                if (((Boolean) objB4).booleanValue()) {
                    return obj3;
                }
                jl8 jl8Var9 = rreVar.f;
                if (jl8Var9 != null) {
                }
                jl8Var.c.g(jl8Var.f, jl8Var.g);
                return obj3;
        }
    }
}
