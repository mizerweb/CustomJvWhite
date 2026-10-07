package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kv extends mdh implements qf7 {
    public f9b e;
    public lv f;
    public Object g;
    public hv h;
    public List i;
    public List j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final /* synthetic */ lv o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(int i, lv lvVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.o = lvVar;
        this.p = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new kv(this.p, this.o, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((kv) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0201  */
    /* JADX WARN: Code duplicated, block: B:91:0x021b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0201 -> B:87:0x0208). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
