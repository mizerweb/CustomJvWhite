package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hqc {
    public final gu4 a;
    public final xt4 b;
    public final jsa c;
    public final l9b d = new l9b();
    public gj2 e;
    public long f;

    public hqc(dq4 dq4Var, xt4 xt4Var, jsa jsaVar) {
        this.a = dq4Var;
        this.b = xt4Var;
        this.c = jsaVar;
    }

    public final Object a(Long l, nq4 nq4Var) {
        gj2 gj2Var = this.e;
        boolean z = l == null || (gj2Var != null && gj2Var.b == l.longValue());
        if (gj2Var != null && z) {
            this.e = null;
            Object objU0 = this.c.u0((luk) gj2Var.c, nq4Var);
            if (objU0 == hu4.a) {
                return objU0;
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(luk lukVar, nq4 nq4Var) throws Throwable {
        gqc gqcVar;
        j9b j9bVar;
        int i;
        luk lukVar2;
        int i2;
        j9b j9bVar2;
        Object objA;
        if (nq4Var instanceof gqc) {
            gqcVar = (gqc) nq4Var;
            int i3 = gqcVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gqcVar.j = i3 - Integer.MIN_VALUE;
            } else {
                gqcVar = new gqc(this, nq4Var);
            }
        } else {
            gqcVar = new gqc(this, nq4Var);
        }
        Object obj = gqcVar.h;
        int i4 = gqcVar.j;
        Object obj2 = sbi.a;
        int i5 = 0;
        Object obj3 = hu4.a;
        try {
            if (i4 == 0) {
                ch3.d0(obj);
                gqcVar.d = lukVar;
                j9bVar = this.d;
                gqcVar.e = j9bVar;
                gqcVar.f = 0;
                gqcVar.j = 1;
                if (j9bVar.b(gqcVar) != obj3) {
                    i = 0;
                }
                return obj3;
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    i5 = gqcVar.g;
                    i2 = gqcVar.f;
                    j9b j9bVar3 = gqcVar.e;
                    lukVar2 = gqcVar.d;
                    try {
                        ch3.d0(obj);
                        j9bVar = j9bVar3;
                        long j = this.f + 1;
                        this.f = j;
                        this.e = new gj2(j, lukVar2, 7);
                        jsa jsaVar = this.c;
                        gqcVar.d = null;
                        gqcVar.e = j9bVar;
                        gqcVar.f = i2;
                        gqcVar.g = i5;
                        gqcVar.j = 3;
                        try {
                            a8j.x(jsaVar.E2, new v1g(j, lukVar2.d(), lukVar2 instanceof yqa));
                            objA = jsaVar.W().a(new kc(lukVar2.c(), lukVar2.b()), gqcVar);
                            if (objA != obj3) {
                                objA = obj2;
                            }
                            if (objA != obj3) {
                                j9bVar2 = j9bVar;
                            }
                            return obj3;
                        } catch (Throwable th) {
                            th = th;
                            j9bVar2 = j9bVar;
                            j9bVar2.g(null);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j9bVar2 = j9bVar3;
                    }
                } else {
                    if (i4 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j9bVar2 = gqcVar.e;
                    try {
                        ch3.d0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                j9bVar2.g(null);
                throw th;
            }
            int i6 = gqcVar.f;
            j9b j9bVar4 = gqcVar.e;
            luk lukVar3 = gqcVar.d;
            ch3.d0(obj);
            j9bVar = j9bVar4;
            i = i6;
            lukVar = lukVar3;
            j9bVar2.g(null);
            return obj2;
            gqcVar.d = lukVar;
            gqcVar.e = j9bVar;
            gqcVar.f = i;
            gqcVar.g = 0;
            gqcVar.j = 2;
            if (a(null, gqcVar) != obj3) {
                lukVar2 = lukVar;
                i2 = i;
                long j2 = this.f + 1;
                this.f = j2;
                this.e = new gj2(j2, lukVar2, 7);
                jsa jsaVar2 = this.c;
                gqcVar.d = null;
                gqcVar.e = j9bVar;
                gqcVar.f = i2;
                gqcVar.g = i5;
                gqcVar.j = 3;
                a8j.x(jsaVar2.E2, new v1g(j2, lukVar2.d(), lukVar2 instanceof yqa));
                objA = jsaVar2.W().a(new kc(lukVar2.c(), lukVar2.b()), gqcVar);
                if (objA != obj3) {
                    objA = obj2;
                }
                if (objA != obj3) {
                    j9bVar2 = j9bVar;
                    j9bVar2.g(null);
                    return obj2;
                }
            }
            return obj3;
        } catch (Throwable th4) {
            th = th4;
            j9bVar2 = j9bVar;
            j9bVar2.g(null);
            throw th;
        }
    }
}
