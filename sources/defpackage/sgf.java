package defpackage;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sgf extends mdh implements qf7 {
    public int e;
    public ch f;
    public LinkedList g;
    public int h;
    public final /* synthetic */ List i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ CharSequence k;
    public final /* synthetic */ tgf l;
    public final /* synthetic */ long m;
    public final /* synthetic */ Long n;
    public final /* synthetic */ g4b o;
    public final /* synthetic */ Long p;
    public final /* synthetic */ q87 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgf(List list, boolean z, CharSequence charSequence, tgf tgfVar, long j, Long l, g4b g4bVar, Long l2, q87 q87Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = list;
        this.j = z;
        this.k = charSequence;
        this.l = tgfVar;
        this.m = j;
        this.n = l;
        this.o = g4bVar;
        this.p = l2;
        this.q = q87Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new sgf(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((sgf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x019e, code lost:
    
        if (r0 == r2) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sgf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
