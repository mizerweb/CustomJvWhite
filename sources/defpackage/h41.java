package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class h41 implements qbj {
    public Object a = r41.p;
    public ek2 b;
    public final /* synthetic */ p41 c;

    public h41(p41 p41Var) {
        this.c = p41Var;
    }

    @Override // defpackage.qbj
    public final void a(gcf gcfVar, int i) {
        ek2 ek2Var = this.b;
        if (ek2Var != null) {
            ek2Var.a(gcfVar, i);
        }
    }

    public final Object b(nq4 nq4Var) throws Throwable {
        es2 es2VarQ;
        Boolean bool;
        Object obj = this.a;
        boolean z = true;
        if (obj == r41.p || obj == r41.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p41.i;
            p41 p41Var = this.c;
            es2 es2Var = (es2) atomicReferenceFieldUpdater.get(p41Var);
            while (!p41Var.C()) {
                long andIncrement = p41.e.getAndIncrement(p41Var);
                long j = r41.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (es2Var.e != j2) {
                    es2VarQ = p41Var.q(j2, es2Var);
                    if (es2VarQ == null) {
                        continue;
                    }
                } else {
                    es2VarQ = es2Var;
                }
                Object objS = p41Var.S(es2VarQ, i, andIncrement, null);
                c5b c5bVar = r41.m;
                f41 f41Var = null;
                if (objS == c5bVar) {
                    ore.k("unreachable");
                    return null;
                }
                c5b c5bVar2 = r41.o;
                if (objS == c5bVar2) {
                    if (andIncrement < p41Var.w()) {
                        es2VarQ.a();
                    }
                    es2Var = es2VarQ;
                } else {
                    if (objS == r41.n) {
                        p41 p41Var2 = this.c;
                        ek2 ek2VarR = wk8.r(p90.B(nq4Var));
                        try {
                            this.b = ek2VarR;
                            Object objS2 = p41Var2.S(es2VarQ, i, andIncrement, this);
                            cf7 cf7Var = p41Var2.b;
                            if (objS2 != c5bVar) {
                                if (objS2 == c5bVar2) {
                                    if (andIncrement < p41Var2.w()) {
                                        es2VarQ.a();
                                    }
                                    es2 es2Var2 = (es2) p41.i.get(p41Var2);
                                    while (true) {
                                        if (p41Var2.C()) {
                                            ek2 ek2Var = this.b;
                                            this.b = null;
                                            this.a = r41.l;
                                            Throwable thS = p41Var.s();
                                            if (thS != null) {
                                                ek2Var.resumeWith(new poe(thS));
                                                break;
                                            }
                                            ek2Var.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = p41.e.getAndIncrement(p41Var2);
                                        long j3 = r41.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (es2Var2.e != j4) {
                                            es2 es2VarQ2 = p41Var2.q(j4, es2Var2);
                                            if (es2VarQ2 != null) {
                                                es2Var2 = es2VarQ2;
                                            }
                                        }
                                        Object objS3 = p41Var2.S(es2Var2, i2, andIncrement2, this);
                                        if (objS3 == r41.m) {
                                            a(es2Var2, i2);
                                            break;
                                        }
                                        if (objS3 == r41.o) {
                                            if (andIncrement2 < p41Var2.w()) {
                                                es2Var2.a();
                                            }
                                        } else {
                                            if (objS3 == r41.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            es2Var2.a();
                                            this.a = objS3;
                                            this.b = null;
                                            bool = Boolean.TRUE;
                                            if (cf7Var != null) {
                                                f41Var = new f41(objS3, cf7Var);
                                            }
                                        }
                                    }
                                } else {
                                    es2VarQ.a();
                                    this.a = objS2;
                                    this.b = null;
                                    bool = Boolean.TRUE;
                                    if (cf7Var != null) {
                                        f41Var = new f41(objS2, cf7Var);
                                    }
                                }
                                ek2VarR.j(bool, f41Var);
                                break;
                            }
                            a(es2VarQ, i);
                            return ek2VarR.s();
                        } catch (Throwable th) {
                            ek2VarR.B();
                            throw th;
                        }
                    }
                    es2VarQ.a();
                    this.a = objS;
                }
            }
            this.a = r41.l;
            Throwable thS2 = p41Var.s();
            if (thS2 != null) {
                int i3 = kgg.a;
                throw thS2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c() throws Throwable {
        Object obj = this.a;
        c5b c5bVar = r41.p;
        if (obj == c5bVar) {
            ore.k("`hasNext()` has not been invoked");
            return null;
        }
        this.a = c5bVar;
        if (obj != r41.l) {
            return obj;
        }
        Throwable thU = this.c.u();
        int i = kgg.a;
        throw thU;
    }
}
