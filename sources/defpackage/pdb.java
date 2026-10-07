package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class pdb extends mdh implements qf7 {
    public qdb e;
    public Object f;
    public File g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ qdb k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Rect m;
    public final /* synthetic */ RectF n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdb(qdb qdbVar, String str, Rect rect, RectF rectF, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = qdbVar;
        this.l = str;
        this.m = rect;
        this.n = rectF;
        this.o = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new pdb(this.k, this.l, this.m, this.n, this.o, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((pdb) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7 A[Catch: all -> 0x0025, CancellationException -> 0x0105, TryCatch #2 {CancellationException -> 0x0105, all -> 0x0025, blocks: (B:8:0x0020, B:38:0x00ce, B:15:0x003d, B:32:0x00a3, B:34:0x00a7, B:28:0x0087), top: B:50:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r15 == r8) goto L36;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
