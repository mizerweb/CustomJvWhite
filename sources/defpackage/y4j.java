package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y4j extends mdh implements qf7 {
    public a5j e;
    public Collection f;
    public Iterator g;
    public int h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ List m;
    public final /* synthetic */ a5j n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4j(List list, a5j a5jVar, int i, int i2, int i3, int i4, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = list;
        this.n = a5jVar;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = i4;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        y4j y4jVar = new y4j(this.m, this.n, this.o, this.p, this.q, this.r, lq4Var);
        y4jVar.l = obj;
        return y4jVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((y4j) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:13:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007a -> B:14:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
