package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class id3 extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ xd3 f;
    public final /* synthetic */ Long g;
    public final /* synthetic */ CharSequence h;
    public final /* synthetic */ List i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Long k;
    public final /* synthetic */ q87 l;
    public final /* synthetic */ g4b m;
    public final /* synthetic */ Long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id3(xd3 xd3Var, Long l, CharSequence charSequence, List list, boolean z, Long l2, q87 q87Var, g4b g4bVar, Long l3, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = xd3Var;
        this.g = l;
        this.h = charSequence;
        this.i = list;
        this.j = z;
        this.k = l2;
        this.l = q87Var;
        this.m = g4bVar;
        this.n = l3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new id3(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((id3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r0 == r15) goto L24;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r5 = r17
            int r0 = r5.e
            java.lang.Long r11 = r5.g
            r12 = 2
            java.util.List r4 = r5.i
            r13 = 1
            xd3 r14 = r5.f
            hu4 r15 = defpackage.hu4.a
            if (r0 == 0) goto L26
            if (r0 == r13) goto L22
            if (r0 != r12) goto L1b
            defpackage.ch3.d0(r18)
            r0 = r18
            goto L8d
        L1b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            r0 = 0
            return r0
        L22:
            defpackage.ch3.d0(r18)
            goto L54
        L26:
            defpackage.ch3.d0(r18)
            ny8 r0 = r14.y
            java.lang.Object r0 = r0.getValue()
            tgf r0 = (defpackage.tgf) r0
            long r1 = r11.longValue()
            r5.e = r13
            java.lang.CharSequence r3 = r5.h
            boolean r6 = r5.j
            r7 = r6
            java.lang.Long r6 = r5.k
            r8 = r7
            q87 r7 = r5.l
            r9 = r8
            g4b r8 = r5.m
            r10 = r9
            java.lang.Long r9 = r5.n
            r16 = r10
            r10 = r5
            r5 = r16
            java.lang.Object r0 = r0.b(r1, r3, r4, r5, r6, r7, r8, r9, r10)
            r5 = r10
            if (r0 != r15) goto L54
            goto L8c
        L54:
            r14.E()
            boolean r0 = r5.j
            if (r0 == 0) goto L63
            java.util.Collection r4 = (java.util.Collection) r4
            int r0 = r4.size()
        L61:
            r2 = r0
            goto L76
        L63:
            int r0 = r14.o1
            int r1 = r4.size()
            int r1 = r1 / r0
            int r2 = r4.size()
            int r2 = r2 % r0
            if (r2 == 0) goto L72
            goto L73
        L72:
            r13 = 0
        L73:
            int r0 = r1 + r13
            goto L61
        L76:
            long r0 = r11.longValue()
            ny8 r3 = r14.z
            java.lang.Object r3 = r3.getValue()
            i51 r3 = (defpackage.i51) r3
            r5.e = r12
            q87 r4 = r5.l
            java.lang.Object r0 = defpackage.ldf.d(r0, r2, r3, r4, r5)
            if (r0 != r15) goto L8d
        L8c:
            return r15
        L8d:
            ec3 r0 = (defpackage.ec3) r0
            ic6 r1 = r14.L1
            defpackage.a8j.x(r1, r0)
            sbi r0 = defpackage.sbi.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
