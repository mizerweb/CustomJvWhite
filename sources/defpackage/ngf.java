package defpackage;

import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class ngf {
    public final String a = ngf.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;

    public ngf(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Serializable a(ngf ngfVar, q24 q24Var, long j, ija ijaVar, s5e s5eVar, nq4 nq4Var) {
        mgf mgfVar;
        if (nq4Var instanceof mgf) {
            mgfVar = (mgf) nq4Var;
            int i = mgfVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mgfVar.f = i - Integer.MIN_VALUE;
            } else {
                mgfVar = new mgf(ngfVar, nq4Var);
            }
        } else {
            mgfVar = new mgf(ngfVar, nq4Var);
        }
        mgf mgfVar2 = mgfVar;
        Object objE = mgfVar2.d;
        int i2 = mgfVar2.f;
        if (i2 == 0) {
            ch3.d0(objE);
            d4b d4bVar = new d4b(q24Var.a, j, new dja(ijaVar, s5eVar.a.toString()), new Long(q24Var.b));
            pvb pvbVar = (pvb) ngfVar.b.getValue();
            String str = ngfVar.a;
            onf onfVar = (onf) ngfVar.f.getValue();
            mgfVar2.f = 1;
            objE = qe7.E(pvbVar, d4bVar, str, 0L, 5, onfVar, null, mgfVar2, 68);
            hu4 hu4Var = hu4.a;
            if (objE == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objE);
        }
        e4b e4bVar = (e4b) objE;
        if (e4bVar != null) {
            return e4bVar.c;
        }
        ore.p("Required value was null.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x018c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0193  */
    /* JADX WARN: Code duplicated, block: B:81:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01da  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ed A[Catch: all -> 0x0241, CancellationException -> 0x027b, TRY_LEAVE, TryCatch #1 {all -> 0x0241, blocks: (B:90:0x01de, B:93:0x01ed), top: B:128:0x01de }] */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x019d, please report this as an issue */
    public final Object b(q24 q24Var, long j, s5e s5eVar, ija ijaVar, nq4 nq4Var) {
        lgf lgfVar;
        s5e s5eVar2;
        q24 q24Var2;
        ija ijaVar2;
        sbi sbiVar;
        je9 je9Var;
        s5e s5eVar3;
        q24 q24Var3;
        long j2;
        long j3;
        String str;
        a4c a4cVar;
        String str2;
        je9 je9Var2;
        q24 q24Var4;
        ija ijaVar3;
        long j4;
        je9 je9Var3;
        q24 q24Var5;
        int i;
        long j5;
        long j6;
        int i2;
        hja hjaVar;
        String str3;
        a4c a4cVar2;
        hz3 hz3Var;
        q24 q24Var6;
        ngf ngfVar = this;
        long j7 = j;
        je9 je9Var4 = je9.f;
        sbi sbiVar2 = sbi.a;
        je9 je9Var5 = je9.d;
        if (nq4Var instanceof lgf) {
            lgfVar = (lgf) nq4Var;
            int i3 = lgfVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lgfVar.m = i3 - Integer.MIN_VALUE;
            } else {
                lgfVar = new lgf(ngfVar, nq4Var);
            }
        } else {
            lgfVar = new lgf(ngfVar, nq4Var);
        }
        lgf lgfVar2 = lgfVar;
        Object objR = lgfVar2.k;
        hu4 hu4Var = hu4.a;
        int i4 = lgfVar2.m;
        String str4 = ":";
        try {
            try {
                if (i4 == 0) {
                    ch3.d0(objR);
                    l34 l34Var = (l34) ngfVar.c.getValue();
                    lgfVar2.d = q24Var;
                    s5eVar2 = s5eVar;
                    lgfVar2.e = s5eVar2;
                    lgfVar2.f = ijaVar;
                    lgfVar2.g = j7;
                    lgfVar2.m = 1;
                    objR = l34Var.r(j7, lgfVar2);
                    if (objR != hu4Var) {
                        q24Var2 = q24Var;
                        ijaVar2 = ijaVar;
                    }
                    return hu4Var;
                }
                if (i4 == 1) {
                    j7 = lgfVar2.g;
                    ijaVar2 = lgfVar2.f;
                    s5eVar2 = lgfVar2.e;
                    q24Var2 = lgfVar2.d;
                    ch3.d0(objR);
                } else {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            int i5 = lgfVar2.j;
                            int i6 = lgfVar2.i;
                            long j8 = lgfVar2.h;
                            j2 = lgfVar2.g;
                            q24 q24Var7 = lgfVar2.d;
                            try {
                                ch3.d0(objR);
                                q24Var5 = q24Var7;
                                j5 = j8;
                                sbiVar = sbiVar2;
                                str2 = "send reaction response: reactionInfoTotalCount = ";
                                je9Var2 = je9Var4;
                                i = i5;
                                i2 = i6;
                                j6 = j2;
                                try {
                                    hjaVar = (hja) objR;
                                    str3 = ngfVar.a;
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 != null && a4cVar2.b(je9Var5)) {
                                        str4 = ":";
                                        try {
                                            je9Var3 = je9Var2;
                                            try {
                                                a4cVar2.c(je9Var5, str3, str2 + hjaVar.b, null);
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            je9Var3 = je9Var2;
                                        }
                                    } else {
                                        je9Var3 = je9Var2;
                                        str4 = ":";
                                    }
                                    hz3Var = (hz3) ngfVar.d.getValue();
                                    lgfVar2.d = q24Var5;
                                    lgfVar2.e = null;
                                    lgfVar2.f = null;
                                    lgfVar2.g = j6;
                                    lgfVar2.h = j5;
                                    lgfVar2.i = i2;
                                    lgfVar2.j = i;
                                    lgfVar2.m = 4;
                                    q24Var6 = q24Var5;
                                    try {
                                        if (hz3Var.D(q24Var6, j5, hjaVar, lgfVar2) == hu4Var) {
                                            return hu4Var;
                                        }
                                        return sbiVar;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        q24Var5 = q24Var6;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    je9Var3 = je9Var2;
                                    str4 = ":";
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                q24Var5 = q24Var7;
                                je9Var3 = je9Var4;
                                sbiVar = sbiVar2;
                                j6 = j2;
                            }
                        } else {
                            if (i4 != 4) {
                                ore.k("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j6 = lgfVar2.g;
                            q24Var5 = lgfVar2.d;
                            try {
                                ch3.d0(objR);
                                return sbiVar2;
                            } catch (Throwable th6) {
                                th = th6;
                                je9Var3 = je9Var4;
                                sbiVar = sbiVar2;
                            }
                        }
                        str4 = ":";
                        String str5 = ngfVar.a;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 == null) {
                            return sbiVar;
                        }
                        je9 je9Var6 = je9Var3;
                        if (!a4cVar3.b(je9Var6)) {
                            return sbiVar;
                        }
                        a4cVar3.c(je9Var6, str5, "send reaction error for " + q24Var5 + str4 + j6, th);
                        return sbiVar;
                    }
                    j3 = lgfVar2.h;
                    j2 = lgfVar2.g;
                    ijaVar2 = lgfVar2.f;
                    s5eVar3 = lgfVar2.e;
                    q24Var3 = lgfVar2.d;
                    try {
                        ch3.d0(objR);
                        je9Var = je9Var4;
                        sbiVar = sbiVar2;
                        q24 q24Var8 = q24Var3;
                        ijaVar3 = ijaVar2;
                        j4 = j3;
                        q24Var4 = q24Var8;
                        str2 = "send reaction response: reactionInfoTotalCount = ";
                        je9Var2 = je9Var;
                    } catch (Throwable th7) {
                        th = th7;
                        je9Var = je9Var4;
                        sbiVar = sbiVar2;
                        str = ngfVar.a;
                        a4cVar = gm0.f;
                        if (a4cVar == null) {
                            str2 = "send reaction response: reactionInfoTotalCount = ";
                            je9Var2 = je9Var;
                        } else {
                            str2 = "send reaction response: reactionInfoTotalCount = ";
                            je9Var2 = je9Var;
                            if (a4cVar.b(je9Var2)) {
                                a4cVar.c(je9Var2, str, "commentReactionsUpdateLogic.updateBySelfReaction fail $" + q24Var3 + ":" + j2, th);
                            }
                        }
                        q24Var4 = q24Var3;
                        ijaVar3 = ijaVar2;
                        j4 = j3;
                    }
                    try {
                        lgfVar2.d = q24Var4;
                        lgfVar2.e = null;
                        lgfVar2.f = null;
                        lgfVar2.g = j2;
                        lgfVar2.h = j4;
                        i = 0;
                        lgfVar2.i = 0;
                        lgfVar2.j = 0;
                        lgfVar2.m = 3;
                        ngfVar = this;
                        try {
                            objR = a(ngfVar, q24Var4, j4, ijaVar3, s5eVar3, lgfVar2);
                            if (objR != hu4Var) {
                                j5 = j4;
                                q24Var5 = q24Var4;
                                j6 = j2;
                                i2 = 0;
                                hjaVar = (hja) objR;
                                str3 = ngfVar.a;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    str4 = ":";
                                    je9Var3 = je9Var2;
                                    a4cVar2.c(je9Var5, str3, str2 + hjaVar.b, null);
                                    hz3Var = (hz3) ngfVar.d.getValue();
                                    lgfVar2.d = q24Var5;
                                    lgfVar2.e = null;
                                    lgfVar2.f = null;
                                    lgfVar2.g = j6;
                                    lgfVar2.h = j5;
                                    lgfVar2.i = i2;
                                    lgfVar2.j = i;
                                    lgfVar2.m = 4;
                                    q24Var6 = q24Var5;
                                    if (hz3Var.D(q24Var6, j5, hjaVar, lgfVar2) == hu4Var) {
                                        return sbiVar;
                                    }
                                }
                                je9Var3 = je9Var2;
                                str4 = ":";
                                hz3Var = (hz3) ngfVar.d.getValue();
                                lgfVar2.d = q24Var5;
                                lgfVar2.e = null;
                                lgfVar2.f = null;
                                lgfVar2.g = j6;
                                lgfVar2.h = j5;
                                lgfVar2.i = i2;
                                lgfVar2.j = i;
                                lgfVar2.m = 4;
                                q24Var6 = q24Var5;
                                if (hz3Var.D(q24Var6, j5, hjaVar, lgfVar2) == hu4Var) {
                                    return sbiVar;
                                }
                            }
                            return hu4Var;
                        } catch (Throwable th8) {
                            th = th8;
                            je9Var3 = je9Var2;
                            q24Var5 = q24Var4;
                            j6 = j2;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        ngfVar = this;
                    }
                }
                ky3 ky3Var = (ky3) objR;
                if (ky3Var == null) {
                    String str6 = ngfVar.a;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null && a4cVar4.b(je9Var5)) {
                        a4cVar4.c(je9Var5, str6, nbh.s(j7, "comment ", " not found"), null);
                        return sbiVar2;
                    }
                    return sbiVar2;
                }
                sbiVar = sbiVar2;
                if (ky3Var.j == wja.DELETED) {
                    String str7 = ngfVar.a;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 == null || !a4cVar5.b(je9Var5)) {
                        return sbiVar;
                    }
                    a4cVar5.c(je9Var5, str7, nbh.s(j7, "comment ", " deleted"), null);
                    return sbiVar;
                }
                je9Var = je9Var4;
                long j9 = ky3Var.b;
                if (j9 == 0) {
                    String str8 = ngfVar.a;
                    a4c a4cVar6 = gm0.f;
                    if (a4cVar6 == null || !a4cVar6.b(je9Var5)) {
                        return sbiVar;
                    }
                    a4cVar6.c(je9Var5, str8, nbh.s(j7, "comment ", " has no serverId"), null);
                    return sbiVar;
                }
                try {
                    hz3 hz3Var2 = (hz3) ngfVar.d.getValue();
                    ((lja) ngfVar.e.getValue()).getClass();
                    z5e z5eVar = new z5e(xml.d(ijaVar2.a()), s5eVar2);
                    lgfVar2.d = q24Var2;
                    lgfVar2.e = s5eVar2;
                    lgfVar2.f = ijaVar2;
                    lgfVar2.g = j7;
                    lgfVar2.h = j9;
                    lgfVar2.i = 0;
                    lgfVar2.j = 0;
                    lgfVar2.m = 2;
                    if (hz3Var2.u(j7, z5eVar, lgfVar2) != hu4Var) {
                        s5eVar3 = s5eVar2;
                        q24Var3 = q24Var2;
                        j2 = j7;
                        j3 = j9;
                        q24 q24Var9 = q24Var3;
                        ijaVar3 = ijaVar2;
                        j4 = j3;
                        q24Var4 = q24Var9;
                        str2 = "send reaction response: reactionInfoTotalCount = ";
                        je9Var2 = je9Var;
                        lgfVar2.d = q24Var4;
                        lgfVar2.e = null;
                        lgfVar2.f = null;
                        lgfVar2.g = j2;
                        lgfVar2.h = j4;
                        i = 0;
                        lgfVar2.i = 0;
                        lgfVar2.j = 0;
                        lgfVar2.m = 3;
                        ngfVar = this;
                        objR = a(ngfVar, q24Var4, j4, ijaVar3, s5eVar3, lgfVar2);
                        if (objR != hu4Var) {
                            j5 = j4;
                            q24Var5 = q24Var4;
                            j6 = j2;
                            i2 = 0;
                            hjaVar = (hja) objR;
                            str3 = ngfVar.a;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                str4 = ":";
                                je9Var3 = je9Var2;
                                a4cVar2.c(je9Var5, str3, str2 + hjaVar.b, null);
                                hz3Var = (hz3) ngfVar.d.getValue();
                                lgfVar2.d = q24Var5;
                                lgfVar2.e = null;
                                lgfVar2.f = null;
                                lgfVar2.g = j6;
                                lgfVar2.h = j5;
                                lgfVar2.i = i2;
                                lgfVar2.j = i;
                                lgfVar2.m = 4;
                                q24Var6 = q24Var5;
                                if (hz3Var.D(q24Var6, j5, hjaVar, lgfVar2) == hu4Var) {
                                    return sbiVar;
                                }
                            }
                            je9Var3 = je9Var2;
                            str4 = ":";
                            hz3Var = (hz3) ngfVar.d.getValue();
                            lgfVar2.d = q24Var5;
                            lgfVar2.e = null;
                            lgfVar2.f = null;
                            lgfVar2.g = j6;
                            lgfVar2.h = j5;
                            lgfVar2.i = i2;
                            lgfVar2.j = i;
                            lgfVar2.m = 4;
                            q24Var6 = q24Var5;
                            if (hz3Var.D(q24Var6, j5, hjaVar, lgfVar2) == hu4Var) {
                                return sbiVar;
                            }
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                    s5eVar3 = s5eVar2;
                    q24Var3 = q24Var2;
                    j2 = j7;
                    j3 = j9;
                    str = ngfVar.a;
                    a4cVar = gm0.f;
                    if (a4cVar == null) {
                        str2 = "send reaction response: reactionInfoTotalCount = ";
                        je9Var2 = je9Var;
                    } else {
                        str2 = "send reaction response: reactionInfoTotalCount = ";
                        je9Var2 = je9Var;
                        if (a4cVar.b(je9Var2)) {
                            a4cVar.c(je9Var2, str, "commentReactionsUpdateLogic.updateBySelfReaction fail $" + q24Var3 + ":" + j2, th);
                        }
                    }
                    q24Var4 = q24Var3;
                    ijaVar3 = ijaVar2;
                    j4 = j3;
                }
                return hu4Var;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
