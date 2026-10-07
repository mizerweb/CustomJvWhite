package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qk7 {
    public final String a = qk7.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public qk7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, boolean z, nq4 nq4Var) {
        mk7 mk7Var;
        boolean z2;
        long j2;
        Object objI;
        if (nq4Var instanceof mk7) {
            mk7Var = (mk7) nq4Var;
            int i = mk7Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                mk7Var.h = i - Integer.MIN_VALUE;
            } else {
                mk7Var = new mk7(this, nq4Var);
            }
        } else {
            mk7Var = new mk7(this, nq4Var);
        }
        Object objD = mk7Var.f;
        Object obj = hu4.a;
        int i2 = mk7Var.h;
        if (i2 == 0) {
            ch3.d0(objD);
            String str = this.a;
            if (j == 0) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "invalid server chat id #0!", null);
                    }
                }
                return null;
            }
            gm0.n(str, bc1.l(j, "execute: ", ", force: ", z));
            mk7Var.d = j;
            mk7Var.e = z;
            mk7Var.h = 1;
            objD = d(j, z, mk7Var);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z = mk7Var.e;
            j = mk7Var.d;
            ch3.d0(objD);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(objD);
                    return objD;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = mk7Var.e;
            j2 = mk7Var.d;
            ch3.d0(objD);
        }
        xn3 xn3Var = (xn3) this.d.getValue();
        mk7Var.d = j2;
        mk7Var.e = z2;
        mk7Var.h = 3;
        objI = xn3Var.i(j2, mk7Var);
        if (objI != obj) {
            return obj;
        }
        return objI;
        rt2 rt2Var = (rt2) objD;
        if (rt2Var != null) {
            return rt2Var;
        }
        List listS = c0a.s(j);
        mk7Var.d = j;
        mk7Var.e = z;
        mk7Var.h = 2;
        if (c(listS, mk7Var) != obj) {
            long j3 = j;
            z2 = z;
            j2 = j3;
            xn3 xn3Var2 = (xn3) this.d.getValue();
            mk7Var.d = j2;
            mk7Var.e = z2;
            mk7Var.h = 3;
            objI = xn3Var2.i(j2, mk7Var);
            if (objI != obj) {
                return objI;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00bd -> B:46:0x00c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.Set r13, defpackage.nq4 r14) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk7.b(java.util.Set, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r0 == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r0.w(r3, r13) == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.List r17, defpackage.nq4 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk7.c(java.util.List, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Comparable d(long j, boolean z, nq4 nq4Var) {
        pk7 pk7Var;
        Object obj;
        boolean z2;
        rt2 rt2Var;
        boolean z3;
        rt2 rt2Var2;
        vg4 vg4VarW;
        long j2 = j;
        if (nq4Var instanceof pk7) {
            pk7Var = (pk7) nq4Var;
            int i = pk7Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                pk7Var.i = i - Integer.MIN_VALUE;
            } else {
                pk7Var = new pk7(this, nq4Var);
            }
        } else {
            pk7Var = new pk7(this, nq4Var);
        }
        pk7 pk7Var2 = pk7Var;
        Object obj2 = pk7Var2.g;
        hu4 hu4Var = hu4.a;
        int i2 = pk7Var2.i;
        if (i2 == 0) {
            ch3.d0(obj2);
            xn3 xn3Var = (xn3) this.d.getValue();
            pk7Var2.d = j2;
            pk7Var2.e = z;
            pk7Var2.i = 1;
            Object objI = xn3Var.i(j2, pk7Var2);
            if (objI != hu4Var) {
                obj = objI;
                z2 = z;
            }
            return hu4Var;
        }
        if (i2 == 1) {
            boolean z4 = pk7Var2.e;
            long j3 = pk7Var2.d;
            ch3.d0(obj2);
            obj = obj2;
            z2 = z4;
            j2 = j3;
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = pk7Var2.e;
            rt2Var2 = pk7Var2.f;
            ch3.d0(obj2);
        }
        z2 = z3;
        rt2Var = rt2Var2;
        if (!rt2Var.h0() && (vg4VarW = rt2Var.w()) != null && vg4VarW.h()) {
            gm0.n(this.a, "execute: chat is dialog && chat contains! Ignore force!");
            return rt2Var;
        }
        if (!z2) {
            return null;
        }
        gm0.n(this.a, "execute: chat contains!");
        return rt2Var;
        rt2Var = (rt2) obj;
        if (rt2Var == null) {
            return null;
        }
        mg5 mg5Var = mg5.REGULAR;
        if (rt2Var.u(mg5Var) == 0 && rt2Var.y() > 0) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    long j4 = rt2Var.a;
                    long jY = rt2Var.y();
                    StringBuilder sbS = qt4.s(j4, "execute: chat exist l", "|s:");
                    sbS.append(j2);
                    sbS.append(" with empty chunks and\n                    |has lastMessageTime: ");
                    sbS.append(jY);
                    sbS.append(",\n                    |insert first chunk\n                    |");
                    a4cVar.c(je9Var, str, s5h.y0(sbS.toString()), null);
                }
            }
            xn3 xn3Var2 = (xn3) this.d.getValue();
            long j5 = rt2Var.a;
            long jY2 = rt2Var.y();
            pk7Var2.f = rt2Var;
            pk7Var2.d = j2;
            pk7Var2.e = z2;
            pk7Var2.i = 2;
            Object objC = xn3Var2.j().c(j5, true, new zw9(jY2, mg5Var, null), pk7Var2);
            if (objC != hu4Var) {
                objC = sbi.a;
            }
            if (objC != hu4Var) {
                z3 = z2;
                rt2Var2 = rt2Var;
                z2 = z3;
                rt2Var = rt2Var2;
            }
            return hu4Var;
        }
        if (!rt2Var.h0()) {
        }
        if (!z2) {
            return null;
        }
        gm0.n(this.a, "execute: chat contains!");
        return rt2Var;
    }
}
