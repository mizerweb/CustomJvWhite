package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i13 extends wed {
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final int n;

    public i13(ite iteVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        super(iteVar, "live-stream-fetcher", 12);
        this.j = ny8Var;
        this.k = ny8Var2;
        this.l = ny8Var4;
        this.m = ny8Var3;
        this.n = 40;
    }

    @Override // defpackage.wed
    public final int j() {
        return this.n;
    }

    @Override // defpackage.wed
    public final /* bridge */ /* synthetic */ Object n(Object obj, List list, Object obj2, qed qedVar) {
        return u(((Number) obj).longValue(), list, (g13) obj2, qedVar);
    }

    @Override // defpackage.wed
    public final Object o(Object obj, List list, gz gzVar) {
        ((Number) obj).longValue();
        wy2 wy2Var = new wy2(kfc.V3, 5);
        List list2 = list;
        if (list2.isEmpty()) {
            ore.p("chatIds can't be empty");
            return null;
        }
        wy2Var.e("chatIds", ww3.U1(list2));
        return ((sih) this.j.getValue()).a.g(wy2Var, gzVar);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b9 -> B:33:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e2 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object u(long r18, java.util.List r20, defpackage.g13 r21, defpackage.nq4 r22) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i13.u(long, java.util.List, g13, nq4):java.lang.Object");
    }
}
