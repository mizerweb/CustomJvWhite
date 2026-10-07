package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d7h extends mdh implements qf7 {
    public f7h e;
    public List f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final /* synthetic */ f7h l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7h(f7h f7hVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = f7hVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new d7h(this.l, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((d7h) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d9 A[Catch: all -> 0x00f9, CancellationException -> 0x00fc, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00fc, all -> 0x00f9, blocks: (B:7:0x001c, B:47:0x00d9, B:12:0x002d, B:30:0x0092, B:31:0x009d, B:33:0x00a3, B:35:0x00ae, B:37:0x00b2, B:39:0x00b6, B:41:0x00bc, B:42:0x00c0, B:44:0x00c6, B:45:0x00ce, B:15:0x003d, B:18:0x0055, B:20:0x0062, B:21:0x0065, B:23:0x0069, B:25:0x0071, B:26:0x0078), top: B:56:0x0008 }] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        if (defpackage.f7h.a(r8, r14, r13) == r5) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f4 -> B:50:0x00f7). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
