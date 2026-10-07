package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class m31 {
    public final xt4 a;
    public final xt4 b;
    public final long c;
    public final qf7 d;
    public final cf7 e;
    public final qf7 f;
    public final String g;
    public final pzf h;
    public final pzf i;
    public final AtomicBoolean j;
    public final ArrayList k;
    public final CopyOnWriteArrayList l;

    public m31(String str, xt4 xt4Var, xt4 xt4Var2, gu4 gu4Var, long j, qf7 qf7Var, cf7 cf7Var, wf0 wf0Var, int i) {
        if ((i & 16) != 0) {
            ghb ghbVar = ew5.b;
            j = qe7.P(300L, lw5.MILLISECONDS);
        }
        qf7 dzVar = (i & np0.m) != 0 ? new dz(3) : wf0Var;
        this.a = xt4Var;
        this.b = xt4Var2;
        this.c = j;
        this.d = qf7Var;
        this.e = cf7Var;
        this.f = dzVar;
        this.g = "Buffer:".concat(str);
        this.h = e9i.b(1, 0, 2);
        this.i = e9i.b(0, Integer.MAX_VALUE, 1);
        this.j = new AtomicBoolean(false);
        this.k = new ArrayList();
        this.l = new CopyOnWriteArrayList();
        yab.i0(gu4Var, null, 0, new qn6(this, (lq4) null, 7), 3);
    }

    public static final Object a(m31 m31Var, j31 j31Var) {
        ArrayList arrayList = m31Var.k;
        CopyOnWriteArrayList copyOnWriteArrayList = m31Var.l;
        if (!copyOnWriteArrayList.isEmpty()) {
            arrayList.addAll(copyOnWriteArrayList);
            copyOnWriteArrayList.clear();
        }
        if (!arrayList.isEmpty()) {
            List listT1 = ww3.T1(arrayList);
            arrayList.clear();
            Object objD = m31Var.d(listT1, j31Var);
            if (objD == hu4.a) {
                return objD;
            }
        }
        return sbi.a;
    }

    public final void b(Object obj) {
        if (this.j.get()) {
            pzf pzfVar = this.i;
            if (((Number) ((t7h) pzfVar.c()).getValue()).intValue() != 0) {
                pzfVar.a(obj);
                return;
            }
        }
        this.l.add(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r6.p(r0) == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.nq4 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.f31
            if (r0 == 0) goto L13
            r0 = r7
            f31 r0 = (defpackage.f31) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            f31 r0 = new f31
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 0
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r2) goto L2b
            defpackage.ch3.d0(r7)
            goto L5d
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r3
        L31:
            i64 r6 = r0.d
            defpackage.ch3.d0(r7)
            goto L52
        L37:
            defpackage.ch3.d0(r7)
            i64 r7 = new i64
            r7.<init>()
            ffh r1 = new ffh
            r1.<init>(r7)
            r0.d = r7
            r0.g = r4
            pzf r6 = r6.h
            java.lang.Object r6 = r6.emit(r1, r0)
            if (r6 != r5) goto L51
            goto L5c
        L51:
            r6 = r7
        L52:
            r0.d = r3
            r0.g = r2
            java.lang.Object r6 = r6.p(r0)
            if (r6 != r5) goto L5d
        L5c:
            return r5
        L5d:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m31.c(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(List list, nq4 nq4Var) {
        i31 i31Var;
        long j;
        if (nq4Var instanceof i31) {
            i31Var = (i31) nq4Var;
            int i = i31Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                i31Var.h = i - Integer.MIN_VALUE;
            } else {
                i31Var = new i31(this, nq4Var);
            }
        } else {
            i31Var = new i31(this, nq4Var);
        }
        Object obj = i31Var.f;
        int i2 = i31Var.h;
        sbi sbiVar = sbi.a;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                if (!list.isEmpty()) {
                    long jNanoTime = System.nanoTime();
                    xt4 xt4Var = this.a;
                    qob qobVar = new qob(this, list, null, 9);
                    i31Var.d = list;
                    i31Var.e = jNanoTime;
                    i31Var.h = 1;
                    Object objK0 = yab.K0(xt4Var, qobVar, i31Var);
                    hu4 hu4Var = hu4.a;
                    if (objK0 == hu4Var) {
                        return hu4Var;
                    }
                    j = jNanoTime;
                }
                return sbiVar;
            }
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = i31Var.e;
            list = i31Var.d;
            ch3.d0(obj);
            if (!list.isEmpty()) {
                long jG = ew5.g(qe7.P(System.nanoTime() - j, lw5.NANOSECONDS));
                this.f.invoke(this.g, "Processed " + list.size() + " items in " + jG + "ms");
            }
            return sbiVar;
        } catch (Throwable th) {
            this.e.invoke(th);
            return sbiVar;
        }
    }
}
