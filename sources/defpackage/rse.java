package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rse extends mdh implements qf7 {
    public List e;
    public sse f;
    public Iterator g;
    public long h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ sse m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rse(sse sseVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = sseVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        rse rseVar = new rse(this.m, lq4Var);
        rseVar.l = obj;
        return rseVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((rse) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        if (defpackage.tre.J0(r13) == r11) goto L24;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b7 -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.l
            yx6 r0 = (defpackage.yx6) r0
            int r1 = r13.k
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L37
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1c
            int r1 = r13.i
            long r5 = r13.h
            java.util.List r7 = r13.e
            java.util.List r7 = (java.util.List) r7
            defpackage.ch3.d0(r14)
        L1a:
            r14 = r1
            goto L3e
        L1c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r13)
            return r4
        L22:
            int r1 = r13.j
            int r5 = r13.i
            long r6 = r13.h
            java.util.Iterator r8 = r13.g
            sse r9 = r13.f
            java.util.List r10 = r13.e
            java.util.List r10 = (java.util.List) r10
            defpackage.ch3.d0(r14)
            r14 = r9
            r9 = r1
            r1 = r5
            goto L6e
        L37:
            defpackage.ch3.d0(r14)
            r5 = -9223372036854775808
            r14 = 500(0x1f4, float:7.0E-43)
        L3e:
            vt4 r1 = r13.getContext()
            boolean r1 = defpackage.vd7.E(r1)
            if (r1 == 0) goto Lba
            sse r1 = r13.m
            nuc r7 = r1.b()
            rre r7 = r7.a
            ws9 r8 = new ws9
            r8.<init>(r14, r3, r5)
            r9 = 0
            java.lang.Object r7 = defpackage.ch3.G(r7, r3, r9, r8)
            java.util.List r7 = (java.util.List) r7
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto Lba
            r8 = r7
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r10 = r1
            r1 = r14
            r14 = r10
            r10 = r7
            r6 = r5
        L6e:
            boolean r5 = r8.hasNext()
            hu4 r11 = defpackage.hu4.a
            if (r5 == 0) goto L9d
            java.lang.Object r5 = r8.next()
            stc r5 = (defpackage.stc) r5
            r14.getClass()
            rtc r5 = defpackage.sse.c(r5)
            r13.l = r0
            r12 = r10
            java.util.List r12 = (java.util.List) r12
            r13.e = r12
            r13.f = r14
            r13.g = r8
            r13.h = r6
            r13.i = r1
            r13.j = r9
            r13.k = r3
            java.lang.Object r5 = r0.emit(r5, r13)
            if (r5 != r11) goto L6e
            goto Lb9
        L9d:
            java.lang.Object r14 = defpackage.ww3.B1(r10)
            stc r14 = (defpackage.stc) r14
            long r5 = r14.a
            r13.l = r0
            r13.e = r4
            r13.f = r4
            r13.g = r4
            r13.h = r5
            r13.i = r1
            r13.k = r2
            java.lang.Object r14 = defpackage.tre.J0(r13)
            if (r14 != r11) goto L1a
        Lb9:
            return r11
        Lba:
            sbi r13 = defpackage.sbi.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rse.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
