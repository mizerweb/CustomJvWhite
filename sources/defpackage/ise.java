package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ise extends mdh implements qf7 {
    public ose e;
    public Collection f;
    public Iterator g;
    public Collection h;
    public int i;
    public int j;
    public int k;
    public final /* synthetic */ mg5 l;
    public final /* synthetic */ ose m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ int q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ise(mg5 mg5Var, ose oseVar, long j, long j2, long j3, int i, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = mg5Var;
        this.m = oseVar;
        this.n = j;
        this.o = j2;
        this.p = j3;
        this.q = i;
        this.r = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new ise(this.l, this.m, this.n, this.o, this.p, this.q, this.r, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ise) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0115  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0115 -> B:38:0x0117). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ise.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
