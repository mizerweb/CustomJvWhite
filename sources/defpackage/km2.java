package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class km2 extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ List f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ pm2 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public AutoCloseable l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km2(List list, lq4 lq4Var, boolean z, pm2 pm2Var, boolean z2, boolean z3, int i) {
        super(2, lq4Var);
        this.f = list;
        this.g = z;
        this.h = pm2Var;
        this.i = z2;
        this.j = z3;
        this.k = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new km2(this.f, lq4Var, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((km2) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d8, code lost:
    
        if (defpackage.pm2.e(r0, 1000000000, r12) == r9) goto L66;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
