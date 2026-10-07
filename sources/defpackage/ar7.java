package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ar7 extends mdh implements tf7 {
    public int e;
    public /* synthetic */ yx6 f;
    public /* synthetic */ Object[] g;
    public final /* synthetic */ List h;
    public final /* synthetic */ cr7 i;
    public yx6 j;
    public vg4[] k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar7(lq4 lq4Var, List list, cr7 cr7Var) {
        super(3, lq4Var);
        this.h = list;
        this.i = cr7Var;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        ar7 ar7Var = new ar7((lq4) obj3, this.h, this.i);
        ar7Var.f = (yx6) obj;
        ar7Var.g = (Object[]) obj2;
        return ar7Var.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r6.t(r5, r7, r10) == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r11.emit(r0, r10) == r4) goto L28;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.e
            r1 = 2
            r2 = 1
            r3 = 0
            hu4 r4 = defpackage.hu4.a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L18
            if (r0 != r1) goto L12
            defpackage.ch3.d0(r11)
            goto L82
        L12:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r10)
            return r3
        L18:
            vg4[] r0 = r10.k
            yx6 r2 = r10.j
            defpackage.ch3.d0(r11)     // Catch: java.lang.Throwable -> L70
            goto L70
        L20:
            defpackage.ch3.d0(r11)
            yx6 r11 = r10.f
            java.lang.Object[] r0 = r10.g
            vg4[] r0 = (defpackage.vg4[]) r0
            m8b r5 = new m8b
            r5.<init>()
            int r6 = r0.length
            r7 = 0
        L30:
            if (r7 >= r6) goto L4c
            r8 = r0[r7]
            boolean r8 = defpackage.f55.q(r8)
            if (r8 == 0) goto L49
            java.util.List r8 = r10.h
            java.lang.Object r8 = r8.get(r7)
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            r5.a(r8)
        L49:
            int r7 = r7 + 1
            goto L30
        L4c:
            boolean r6 = r5.j()
            if (r6 == 0) goto L71
            cr7 r6 = r10.i
            ny8 r6 = r6.c     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L6f
            a0b r6 = (defpackage.a0b) r6     // Catch: java.lang.Throwable -> L6f
            long r7 = defpackage.cr7.i     // Catch: java.lang.Throwable -> L6f
            r10.f = r3     // Catch: java.lang.Throwable -> L6f
            r10.g = r3     // Catch: java.lang.Throwable -> L6f
            r10.j = r11     // Catch: java.lang.Throwable -> L6f
            r10.k = r0     // Catch: java.lang.Throwable -> L6f
            r10.e = r2     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = r6.t(r5, r7, r10)     // Catch: java.lang.Throwable -> L6f
            if (r2 != r4) goto L6f
            goto L81
        L6f:
            r2 = r11
        L70:
            r11 = r2
        L71:
            r10.f = r3
            r10.g = r3
            r10.j = r3
            r10.k = r3
            r10.e = r1
            java.lang.Object r10 = r11.emit(r0, r10)
            if (r10 != r4) goto L82
        L81:
            return r4
        L82:
            sbi r10 = defpackage.sbi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
