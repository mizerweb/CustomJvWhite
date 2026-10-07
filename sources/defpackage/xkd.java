package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class xkd implements nkd {
    public final long a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final boolean g;
    public final mjg h;
    public final r8e i;
    public final mkd j;

    public xkd(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = j;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
        this.g = ((zed) ny8Var3.getValue()).a.t() == j;
        mjg mjgVarA = p90.a(r66.a);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
        this.j = new mkd(jkd.a, true);
    }

    @Override // defpackage.nkd
    public final List a(boolean z) {
        c79 c79VarW = yab.w();
        c79VarW.add(ekd.SAVE);
        c79VarW.add(ekd.SHARE);
        if (this.g) {
            if (!z) {
                c79VarW.add(ekd.SET_MAIN);
            }
            c79VarW.add(ekd.DELETE);
        }
        return yab.j(c79VarW);
    }

    @Override // defpackage.nkd
    public final r8e b() {
        return this.i;
    }

    @Override // defpackage.nkd
    public final mkd c() {
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r9 == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (r9 == r7) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a2 -> B:31:0x00a5). Please report as a decompilation issue!!! */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.nq4 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.ukd
            if (r0 == 0) goto L13
            r0 = r9
            ukd r0 = (defpackage.ukd) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ukd r0 = new ukd
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            mjg r6 = r8.h
            hu4 r7 = defpackage.hu4.a
            if (r1 == 0) goto L45
            if (r1 == r4) goto L3f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L35
            mjg r1 = r0.d
            java.util.List r1 = (java.util.List) r1
            defpackage.ch3.d0(r9)
            goto La5
        L35:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r5
        L3b:
            defpackage.ch3.d0(r9)
            goto L67
        L3f:
            mjg r1 = r0.d
            defpackage.ch3.d0(r9)
            goto L54
        L45:
            defpackage.ch3.d0(r9)
            r0.d = r6
            r0.g = r4
            java.lang.Object r9 = r8.g(r0)
            if (r9 != r7) goto L53
            goto La4
        L53:
            r1 = r6
        L54:
            java.util.List r9 = defpackage.xw3.Q0(r9)
            r1.setValue(r9)
            r0.d = r5
            r0.g = r3
            r9 = 0
            java.io.Serializable r9 = r8.f(r9, r0)
            if (r9 != r7) goto L67
            goto La4
        L67:
            ylc r9 = (defpackage.ylc) r9
            java.lang.Object r1 = r9.a
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r9 = r9.b
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r3 = r6.getValue()
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r1 = defpackage.ww3.G1(r1, r3)
            r6.j(r5, r1)
        L84:
            java.lang.Object r1 = r6.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            if (r1 >= r9) goto Lc3
            java.lang.Object r9 = r6.getValue()
            java.util.List r9 = (java.util.List) r9
            int r9 = r9.size()
            r0.d = r5
            r0.g = r2
            java.io.Serializable r9 = r8.f(r9, r0)
            if (r9 != r7) goto La5
        La4:
            return r7
        La5:
            ylc r9 = (defpackage.ylc) r9
            java.lang.Object r1 = r9.a
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r9 = r9.b
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r3 = r6.getValue()
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r1 = defpackage.ww3.G1(r1, r3)
            r6.j(r5, r1)
            goto L84
        Lc3:
            sbi r8 = defpackage.sbi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkd.d(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0236  */
    /* JADX WARN: Code duplicated, block: B:110:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01af A[LOOP:2: B:74:0x0198->B:79:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c4 A[LOOP:0: B:56:0x0112->B:85:0x01c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:99:0x022b  */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ec, code lost:
    
        if (r3.a(r10, r4, r22, r22) == r12) goto L104;
     */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.ekd r20, defpackage.ckd r21, java.lang.String r22, boolean r23, defpackage.fz7 r24, defpackage.nq4 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkd.e(ekd, ckd, java.lang.String, boolean, fz7, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable f(int i, nq4 nq4Var) throws Throwable {
        vkd vkdVar;
        Object poeVar;
        List list;
        List listW0;
        if (nq4Var instanceof vkd) {
            vkdVar = (vkd) nq4Var;
            int i2 = vkdVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vkdVar.f = i2 - Integer.MIN_VALUE;
            } else {
                vkdVar = new vkd(this, nq4Var);
            }
        } else {
            vkdVar = new vkd(this, nq4Var);
        }
        Object objD = vkdVar.d;
        hu4 hu4Var = hu4.a;
        int i3 = vkdVar.f;
        byte b = 0;
        try {
            if (i3 == 0) {
                ch3.d0(objD);
                long j = this.a;
                wy2 wy2Var = new wy2((kfc) (b == true ? 1 : 0), 22);
                wy2Var.f(j, "contactId");
                wy2Var.c(50, "count");
                if (i != 0) {
                    wy2Var.c(i, "from");
                }
                pvb pvbVar = (pvb) this.b.getValue();
                vkdVar.f = 1;
                objD = pvbVar.D(wy2Var, vkdVar);
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objD);
            }
            poeVar = (ol4) objD;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            String name = xkd.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.j(this.a, "Can't load contact photos, contactId:"), thA);
                }
            }
        }
        ol4 ol4Var = (ol4) (poeVar instanceof poe ? null : poeVar);
        int i4 = 0;
        if (ol4Var == null || (list = ol4Var.c) == null || list.isEmpty()) {
            return new ylc(r66.a, new Integer(0));
        }
        List list2 = ol4Var.d;
        if (list2 == null || list2.size() != ol4Var.c.size()) {
            List list3 = ol4Var.c;
            ArrayList arrayList = new ArrayList(yw3.W0(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(new ckd(0L, Collections.singletonList((String) it.next())));
            }
            listW0 = arrayList;
        } else {
            listW0 = yhf.w0(new m2i(new eda(new sw(1, ol4Var.d), new sw(1, ol4Var.c), new wf0(25)), new skd(i4)));
        }
        return new ylc(listW0, new Integer(ol4Var.e));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2 A[EDGE_INSN: B:49:0x00b2->B:42:0x00b2 BREAK  A[LOOP:0: B:24:0x0068->B:53:0x0068], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(nq4 nq4Var) {
        wkd wkdVar;
        vg4 vg4Var;
        long j;
        Iterator it;
        ListIterator listIterator;
        c79 c79VarJ;
        us0 us0Var;
        if (nq4Var instanceof wkd) {
            wkdVar = (wkd) nq4Var;
            int i = wkdVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wkdVar.f = i - Integer.MIN_VALUE;
            } else {
                wkdVar = new wkd(this, nq4Var);
            }
        } else {
            wkdVar = new wkd(this, nq4Var);
        }
        Object objI = wkdVar.d;
        int i2 = wkdVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            long j2 = this.a;
            if (j2 != 0) {
                no4 no4Var = (no4) this.c.getValue();
                wkdVar.f = 1;
                objI = no4Var.i(j2);
                hu4 hu4Var = hu4.a;
                if (objI == hu4Var) {
                    return hu4Var;
                }
            } else {
                vg4Var = null;
            }
            if (vg4Var != null) {
                ki4 ki4Var = vg4Var.a.b;
                j = ki4Var.e;
                String str = ki4Var.c;
                String str2 = ki4Var.d;
                c79 c79VarW = yab.w();
                it = new vpe().iterator();
                while (true) {
                    listIterator = ((tpe) it).b;
                    if (listIterator.hasPrevious()) {
                        break;
                    }
                    us0Var = (us0) listIterator.previous();
                    if (us0Var.compareTo(us0.a) < 0 && us0Var.compareTo(us0.e) <= 0) {
                        rs0 rs0Var = rs0.b;
                        String strD = vs0.d(str2, us0Var, rs0Var);
                        if (strD != null) {
                            c79VarW.add(strD);
                        }
                        rs0 rs0Var2 = rs0.a;
                        String strD2 = vs0.d(str2, us0Var, rs0Var2);
                        if (strD2 != null) {
                            c79VarW.add(strD2);
                        }
                        String strD3 = vs0.d(str, us0Var, rs0Var);
                        if (strD3 != null) {
                            c79VarW.add(strD3);
                        }
                        String strD4 = vs0.d(str, us0Var, rs0Var2);
                        if (strD4 != null) {
                            c79VarW.add(strD4);
                        }
                    }
                }
                c79VarJ = yab.j(c79VarW);
                if (j == 0 || !c79VarJ.isEmpty()) {
                    return new ckd(j, c79VarJ);
                }
            }
            return null;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objI);
        vg4Var = (vg4) objI;
        if (vg4Var != null) {
            ki4 ki4Var2 = vg4Var.a.b;
            j = ki4Var2.e;
            String str3 = ki4Var2.c;
            String str4 = ki4Var2.d;
            c79 c79VarW2 = yab.w();
            it = new vpe().iterator();
            while (true) {
                listIterator = ((tpe) it).b;
                if (listIterator.hasPrevious()) {
                    break;
                    break;
                }
                us0Var = (us0) listIterator.previous();
                if (us0Var.compareTo(us0.a) < 0) {
                }
            }
            c79VarJ = yab.j(c79VarW2);
            if (j == 0) {
            }
            return new ckd(j, c79VarJ);
        }
        return null;
    }
}
