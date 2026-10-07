package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class rle extends mdh implements qf7 {
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public aq j;
    public Object k;
    public String l;
    public yhh m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public final /* synthetic */ aq r;
    public final /* synthetic */ dme s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ yle u;
    public final /* synthetic */ qih v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rle(aq aqVar, dme dmeVar, boolean z, yle yleVar, qih qihVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.r = aqVar;
        this.s = dmeVar;
        this.t = z;
        this.u = yleVar;
        this.v = qihVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new rle(this.r, this.s, this.t, this.u, this.v, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((rle) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x014a A[Catch: all -> 0x0167, CancellationException -> 0x01f1, TryCatch #0 {CancellationException -> 0x01f1, blocks: (B:14:0x008a, B:53:0x01e6, B:19:0x00b8, B:49:0x01b9, B:24:0x00ef, B:34:0x0146, B:36:0x014a, B:38:0x0150, B:41:0x0169, B:44:0x017d, B:45:0x0184, B:30:0x0112), top: B:71:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0150 A[Catch: all -> 0x0167, CancellationException -> 0x01f1, TryCatch #0 {CancellationException -> 0x01f1, blocks: (B:14:0x008a, B:53:0x01e6, B:19:0x00b8, B:49:0x01b9, B:24:0x00ef, B:34:0x0146, B:36:0x014a, B:38:0x0150, B:41:0x0169, B:44:0x017d, B:45:0x0184, B:30:0x0112), top: B:71:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0169 A[Catch: all -> 0x0167, CancellationException -> 0x01f1, TryCatch #0 {CancellationException -> 0x01f1, blocks: (B:14:0x008a, B:53:0x01e6, B:19:0x00b8, B:49:0x01b9, B:24:0x00ef, B:34:0x0146, B:36:0x014a, B:38:0x0150, B:41:0x0169, B:44:0x017d, B:45:0x0184, B:30:0x0112), top: B:71:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x017b  */
    /* JADX WARN: Code duplicated, block: B:44:0x017d A[Catch: all -> 0x0167, CancellationException -> 0x01f1, TryCatch #0 {CancellationException -> 0x01f1, blocks: (B:14:0x008a, B:53:0x01e6, B:19:0x00b8, B:49:0x01b9, B:24:0x00ef, B:34:0x0146, B:36:0x014a, B:38:0x0150, B:41:0x0169, B:44:0x017d, B:45:0x0184, B:30:0x0112), top: B:71:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0184 A[Catch: all -> 0x0167, CancellationException -> 0x01f1, TryCatch #0 {CancellationException -> 0x01f1, blocks: (B:14:0x008a, B:53:0x01e6, B:19:0x00b8, B:49:0x01b9, B:24:0x00ef, B:34:0x0146, B:36:0x014a, B:38:0x0150, B:41:0x0169, B:44:0x017d, B:45:0x0184, B:30:0x0112), top: B:71:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x021d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0244  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x0184, please report this as an issue */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        aq aqVar;
        dme dmeVar;
        boolean z;
        qih qihVar;
        int i;
        Object objU;
        qih qihVar2;
        yle yleVar;
        aq aqVar2;
        aq aqVar3;
        int i2;
        dme dmeVar2;
        hih hihVar;
        String str;
        yhh yhhVar;
        dme dmeVar3;
        yhh yhhVar2;
        qih qihVar3;
        long jA;
        agb agbVar;
        pih pihVarC;
        qle qleVar;
        int i3;
        qih qihVar4;
        dme dmeVar4;
        yhh yhhVar3;
        dme dmeVar5;
        pih pihVarC2;
        qle qleVar2;
        aq aqVar4;
        dme dmeVar6;
        int i4 = this.q;
        int i5 = 0;
        hu4 hu4Var = hu4.a;
        try {
            if (i4 == 0) {
                ch3.d0(obj);
                aqVar = this.r;
                dmeVar = this.s;
                z = this.t;
                yle yleVar2 = this.u;
                qih qihVar5 = this.v;
                try {
                    aqVar.e = (bq) dmeVar.i.getValue();
                    this.e = aqVar;
                    this.f = dmeVar;
                    this.g = yleVar2;
                    this.h = qihVar5;
                    this.i = dmeVar;
                    this.j = aqVar;
                    this.k = qihVar5;
                    this.l = null;
                    this.n = z;
                    this.o = 0;
                    this.p = 0;
                    this.q = 1;
                    objU = aqVar.u(this);
                    if (objU != hu4Var) {
                        qihVar = qihVar5;
                        qihVar2 = qihVar;
                        yleVar = yleVar2;
                        aqVar2 = aqVar;
                        aqVar3 = aqVar2;
                        i2 = 0;
                        i = 0;
                        dmeVar2 = dmeVar;
                        hihVar = (hih) objU;
                        if (hihVar == null) {
                            jA = dme.a(dmeVar2, hihVar);
                            if (z) {
                                ((agb) dmeVar2.j().i.get()).j(hihVar, true, jA, yleVar);
                            } else {
                                agbVar = (agb) dmeVar2.j().i.get();
                                if (agbVar == null) {
                                    agbVar.j(hihVar, false, jA, yleVar);
                                }
                            }
                        } else {
                            str = "nullable request for " + aqVar2;
                            yhhVar = new yhh("app.exception", str, null);
                            this.e = dmeVar2;
                            this.f = qihVar2;
                            this.g = dmeVar;
                            this.h = aqVar3;
                            this.i = qihVar;
                            this.j = null;
                            this.k = null;
                            this.l = str;
                            this.m = yhhVar;
                            this.o = i;
                            this.p = i2;
                            this.q = 2;
                            if (dme.d(dmeVar2, aqVar2, yhhVar, this) == hu4Var) {
                                dmeVar3 = dmeVar2;
                                yhhVar2 = yhhVar;
                                qihVar3 = qihVar2;
                                pihVarC = qihVar3.c();
                                qleVar = new qle(qihVar3, yhhVar2, null, 0);
                                this.e = dmeVar3;
                                this.f = dmeVar;
                                this.g = aqVar3;
                                this.h = qihVar;
                                this.i = null;
                                this.j = null;
                                this.k = str;
                                this.l = null;
                                this.m = null;
                                this.o = i;
                                this.p = i2;
                                this.q = 3;
                                if (pihVarC.a(qleVar, this) != hu4Var) {
                                    i3 = i;
                                    aqVar = aqVar3;
                                    qihVar4 = qihVar;
                                    dmeVar4 = dmeVar3;
                                    gm0.Y(dmeVar4.s, str);
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    qihVar = qihVar5;
                    i = 0;
                    yhhVar3 = new yhh("app.exception", th.getMessage(), null);
                    this.e = dmeVar;
                    this.f = aqVar;
                    this.g = qihVar;
                    this.h = th;
                    this.i = null;
                    this.j = null;
                    this.k = yhhVar3;
                    this.l = null;
                    this.m = null;
                    this.o = i;
                    this.p = 0;
                    this.q = 4;
                    if (dme.d(dmeVar, aqVar, yhhVar3, this) != hu4Var) {
                        dmeVar5 = dmeVar;
                        pihVarC2 = qihVar.c();
                        qleVar2 = new qle(qihVar, yhhVar3, null, 1);
                        this.e = dmeVar5;
                        this.f = aqVar;
                        this.g = th;
                        this.h = null;
                        this.i = null;
                        this.j = null;
                        this.k = null;
                        this.o = i;
                        this.p = i5;
                        this.q = 5;
                        if (pihVarC2.a(qleVar2, this) != hu4Var) {
                            aqVar4 = aqVar;
                            dmeVar6 = dmeVar5;
                            String str2 = "fail to run request for " + aqVar4 + "/" + aqVar4.getClass();
                            gm0.V(dmeVar6.s, str2, new vid(str2, th));
                            return sbi.a;
                        }
                    }
                }
                return hu4Var;
            }
            if (i4 == 1) {
                i2 = this.p;
                int i6 = this.o;
                z = this.n;
                qih qihVar6 = (qih) this.k;
                aqVar3 = this.j;
                dme dmeVar7 = (dme) this.i;
                qihVar2 = (qih) this.h;
                yle yleVar3 = (yle) this.g;
                dmeVar2 = (dme) this.f;
                aqVar2 = (aq) this.e;
                try {
                    ch3.d0(obj);
                    qihVar = qihVar6;
                    dmeVar = dmeVar7;
                    yleVar = yleVar3;
                    i = i6;
                    objU = obj;
                    try {
                        hihVar = (hih) objU;
                        if (hihVar == null) {
                            str = "nullable request for " + aqVar2;
                            yhhVar = new yhh("app.exception", str, null);
                            this.e = dmeVar2;
                            this.f = qihVar2;
                            this.g = dmeVar;
                            this.h = aqVar3;
                            this.i = qihVar;
                            this.j = null;
                            this.k = null;
                            this.l = str;
                            this.m = yhhVar;
                            this.o = i;
                            this.p = i2;
                            this.q = 2;
                            if (dme.d(dmeVar2, aqVar2, yhhVar, this) == hu4Var) {
                                dmeVar3 = dmeVar2;
                                yhhVar2 = yhhVar;
                                qihVar3 = qihVar2;
                                pihVarC = qihVar3.c();
                                qleVar = new qle(qihVar3, yhhVar2, null, 0);
                                this.e = dmeVar3;
                                this.f = dmeVar;
                                this.g = aqVar3;
                                this.h = qihVar;
                                this.i = null;
                                this.j = null;
                                this.k = str;
                                this.l = null;
                                this.m = null;
                                this.o = i;
                                this.p = i2;
                                this.q = 3;
                                if (pihVarC.a(qleVar, this) != hu4Var) {
                                    i3 = i;
                                    aqVar = aqVar3;
                                    qihVar4 = qihVar;
                                    dmeVar4 = dmeVar3;
                                    gm0.Y(dmeVar4.s, str);
                                }
                            }
                            return hu4Var;
                        }
                        jA = dme.a(dmeVar2, hihVar);
                        if (z) {
                            ((agb) dmeVar2.j().i.get()).j(hihVar, true, jA, yleVar);
                        } else {
                            agbVar = (agb) dmeVar2.j().i.get();
                            if (agbVar == null) {
                                agbVar.j(hihVar, false, jA, yleVar);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aqVar = aqVar3;
                        yhhVar3 = new yhh("app.exception", th.getMessage(), null);
                        this.e = dmeVar;
                        this.f = aqVar;
                        this.g = qihVar;
                        this.h = th;
                        this.i = null;
                        this.j = null;
                        this.k = yhhVar3;
                        this.l = null;
                        this.m = null;
                        this.o = i;
                        this.p = 0;
                        this.q = 4;
                        if (dme.d(dmeVar, aqVar, yhhVar3, this) != hu4Var) {
                            dmeVar5 = dmeVar;
                            pihVarC2 = qihVar.c();
                            qleVar2 = new qle(qihVar, yhhVar3, null, 1);
                            this.e = dmeVar5;
                            this.f = aqVar;
                            this.g = th;
                            this.h = null;
                            this.i = null;
                            this.j = null;
                            this.k = null;
                            this.o = i;
                            this.p = i5;
                            this.q = 5;
                            if (pihVarC2.a(qleVar2, this) != hu4Var) {
                                aqVar4 = aqVar;
                                dmeVar6 = dmeVar5;
                                String str3 = "fail to run request for " + aqVar4 + "/" + aqVar4.getClass();
                                gm0.V(dmeVar6.s, str3, new vid(str3, th));
                                return sbi.a;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    qihVar = qihVar6;
                    dmeVar = dmeVar7;
                    i = i6;
                    aqVar = aqVar3;
                    yhhVar3 = new yhh("app.exception", th.getMessage(), null);
                    this.e = dmeVar;
                    this.f = aqVar;
                    this.g = qihVar;
                    this.h = th;
                    this.i = null;
                    this.j = null;
                    this.k = yhhVar3;
                    this.l = null;
                    this.m = null;
                    this.o = i;
                    this.p = 0;
                    this.q = 4;
                    if (dme.d(dmeVar, aqVar, yhhVar3, this) != hu4Var) {
                        dmeVar5 = dmeVar;
                        pihVarC2 = qihVar.c();
                        qleVar2 = new qle(qihVar, yhhVar3, null, 1);
                        this.e = dmeVar5;
                        this.f = aqVar;
                        this.g = th;
                        this.h = null;
                        this.i = null;
                        this.j = null;
                        this.k = null;
                        this.o = i;
                        this.p = i5;
                        this.q = 5;
                        if (pihVarC2.a(qleVar2, this) != hu4Var) {
                            aqVar4 = aqVar;
                            dmeVar6 = dmeVar5;
                            String str4 = "fail to run request for " + aqVar4 + "/" + aqVar4.getClass();
                            gm0.V(dmeVar6.s, str4, new vid(str4, th));
                            return sbi.a;
                        }
                    }
                    return hu4Var;
                }
            } else {
                if (i4 == 2) {
                    int i7 = this.p;
                    int i8 = this.o;
                    yhhVar2 = this.m;
                    String str5 = this.l;
                    qih qihVar7 = (qih) this.i;
                    aq aqVar5 = (aq) this.h;
                    dme dmeVar8 = (dme) this.g;
                    qihVar3 = (qih) this.f;
                    dmeVar3 = (dme) this.e;
                    try {
                        ch3.d0(obj);
                        qihVar = qihVar7;
                        aqVar3 = aqVar5;
                        i = i8;
                        i2 = i7;
                        str = str5;
                        dmeVar = dmeVar8;
                        pihVarC = qihVar3.c();
                        qleVar = new qle(qihVar3, yhhVar2, null, 0);
                        this.e = dmeVar3;
                        this.f = dmeVar;
                        this.g = aqVar3;
                        this.h = qihVar;
                        this.i = null;
                        this.j = null;
                        this.k = str;
                        this.l = null;
                        this.m = null;
                        this.o = i;
                        this.p = i2;
                        this.q = 3;
                        if (pihVarC.a(qleVar, this) != hu4Var) {
                            i3 = i;
                            aqVar = aqVar3;
                            qihVar4 = qihVar;
                            dmeVar4 = dmeVar3;
                            gm0.Y(dmeVar4.s, str);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i = i8;
                        aqVar = aqVar5;
                        dmeVar = dmeVar8;
                        qihVar = qihVar7;
                        yhhVar3 = new yhh("app.exception", th.getMessage(), null);
                        this.e = dmeVar;
                        this.f = aqVar;
                        this.g = qihVar;
                        this.h = th;
                        this.i = null;
                        this.j = null;
                        this.k = yhhVar3;
                        this.l = null;
                        this.m = null;
                        this.o = i;
                        this.p = 0;
                        this.q = 4;
                        if (dme.d(dmeVar, aqVar, yhhVar3, this) != hu4Var) {
                            dmeVar5 = dmeVar;
                            pihVarC2 = qihVar.c();
                            qleVar2 = new qle(qihVar, yhhVar3, null, 1);
                            this.e = dmeVar5;
                            this.f = aqVar;
                            this.g = th;
                            this.h = null;
                            this.i = null;
                            this.j = null;
                            this.k = null;
                            this.o = i;
                            this.p = i5;
                            this.q = 5;
                            if (pihVarC2.a(qleVar2, this) != hu4Var) {
                                aqVar4 = aqVar;
                                dmeVar6 = dmeVar5;
                                String str6 = "fail to run request for " + aqVar4 + "/" + aqVar4.getClass();
                                gm0.V(dmeVar6.s, str6, new vid(str6, th));
                                return sbi.a;
                            }
                        }
                    }
                    return hu4Var;
                }
                if (i4 != 3) {
                    if (i4 == 4) {
                        i5 = this.p;
                        int i9 = this.o;
                        yhhVar3 = (yhh) this.k;
                        Throwable th5 = (Throwable) this.h;
                        qih qihVar8 = (qih) this.g;
                        aqVar = (aq) this.f;
                        dmeVar5 = (dme) this.e;
                        ch3.d0(obj);
                        qihVar = qihVar8;
                        i = i9;
                        th = th5;
                        pihVarC2 = qihVar.c();
                        qleVar2 = new qle(qihVar, yhhVar3, null, 1);
                        this.e = dmeVar5;
                        this.f = aqVar;
                        this.g = th;
                        this.h = null;
                        this.i = null;
                        this.j = null;
                        this.k = null;
                        this.o = i;
                        this.p = i5;
                        this.q = 5;
                        if (pihVarC2.a(qleVar2, this) != hu4Var) {
                            aqVar4 = aqVar;
                            dmeVar6 = dmeVar5;
                        }
                        return hu4Var;
                    }
                    if (i4 != 5) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) this.g;
                    aqVar4 = (aq) this.f;
                    dmeVar6 = (dme) this.e;
                    ch3.d0(obj);
                    String str7 = "fail to run request for " + aqVar4 + "/" + aqVar4.getClass();
                    gm0.V(dmeVar6.s, str7, new vid(str7, th));
                } else {
                    i3 = this.o;
                    str = (String) this.k;
                    qihVar4 = (qih) this.h;
                    aqVar = (aq) this.g;
                    dmeVar = (dme) this.f;
                    dmeVar4 = (dme) this.e;
                    try {
                        ch3.d0(obj);
                        gm0.Y(dmeVar4.s, str);
                    } catch (Throwable th6) {
                        th = th6;
                        qihVar = qihVar4;
                        i = i3;
                        yhhVar3 = new yhh("app.exception", th.getMessage(), null);
                        this.e = dmeVar;
                        this.f = aqVar;
                        this.g = qihVar;
                        this.h = th;
                        this.i = null;
                        this.j = null;
                        this.k = yhhVar3;
                        this.l = null;
                        this.m = null;
                        this.o = i;
                        this.p = 0;
                        this.q = 4;
                        if (dme.d(dmeVar, aqVar, yhhVar3, this) != hu4Var) {
                            dmeVar5 = dmeVar;
                            pihVarC2 = qihVar.c();
                            qleVar2 = new qle(qihVar, yhhVar3, null, 1);
                            this.e = dmeVar5;
                            this.f = aqVar;
                            this.g = th;
                            this.h = null;
                            this.i = null;
                            this.j = null;
                            this.k = null;
                            this.o = i;
                            this.p = i5;
                            this.q = 5;
                            if (pihVarC2.a(qleVar2, this) != hu4Var) {
                                aqVar4 = aqVar;
                                dmeVar6 = dmeVar5;
                                String str8 = "fail to run request for " + aqVar4 + "/" + aqVar4.getClass();
                                gm0.V(dmeVar6.s, str8, new vid(str8, th));
                            }
                        }
                        return hu4Var;
                    }
                }
            }
            return sbi.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
