package defpackage;

import java.util.ArrayList;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class yrj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final ny8 c;
    public final Set d;
    public final p41 e;
    public jdj f;

    public yrj(qs8 qs8Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = qs8Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        ma6 ma6Var = trj.g;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            arrayList.add(((trj) y1Var.next()).a);
        }
        this.d = ww3.X1(arrayList);
        this.e = yab.b(0, 0, null, 7);
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
        this.f = jdjVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v9 java.lang.Object, still in use, count: 2, list:
          (r3v9 java.lang.Object) from 0x0053: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v9 java.lang.Object) binds: [B:19:0x0052, B:71:0x0053] A[DONT_GENERATE, DONT_INLINE]
          (r3v9 java.lang.Object) from 0x0047: CHECK_CAST (trj) (r3v9 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.os8
    public final java.lang.Object c(java.lang.String r13, java.lang.String r14, defpackage.lq4 r15) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrj.c(java.lang.String, java.lang.String, lq4):java.lang.Object");
    }

    @Override // defpackage.os8
    public final p41 d() {
        return this.e;
    }

    @Override // defpackage.os8
    public final Set e() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[PHI: r1 r3 r4
  0x0046: PHI (r1v10 qrj) = (r1v8 qrj), (r1v18 qrj) binds: [B:40:0x00e5, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r3v3 mpj) = (r3v2 mpj), (r3v5 mpj) binds: [B:40:0x00e5, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r4v6 trj) = (r4v4 trj), (r4v8 trj) binds: [B:40:0x00e5, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object f(String str, nq4 nq4Var) {
        vrj vrjVar;
        trj trjVar;
        Object objA;
        trj trjVar2;
        mpj mpjVar;
        qrj qrjVar;
        p41 p41Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof vrj) {
            vrjVar = (vrj) nq4Var;
            int i = vrjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                vrjVar.i = i - Integer.MIN_VALUE;
            } else {
                vrjVar = new vrj(this, nq4Var);
            }
        } else {
            vrjVar = new vrj(this, nq4Var);
        }
        vrj vrjVar2 = vrjVar;
        Object obj = vrjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = vrjVar2.i;
        lq4 lq4Var = null;
        if (i2 != 0) {
            if (i2 == 1) {
                trjVar = vrjVar2.d;
                ch3.d0(obj);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qrjVar = vrjVar2.f;
                mpjVar = vrjVar2.e;
                trjVar2 = vrjVar2.d;
                ch3.d0(obj);
            }
            qrj qrjVar2 = qrjVar;
            q40 q40Var = new q40(mpjVar, this, trjVar2, lq4Var, 9);
            vrjVar2.d = null;
            vrjVar2.e = null;
            vrjVar2.f = null;
            vrjVar2.i = 3;
            return qrjVar2.c(q40Var, vrjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(obj);
        trj trjVar3 = trj.SETUP_SCREEN_CAPTURE_BEHAVIOR;
        qs8 qs8Var = this.a;
        l44 l44Var = (l44) this.c.getValue();
        p41 p41Var2 = this.e;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(mpj.Companion.serializer(), str);
            trjVar2 = trjVar3;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + trjVar3, webAppJsonException);
                }
            }
            vrjVar2.d = trjVar3;
            vrjVar2.e = null;
            vrjVar2.f = null;
            vrjVar2.i = 1;
            if (l44Var.a(p41Var2, ks8Var, trjVar3, null, vrjVar2) != hu4Var) {
                trjVar = trjVar3;
                trjVar2 = trjVar;
                objA = null;
            }
        }
        mpjVar = (mpj) objA;
        if (mpjVar != null) {
            qrjVar = new qrj(mpjVar.b);
            p41Var = this.e;
            vrjVar2.d = trjVar2;
            vrjVar2.e = mpjVar;
            vrjVar2.f = qrjVar;
            vrjVar2.i = 2;
            if (p41Var.a(vrjVar2, qrjVar) != hu4Var) {
                qrj qrjVar3 = qrjVar;
                q40 q40Var2 = new q40(mpjVar, this, trjVar2, lq4Var, 9);
                vrjVar2.d = null;
                vrjVar2.e = null;
                vrjVar2.f = null;
                vrjVar2.i = 3;
                if (qrjVar3.c(q40Var2, vrjVar2) == hu4Var) {
                }
            }
        }
        trjVar2 = trjVar;
        objA = null;
        mpjVar = (mpj) objA;
        if (mpjVar != null) {
            qrjVar = new qrj(mpjVar.b);
            p41Var = this.e;
            vrjVar2.d = trjVar2;
            vrjVar2.e = mpjVar;
            vrjVar2.f = qrjVar;
            vrjVar2.i = 2;
            if (p41Var.a(vrjVar2, qrjVar) != hu4Var) {
                qrj qrjVar4 = qrjVar;
                q40 q40Var3 = new q40(mpjVar, this, trjVar2, lq4Var, 9);
                vrjVar2.d = null;
                vrjVar2.e = null;
                vrjVar2.f = null;
                vrjVar2.i = 3;
                if (qrjVar4.c(q40Var3, vrjVar2) == hu4Var) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r6.a(r8, r6, r7, null, r9) == r3) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r17, defpackage.nq4 r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            sbi r2 = defpackage.sbi.a
            boolean r3 = r0 instanceof defpackage.wrj
            if (r3 == 0) goto L1a
            r3 = r0
            wrj r3 = (defpackage.wrj) r3
            int r4 = r3.f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f = r4
        L18:
            r9 = r3
            goto L20
        L1a:
            wrj r3 = new wrj
            r3.<init>(r1, r0)
            goto L18
        L20:
            java.lang.Object r0 = r9.d
            hu4 r3 = defpackage.hu4.a
            int r4 = r9.f
            r5 = 1
            r10 = 2
            r11 = 0
            if (r4 == 0) goto L3d
            if (r4 == r5) goto L39
            if (r4 != r10) goto L33
            defpackage.ch3.d0(r0)
            return r2
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r11
        L39:
            defpackage.ch3.d0(r0)
            goto La6
        L3d:
            defpackage.ch3.d0(r0)
            qs8 r4 = r1.a
            trj r7 = defpackage.trj.SETUP_BACK_BUTTON
            ny8 r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            r6 = r0
            l44 r6 = (defpackage.l44) r6
            p41 r8 = r1.e
            r12 = r6
            ks8 r6 = new ks8
            ns8 r0 = new ns8
            java.lang.String r13 = "json_decode_error"
            r0.<init>(r13, r10)
            r6.<init>(r0)
            r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L6e
            fpj r0 = defpackage.gpj.Companion     // Catch: java.lang.IllegalArgumentException -> L6e
            aw8 r0 = r0.serializer()     // Catch: java.lang.IllegalArgumentException -> L6e
            aw8 r0 = (defpackage.aw8) r0     // Catch: java.lang.IllegalArgumentException -> L6e
            r13 = r17
            java.lang.Object r11 = r4.a(r0, r13)     // Catch: java.lang.IllegalArgumentException -> L6e
            goto La7
        L6e:
            r0 = move-exception
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            one.me.webapp.domain.jsbridge.WebAppJsonException r13 = new one.me.webapp.domain.jsbridge.WebAppJsonException
            r13.<init>(r0)
            a4c r0 = defpackage.gm0.f
            if (r0 != 0) goto L81
            goto L9a
        L81:
            je9 r14 = defpackage.je9.f
            boolean r15 = r0.b(r14)
            if (r15 == 0) goto L9a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r11 = "json parse error at: "
            r15.<init>(r11)
            r15.append(r7)
            java.lang.String r11 = r15.toString()
            r0.c(r14, r4, r11, r13)
        L9a:
            r9.f = r5
            r5 = r8
            r8 = 0
            r4 = r12
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9)
            if (r0 != r3) goto La6
            goto Lbd
        La6:
            r11 = 0
        La7:
            gpj r11 = (defpackage.gpj) r11
            if (r11 != 0) goto Lac
            goto Lbe
        Lac:
            p41 r0 = r1.e
            rrj r1 = new rrj
            boolean r4 = r11.a
            r1.<init>(r4)
            r9.f = r10
            java.lang.Object r0 = r0.a(r9, r1)
            if (r0 != r3) goto Lbe
        Lbd:
            return r3
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrj.g(java.lang.String, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r6.a(r8, r6, r7, null, r9) == r3) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r17, defpackage.nq4 r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            sbi r2 = defpackage.sbi.a
            boolean r3 = r0 instanceof defpackage.xrj
            if (r3 == 0) goto L1a
            r3 = r0
            xrj r3 = (defpackage.xrj) r3
            int r4 = r3.f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f = r4
        L18:
            r9 = r3
            goto L20
        L1a:
            xrj r3 = new xrj
            r3.<init>(r1, r0)
            goto L18
        L20:
            java.lang.Object r0 = r9.d
            hu4 r3 = defpackage.hu4.a
            int r4 = r9.f
            r5 = 1
            r10 = 2
            r11 = 0
            if (r4 == 0) goto L3d
            if (r4 == r5) goto L39
            if (r4 != r10) goto L33
            defpackage.ch3.d0(r0)
            return r2
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r11
        L39:
            defpackage.ch3.d0(r0)
            goto La6
        L3d:
            defpackage.ch3.d0(r0)
            qs8 r4 = r1.a
            trj r7 = defpackage.trj.SETUP_CLOSING_BEHAVIOUR
            ny8 r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            r6 = r0
            l44 r6 = (defpackage.l44) r6
            p41 r8 = r1.e
            r12 = r6
            ks8 r6 = new ks8
            ns8 r0 = new ns8
            java.lang.String r13 = "json_decode_error"
            r0.<init>(r13, r10)
            r6.<init>(r0)
            r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L6e
            ipj r0 = defpackage.jpj.Companion     // Catch: java.lang.IllegalArgumentException -> L6e
            aw8 r0 = r0.serializer()     // Catch: java.lang.IllegalArgumentException -> L6e
            aw8 r0 = (defpackage.aw8) r0     // Catch: java.lang.IllegalArgumentException -> L6e
            r13 = r17
            java.lang.Object r11 = r4.a(r0, r13)     // Catch: java.lang.IllegalArgumentException -> L6e
            goto La7
        L6e:
            r0 = move-exception
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            one.me.webapp.domain.jsbridge.WebAppJsonException r13 = new one.me.webapp.domain.jsbridge.WebAppJsonException
            r13.<init>(r0)
            a4c r0 = defpackage.gm0.f
            if (r0 != 0) goto L81
            goto L9a
        L81:
            je9 r14 = defpackage.je9.f
            boolean r15 = r0.b(r14)
            if (r15 == 0) goto L9a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r11 = "json parse error at: "
            r15.<init>(r11)
            r15.append(r7)
            java.lang.String r11 = r15.toString()
            r0.c(r14, r4, r11, r13)
        L9a:
            r9.f = r5
            r5 = r8
            r8 = 0
            r4 = r12
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9)
            if (r0 != r3) goto La6
            goto Lbd
        La6:
            r11 = 0
        La7:
            jpj r11 = (defpackage.jpj) r11
            if (r11 != 0) goto Lac
            goto Lbe
        Lac:
            p41 r0 = r1.e
            prj r1 = new prj
            boolean r4 = r11.a
            r1.<init>(r4)
            r9.f = r10
            java.lang.Object r0 = r0.a(r9, r1)
            if (r0 != r3) goto Lbe
        Lbd:
            return r3
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrj.h(java.lang.String, nq4):java.lang.Object");
    }
}
