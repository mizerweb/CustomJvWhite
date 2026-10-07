package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class hkj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final ny8 c;
    public final Set d;
    public final p41 e;
    public jdj f;

    public hkj(qs8 qs8Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = qs8Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        ma6 ma6Var = dkj.f;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            arrayList.add(((dkj) y1Var.next()).a);
        }
        this.d = ww3.X1(arrayList);
        this.e = yab.b(0, 0, null, 7);
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
        this.f = jdjVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (g(r13, r1) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        if (f(r13, r1) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        return r2;
     */
    @Override // defpackage.os8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r12, java.lang.String r13, defpackage.lq4 r14) {
        /*
            r11 = this;
            sbi r0 = defpackage.sbi.a
            boolean r1 = r14 instanceof defpackage.ekj
            if (r1 == 0) goto L15
            r1 = r14
            ekj r1 = (defpackage.ekj) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.g = r2
            goto L1c
        L15:
            ekj r1 = new ekj
            nq4 r14 = (defpackage.nq4) r14
            r1.<init>(r11, r14)
        L1c:
            java.lang.Object r14 = r1.e
            hu4 r2 = defpackage.hu4.a
            int r3 = r1.g
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L38
            if (r3 == r5) goto L2b
            if (r3 != r4) goto L32
        L2b:
            dkj r12 = r1.d
            defpackage.ch3.d0(r14)
            goto Lab
        L32:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            return r6
        L38:
            defpackage.ch3.d0(r14)
            ma6 r14 = defpackage.dkj.f
            java.util.Iterator r14 = r14.iterator()
        L41:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r14.next()
            r7 = r3
            dkj r7 = (defpackage.dkj) r7
            java.lang.String r7 = r7.a
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L41
            goto L58
        L57:
            r3 = r6
        L58:
            r14 = r3
            dkj r14 = (defpackage.dkj) r14
            if (r14 != 0) goto L87
            java.lang.Class<hkj> r13 = defpackage.hkj.class
            java.lang.String r3 = r13.getName()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Unknown method with name = "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = " in JsDelegate: "
            r13.append(r12)
            r13.append(r11)
            java.lang.String r4 = r13.toString()
            a4c r1 = defpackage.gm0.f
            if (r1 == 0) goto Lc7
            je9 r2 = defpackage.je9.g
            r6 = 0
            r7 = 8
            r5 = 0
            defpackage.a4c.f(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L87:
            int r12 = r14.ordinal()
            if (r12 == 0) goto La0
            if (r12 != r5) goto L9c
            r1.d = r14
            r1.g = r4
            java.lang.Object r12 = r11.g(r13, r1)
            if (r12 != r2) goto L9a
            goto Laa
        L9a:
            r12 = r14
            goto Lab
        L9c:
            defpackage.ore.o()
            return r6
        La0:
            r1.d = r14
            r1.g = r5
            java.lang.Object r12 = r11.f(r13, r1)
            if (r12 != r2) goto L9a
        Laa:
            return r2
        Lab:
            java.lang.String r2 = r12.a
            jdj r12 = r11.f
            if (r12 == 0) goto Lc7
            ny8 r11 = r11.b
            java.lang.Object r11 = r11.getValue()
            r1 = r11
            fgj r1 = (defpackage.fgj) r1
            long r3 = r12.a
            java.lang.String r5 = r12.b
            r9 = 0
            r10 = 240(0xf0, float:3.36E-43)
            r6 = 1
            r7 = 0
            r8 = 0
            defpackage.fgj.a(r1, r2, r3, r5, r6, r7, r8, r9, r10)
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkj.c(java.lang.String, java.lang.String, lq4):java.lang.Object");
    }

    @Override // defpackage.os8
    public final p41 d() {
        return this.e;
    }

    @Override // defpackage.os8
    public final Set e() {
        return this.d;
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
    public final java.lang.Object f(java.lang.String r17, defpackage.nq4 r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            sbi r2 = defpackage.sbi.a
            boolean r3 = r0 instanceof defpackage.fkj
            if (r3 == 0) goto L1a
            r3 = r0
            fkj r3 = (defpackage.fkj) r3
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
            fkj r3 = new fkj
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
            dkj r7 = defpackage.dkj.OPEN_LINK
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
            bmj r0 = defpackage.cmj.Companion     // Catch: java.lang.IllegalArgumentException -> L6e
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
            cmj r11 = (defpackage.cmj) r11
            if (r11 != 0) goto Lac
            goto Lbe
        Lac:
            p41 r0 = r1.e
            bkj r1 = new bkj
            java.lang.String r4 = r11.a
            r1.<init>(r4)
            r9.f = r10
            java.lang.Object r0 = r0.a(r9, r1)
            if (r0 != r3) goto Lbe
        Lbd:
            return r3
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkj.f(java.lang.String, nq4):java.lang.Object");
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
            boolean r3 = r0 instanceof defpackage.gkj
            if (r3 == 0) goto L1a
            r3 = r0
            gkj r3 = (defpackage.gkj) r3
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
            gkj r3 = new gkj
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
            dkj r7 = defpackage.dkj.OPEN_MAX_LINK
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
            emj r0 = defpackage.fmj.Companion     // Catch: java.lang.IllegalArgumentException -> L6e
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
            fmj r11 = (defpackage.fmj) r11
            if (r11 != 0) goto Lac
            goto Lbe
        Lac:
            p41 r0 = r1.e
            akj r1 = new akj
            java.lang.String r4 = r11.a
            r1.<init>(r4)
            r9.f = r10
            java.lang.Object r0 = r0.a(r9, r1)
            if (r0 != r3) goto Lbe
        Lbd:
            return r3
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkj.g(java.lang.String, nq4):java.lang.Object");
    }
}
