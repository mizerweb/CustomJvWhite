package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bue extends mdh implements qf7 {
    public syd e;
    public die f;
    public Iterator g;
    public long h;
    public int i;
    public int j;
    public final /* synthetic */ die k;
    public final /* synthetic */ cue l;
    public final /* synthetic */ syd m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bue(die dieVar, cue cueVar, syd sydVar, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = dieVar;
        this.l = cueVar;
        this.m = sydVar;
        this.n = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new bue(this.k, this.l, this.m, this.n, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((bue) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0126  */
    /* JADX WARN: Code duplicated, block: B:48:0x0163  */
    /* JADX WARN: Code duplicated, block: B:49:0x016c  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:0: B:41:0x0120->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
    
        if (r6.e(r7, r8, r9, r14) == r1) goto L45;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bue.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
