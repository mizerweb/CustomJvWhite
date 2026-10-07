package defpackage;

import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class mj2 {
    public final String a = mj2.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public mj2(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Serializable a(mj2 mj2Var, q24 q24Var, long j, nq4 nq4Var) {
        lj2 lj2Var;
        if (nq4Var instanceof lj2) {
            lj2Var = (lj2) nq4Var;
            int i = lj2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lj2Var.f = i - Integer.MIN_VALUE;
            } else {
                lj2Var = new lj2(mj2Var, nq4Var);
            }
        } else {
            lj2Var = new lj2(mj2Var, nq4Var);
        }
        lj2 lj2Var2 = lj2Var;
        Object objE = lj2Var2.d;
        int i2 = lj2Var2.f;
        if (i2 == 0) {
            ch3.d0(objE);
            d3b d3bVar = new d3b(q24Var.a, j, new Long(q24Var.b));
            pvb pvbVar = (pvb) mj2Var.b.getValue();
            String str = mj2Var.a;
            onf onfVar = (onf) mj2Var.c.getValue();
            lj2Var2.f = 1;
            objE = qe7.E(pvbVar, d3bVar, str, 0L, 5, onfVar, null, lj2Var2, 68);
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
        e3b e3bVar = (e3b) objE;
        if (e3bVar != null) {
            return e3bVar.c;
        }
        ore.p("Required value was null.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x020a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0212  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0158  */
    /* JADX WARN: Code duplicated, block: B:86:0x0196  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c1  */
    /* JADX WARN: Instruction removed from duplicated block: B:112:0x0212, please report this as an issue */
    public final Object b(q24 q24Var, long j, z5e z5eVar, nq4 nq4Var) {
        kj2 kj2Var;
        q24 q24Var2;
        Object obj;
        z5e z5eVar2;
        long j2;
        long j3;
        String str;
        a4c a4cVar;
        long j4;
        long j5;
        int i;
        long j6;
        int i2;
        String str2;
        q24 q24Var3;
        hja hjaVar;
        String str3;
        a4c a4cVar2;
        Integer num;
        hz3 hz3Var;
        String str4;
        a4c a4cVar3;
        je9 je9Var;
        long j7 = j;
        je9 je9Var2 = je9.f;
        sbi sbiVar = sbi.a;
        je9 je9Var3 = je9.d;
        if (nq4Var instanceof kj2) {
            kj2Var = (kj2) nq4Var;
            int i3 = kj2Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kj2Var.l = i3 - Integer.MIN_VALUE;
            } else {
                kj2Var = new kj2(this, nq4Var);
            }
        } else {
            kj2Var = new kj2(this, nq4Var);
        }
        kj2 kj2Var2 = kj2Var;
        Object objA = kj2Var2.j;
        hu4 hu4Var = hu4.a;
        int i4 = kj2Var2.l;
        try {
            try {
                if (i4 == 0) {
                    ch3.d0(objA);
                    l34 l34Var = (l34) this.d.getValue();
                    q24Var2 = q24Var;
                    kj2Var2.d = q24Var2;
                    kj2Var2.e = z5eVar;
                    kj2Var2.f = j7;
                    kj2Var2.l = 1;
                    Object objR = l34Var.r(j7, kj2Var2);
                    if (objR != hu4Var) {
                        obj = objR;
                        z5eVar2 = z5eVar;
                    }
                    return hu4Var;
                }
                if (i4 != 1) {
                    try {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                int i5 = kj2Var2.i;
                                int i6 = kj2Var2.h;
                                long j8 = kj2Var2.g;
                                long j9 = kj2Var2.f;
                                q24 q24Var4 = kj2Var2.d;
                                try {
                                    ch3.d0(objA);
                                    i = i6;
                                    j6 = j8;
                                    i2 = i5;
                                    j4 = j9;
                                    q24Var2 = q24Var4;
                                } catch (Throwable th) {
                                    th = th;
                                    j4 = j9;
                                    q24Var3 = q24Var4;
                                }
                            } else {
                                if (i4 != 4) {
                                    ore.k("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                j4 = kj2Var2.f;
                                q24Var3 = kj2Var2.d;
                                try {
                                    ch3.d0(objA);
                                    return sbiVar;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            str2 = ":";
                            str4 = this.a;
                            a4cVar3 = gm0.f;
                            if (a4cVar3 == null) {
                                return sbiVar;
                            }
                            je9Var = je9Var2;
                            if (a4cVar3.b(je9Var)) {
                                return sbiVar;
                            }
                            a4cVar3.c(je9Var, str4, "cancel reaction error " + q24Var3 + str2 + j4, th);
                            return sbiVar;
                        }
                        j3 = kj2Var2.g;
                        j2 = kj2Var2.f;
                        q24Var2 = kj2Var2.d;
                        try {
                            ch3.d0(objA);
                            j5 = j3;
                            j4 = j2;
                        } catch (Throwable th3) {
                            th = th3;
                            str = this.a;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var2, str, "commentReactionsUpdateLogic.updateBySelfReaction fail " + q24Var2 + ":" + j2, th);
                            }
                            j4 = j2;
                            j5 = j3;
                        }
                        try {
                            kj2Var2.d = q24Var2;
                            kj2Var2.e = null;
                            kj2Var2.f = j4;
                            kj2Var2.g = j5;
                            i = 0;
                            kj2Var2.h = 0;
                            kj2Var2.i = 0;
                            kj2Var2.l = 3;
                            objA = a(this, q24Var2, j5, kj2Var2);
                            if (objA != hu4Var) {
                                j6 = j5;
                                i2 = 0;
                            }
                            return hu4Var;
                        } catch (Throwable th4) {
                            th = th4;
                            je9Var2 = je9Var2;
                            sbiVar = sbiVar;
                            str2 = ":";
                            q24Var3 = q24Var2;
                            str4 = this.a;
                            a4cVar3 = gm0.f;
                            if (a4cVar3 == null) {
                                return sbiVar;
                            }
                            je9Var = je9Var2;
                            if (a4cVar3.b(je9Var)) {
                                return sbiVar;
                            }
                            a4cVar3.c(je9Var, str4, "cancel reaction error " + q24Var3 + str2 + j4, th);
                            return sbiVar;
                        }
                        hjaVar = (hja) objA;
                        str3 = this.a;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 == null && a4cVar2.b(je9Var3)) {
                            if (hjaVar != null) {
                                str2 = ":";
                                try {
                                    num = new Integer(hjaVar.b);
                                } catch (Throwable th5) {
                                    th = th5;
                                    q24Var3 = q24Var2;
                                    str4 = this.a;
                                    a4cVar3 = gm0.f;
                                    if (a4cVar3 == null) {
                                        return sbiVar;
                                    }
                                    je9Var = je9Var2;
                                    if (a4cVar3.b(je9Var)) {
                                        return sbiVar;
                                    }
                                    a4cVar3.c(je9Var, str4, "cancel reaction error " + q24Var3 + str2 + j4, th);
                                    return sbiVar;
                                }
                            } else {
                                str2 = ":";
                                num = null;
                            }
                            a4cVar2.c(je9Var3, str3, "cancel reaction response: reactionInfoTotalCount = " + num, null);
                        } else {
                            hjaVar = hjaVar;
                            str2 = ":";
                        }
                        hz3Var = (hz3) this.e.getValue();
                        kj2Var2.d = q24Var2;
                        kj2Var2.e = null;
                        kj2Var2.f = j4;
                        kj2Var2.g = j6;
                        kj2Var2.h = i;
                        kj2Var2.i = i2;
                        kj2Var2.l = 4;
                        if (hz3Var.D(q24Var2, j6, hjaVar, kj2Var2) == hu4Var) {
                            return hu4Var;
                        }
                        return sbiVar;
                    } catch (Throwable th6) {
                        th = th6;
                        str2 = ":";
                        q24Var3 = q24Var2;
                        str4 = this.a;
                        a4cVar3 = gm0.f;
                        if (a4cVar3 == null) {
                            return sbiVar;
                        }
                        je9Var = je9Var2;
                        if (a4cVar3.b(je9Var)) {
                            return sbiVar;
                        }
                        a4cVar3.c(je9Var, str4, "cancel reaction error " + q24Var3 + str2 + j4, th);
                        return sbiVar;
                    }
                }
                j7 = kj2Var2.f;
                z5e z5eVar3 = kj2Var2.e;
                q24 q24Var5 = kj2Var2.d;
                ch3.d0(objA);
                obj = objA;
                z5eVar2 = z5eVar3;
                q24Var2 = q24Var5;
                ky3 ky3Var = (ky3) obj;
                if (ky3Var == null) {
                    String str5 = this.a;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null && a4cVar4.b(je9Var3)) {
                        a4cVar4.c(je9Var3, str5, nbh.s(j7, "comment ", " not found"), null);
                        return sbiVar;
                    }
                } else if (ky3Var.j == wja.DELETED) {
                    String str6 = this.a;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null && a4cVar5.b(je9Var3)) {
                        a4cVar5.c(je9Var3, str6, nbh.s(j7, "comment ", " deleted"), null);
                        return sbiVar;
                    }
                } else {
                    long j10 = ky3Var.b;
                    if (j10 != 0) {
                        try {
                            hz3 hz3Var2 = (hz3) this.e.getValue();
                            kj2Var2.d = q24Var2;
                            kj2Var2.e = null;
                            kj2Var2.f = j7;
                            kj2Var2.g = j10;
                            kj2Var2.h = 0;
                            kj2Var2.i = 0;
                            kj2Var2.l = 2;
                            if (hz3Var2.u(j7, z5eVar2, kj2Var2) != hu4Var) {
                                j2 = j7;
                                j3 = j10;
                                j5 = j3;
                                j4 = j2;
                                kj2Var2.d = q24Var2;
                                kj2Var2.e = null;
                                kj2Var2.f = j4;
                                kj2Var2.g = j5;
                                i = 0;
                                kj2Var2.h = 0;
                                kj2Var2.i = 0;
                                kj2Var2.l = 3;
                                objA = a(this, q24Var2, j5, kj2Var2);
                                if (objA != hu4Var) {
                                    j6 = j5;
                                    i2 = 0;
                                    hjaVar = (hja) objA;
                                    str3 = this.a;
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 == null) {
                                        hjaVar = hjaVar;
                                        str2 = ":";
                                        hz3Var = (hz3) this.e.getValue();
                                        kj2Var2.d = q24Var2;
                                        kj2Var2.e = null;
                                        kj2Var2.f = j4;
                                        kj2Var2.g = j6;
                                        kj2Var2.h = i;
                                        kj2Var2.i = i2;
                                        kj2Var2.l = 4;
                                        if (hz3Var.D(q24Var2, j6, hjaVar, kj2Var2) == hu4Var) {
                                            return sbiVar;
                                        }
                                    } else {
                                        if (hjaVar != null) {
                                            str2 = ":";
                                            num = new Integer(hjaVar.b);
                                        } else {
                                            str2 = ":";
                                            num = null;
                                        }
                                        a4cVar2.c(je9Var3, str3, "cancel reaction response: reactionInfoTotalCount = " + num, null);
                                        hz3Var = (hz3) this.e.getValue();
                                        kj2Var2.d = q24Var2;
                                        kj2Var2.e = null;
                                        kj2Var2.f = j4;
                                        kj2Var2.g = j6;
                                        kj2Var2.h = i;
                                        kj2Var2.i = i2;
                                        kj2Var2.l = 4;
                                        if (hz3Var.D(q24Var2, j6, hjaVar, kj2Var2) == hu4Var) {
                                            return sbiVar;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j2 = j7;
                            j3 = j10;
                            str = this.a;
                            a4cVar = gm0.f;
                            if (a4cVar != null && a4cVar.b(je9Var2)) {
                                a4cVar.c(je9Var2, str, "commentReactionsUpdateLogic.updateBySelfReaction fail " + q24Var2 + ":" + j2, th);
                            }
                            j4 = j2;
                            j5 = j3;
                        }
                        return hu4Var;
                    }
                    String str7 = this.a;
                    a4c a4cVar6 = gm0.f;
                    if (a4cVar6 != null && a4cVar6.b(je9Var3)) {
                        a4cVar6.c(je9Var3, str7, nbh.s(j7, "comment ", " has no serverId"), null);
                        return sbiVar;
                    }
                }
                return sbiVar;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
