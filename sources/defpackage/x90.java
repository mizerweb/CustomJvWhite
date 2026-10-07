package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class x90 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final String f = x90.class.getName();

    public x90(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        if (r1 == r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        if (r1 == r8) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.x90 r30, long r31, defpackage.e70 r33, defpackage.b60 r34, android.net.Uri r35, defpackage.ns5 r36, java.lang.String r37, defpackage.nq4 r38) {
        /*
            r0 = r30
            r1 = r38
            boolean r2 = r1 instanceof defpackage.u90
            if (r2 == 0) goto L17
            r2 = r1
            u90 r2 = (defpackage.u90) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f = r3
            goto L1c
        L17:
            u90 r2 = new u90
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.d
            int r3 = r2.f
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L39
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2e
            defpackage.ch3.d0(r1)
            goto Lb3
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            r0 = 0
            return r0
        L35:
            defpackage.ch3.d0(r1)
            goto L9a
        L39:
            defpackage.ch3.d0(r1)
            r1 = r34
            long r13 = r1.a
            r1 = r33
            java.lang.String r10 = r1.t
            java.lang.String r19 = r35.toString()
            pjh r7 = new pjh
            r11 = 0
            r15 = 0
            r17 = 0
            r20 = 1
            r21 = 0
            r22 = 0
            java.lang.String r24 = ""
            r25 = 0
            r26 = 1
            r27 = 0
            r8 = r31
            r28 = r36
            r29 = r37
            r7.<init>(r8, r10, r11, r13, r15, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29)
            ny8 r1 = r0.e
            java.lang.Object r1 = r1.getValue()
            e5d r1 = (defpackage.e5d) r1
            b5d r1 = r1.W3
            zv8[] r3 = defpackage.e5d.S6
            r8 = 258(0x102, float:3.62E-43)
            r3 = r3[r8]
            i5d r1 = r1.a(r3)
            java.lang.Object r1 = r1.i()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            ny8 r3 = r0.b
            hu4 r8 = defpackage.hu4.a
            if (r1 == 0) goto La0
            java.lang.Object r0 = r3.getValue()
            wp6 r0 = (defpackage.wp6) r0
            r2.f = r6
            java.lang.Object r1 = r0.c(r7, r2)
            if (r1 != r8) goto L9a
            goto Lb2
        L9a:
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto Lb8
        L9e:
            r4 = r6
            goto Lb8
        La0:
            java.lang.Object r1 = r3.getValue()
            wp6 r1 = (defpackage.wp6) r1
            xc3 r1 = r1.b(r7)
            r2.f = r5
            java.lang.Enum r1 = r0.c(r1, r2)
            if (r1 != r8) goto Lb3
        Lb2:
            return r8
        Lb3:
            kyj r0 = defpackage.kyj.c
            if (r1 != r0) goto Lb8
            goto L9e
        Lb8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x90.a(x90, long, e70, b60, android.net.Uri, ns5, java.lang.String, nq4):java.lang.Object");
    }

    public final boolean b(e70 e70Var) {
        Object poeVar;
        String str = e70Var.u;
        boolean z = true;
        if (str != null && str.length() != 0) {
            File file = new File(e70Var.u);
            try {
                poeVar = Boolean.valueOf(file.exists() && file.canRead());
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Object obj = Boolean.FALSE;
            if (poeVar instanceof poe) {
                poeVar = obj;
            }
            if (((Boolean) poeVar).booleanValue()) {
                z = false;
            }
        }
        String str2 = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, s5h.x0("\n            Load audio message.\n                needDownload = " + z + ";\n                localPath = " + e70Var.u + ";\n                attachStatus = " + e70Var.q + ".\n            "), null);
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum c(xc3 xc3Var, nq4 nq4Var) {
        w90 w90Var;
        if (nq4Var instanceof w90) {
            w90Var = (w90) nq4Var;
            int i = w90Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                w90Var.f = i - Integer.MIN_VALUE;
            } else {
                w90Var = new w90(this, nq4Var);
            }
        } else {
            w90Var = new w90(this, nq4Var);
        }
        Object objO = w90Var.d;
        int i2 = w90Var.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objO);
            int i3 = 2;
            c9 c9Var = new c9(i3, lq4Var, i3);
            w90Var.f = 1;
            objO = e9i.O(xc3Var, c9Var, w90Var);
            hu4 hu4Var = hu4.a;
            if (objO == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objO);
        }
        lyj lyjVar = (lyj) objO;
        if (lyjVar != null) {
            return lyjVar.b;
        }
        return null;
    }
}
