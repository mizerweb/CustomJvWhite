package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x17 extends mdh implements qf7 {
    public int e;
    public int f;
    public a27 g;
    public Iterator h;
    public int i;
    public final /* synthetic */ a27 j;
    public final /* synthetic */ wo3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x17(a27 a27Var, wo3 wo3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = a27Var;
        this.k = wo3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new x17(this.j, this.k, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((x17) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d A[PHI: r0 r4 r5 r6
  0x005d: PHI (r0v8 int) = (r0v6 int), (r0v9 int) binds: [B:21:0x0055, B:28:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r4v6 int) = (r4v1 int), (r4v7 int) binds: [B:21:0x0055, B:28:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r5v1 java.util.Iterator) = (r5v0 java.util.Iterator), (r5v2 java.util.Iterator) binds: [B:21:0x0055, B:28:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r6v1 a27) = (r6v0 a27), (r6v2 a27) binds: [B:21:0x0055, B:28:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0081 -> B:27:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.i
            a27 r1 = r10.j
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1e
            if (r0 != r3) goto L17
            int r0 = r10.f
            int r4 = r10.e
            java.util.Iterator r5 = r10.h
            a27 r6 = r10.g
            defpackage.ch3.d0(r11)
            goto L84
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r10)
            r10 = 0
            return r10
        L1e:
            defpackage.ch3.d0(r11)
            sy4 r11 = r1.c
            java.lang.String r0 = r1.a
            gjg r11 = r11.j(r0)
            java.lang.Object r11 = r11.getValue()
            r17 r11 = (defpackage.r17) r11
            if (r11 == 0) goto L3f
            java.util.Set r11 = r11.d
            if (r11 == 0) goto L3f
            i37 r0 = defpackage.i37.UNREAD
            boolean r11 = r11.contains(r0)
            if (r11 != r3) goto L3f
            r11 = r3
            goto L40
        L3f:
            r11 = r2
        L40:
            wo3 r0 = r10.k
            java.util.Collection r0 = r0.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L55
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L55
            r2 = r3
            goto L90
        L55:
            java.util.Iterator r0 = r0.iterator()
            r4 = r11
            r5 = r0
            r6 = r1
            r0 = r2
        L5d:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L8e
            java.lang.Object r11 = r5.next()
            java.lang.Number r11 = (java.lang.Number) r11
            long r7 = r11.longValue()
            uy2 r11 = r6.b
            java.lang.String r9 = r6.a
            r10.g = r6
            r10.h = r5
            r10.e = r4
            r10.f = r0
            r10.i = r3
            java.lang.Boolean r11 = r11.h(r7, r9)
            hu4 r7 = defpackage.hu4.a
            if (r11 != r7) goto L84
            return r7
        L84:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L5d
        L8c:
            r11 = r4
            goto L90
        L8e:
            r2 = r3
            goto L8c
        L90:
            sbi r10 = defpackage.sbi.a
            if (r2 == 0) goto L97
            if (r11 != 0) goto L97
            return r10
        L97:
            defpackage.a27.a(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x17.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
