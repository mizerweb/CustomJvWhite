package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ag0 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(long j, long j2, ut7 ut7Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 3;
        this.g = j;
        this.h = j2;
        this.i = ut7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new ag0((dg0) obj2, this.g, this.h, lq4Var, 0);
            case 1:
                return new ag0((b41) obj2, this.g, this.h, lq4Var, 1);
            case 2:
                return new ag0((qw2) obj2, this.g, this.h, lq4Var, 2);
            case 3:
                return new ag0(this.g, this.h, (ut7) obj2, lq4Var);
            case 4:
                return new ag0((fva) obj2, this.g, this.h, lq4Var, 4);
            case 5:
                return new ag0((aob) obj2, this.g, this.h, lq4Var, 5);
            case 6:
                return new ag0((i8e) obj2, this.g, this.h, lq4Var, 6);
            default:
                return new ag0((ose) obj2, this.g, this.h, lq4Var, 7);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((ag0) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:152:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[LOOP:0: B:96:0x01a5->B:153:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0167  */
    /* JADX WARN: Code duplicated, block: B:86:0x0183  */
    /* JADX WARN: Code duplicated, block: B:89:0x018d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0190  */
    /* JADX WARN: Code duplicated, block: B:92:0x0197  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0181 -> B:87:0x0185). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag0(Object obj, long j, long j2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.g = j;
        this.h = j2;
    }
}
