package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class v90 extends mdh implements qf7 {
    public sfa e;
    public e70 f;
    public b60 g;
    public boolean h;
    public boolean i;
    public int j;
    public final /* synthetic */ x90 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ Uri n;
    public final /* synthetic */ ns5 o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v90(x90 x90Var, long j, long j2, Uri uri, ns5 ns5Var, String str, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = x90Var;
        this.l = j;
        this.m = j2;
        this.n = uri;
        this.o = ns5Var;
        this.p = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new v90(this.k, this.l, this.m, this.n, this.o, this.p, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((v90) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:60:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0183  */
    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c2, code lost:
    
        if (r2 == r11) goto L78;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
