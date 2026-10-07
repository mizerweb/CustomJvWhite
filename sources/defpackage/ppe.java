package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class ppe {
    public final ouh a;
    public final String b = ppe.class.getName();
    public final fgf c;
    public final ConcurrentLinkedQueue d;
    public final l9b e;

    public ppe(int i, ouh ouhVar) {
        this.a = ouhVar;
        int i2 = ggf.a;
        this.c = new fgf(i);
        this.d = new ConcurrentLinkedQueue();
        this.e = new l9b();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #0 {all -> 0x0098, blocks: (B:29:0x007b, B:32:0x0087, B:35:0x008c, B:37:0x0092, B:40:0x009b, B:46:0x00ab, B:43:0x00a0, B:45:0x00a6), top: B:52:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:29:0x007b, B:32:0x0087, B:35:0x008c, B:37:0x0092, B:40:0x009b, B:46:0x00ab, B:43:0x00a0, B:45:0x00a6), top: B:52:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(nq4 nq4Var) {
        mpe mpeVar;
        l9b l9bVar;
        nuh nuhVar;
        String str;
        a4c a4cVar;
        a4c a4cVar2;
        je9 je9Var = je9.d;
        if (nq4Var instanceof mpe) {
            mpeVar = (mpe) nq4Var;
            int i = mpeVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpeVar.g = i - Integer.MIN_VALUE;
            } else {
                mpeVar = new mpe(this, nq4Var);
            }
        } else {
            mpeVar = new mpe(this, nq4Var);
        }
        Object obj = mpeVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = mpeVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            String str2 = this.b;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                fgf fgfVar = this.c;
                fgfVar.getClass();
                a4cVar3.c(je9Var, str2, zo5.h(Math.max(egf.g.get(fgfVar), 0), "execute: trying acquire connection, current permits="), null);
            }
            fgf fgfVar2 = this.c;
            mpeVar.g = 1;
            if (fgfVar2.a(mpeVar) != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(obj);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = mpeVar.d;
            ch3.d0(obj);
        }
        try {
            nuhVar = (nuh) this.d.poll();
            str = this.b;
            if (nuhVar != null) {
                a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str, "Reusing existing connection", null);
                }
            } else {
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Creating new connection", null);
                }
                ouh ouhVar = this.a;
                ouhVar.getClass();
                nuhVar = new nuh(ouhVar.a, ouhVar.d, ouhVar.b, ouhVar.c, ouhVar.e);
            }
            return nuhVar;
        } finally {
            l9bVar.g(null);
        }
        l9b l9bVar2 = this.e;
        mpeVar.d = l9bVar2;
        mpeVar.g = 2;
        if (l9bVar2.b(mpeVar) != hu4Var) {
            l9bVar = l9bVar2;
            nuhVar = (nuh) this.d.poll();
            str = this.b;
            if (nuhVar != null) {
                a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    a4cVar2.c(je9Var, str, "Reusing existing connection", null);
                }
            } else {
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    a4cVar.c(je9Var, str, "Creating new connection", null);
                }
                ouh ouhVar2 = this.a;
                ouhVar2.getClass();
                nuhVar = new nuh(ouhVar2.a, ouhVar2.d, ouhVar2.b, ouhVar2.c, ouhVar2.e);
            }
            return nuhVar;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #1 {all -> 0x00a7, blocks: (B:38:0x0094, B:26:0x0067, B:28:0x006d, B:37:0x008e, B:43:0x00aa, B:46:0x00b6, B:48:0x00be, B:40:0x009a), top: B:56:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a A[Catch: all -> 0x00a7, TryCatch #1 {all -> 0x00a7, blocks: (B:38:0x0094, B:26:0x0067, B:28:0x006d, B:37:0x008e, B:43:0x00aa, B:46:0x00b6, B:48:0x00be, B:40:0x009a), top: B:56:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0086 -> B:33:0x0087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x008e -> B:34:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppe.b(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r3.b(r1) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        if (((defpackage.nuh) r9).a(r1) == r2) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.fd4 r9, defpackage.nq4 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Connection returned to pool, pool size="
            boolean r1 = r10 instanceof defpackage.ope
            if (r1 == 0) goto L15
            r1 = r10
            ope r1 = (defpackage.ope) r1
            int r2 = r1.h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.h = r2
            goto L1a
        L15:
            ope r1 = new ope
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.f
            hu4 r2 = defpackage.hu4.a
            int r3 = r1.h
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2e
            defpackage.ch3.d0(r10)
            goto Lac
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r6
        L34:
            l9b r9 = r1.e
            nuh r1 = r1.d
            defpackage.ch3.d0(r10)
            r3 = r9
            r9 = r1
            goto L6b
        L3e:
            defpackage.ch3.d0(r10)
            boolean r10 = r9 instanceof defpackage.nuh
            if (r10 == 0) goto L9f
            r10 = r9
            nuh r10 = (defpackage.nuh) r10
            guh r3 = r10.i
            if (r3 == 0) goto L9f
            boolean r7 = r3.f
            if (r7 != 0) goto L9f
            boolean r7 = r3.g
            if (r7 != 0) goto L9f
            boolean r7 = r3.i
            if (r7 != 0) goto L9f
            boolean r3 = r3.j
            if (r3 != 0) goto L9f
            l9b r3 = r8.e
            r1.d = r10
            r1.e = r3
            r1.h = r5
            java.lang.Object r10 = r3.b(r1)
            if (r10 != r2) goto L6b
            goto Lab
        L6b:
            java.util.concurrent.ConcurrentLinkedQueue r10 = r8.d     // Catch: java.lang.Throwable -> L95
            r10.offer(r9)     // Catch: java.lang.Throwable -> L95
            java.lang.String r9 = r8.b     // Catch: java.lang.Throwable -> L95
            a4c r10 = defpackage.gm0.f     // Catch: java.lang.Throwable -> L95
            if (r10 != 0) goto L77
            goto L97
        L77:
            je9 r1 = defpackage.je9.d     // Catch: java.lang.Throwable -> L95
            boolean r2 = r10.b(r1)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L97
            java.util.concurrent.ConcurrentLinkedQueue r2 = r8.d     // Catch: java.lang.Throwable -> L95
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L95
            r4.append(r2)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L95
            r10.c(r1, r9, r0, r6)     // Catch: java.lang.Throwable -> L95
            goto L97
        L95:
            r8 = move-exception
            goto L9b
        L97:
            r3.g(r6)
            goto Lac
        L9b:
            r3.g(r6)
            throw r8
        L9f:
            r1.d = r6
            r1.h = r4
            nuh r9 = (defpackage.nuh) r9
            java.lang.Object r9 = r9.a(r1)
            if (r9 != r2) goto Lac
        Lab:
            return r2
        Lac:
            fgf r8 = r8.c
            r8.d()
            sbi r8 = defpackage.sbi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppe.c(fd4, nq4):java.lang.Object");
    }
}
