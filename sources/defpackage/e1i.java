package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class e1i {
    public final c7k a;
    public final gu4 b;
    public final xhh c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final String i = e1i.class.getName();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final pzf k;
    public final q8e l;

    public e1i(c7k c7kVar, dq4 dq4Var, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = c7kVar;
        this.b = dq4Var;
        this.c = xhhVar;
        this.d = ny8Var5;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var2;
        this.h = ny8Var6;
        pzf pzfVarB = e9i.b(0, 0, 6);
        this.k = pzfVarB;
        this.l = new q8e(pzfVarB);
        e9i.j0(new fz6(((wkb) ny8Var.getValue()).b, new gv7(this, ny8Var6, ny8Var4, null, 18), 3), dq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object a(e1i e1iVar, long j, long j2, long j3, Throwable th, nq4 nq4Var) {
        z0i z0iVar;
        long j4;
        long j5;
        Throwable th2 = th;
        e1iVar.getClass();
        if (nq4Var instanceof z0i) {
            z0iVar = (z0i) nq4Var;
            int i = z0iVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                z0iVar.h = i - Integer.MIN_VALUE;
            } else {
                z0iVar = new z0i(e1iVar, nq4Var);
            }
        } else {
            z0iVar = new z0i(e1iVar, nq4Var);
        }
        Object obj = z0iVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = z0iVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = e1iVar.i;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "fail to fetch transcription", th2);
                }
            }
            boolean z = e1iVar.a.z(j);
            e1iVar.e().c(new kfi(j3, j, false));
            if (z) {
                pzf pzfVar = e1iVar.k;
                w0i w0iVar = new w0i(new tnh(R.string.message_transcribe_failed));
                z0iVar.e = th2;
                j4 = j2;
                z0iVar.d = j4;
                z0iVar.h = 1;
                if (pzfVar.emit(w0iVar, z0iVar) == hu4Var) {
                    return hu4Var;
                }
            } else {
                j4 = j2;
            }
            j5 = j4;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = z0iVar.d;
            th2 = z0iVar.e;
            ch3.d0(obj);
        }
        if (!(th2 instanceof TamErrorException) || !p90.C(((TamErrorException) th2).a.b)) {
            ((n0i) e1iVar.h.getValue()).a(3, j5);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public static final Object b(e1i e1iVar, long j, long j2, long j3, k0i k0iVar, q36 q36Var, nq4 nq4Var) {
        a1i a1iVar;
        k1i k1iVar;
        long j4;
        long j5;
        hu4 hu4Var;
        long j6;
        long j7;
        long j8;
        e1iVar.getClass();
        ny8 ny8Var = e1iVar.h;
        if (nq4Var instanceof a1i) {
            a1iVar = (a1i) nq4Var;
            int i = a1iVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                a1iVar.j = i - Integer.MIN_VALUE;
            } else {
                a1iVar = new a1i(e1iVar, nq4Var);
            }
        } else {
            a1iVar = new a1i(e1iVar, nq4Var);
        }
        Object obj = a1iVar.h;
        int i2 = a1iVar.j;
        sbi sbiVar = sbi.a;
        hu4 hu4Var2 = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            k1iVar = k0iVar.d;
            sua suaVar = (sua) e1iVar.e.getValue();
            String str = (String) q36Var.b;
            os1 os1Var = new os1(k1iVar, q36Var, k0iVar, 23);
            a1iVar.g = k1iVar;
            a1iVar.d = j;
            j4 = j2;
            a1iVar.e = j4;
            j5 = j3;
            a1iVar.f = j5;
            a1iVar.j = 1;
            suaVar.s(j, str, os1Var);
            hu4Var = hu4Var2;
            if (sbiVar != hu4Var) {
                j6 = j;
            }
            return hu4Var;
        }
        if (i2 == 1) {
            long j9 = a1iVar.f;
            j4 = a1iVar.e;
            j6 = a1iVar.d;
            k1iVar = a1iVar.g;
            ch3.d0(obj);
            hu4Var = hu4Var2;
            j5 = j9;
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = a1iVar.f;
            j8 = a1iVar.d;
            ch3.d0(obj);
        }
        j5 = j7;
        j6 = j8;
        e1iVar.e().c(new kfi(j5, j6, false));
        return sbiVar;
        c7k c7kVar = e1iVar.a;
        if (k1iVar == k1i.SUCCESS) {
            ((ConcurrentHashMap) c7kVar.b).compute(Long.valueOf(j6), new mw1(20, new wf0(28)));
            ((n0i) ny8Var.getValue()).a(1, j4);
        } else {
            boolean z = c7kVar.z(j6);
            ((n0i) ny8Var.getValue()).a(k1iVar == k1i.FAILED ? 3 : 2, j4);
            if (z) {
                pzf pzfVar = e1iVar.k;
                w0i w0iVar = new w0i(new tnh(R.string.message_transcribe_failed));
                a1iVar.g = null;
                a1iVar.d = j6;
                a1iVar.e = j4;
                a1iVar.f = j5;
                a1iVar.j = 2;
                if (pzfVar.emit(w0iVar, a1iVar) != hu4Var) {
                    j7 = j5;
                    j8 = j6;
                    j5 = j7;
                    j6 = j8;
                }
                return hu4Var;
            }
        }
        e1iVar.e().c(new kfi(j5, j6, false));
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static final Object c(e1i e1iVar, long j, long j2, long j3, nq4 nq4Var) {
        b1i b1iVar;
        e1iVar.getClass();
        if (nq4Var instanceof b1i) {
            b1iVar = (b1i) nq4Var;
            int i = b1iVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                b1iVar.f = i - Integer.MIN_VALUE;
            } else {
                b1iVar = new b1i(e1iVar, nq4Var);
            }
        } else {
            b1iVar = new b1i(e1iVar, nq4Var);
        }
        b1i b1iVar2 = b1iVar;
        Object obj = b1iVar2.d;
        int i2 = b1iVar2.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return ((roe) obj).a;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        c1i c1iVar = new c1i(e1iVar, j, j2, j3, null);
        ptf ptfVar = new ptf(20, e1iVar);
        b1iVar2.f = 1;
        Object objF = e1iVar.f(c1iVar, ptfVar, b1iVar2);
        Object obj2 = hu4.a;
        return objF == obj2 ? obj2 : objF;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object d(long j, rt2 rt2Var, nq4 nq4Var) {
        y0i y0iVar;
        rt2 rt2Var2;
        q36 q36Var;
        e70 e70VarL;
        b60 b60Var;
        q36 q36Var2;
        n1i n1iVarT;
        vo8 vo8Var;
        x60 x60Var;
        String str;
        a4c a4cVar;
        e70 e70VarL2;
        d70 d70Var;
        long j2 = j;
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof y0i) {
            y0iVar = (y0i) nq4Var;
            int i = y0iVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                y0iVar.h = i - Integer.MIN_VALUE;
            } else {
                y0iVar = new y0i(this, nq4Var);
            }
        } else {
            y0iVar = new y0i(this, nq4Var);
        }
        Object objF = y0iVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = y0iVar.h;
        int i3 = 1;
        if (i2 == 0) {
            ch3.d0(objF);
            sua suaVar = (sua) this.e.getValue();
            y0iVar.e = rt2Var;
            y0iVar.d = j2;
            y0iVar.h = 1;
            objF = suaVar.f(j2, y0iVar);
            if (objF == hu4Var) {
                return hu4Var;
            }
            rt2Var2 = rt2Var;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = y0iVar.d;
            rt2Var2 = y0iVar.e;
            ch3.d0(objF);
        }
        long j3 = j2;
        sfa sfaVar = (sfa) objF;
        if (sfaVar == null || sfaVar.b == 0) {
            String str2 = this.i;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, zo5.j(j3, "Not valid message. MessageDb or serverId == 0. MessageId = "), null);
            }
        } else {
            c7k c7kVar = this.a;
            long j4 = sfaVar.a;
            c46 c46Var = sfaVar.n;
            if (c46Var == null || (e70VarL2 = c46Var.l(y60.d)) == null || (d70Var = e70VarL2.d) == null) {
                if (c46Var == null || (e70VarL = c46Var.l(y60.e)) == null || (b60Var = e70VarL.e) == null) {
                    q36Var = null;
                } else {
                    String str3 = e70VarL.t;
                    long j5 = b60Var.a;
                    c7kVar.t(j4);
                    q36Var2 = new q36(str3, j5, b60Var.i, new lxb(2));
                }
                if (q36Var == null) {
                    n1iVarT = this.a.t(j3);
                    if (((x60) q36Var.c) != x60.c) {
                        if (n1iVarT instanceof l1i) {
                            ((ConcurrentHashMap) this.a.b).remove(Long.valueOf(j3));
                        } else if (n1iVarT instanceof m1i) {
                            this.a.z(j3);
                        } else {
                            if (n1iVarT == null) {
                                ore.o();
                                return null;
                            }
                            ((ConcurrentHashMap) this.a.b).put(Long.valueOf(j3), l1i.a);
                        }
                        e().c(new kfi(sfaVar.h, j3, false));
                        return sbiVar;
                    }
                    vo8Var = (vo8) this.j.get(new Long(j3));
                    if (vo8Var == null && vo8Var.isActive()) {
                        boolean z = n1iVarT instanceof m1i;
                        c7k c7kVar2 = this.a;
                        if (z) {
                            c7kVar2.z(j3);
                        } else {
                            ((ConcurrentHashMap) c7kVar2.b).put(Long.valueOf(j3), m1i.a);
                        }
                        e().c(new kfi(sfaVar.h, j3, false));
                        return sbiVar;
                    }
                    if (!(n1iVarT instanceof m1i) && (x60Var = (x60) q36Var.c) != null && (x60Var == x60.b || x60Var == x60.d)) {
                        this.a.z(j3);
                        e().c(new kfi(sfaVar.h, j3, false));
                        return sbiVar;
                    }
                    sgg sggVarI0 = yab.i0(this.b, ((n0c) this.c).b(), 0, new ue0(this, j3, sfaVar, rt2Var2, q36Var, (lq4) null), 2);
                    this.j.put(new Long(j3), sggVarI0);
                    sggVarI0.Y(new t14(this, j3, sggVarI0, 7));
                    return sbiVar;
                }
                str = this.i;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.j(j3, "No attach with type AUDIO or VIDEO for messageId "), null);
                    return sbiVar;
                }
            } else {
                String str4 = e70VarL2.t;
                long j6 = d70Var.a;
                c7kVar.t(j4);
                q36Var2 = new q36(str4, j6, d70Var.v, new lxb(i3));
            }
            q36Var = q36Var2;
            if (q36Var == null) {
                n1iVarT = this.a.t(j3);
                if (((x60) q36Var.c) != x60.c) {
                    vo8Var = (vo8) this.j.get(new Long(j3));
                    if (vo8Var == null) {
                    }
                    if (!(n1iVarT instanceof m1i)) {
                    }
                    sgg sggVarI1 = yab.i0(this.b, ((n0c) this.c).b(), 0, new ue0(this, j3, sfaVar, rt2Var2, q36Var, (lq4) null), 2);
                    this.j.put(new Long(j3), sggVarI1);
                    sggVarI1.Y(new t14(this, j3, sggVarI1, 7));
                    return sbiVar;
                }
                if (n1iVarT instanceof l1i) {
                    ((ConcurrentHashMap) this.a.b).remove(Long.valueOf(j3));
                } else if (n1iVarT instanceof m1i) {
                    this.a.z(j3);
                } else {
                    if (n1iVarT == null) {
                        ore.o();
                        return null;
                    }
                    ((ConcurrentHashMap) this.a.b).put(Long.valueOf(j3), l1i.a);
                }
                e().c(new kfi(sfaVar.h, j3, false));
                return sbiVar;
            }
            str = this.i;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                a4cVar.c(je9Var, str, zo5.j(j3, "No attach with type AUDIO or VIDEO for messageId "), null);
                return sbiVar;
            }
        }
        return sbiVar;
    }

    public final t51 e() {
        return (t51) this.f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [c1i, cf7] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [cf7] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [cf7] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ce -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(defpackage.c1i r12, defpackage.ptf r13, defpackage.nq4 r14) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1i.f(c1i, ptf, nq4):java.lang.Object");
    }
}
