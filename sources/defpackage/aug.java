package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aug extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public long f;
    public int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aug(Object obj, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.f = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new aug((iug) obj2, this.f, lq4Var, 0);
            case 1:
                return new aug((b7i) obj2, lq4Var, 1);
            case 2:
                return new aug((p8i) obj2, lq4Var, 2);
            case 3:
                aug augVar = new aug((vei) obj2, lq4Var, 3);
                augVar.f = ((Number) obj).longValue();
                return augVar;
            case 4:
                return new aug((gpi) obj2, this.f, lq4Var, 4);
            default:
                return new aug((g1j) obj2, this.f, lq4Var, 5);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((aug) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((aug) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((aug) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((aug) create(Long.valueOf(((Number) obj).longValue()), (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((aug) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((aug) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0170 -> B:64:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01b6 -> B:78:0x01ba). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aug.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aug(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }
}
