package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pka extends mdh implements qf7 {
    public List e;
    public qka f;
    public Iterator g;
    public long h;
    public long i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qka m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pka(qka qkaVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = qkaVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        pka pkaVar = new pka(this.m, lq4Var);
        pkaVar.l = obj;
        return pkaVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((pka) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00a7 A[EDGE_INSN: B:101:0x00a7->B:35:0x00a7 BREAK  A[LOOP:0: B:25:0x008a->B:34:0x00a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[LOOP:0: B:25:0x008a->B:34:0x00a1, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.Iterator, java.util.List, qka] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0119 -> B:50:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0168 -> B:99:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x017d -> B:72:0x0183). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x01ca -> B:87:0x01c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pka.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
