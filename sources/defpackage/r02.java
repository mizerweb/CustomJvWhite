package defpackage;

import android.content.Intent;
import one.me.calls.impl.service.CallServiceImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class r02 extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ CallServiceImpl f;
    public final /* synthetic */ y02 g;
    public final /* synthetic */ x02 h;
    public final /* synthetic */ dz4 i;
    public final /* synthetic */ be1 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Intent l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r02(CallServiceImpl callServiceImpl, y02 y02Var, x02 x02Var, dz4 dz4Var, be1 be1Var, boolean z, Intent intent, int i, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = callServiceImpl;
        this.g = y02Var;
        this.h = x02Var;
        this.i = dz4Var;
        this.j = be1Var;
        this.k = z;
        this.l = intent;
        this.m = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new r02(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((r02) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (one.me.calls.impl.service.CallServiceImpl.a(r0, r1, r2, r16.i, r16.j, r16) == r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (one.me.calls.impl.service.CallServiceImpl.b(r0, r1, r2, r16.i, r16.j, false, r6, true, r16) == r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
    
        if (one.me.calls.impl.service.CallServiceImpl.b(r0, r1, r2, r16.i, r16.j, true, true, true, r16) == r13) goto L42;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r02.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
