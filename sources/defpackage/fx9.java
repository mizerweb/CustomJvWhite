package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class fx9 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public long g;
    public final /* synthetic */ long h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx9(long j, long j2, fz6 fz6Var, u8h u8hVar, njd njdVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = j;
        this.h = j2;
        this.j = fz6Var;
        this.k = u8hVar;
        this.l = njdVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                return new fx9((lx9) obj4, this.h, (e70) obj3, (hb9) obj2, lq4Var);
            default:
                fx9 fx9Var = new fx9(this.g, this.h, (fz6) obj4, (u8h) obj3, (njd) obj2, lq4Var);
                fx9Var.i = obj;
                return fx9Var;
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
        return ((fx9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        lx9 lx9Var;
        long j;
        String str;
        kw9 kw9Var;
        a4c a4cVar;
        je9 je9Var;
        switch (this.e) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i = this.f;
                try {
                    if (i != 0) {
                        if (i != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = this.g;
                        lx9Var = (lx9) this.i;
                        try {
                            ch3.d0(obj);
                        } catch (Throwable th) {
                            th = th;
                            str = lx9Var.d;
                            kw9Var = new kw9(th);
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, zo5.j(j, "Can't download attach for mediaId="), kw9Var);
                                }
                            }
                        }
                        break;
                    } else {
                        ch3.d0(obj);
                        lx9 lx9Var2 = (lx9) this.j;
                        long j2 = this.h;
                        e70 e70Var = (e70) this.k;
                        hb9 hb9Var = (hb9) this.l;
                        try {
                            String str2 = lx9Var2.d;
                            a4c a4cVar2 = gm0.f;
                            lq4 lq4Var = null;
                            if (a4cVar2 != null) {
                                je9 je9Var2 = je9.d;
                                if (a4cVar2.b(je9Var2)) {
                                    a4cVar2.c(je9Var2, str2, "prepareAttachIfNeeded: " + j2 + ", downloading attach", null);
                                }
                            }
                            zhb zhbVar = zhb.b;
                            f1j f1jVar = new f1j(e70Var, lx9Var2, hb9Var, lq4Var, 8);
                            this.i = lx9Var2;
                            this.g = j2;
                            this.f = 1;
                            if (yab.K0(zhbVar, f1jVar, this) == hu4Var) {
                                return hu4Var;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            lx9Var = lx9Var2;
                            j = j2;
                            str = lx9Var.d;
                            kw9Var = new kw9(th);
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, zo5.j(j, "Can't download attach for mediaId="), kw9Var);
                                }
                            }
                        }
                    }
                    return sbi.a;
                } catch (CancellationException e) {
                    throw e;
                }
            default:
                gu4 gu4Var = (gu4) this.i;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    long jG = ew5.g(this.g);
                    long jG2 = ew5.g(this.h);
                    vt4 vt4VarK = gu4Var.k();
                    wfe wfeVar = new wfe();
                    vfe vfeVar = new vfe();
                    fz6 fz6Var = (fz6) this.j;
                    py6 py6Var = new py6(vfeVar, (u8h) this.k, jG2, jG, wfeVar, (njd) this.l, gu4Var, vt4VarK);
                    this.i = null;
                    this.f = 1;
                    if (fz6Var.collect(py6Var, this) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx9(lx9 lx9Var, long j, e70 e70Var, hb9 hb9Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = lx9Var;
        this.h = j;
        this.k = e70Var;
        this.l = hb9Var;
    }
}
