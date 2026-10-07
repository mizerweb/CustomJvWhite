package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class cfh extends mdh implements qf7 {
    public ArrayList e;
    public Object f;
    public Object g;
    public Object h;
    public q3b i;
    public Object j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public long q;
    public long r;
    public long s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ dfh v;
    public final /* synthetic */ k8b w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfh(dfh dfhVar, k8b k8bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.v = dfhVar;
        this.w = k8bVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        cfh cfhVar = new cfh(this.v, this.w, lq4Var);
        cfhVar.u = obj;
        return cfhVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((cfh) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x030a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0313  */
    /* JADX WARN: Code duplicated, block: B:72:0x0319  */
    /* JADX WARN: Code duplicated, block: B:77:0x034f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0357  */
    /* JADX WARN: Code duplicated, block: B:99:0x03e6  */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.ArrayList, q3b] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0145 -> B:28:0x015b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01bc -> B:35:0x01c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0223 -> B:41:0x0234). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x025e -> B:48:0x026c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0357 -> B:61:0x02d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x03d7 -> B:95:0x03da). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
