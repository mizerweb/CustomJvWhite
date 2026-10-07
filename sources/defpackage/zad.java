package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public final class zad {
    public final int a;
    public final af7 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final af4[] f;
    public final fgf g;
    public final zv h;

    public zad(int i, af7 af7Var) {
        this.a = i;
        this.b = af7Var;
        this.f = new af4[i];
        int i2 = ggf.a;
        this.g = new fgf(i);
        this.h = new zv(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(nq4 nq4Var) {
        vad vadVar;
        zv zvVar = this.h;
        if (nq4Var instanceof vad) {
            vadVar = (vad) nq4Var;
            int i = vadVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vadVar.f = i - Integer.MIN_VALUE;
            } else {
                vadVar = new vad(this, nq4Var);
            }
        } else {
            vadVar = new vad(this, nq4Var);
        }
        Object obj = vadVar.d;
        int i2 = vadVar.f;
        fgf fgfVar = this.g;
        if (i2 == 0) {
            ch3.d0(obj);
            vadVar.f = 1;
            Object objA = fgfVar.a(vadVar);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        try {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                if (this.e) {
                    n1g.a0(21, "Connection pool is closed");
                    throw null;
                }
                if (zvVar.isEmpty() && this.d < this.a) {
                    af4 af4Var = new af4((qxe) this.b.invoke());
                    af4[] af4VarArr = this.f;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    af4VarArr[i3] = af4Var;
                    zvVar.addLast(af4Var);
                }
                af4 af4Var2 = (af4) zvVar.removeLast();
                reentrantLock.unlock();
                return af4Var2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            fgfVar.d();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:29:0x0064, B:31:0x0068, B:35:0x0070, B:39:0x0077), top: B:46:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070 A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:29:0x0064, B:31:0x0068, B:35:0x0070, B:39:0x0077), top: B:46:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0077 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #1 {all -> 0x006c, blocks: (B:29:0x0064, B:31:0x0068, B:35:0x0070, B:39:0x0077), top: B:46:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0053 -> B:25:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0053
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r7, defpackage.cz1 r9, defpackage.nq4 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.wad
            if (r0 == 0) goto L13
            r0 = r10
            wad r0 = (defpackage.wad) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            wad r0 = new wad
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.g
            int r1 = r0.i
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            long r7 = r0.d
            wfe r9 = r0.f
            af7 r1 = r0.e
            defpackage.ch3.d0(r10)     // Catch: java.lang.Throwable -> L2c
            goto L55
        L2c:
            r10 = move-exception
            goto L5f
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r3
        L34:
            defpackage.ch3.d0(r10)
        L37:
            wfe r10 = new wfe
            r10.<init>()
            voc r1 = new voc     // Catch: java.lang.Throwable -> L5a
            r4 = 7
            r1.<init>(r10, r6, r3, r4)     // Catch: java.lang.Throwable -> L5a
            r0.e = r9     // Catch: java.lang.Throwable -> L5a
            r0.f = r10     // Catch: java.lang.Throwable -> L5a
            r0.d = r7     // Catch: java.lang.Throwable -> L5a
            r0.i = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r1 = defpackage.lvb.K0(r7, r1, r0)     // Catch: java.lang.Throwable -> L5a
            hu4 r4 = defpackage.hu4.a
            if (r1 != r4) goto L53
            return r4
        L53:
            r1 = r9
            r9 = r10
        L55:
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r3
            goto L64
        L5a:
            r1 = move-exception
            r5 = r1
            r1 = r9
            r9 = r10
            r10 = r5
        L5f:
            r5 = r10
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r5
        L64:
            boolean r4 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L6e
            r9.invoke()     // Catch: java.lang.Throwable -> L6c
            goto L75
        L6c:
            r7 = move-exception
            goto L78
        L6e:
            if (r0 != 0) goto L77
            java.lang.Object r10 = r10.a     // Catch: java.lang.Throwable -> L6c
            if (r10 == 0) goto L75
            return r10
        L75:
            r0 = r1
            goto L37
        L77:
            throw r0     // Catch: java.lang.Throwable -> L6c
        L78:
            java.lang.Object r8 = r10.a
            af4 r8 = (defpackage.af4) r8
            if (r8 == 0) goto L81
            r6.e(r8)
        L81:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zad.b(long, cz1, nq4):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (af4 af4Var : this.f) {
                if (af4Var != null) {
                    af4Var.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(StringBuilder sb) {
        zv zvVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            c79 c79VarW = yab.w();
            int i = zvVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                c79VarW.add(zvVar.get(i2));
            }
            c79 c79VarJ = yab.j(c79VarW);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            fgf fgfVar = this.g;
            fgfVar.getClass();
            sb2.append(Math.max(egf.g.get(fgfVar), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + c79VarJ.getSize() + ")[" + ww3.z1(c79VarJ, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            af4[] af4VarArr = this.f;
            int length = af4VarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                af4 af4Var = af4VarArr[i4];
                i3++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i3);
                sb3.append("] - ");
                sb3.append(af4Var != null ? af4Var.a.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (af4Var != null) {
                    af4Var.l(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(af4 af4Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(af4Var);
            reentrantLock.unlock();
            this.g.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
