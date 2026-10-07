package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lm8 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm8(m7g m7gVar, String str, z4a z4aVar, int i, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = m7gVar;
        this.j = str;
        this.k = z4aVar;
        this.g = i;
        this.h = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                return new lm8((mm8) obj3, (b0e) obj2, this.h, this.g, lq4Var);
            default:
                return new lm8((m7g) this.i, (String) obj3, (z4a) obj2, this.g, this.h, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((lm8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (defpackage.m7g.f(r4, r5, r6, r7, r8, r10) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (defpackage.m7g.g(r4, r5, r6, r7, r8, r10) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
    
        if (r0.emit(r11, r10) == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return r0;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm8(mm8 mm8Var, b0e b0eVar, boolean z, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = mm8Var;
        this.k = b0eVar;
        this.h = z;
        this.g = i;
    }
}
