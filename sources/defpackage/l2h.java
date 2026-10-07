package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l2h extends mdh implements qf7 {
    public yf5 e;
    public q2h f;
    public kwg g;
    public Object h;
    public Object i;
    public p2h j;
    public long k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ p2h n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2h(p2h p2hVar, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.n = p2hVar;
        this.o = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        l2h l2hVar = new l2h(this.n, this.o, lq4Var);
        l2hVar.m = obj;
        return l2hVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((l2h) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:34:0x00e1, B:37:0x00e6, B:39:0x00ee), top: B:69:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x011c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0140  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        yf5 yf5VarH;
        Object objP;
        Object objZ0;
        q2h q2hVar;
        kwg kwgVar;
        p2h p2hVar;
        j9b j9bVar;
        long j;
        p2h p2hVar2;
        long j2;
        q2h q2hVar2;
        kwg kwgVar2;
        Long l;
        Object objJ;
        kwg kwgVar3;
        q2h q2hVar3;
        kwg kwgVar4;
        p2h p2hVar3;
        j9b j9bVar2;
        long j3;
        q2h q2hVar4;
        long j4;
        Long l2;
        gu4 gu4Var = (gu4) this.m;
        hu4 hu4Var = hu4.a;
        int i = this.l;
        u8b u8bVar = null;
        if (i == 0) {
            ch3.d0(obj);
            Long l3 = this.n.c;
            long j5 = this.o;
            if (l3 == null || l3.longValue() != j5) {
                return null;
            }
            yf5 yf5VarH2 = yab.h(gu4Var, null, 0, new k2h(this.n, this.o, null, 0), 3);
            yf5VarH = yab.h(gu4Var, null, 0, new k2h(this.n, this.o, null, 1), 3);
            this.m = null;
            this.e = yf5VarH;
            this.l = 1;
            objP = yf5VarH2.p(this);
            if (objP != hu4Var) {
            }
            return hu4Var;
        }
        try {
            if (i == 1) {
                yf5VarH = this.e;
                ch3.d0(obj);
                objP = obj;
            } else {
                if (i == 2) {
                    q2h q2hVar5 = this.f;
                    ch3.d0(obj);
                    q2hVar = q2hVar5;
                    objZ0 = obj;
                    kwgVar = (kwg) objZ0;
                    p2hVar = this.n;
                    j9bVar = p2hVar.b;
                    j = this.o;
                    this.m = null;
                    this.e = null;
                    this.f = q2hVar;
                    this.g = kwgVar;
                    this.h = j9bVar;
                    this.i = p2hVar;
                    this.k = j;
                    this.l = 3;
                    if (j9bVar.b(this) != hu4Var) {
                        p2hVar2 = p2hVar;
                        j2 = j;
                        q2hVar2 = q2hVar;
                        kwgVar2 = kwgVar;
                        l = p2hVar2.c;
                        if (l == null) {
                            p2hVar2.d = kwgVar2.b;
                        }
                        j9bVar.g(null);
                        if (q2hVar2.b > 0) {
                            aj5 aj5Var = this.n.a;
                            long j6 = this.o;
                            this.m = null;
                            this.e = null;
                            this.f = q2hVar2;
                            this.g = kwgVar2;
                            this.h = null;
                            this.i = null;
                            this.l = 4;
                            objJ = aj5Var.j(j6, true, 0L, this);
                            if (objJ != hu4Var) {
                                kwgVar3 = kwgVar2;
                                q2hVar3 = q2hVar2;
                                kwgVar4 = (kwg) objJ;
                                p2hVar3 = this.n;
                                j9bVar2 = p2hVar3.b;
                                j3 = this.o;
                                this.m = null;
                                this.e = null;
                                this.f = q2hVar3;
                                this.g = kwgVar3;
                                this.h = kwgVar4;
                                this.i = j9bVar2;
                                this.j = p2hVar3;
                                this.k = j3;
                                this.l = 5;
                                if (j9bVar2.b(this) != hu4Var) {
                                    q2hVar4 = q2hVar3;
                                    j4 = j3;
                                }
                            }
                        }
                        return new j2h(q2hVar2, kwgVar2.a, u8bVar);
                    }
                    return hu4Var;
                }
                if (i == 3) {
                    j2 = this.k;
                    p2hVar2 = (p2h) this.i;
                    j9bVar = (j9b) this.h;
                    kwgVar = this.g;
                    q2hVar = this.f;
                    ch3.d0(obj);
                    q2hVar2 = q2hVar;
                    kwgVar2 = kwgVar;
                    try {
                        l = p2hVar2.c;
                        if (l == null && l.longValue() == j2) {
                            p2hVar2.d = kwgVar2.b;
                        }
                        j9bVar.g(null);
                        if (q2hVar2.b > 0) {
                            aj5 aj5Var2 = this.n.a;
                            long j7 = this.o;
                            this.m = null;
                            this.e = null;
                            this.f = q2hVar2;
                            this.g = kwgVar2;
                            this.h = null;
                            this.i = null;
                            this.l = 4;
                            objJ = aj5Var2.j(j7, true, 0L, this);
                            if (objJ != hu4Var) {
                                kwgVar3 = kwgVar2;
                                q2hVar3 = q2hVar2;
                                kwgVar4 = (kwg) objJ;
                                p2hVar3 = this.n;
                                j9bVar2 = p2hVar3.b;
                                j3 = this.o;
                                this.m = null;
                                this.e = null;
                                this.f = q2hVar3;
                                this.g = kwgVar3;
                                this.h = kwgVar4;
                                this.i = j9bVar2;
                                this.j = p2hVar3;
                                this.k = j3;
                                this.l = 5;
                                if (j9bVar2.b(this) != hu4Var) {
                                    q2hVar4 = q2hVar3;
                                    j4 = j3;
                                }
                            }
                            return hu4Var;
                        }
                        return new j2h(q2hVar2, kwgVar2.a, u8bVar);
                    } catch (Throwable th) {
                        j9bVar.g(null);
                        throw th;
                    }
                }
                if (i == 4) {
                    kwg kwgVar5 = this.g;
                    q2hVar3 = this.f;
                    ch3.d0(obj);
                    kwgVar3 = kwgVar5;
                    objJ = obj;
                    kwgVar4 = (kwg) objJ;
                    p2hVar3 = this.n;
                    j9bVar2 = p2hVar3.b;
                    j3 = this.o;
                    this.m = null;
                    this.e = null;
                    this.f = q2hVar3;
                    this.g = kwgVar3;
                    this.h = kwgVar4;
                    this.i = j9bVar2;
                    this.j = p2hVar3;
                    this.k = j3;
                    this.l = 5;
                    if (j9bVar2.b(this) != hu4Var) {
                        q2hVar4 = q2hVar3;
                        j4 = j3;
                    }
                    return hu4Var;
                }
                if (i != 5) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = this.k;
                p2hVar3 = this.j;
                j9bVar2 = (j9b) this.i;
                kwgVar4 = (kwg) this.h;
                kwgVar3 = this.g;
                q2hVar4 = this.f;
                ch3.d0(obj);
            }
            l2 = p2hVar3.c;
            if (l2 != null && l2.longValue() == j4) {
                p2hVar3.e = kwgVar4.b;
            }
            j9bVar2.g(null);
            u8bVar = kwgVar4.a;
            kwgVar2 = kwgVar3;
            q2hVar2 = q2hVar4;
            return new j2h(q2hVar2, kwgVar2.a, u8bVar);
        } catch (Throwable th2) {
            j9bVar2.g(null);
            throw th2;
        }
        q2h q2hVar6 = (q2h) objP;
        this.m = null;
        this.e = null;
        this.f = q2hVar6;
        this.l = 2;
        objZ0 = yf5VarH.z0(this);
        if (objZ0 != hu4Var) {
            q2hVar = q2hVar6;
            kwgVar = (kwg) objZ0;
            p2hVar = this.n;
            j9bVar = p2hVar.b;
            j = this.o;
            this.m = null;
            this.e = null;
            this.f = q2hVar;
            this.g = kwgVar;
            this.h = j9bVar;
            this.i = p2hVar;
            this.k = j;
            this.l = 3;
            if (j9bVar.b(this) != hu4Var) {
                p2hVar2 = p2hVar;
                j2 = j;
                q2hVar2 = q2hVar;
                kwgVar2 = kwgVar;
                l = p2hVar2.c;
                if (l == null) {
                    p2hVar2.d = kwgVar2.b;
                }
                j9bVar.g(null);
                if (q2hVar2.b > 0) {
                    aj5 aj5Var3 = this.n.a;
                    long j8 = this.o;
                    this.m = null;
                    this.e = null;
                    this.f = q2hVar2;
                    this.g = kwgVar2;
                    this.h = null;
                    this.i = null;
                    this.l = 4;
                    objJ = aj5Var3.j(j8, true, 0L, this);
                    if (objJ != hu4Var) {
                        kwgVar3 = kwgVar2;
                        q2hVar3 = q2hVar2;
                        kwgVar4 = (kwg) objJ;
                        p2hVar3 = this.n;
                        j9bVar2 = p2hVar3.b;
                        j3 = this.o;
                        this.m = null;
                        this.e = null;
                        this.f = q2hVar3;
                        this.g = kwgVar3;
                        this.h = kwgVar4;
                        this.i = j9bVar2;
                        this.j = p2hVar3;
                        this.k = j3;
                        this.l = 5;
                        if (j9bVar2.b(this) != hu4Var) {
                            q2hVar4 = q2hVar3;
                            j4 = j3;
                            l2 = p2hVar3.c;
                            if (l2 != null) {
                                p2hVar3.e = kwgVar4.b;
                            }
                            j9bVar2.g(null);
                            u8bVar = kwgVar4.a;
                            kwgVar2 = kwgVar3;
                            q2hVar2 = q2hVar4;
                        }
                    }
                }
                return new j2h(q2hVar2, kwgVar2.a, u8bVar);
            }
        }
        return hu4Var;
    }
}
