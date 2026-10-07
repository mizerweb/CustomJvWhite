package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gv extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public f9b f;
    public lv g;
    public Object h;
    public hv i;
    public List j;
    public int k;
    public int l;
    public int m;
    public final /* synthetic */ lv n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv(int i, lv lvVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
        this.n = lvVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        lv lvVar = this.n;
        switch (i) {
            case 0:
                return new gv(0, lvVar, lq4Var);
            default:
                return new gv(1, lvVar, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((gv) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((gv) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    /* JADX WARN: Code duplicated, block: B:43:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008f -> B:20:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0120 -> B:40:0x0123). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
