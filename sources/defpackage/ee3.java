package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ee3 extends mdh implements qf7 {
    public long e;
    public int f;
    public final /* synthetic */ fe3 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ ArrayList l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee3(fe3 fe3Var, long j, boolean z, int i, boolean z2, ArrayList arrayList, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = fe3Var;
        this.h = j;
        this.i = z;
        this.j = i;
        this.k = z2;
        this.l = arrayList;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new ee3(this.g, this.h, this.i, this.j, this.k, this.l, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ee3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        if (r15 == r12) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r3v2, types: [long] */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
