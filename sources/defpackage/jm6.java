package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jm6 extends mdh implements qf7 {
    public Iterator e;
    public long f;
    public long g;
    public int h;
    public final /* synthetic */ List i;
    public final /* synthetic */ um6 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm6(List list, um6 um6Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = list;
        this.j = um6Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new jm6(this.i, this.j, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((jm6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x009e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:? A[PHI: r14
  PHI (r14v4 java.util.Iterator) = (r14v2 java.util.Iterator), (r14v3 java.util.Iterator), (r14v3 java.util.Iterator), (r14v6 java.util.Iterator) binds: [B:10:0x0028, B:21:0x00a3, B:23:0x00b1, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:11:0x0031->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a3 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b1 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:28:0x0048
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.h
            r1 = 2
            r2 = 1
            um6 r3 = r13.j
            hu4 r4 = defpackage.hu4.a
            if (r0 == 0) goto L28
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L15
            java.util.Iterator r0 = r13.e
            defpackage.ch3.d0(r14)
            r14 = r0
            goto L31
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r13)
            r13 = 0
            return r13
        L1c:
            long r5 = r13.g
            long r7 = r13.f
            java.util.Iterator r0 = r13.e
            defpackage.ch3.d0(r14)
            r14 = r0
            goto L9f
        L28:
            defpackage.ch3.d0(r14)
            java.util.List r14 = r13.i
            java.util.Iterator r14 = r14.iterator()
        L31:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto Lb4
            java.lang.Object r0 = r14.next()
            iaf r0 = (defpackage.iaf) r0
            java.lang.String r5 = "FAVORITE_STICKERS"
            java.lang.String r6 = r0.b
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L48
            goto L31
        L48:
            java.util.List r5 = r0.d
            long r7 = r0.g
            long r9 = r0.j
            java.lang.String r0 = r3.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r7)
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r6, r11}
            java.lang.String r11 = "onAssetsUpdate: stickers=%s, marker=%d, updateTime=%d"
            defpackage.gm0.m(r0, r11, r6)
            java.lang.String r0 = r3.a
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r11 = "setSectionUpdateTime: %d"
            defpackage.gm0.m(r0, r11, r6)
            ny8 r0 = r3.d
            java.lang.Object r0 = r0.getValue()
            et3 r0 = (defpackage.et3) r0
            s7f r0 = (defpackage.s7f) r0
            gvb r6 = r0.T
            zv8[] r11 = defpackage.s7f.j0
            r12 = 42
            r11 = r11[r12]
            java.lang.Long r12 = java.lang.Long.valueOf(r9)
            r6.B(r0, r11, r12)
            an6 r0 = r3.j()
            r13.e = r14
            r13.f = r7
            r13.g = r9
            r13.h = r2
            java.lang.Object r0 = r0.b(r5, r13)
            if (r0 != r4) goto L9e
            goto Lb3
        L9e:
            r5 = r9
        L9f:
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L31
            r13.e = r14
            r13.f = r7
            r13.g = r5
            r13.h = r1
            java.lang.Object r0 = defpackage.um6.a(r3, r7, r13)
            if (r0 != r4) goto L31
        Lb3:
            return r4
        Lb4:
            sbi r13 = defpackage.sbi.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
