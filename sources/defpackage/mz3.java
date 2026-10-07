package defpackage;

import java.util.ArrayList;
import ru.ok.tamtam.messages.b;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes.dex */
public final class mz3 extends aq implements qih, btc {
    public final q24 f;
    public final long g;
    public final String h;

    public mz3(long j, q24 q24Var, long j2, String str) {
        super(j);
        this.f = q24Var;
        this.g = j2;
        this.h = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r13.m(r0, r8) == r11) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object w(defpackage.mz3 r12, defpackage.nq4 r13) {
        /*
            long r0 = r12.g
            boolean r2 = r13 instanceof defpackage.jz3
            if (r2 == 0) goto L16
            r2 = r13
            jz3 r2 = (defpackage.jz3) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f = r3
        L14:
            r8 = r2
            goto L1c
        L16:
            jz3 r2 = new jz3
            r2.<init>(r12, r13)
            goto L14
        L1c:
            java.lang.Object r13 = r8.d
            int r2 = r8.f
            r9 = 2
            r3 = 1
            r10 = 0
            hu4 r11 = defpackage.hu4.a
            if (r2 == 0) goto L39
            if (r2 == r3) goto L35
            if (r2 != r9) goto L2f
            defpackage.ch3.d0(r13)
            goto L86
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r12)
            return r10
        L35:
            defpackage.ch3.d0(r13)
            goto L59
        L39:
            defpackage.ch3.d0(r13)
            bq r13 = r12.e
            if (r13 == 0) goto L41
            goto L42
        L41:
            r13 = r10
        L42:
            l34 r13 = r13.g()
            q24 r4 = r12.f
            java.util.List r5 = defpackage.c0a.s(r0)
            r8.f = r3
            wja r6 = defpackage.wja.DELETED
            r7 = 0
            r3 = r13
            java.lang.Object r13 = r3.C(r4, r5, r6, r7, r8)
            if (r13 != r11) goto L59
            goto L85
        L59:
            bq r13 = r12.e
            if (r13 == 0) goto L5e
            goto L5f
        L5e:
            r13 = r10
        L5f:
            p24 r13 = r13.f()
            xy3 r2 = new xy3
            q24 r3 = r12.f
            java.util.List r0 = defpackage.c0a.s(r0)
            r2.<init>(r3, r0)
            r13.a(r2)
            bq r13 = r12.e
            if (r13 == 0) goto L76
            goto L77
        L76:
            r13 = r10
        L77:
            okh r13 = r13.k()
            long r0 = r12.a
            r8.f = r9
            java.lang.Object r13 = r13.m(r0, r8)
            if (r13 != r11) goto L86
        L85:
            return r11
        L86:
            bq r13 = r12.e
            if (r13 == 0) goto L8b
            goto L8c
        L8b:
            r13 = r10
        L8c:
            h4b r13 = r13.j()
            java.lang.String r12 = r12.h
            r0 = 28
            f4b r1 = defpackage.f4b.MSG_AUTO_DELETED_EMPTY
            defpackage.qrc.m(r13, r1, r12, r10, r0)
            sbi r12 = defpackage.sbi.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz3.w(mz3, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object x(mz3 mz3Var, ky3 ky3Var, yhh yhhVar, nq4 nq4Var) {
        kz3 kz3Var;
        yhh yhhVar2;
        String str;
        if (nq4Var instanceof kz3) {
            kz3Var = (kz3) nq4Var;
            int i = kz3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                kz3Var.g = i - Integer.MIN_VALUE;
            } else {
                kz3Var = new kz3(mz3Var, nq4Var);
            }
        } else {
            kz3Var = new kz3(mz3Var, nq4Var);
        }
        Object obj = kz3Var.e;
        int i2 = kz3Var.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            bq bqVar = mz3Var.e;
            if (bqVar == null) {
                bqVar = null;
            }
            l34 l34VarG = bqVar.g();
            long j = ky3Var.a;
            xfa xfaVar = xfa.ERROR;
            kz3Var.d = yhhVar;
            kz3Var.g = 1;
            if (l34VarG.D(j, xfaVar, kz3Var) != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            yhhVar = kz3Var.d;
            ch3.d0(obj);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yhhVar2 = kz3Var.d;
            ch3.d0(obj);
        }
        str = yhhVar2.b;
        if (str == null) {
            str = "";
        }
        bq bqVar2 = mz3Var.e;
        (bqVar2 != null ? bqVar2 : null).j().C(mz3Var.h, str, yvk.c(str));
        return sbi.a;
        bq bqVar3 = mz3Var.e;
        if (bqVar3 == null) {
            bqVar3 = null;
        }
        okh okhVarK = bqVar3.k();
        long j2 = mz3Var.a;
        kz3Var.d = yhhVar;
        kz3Var.g = 2;
        if (okhVarK.m(j2, kz3Var) != hu4Var) {
            yhhVar2 = yhhVar;
            str = yhhVar2.b;
            if (str == null) {
                str = "";
            }
            bq bqVar4 = mz3Var.e;
            (bqVar4 != null ? bqVar4 : null).j().C(mz3Var.h, str, yvk.c(str));
            return sbi.a;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x023c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0241  */
    /* JADX WARN: Code duplicated, block: B:111:0x024b  */
    /* JADX WARN: Code duplicated, block: B:112:0x024e  */
    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0272  */
    /* JADX WARN: Code duplicated, block: B:124:0x0287  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:93:0x0215  */
    /* JADX WARN: Code duplicated, block: B:99:0x0226  */
    public final Object A(q24 q24Var, gda gdaVar, nq4 nq4Var) {
        lz3 lz3Var;
        q24 q24Var2;
        gda gdaVar2;
        wfe wfeVar;
        wfe wfeVar2;
        s04 s04Var;
        boolean z;
        int i;
        q24 q24Var3;
        wfe wfeVar3;
        int i2;
        s04 s04Var2;
        int i3;
        wfe wfeVar4;
        gda gdaVar3;
        q24 q24Var4;
        bq bqVar;
        c46 c46VarE;
        bq bqVar2;
        ki8 ki8Var;
        ky3 ky3Var;
        s04 s04Var3;
        wfe wfeVar5;
        bq bqVar3;
        wfe wfeVar6;
        a4c a4cVar;
        bq bqVar4;
        xn3 xn3VarD;
        s04 s04Var4;
        ihc ihcVar;
        boolean z2;
        wfe wfeVar7;
        s04 s04Var5;
        q24 q24Var5;
        bq bqVar5;
        bq bqVar6;
        je9 je9Var = je9.d;
        je9 je9Var2 = je9.f;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof lz3) {
            lz3Var = (lz3) nq4Var;
            int i4 = lz3Var.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lz3Var.l = i4 - Integer.MIN_VALUE;
            } else {
                lz3Var = new lz3(this, nq4Var);
            }
        } else {
            lz3Var = new lz3(this, nq4Var);
        }
        lz3 lz3Var2 = lz3Var;
        Object objO = lz3Var2.j;
        hu4 hu4Var = hu4.a;
        int i5 = lz3Var2.l;
        if (i5 == 0) {
            wfe wfeVarP = nbh.p(objO);
            bq bqVar7 = this.e;
            if (bqVar7 == null) {
                bqVar7 = null;
            }
            l34 l34VarG = bqVar7.g();
            long j = gdaVar.f;
            lz3Var2.d = q24Var;
            lz3Var2.e = gdaVar;
            lz3Var2.f = wfeVarP;
            lz3Var2.g = wfeVarP;
            lz3Var2.l = 1;
            Object objO2 = l34VarG.o(q24Var, j, lz3Var2);
            if (objO2 != hu4Var) {
                q24Var2 = q24Var;
                gdaVar2 = gdaVar;
                wfeVar = wfeVarP;
                wfeVar2 = wfeVar;
                objO = objO2;
            }
            return hu4Var;
        }
        if (i5 == 1) {
            wfeVar = (wfe) lz3Var2.g;
            wfeVar2 = lz3Var2.f;
            gda gdaVar4 = lz3Var2.e;
            q24 q24Var6 = lz3Var2.d;
            ch3.d0(objO);
            gdaVar2 = gdaVar4;
            q24Var2 = q24Var6;
        } else {
            if (i5 == 2) {
                i3 = lz3Var2.i;
                s04Var2 = (s04) lz3Var2.g;
                wfe wfeVar8 = lz3Var2.f;
                gdaVar3 = lz3Var2.e;
                q24Var4 = lz3Var2.d;
                ch3.d0(objO);
                wfeVar4 = wfeVar8;
                i2 = 3;
                z = true;
                b50 b50Var = gdaVar3.h;
                bqVar = this.e;
                if (bqVar == null) {
                    bqVar = null;
                }
                c46VarE = pm9.e(b50Var, (m7f) bqVar.M.getValue());
                bqVar2 = this.e;
                if (bqVar2 == null) {
                    bqVar2 = null;
                }
                ki8Var = (ki8) bqVar2.z.getValue();
                ky3Var = (ky3) wfeVar4.a;
                lz3Var2.d = q24Var4;
                lz3Var2.e = gdaVar3;
                lz3Var2.f = wfeVar4;
                lz3Var2.g = s04Var2;
                lz3Var2.i = i3;
                lz3Var2.l = i2;
                if (ki8Var.e(ky3Var, c46VarE, lz3Var2) != hu4Var) {
                    s04Var3 = s04Var2;
                    wfeVar5 = wfeVar4;
                    q24Var3 = q24Var4;
                    bqVar3 = this.e;
                    if (bqVar3 == null) {
                        bqVar3 = null;
                    }
                    l34 l34VarG2 = bqVar3.g();
                    long j2 = gdaVar3.f;
                    lz3Var2.d = q24Var3;
                    lz3Var2.e = null;
                    lz3Var2.f = wfeVar5;
                    lz3Var2.g = s04Var3;
                    lz3Var2.h = wfeVar5;
                    lz3Var2.i = i3;
                    lz3Var2.l = 4;
                    objO = l34VarG2.o(q24Var3, j2, lz3Var2);
                    if (objO != hu4Var) {
                        wfeVar6 = wfeVar5;
                        wfeVar5.a = objO;
                        wfeVar3 = wfeVar6;
                        i = i3;
                        s04Var = s04Var3;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4cVar.c(je9Var, "CommentSendApiTask", c0a.n(wfeVar3.a, "onCommentSend "), null);
                        }
                        if (wfeVar3.a != null) {
                            bqVar4 = this.e;
                            if (bqVar4 == null) {
                                bqVar4 = null;
                            }
                            xn3VarD = bqVar4.d();
                            s04Var4 = s04Var;
                            if (i != 0) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            ihcVar = new ihc(z2, wfeVar3, s04Var4, this, (lq4) null);
                            lz3Var2.d = q24Var3;
                            lz3Var2.e = null;
                            lz3Var2.f = wfeVar3;
                            lz3Var2.g = s04Var4;
                            lz3Var2.h = null;
                            lz3Var2.i = i;
                            lz3Var2.l = 5;
                            if (xn3VarD.e(q24Var3, ihcVar, lz3Var2) != hu4Var) {
                                wfeVar7 = wfeVar3;
                                s04Var5 = s04Var4;
                                q24Var5 = q24Var3;
                            }
                        }
                        return sbiVar;
                    }
                }
                return hu4Var;
            }
            if (i5 == 3) {
                i3 = lz3Var2.i;
                s04 s04Var6 = (s04) lz3Var2.g;
                wfe wfeVar9 = lz3Var2.f;
                gdaVar3 = lz3Var2.e;
                q24 q24Var7 = lz3Var2.d;
                ch3.d0(objO);
                s04Var3 = s04Var6;
                wfeVar5 = wfeVar9;
                q24Var3 = q24Var7;
                z = true;
                bqVar3 = this.e;
                if (bqVar3 == null) {
                    bqVar3 = null;
                }
                l34 l34VarG3 = bqVar3.g();
                long j3 = gdaVar3.f;
                lz3Var2.d = q24Var3;
                lz3Var2.e = null;
                lz3Var2.f = wfeVar5;
                lz3Var2.g = s04Var3;
                lz3Var2.h = wfeVar5;
                lz3Var2.i = i3;
                lz3Var2.l = 4;
                objO = l34VarG3.o(q24Var3, j3, lz3Var2);
                if (objO != hu4Var) {
                    wfeVar6 = wfeVar5;
                    wfeVar5.a = objO;
                    wfeVar3 = wfeVar6;
                    i = i3;
                    s04Var = s04Var3;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, "CommentSendApiTask", c0a.n(wfeVar3.a, "onCommentSend "), null);
                    }
                    if (wfeVar3.a != null) {
                        bqVar4 = this.e;
                        if (bqVar4 == null) {
                            bqVar4 = null;
                        }
                        xn3VarD = bqVar4.d();
                        s04Var4 = s04Var;
                        if (i != 0) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        ihcVar = new ihc(z2, wfeVar3, s04Var4, this, (lq4) null);
                        lz3Var2.d = q24Var3;
                        lz3Var2.e = null;
                        lz3Var2.f = wfeVar3;
                        lz3Var2.g = s04Var4;
                        lz3Var2.h = null;
                        lz3Var2.i = i;
                        lz3Var2.l = 5;
                        if (xn3VarD.e(q24Var3, ihcVar, lz3Var2) != hu4Var) {
                            wfeVar7 = wfeVar3;
                            s04Var5 = s04Var4;
                            q24Var5 = q24Var3;
                        }
                    }
                    return sbiVar;
                }
                return hu4Var;
            }
            if (i5 == 4) {
                i3 = lz3Var2.i;
                wfeVar5 = lz3Var2.h;
                s04Var3 = (s04) lz3Var2.g;
                wfeVar6 = lz3Var2.f;
                q24Var3 = lz3Var2.d;
                ch3.d0(objO);
                z = true;
                wfeVar5.a = objO;
                wfeVar3 = wfeVar6;
                i = i3;
                s04Var = s04Var3;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CommentSendApiTask", c0a.n(wfeVar3.a, "onCommentSend "), null);
                }
                if (wfeVar3.a != null) {
                    bqVar4 = this.e;
                    if (bqVar4 == null) {
                        bqVar4 = null;
                    }
                    xn3VarD = bqVar4.d();
                    s04Var4 = s04Var;
                    if (i != 0) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    ihcVar = new ihc(z2, wfeVar3, s04Var4, this, (lq4) null);
                    lz3Var2.d = q24Var3;
                    lz3Var2.e = null;
                    lz3Var2.f = wfeVar3;
                    lz3Var2.g = s04Var4;
                    lz3Var2.h = null;
                    lz3Var2.i = i;
                    lz3Var2.l = 5;
                    if (xn3VarD.e(q24Var3, ihcVar, lz3Var2) != hu4Var) {
                        wfeVar7 = wfeVar3;
                        s04Var5 = s04Var4;
                        q24Var5 = q24Var3;
                    }
                    return hu4Var;
                }
                return sbiVar;
            }
            if (i5 != 5) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s04Var5 = (s04) lz3Var2.g;
            wfeVar7 = lz3Var2.f;
            q24Var5 = lz3Var2.d;
            ch3.d0(objO);
        }
        bqVar5 = this.e;
        if (bqVar5 == null) {
            bqVar5 = null;
        }
        ((b) bqVar5.E.getValue()).d(s04Var5, (sfa) wfeVar7.a);
        bqVar6 = this.e;
        if (bqVar6 == null) {
            bqVar6 = null;
        }
        bqVar6.f().a(new az3(q24Var5, c0a.s(((ky3) wfeVar7.a).a)));
        bq bqVar8 = this.e;
        (bqVar8 != null ? bqVar8 : null).f().a(new wy3(q24Var5));
        return sbiVar;
        wfeVar.a = objO;
        if (wfeVar2.a == null) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, "CommentSendApiTask", "message cid=" + gdaVar2.f + " for commentsId=" + q24Var2 + " not found!", null);
                return sbiVar;
            }
        } else {
            bq bqVar9 = this.e;
            if (bqVar9 == null) {
                bqVar9 = null;
            }
            s04Var = (s04) ((r8e) bqVar9.d().c.i(q24Var2)).a.getValue();
            if (s04Var != null) {
                gda gdaVar5 = gdaVar2;
                boolean z3 = !qe7.m(((ky3) wfeVar2.a).c, s04Var.b.n.e(mg5.REGULAR));
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    ky3 ky3Var2 = (ky3) wfeVar2.a;
                    a4cVar3.c(je9Var, "CommentSendApiTask", (ky3Var2 != null ? new Long(ky3Var2.a) : null) + ": outOfChunksMessage=" + z3, null);
                }
                if (((ky3) wfeVar2.a).b == 0) {
                    bq bqVar10 = this.e;
                    if (bqVar10 == null) {
                        bqVar10 = null;
                    }
                    ki8 ki8Var2 = (ki8) bqVar10.z.getValue();
                    xfa xfaVar = xfa.READ;
                    lz3Var2.d = q24Var2;
                    lz3Var2.e = gdaVar5;
                    lz3Var2.f = wfeVar2;
                    lz3Var2.g = s04Var;
                    lz3Var2.i = z3 ? 1 : 0;
                    lz3Var2.l = 2;
                    i2 = 3;
                    z = true;
                    if (ki8Var2.g(gdaVar5, q24Var2, xfaVar, false, (32 & 16) != 0 ? null : wja.DELETED, null, lz3Var2) != hu4Var) {
                        wfe wfeVar10 = wfeVar2;
                        s04Var2 = s04Var;
                        i3 = z3 ? 1 : 0;
                        wfeVar4 = wfeVar10;
                        gdaVar3 = gdaVar5;
                        q24Var4 = q24Var2;
                        b50 b50Var2 = gdaVar3.h;
                        bqVar = this.e;
                        if (bqVar == null) {
                            bqVar = null;
                        }
                        c46VarE = pm9.e(b50Var2, (m7f) bqVar.M.getValue());
                        bqVar2 = this.e;
                        if (bqVar2 == null) {
                            bqVar2 = null;
                        }
                        ki8Var = (ki8) bqVar2.z.getValue();
                        ky3Var = (ky3) wfeVar4.a;
                        lz3Var2.d = q24Var4;
                        lz3Var2.e = gdaVar3;
                        lz3Var2.f = wfeVar4;
                        lz3Var2.g = s04Var2;
                        lz3Var2.i = i3;
                        lz3Var2.l = i2;
                        if (ki8Var.e(ky3Var, c46VarE, lz3Var2) != hu4Var) {
                            s04Var3 = s04Var2;
                            wfeVar5 = wfeVar4;
                            q24Var3 = q24Var4;
                            bqVar3 = this.e;
                            if (bqVar3 == null) {
                                bqVar3 = null;
                            }
                            l34 l34VarG4 = bqVar3.g();
                            long j4 = gdaVar3.f;
                            lz3Var2.d = q24Var3;
                            lz3Var2.e = null;
                            lz3Var2.f = wfeVar5;
                            lz3Var2.g = s04Var3;
                            lz3Var2.h = wfeVar5;
                            lz3Var2.i = i3;
                            lz3Var2.l = 4;
                            objO = l34VarG4.o(q24Var3, j4, lz3Var2);
                            if (objO != hu4Var) {
                                wfeVar6 = wfeVar5;
                                wfeVar5.a = objO;
                                wfeVar3 = wfeVar6;
                                i = i3;
                                s04Var = s04Var3;
                                a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    a4cVar.c(je9Var, "CommentSendApiTask", c0a.n(wfeVar3.a, "onCommentSend "), null);
                                }
                                if (wfeVar3.a != null) {
                                    bqVar4 = this.e;
                                    if (bqVar4 == null) {
                                        bqVar4 = null;
                                    }
                                    xn3VarD = bqVar4.d();
                                    s04Var4 = s04Var;
                                    if (i != 0) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    ihcVar = new ihc(z2, wfeVar3, s04Var4, this, (lq4) null);
                                    lz3Var2.d = q24Var3;
                                    lz3Var2.e = null;
                                    lz3Var2.f = wfeVar3;
                                    lz3Var2.g = s04Var4;
                                    lz3Var2.h = null;
                                    lz3Var2.i = i;
                                    lz3Var2.l = 5;
                                    if (xn3VarD.e(q24Var3, ihcVar, lz3Var2) != hu4Var) {
                                        wfeVar7 = wfeVar3;
                                        s04Var5 = s04Var4;
                                        q24Var5 = q24Var3;
                                        bqVar5 = this.e;
                                        if (bqVar5 == null) {
                                            bqVar5 = null;
                                        }
                                        ((b) bqVar5.E.getValue()).d(s04Var5, (sfa) wfeVar7.a);
                                        bqVar6 = this.e;
                                        if (bqVar6 == null) {
                                            bqVar6 = null;
                                        }
                                        bqVar6.f().a(new az3(q24Var5, c0a.s(((ky3) wfeVar7.a).a)));
                                        bq bqVar11 = this.e;
                                        (bqVar11 != null ? bqVar11 : null).f().a(new wy3(q24Var5));
                                        return sbiVar;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    z = true;
                    i = z3 ? 1 : 0;
                    q24Var3 = q24Var2;
                    wfeVar3 = wfeVar2;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, "CommentSendApiTask", c0a.n(wfeVar3.a, "onCommentSend "), null);
                    }
                    if (wfeVar3.a != null) {
                        bqVar4 = this.e;
                        if (bqVar4 == null) {
                            bqVar4 = null;
                        }
                        xn3VarD = bqVar4.d();
                        s04Var4 = s04Var;
                        if (i != 0) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        ihcVar = new ihc(z2, wfeVar3, s04Var4, this, (lq4) null);
                        lz3Var2.d = q24Var3;
                        lz3Var2.e = null;
                        lz3Var2.f = wfeVar3;
                        lz3Var2.g = s04Var4;
                        lz3Var2.h = null;
                        lz3Var2.i = i;
                        lz3Var2.l = 5;
                        if (xn3VarD.e(q24Var3, ihcVar, lz3Var2) != hu4Var) {
                            wfeVar7 = wfeVar3;
                            s04Var5 = s04Var4;
                            q24Var5 = q24Var3;
                            bqVar5 = this.e;
                            if (bqVar5 == null) {
                                bqVar5 = null;
                            }
                            ((b) bqVar5.E.getValue()).d(s04Var5, (sfa) wfeVar7.a);
                            bqVar6 = this.e;
                            if (bqVar6 == null) {
                                bqVar6 = null;
                            }
                            bqVar6.f().a(new az3(q24Var5, c0a.s(((ky3) wfeVar7.a).a)));
                            bq bqVar12 = this.e;
                            (bqVar12 != null ? bqVar12 : null).f().a(new wy3(q24Var5));
                            return sbiVar;
                        }
                    }
                }
                return hu4Var;
            }
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                a4cVar4.c(je9Var2, "CommentSendApiTask", "onCommentSend chat is null", null);
                return sbiVar;
            }
        }
        return sbiVar;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        s4b s4bVar = (s4b) kihVar;
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        wmi wmiVarL = bqVar.l();
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        yab.i0(wmiVarL, ((n0c) bqVar2.h()).a(), 0, new f00(this, s4bVar, null), 2);
    }

    @Override // defpackage.btc
    public final void d() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        wmi wmiVarL = bqVar.l();
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        yab.i0(wmiVarL, ((n0c) bqVar2.h()).a(), 0, new k23(this, null, 22), 2);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        wmi wmiVarL = bqVar.l();
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        yab.i0(wmiVarL, ((n0c) bqVar2.h()).a(), 0, new jd3(this, yhhVar, (lq4) null, 10), 2);
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.CommentSend commentSend = new Tasks.CommentSend();
        commentSend.requestId = this.a;
        commentSend.commentId = this.g;
        q24 q24Var = this.f;
        commentSend.parentChatServerId = q24Var.a();
        commentSend.parentMessageServerId = q24Var.b();
        commentSend.traceId = this.h;
        return sia.toByteArray(commentSend);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_COMMENT_SEND;
    }

    @Override // defpackage.btc
    public final atc j() throws Exception {
        String str;
        atc atcVar = atc.c;
        gm0.n("CommentSendApiTask", "onPreExecute");
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        ky3 ky3VarS = bqVar.g().s(this.g);
        if (ky3VarS == null) {
            y(f4b.EMPTY_MESSAGE_IN_API_TASK);
            return atcVar;
        }
        if (iz3.a(ky3VarS)) {
            bq bqVar2 = this.e;
            (bqVar2 != null ? bqVar2 : null).g().l(this.g);
            y(f4b.MSG_DELETED_BEFORE_SEND);
            return atcVar;
        }
        if (ky3VarS.j == wja.DELETED) {
            y(f4b.MESSAGE_UNEXPECTED_DELETED_STATUS);
            return atcVar;
        }
        if (ky3VarS.i == xfa.ERROR) {
            y(f4b.UPLOAD_FAILED);
            return atcVar;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                q24 q24Var = this.f;
                long j = ky3VarS.a;
                long j2 = ky3VarS.b;
                StringBuilder sb = new StringBuilder("onPreExecute: commentsId = ");
                sb.append(q24Var);
                sb.append(", messageId = ");
                sb.append(j);
                a4cVar.c(je9Var, "CommentSendApiTask", qt4.k(j2, ", serverMessageId = ", sb), null);
            }
        }
        if (!l70.a(ky3VarS)) {
            gm0.n("CommentSendApiTask", "onPreExecute: attaches not ready, SKIP");
            return atc.b;
        }
        try {
            zic zicVarZ = z(ky3VarS);
            b50 b50Var = zicVarZ.c;
            if ((b50Var != null && !b50Var.isEmpty()) || (((str = zicVarZ.b) != null && str.length() != 0) || zicVarZ.d != null)) {
                bq bqVar3 = this.e;
                (bqVar3 != null ? bqVar3 : null).j().I(this.h);
                return atc.a;
            }
            gm0.m("CommentSendApiTask", "createRequest: empty outgoing message commentsId = %s, messageId = %s", this.f, Long.valueOf(this.g));
            f(new yhh("android.empty.message.and.attach", "MsgSend with empty text and attaches", null));
            bq bqVar4 = this.e;
            if (bqVar4 == null) {
                bqVar4 = null;
            }
            qrc.m(bqVar4.j(), f4b.EMPTY_OUTGOING_MESSAGE, this.h, null, 28);
            return atcVar;
        } catch (Exception e) {
            bq bqVar5 = this.e;
            if (bqVar5 == null) {
                bqVar5 = null;
            }
            qrc.m(bqVar5.j(), f4b.UNKNOWN_ERROR_GET_OUTGOING, this.h, null, 28);
            throw e;
        }
    }

    @Override // defpackage.btc
    public final int l() {
        return 5;
    }

    @Override // defpackage.aq
    public final Object m() throws Exception {
        String str;
        gm0.n("CommentSendApiTask", "createRequest");
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        l34 l34VarG = bqVar.g();
        long j = this.g;
        ky3 ky3VarS = l34VarG.s(j);
        String str2 = this.h;
        if (ky3VarS == null) {
            gm0.x("CommentSendApiTask", "messageDb is null", null);
            bq bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = null;
            }
            qrc.m(bqVar2.j(), f4b.NON_EXISTED_MESSAGE_IN_API_TASK, str2, null, 28);
            return null;
        }
        try {
            zic zicVarZ = z(ky3VarS);
            b50 b50Var = zicVarZ.c;
            q24 q24Var = this.f;
            if ((b50Var != null && !b50Var.isEmpty()) || (((str = zicVarZ.b) != null && str.length() != 0) || zicVarZ.d != null)) {
                return new h3b(q24Var.a(), new Long(q24Var.b()), zicVarZ);
            }
            gm0.m("CommentSendApiTask", "createRequest: empty outgoing message commentsId = %s, commentId = %s", q24Var, new Long(j));
            f(new yhh("android.empty.message.and.attach", "MsgSend with empty text and attaches", null));
            bq bqVar3 = this.e;
            if (bqVar3 == null) {
                bqVar3 = null;
            }
            qrc.m(bqVar3.j(), f4b.EMPTY_OUTGOING_MESSAGE, str2, null, 28);
            ore.k("MsgSend with empty text and attaches");
            return null;
        } catch (Exception e) {
            bq bqVar4 = this.e;
            if (bqVar4 == null) {
                bqVar4 = null;
            }
            qrc.m(bqVar4.j(), f4b.UNKNOWN_ERROR_GET_OUTGOING, str2, null, 28);
            throw e;
        }
    }

    public final void y(f4b f4bVar) {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        qrc.m(bqVar.j(), f4bVar, this.h, null, 28);
    }

    public final zic z(ky3 ky3Var) {
        bjc bjcVar;
        eka ekaVar;
        int i;
        c46 c46Var = ky3Var.n;
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        b50 b50VarD = pm9.d(c46Var, (wo6) bqVar.V.getValue());
        if (ky3Var.q == null) {
            bjcVar = null;
        } else {
            int i2 = ky3Var.o;
            if (i2 != 1) {
                i = i2 != 2 ? 1 : 3;
            } else {
                i = 2;
            }
            if (i == 2) {
                bjcVar = new bjc(i, Long.valueOf(ky3Var.K.a()), ky3Var.y, Long.valueOf(ky3Var.K.b()));
            } else {
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CommentSendApiTask", "trying to send unsupported link type " + r5a.l(i) + " to comments: " + ky3Var.K, null);
                    }
                }
                bjcVar = null;
            }
        }
        ArrayList arrayListS = pm9.s(ky3Var.D);
        s60 s60Var = new s60();
        s60Var.d(ky3Var.f);
        s60Var.q(ky3Var.g);
        s60Var.c(b50VarD);
        s60Var.m(bjcVar);
        int i3 = ky3Var.J;
        if (i3 == 0) {
            ekaVar = null;
        } else {
            int iD = qt4.D(i3);
            if (iD == 1) {
                ekaVar = eka.USER;
            } else if (iD == 2) {
                ekaVar = eka.GROUP;
            } else if (iD != 3) {
                ekaVar = iD != 4 ? eka.UNKNOWN : eka.CHANNEL_ADMIN;
            } else {
                ekaVar = eka.CHANNEL;
            }
        }
        s60Var.o(ekaVar);
        s60Var.i(ky3Var.u);
        s60Var.j(arrayListS);
        s60Var.f(null);
        return s60Var.b();
    }
}
