package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class rkd implements nkd {
    public final long a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final mjg e;
    public final r8e f;
    public mkd g;

    public rkd(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = j;
        this.b = ny8Var;
        this.c = ny8Var3;
        this.d = ny8Var2;
        mjg mjgVarA = p90.a(r66.a);
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        this.g = new mkd(new kkd(new xnh("")), false);
    }

    @Override // defpackage.nkd
    public final List a(boolean z) {
        return xw3.P0(ekd.SAVE, ekd.SHARE);
    }

    @Override // defpackage.nkd
    public final r8e b() {
        return this.f;
    }

    @Override // defpackage.nkd
    public final mkd c() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nkd
    public final Object d(nq4 nq4Var) {
        qkd qkdVar;
        Object poeVar;
        rkd rkdVar;
        if (nq4Var instanceof qkd) {
            qkdVar = (qkd) nq4Var;
            int i = qkdVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qkdVar.g = i - Integer.MIN_VALUE;
            } else {
                qkdVar = new qkd(this, nq4Var);
            }
        } else {
            qkdVar = new qkd(this, nq4Var);
        }
        Object objN = qkdVar.e;
        int i2 = qkdVar.g;
        try {
            if (i2 == 0) {
                ch3.d0(objN);
                r8e r8eVarK = ((xn3) this.b.getValue()).k(this.a);
                qkdVar.d = this;
                qkdVar.g = 1;
                objN = e9i.N(r8eVarK, qkdVar);
                hu4 hu4Var = hu4.a;
                if (objN == hu4Var) {
                    return hu4Var;
                }
                rkdVar = this;
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rkdVar = qkdVar.d;
                ch3.d0(objN);
            }
            rt2 rt2Var = (rt2) objN;
            if (rt2Var == null) {
                poeVar = null;
            } else {
                rkdVar.g = new mkd(new kkd(new xnh(rt2Var.F())), true ^ rt2Var.k0((e5d) rkdVar.c.getValue()));
                us0 us0Var = us0.a;
                us0 us0Var2 = us0.e;
                c79 c79VarW = yab.w();
                Iterator it = new vpe().iterator();
                while (true) {
                    ListIterator listIterator = ((tpe) it).b;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    us0 us0Var3 = (us0) listIterator.previous();
                    if (us0Var3.compareTo(us0Var) >= 0 && us0Var3.compareTo(us0Var2) <= 0) {
                        String strS = rt2Var.s(us0Var3, rs0.b);
                        if (strS != null) {
                            c79VarW.add(strS);
                        }
                        String strS2 = rt2Var.s(us0Var3, rs0.a);
                        if (strS2 != null) {
                            c79VarW.add(strS2);
                        }
                    }
                }
                poeVar = new ckd(rt2Var.q(), yab.j(c79VarW));
            }
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        List listQ0 = xw3.Q0(poeVar);
        mjg mjgVar = this.e;
        mjgVar.getClass();
        mjgVar.j(null, listQ0);
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r8 == r10) goto L31;
     */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.ekd r5, defpackage.ckd r6, java.lang.String r7, boolean r8, defpackage.fz7 r9, defpackage.nq4 r10) {
        /*
            r4 = this;
            boolean r6 = r10 instanceof defpackage.pkd
            if (r6 == 0) goto L13
            r6 = r10
            pkd r6 = (defpackage.pkd) r6
            int r8 = r6.g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r8 & r0
            if (r1 == 0) goto L13
            int r8 = r8 - r0
            r6.g = r8
            goto L18
        L13:
            pkd r6 = new pkd
            r6.<init>(r4, r10)
        L18:
            java.lang.Object r8 = r6.e
            int r10 = r6.g
            sbi r0 = defpackage.sbi.a
            r1 = 2
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L37
            if (r10 == r2) goto L33
            if (r10 != r1) goto L2d
            fz7 r9 = r6.d
            defpackage.ch3.d0(r8)
            goto L59
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r4)
            return r3
        L33:
            defpackage.ch3.d0(r8)
            return r0
        L37:
            defpackage.ch3.d0(r8)
            int r5 = r5.ordinal()
            r8 = 0
            ny8 r4 = r4.d
            hu4 r10 = defpackage.hu4.a
            if (r5 == 0) goto L6c
            if (r5 == r2) goto L48
            goto L7d
        L48:
            java.lang.Object r4 = r4.getValue()
            vze r4 = (defpackage.vze) r4
            r6.d = r9
            r6.g = r1
            java.lang.Object r8 = defpackage.vze.c(r4, r7, r8, r6)
            if (r8 != r10) goto L59
            goto L7c
        L59:
            if (r8 == 0) goto L66
            android.net.Uri r8 = (android.net.Uri) r8
            hkd r4 = new hkd
            r4.<init>(r8)
            r9.invoke(r4)
            return r0
        L66:
            java.lang.String r4 = "Required value was null."
            defpackage.ore.k(r4)
            return r3
        L6c:
            java.lang.Object r4 = r4.getValue()
            vze r4 = (defpackage.vze) r4
            r6.d = r3
            r6.g = r2
            java.lang.Object r4 = defpackage.vze.c(r4, r7, r8, r6)
            if (r4 != r10) goto L7d
        L7c:
            return r10
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkd.e(ekd, ckd, java.lang.String, boolean, fz7, nq4):java.lang.Object");
    }
}
