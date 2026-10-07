package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class gd3 extends mdh implements qf7 {
    public Object e;
    public int f;
    public final /* synthetic */ Uri g;
    public final /* synthetic */ long h;
    public final /* synthetic */ xd3 i;
    public final /* synthetic */ Long j;
    public final /* synthetic */ g4b k;
    public final /* synthetic */ q87 l;
    public final /* synthetic */ Long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd3(Uri uri, long j, xd3 xd3Var, Long l, g4b g4bVar, q87 q87Var, Long l2, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = uri;
        this.h = j;
        this.i = xd3Var;
        this.j = l;
        this.k = g4bVar;
        this.l = q87Var;
        this.m = l2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new gd3(this.g, this.h, this.i, this.j, this.k, this.l, this.m, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((gd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f7, code lost:
    
        if (r0 == r11) goto L28;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
