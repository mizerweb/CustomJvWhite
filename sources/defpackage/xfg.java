package defpackage;

import one.me.upload.cleanup.UploadsCleanupScheduler$UploadsCleanupWorker;

/* JADX INFO: loaded from: classes.dex */
public final class xfg extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public long h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfg(na9 na9Var, rt2 rt2Var, long j, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 3;
        this.g = na9Var;
        this.i = rt2Var;
        this.h = j;
        this.f = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                xfg xfgVar = new xfg(this.h, (qzb) obj2, lq4Var, 0);
                xfgVar.g = obj;
                return xfgVar;
            case 1:
                xfg xfgVar2 = new xfg(this.h, (xx6) obj2, lq4Var, 1);
                xfgVar2.g = obj;
                return xfgVar2;
            case 2:
                xfg xfgVar3 = new xfg((vfe) obj2, this.h, lq4Var, 2);
                xfgVar3.g = obj;
                return xfgVar3;
            case 3:
                return new xfg((na9) this.g, (rt2) obj2, this.h, this.f, lq4Var);
            case 4:
                return new xfg((vdh) obj2, lq4Var);
            default:
                xfg xfgVar4 = new xfg((UploadsCleanupScheduler$UploadsCleanupWorker) obj2, this.h, lq4Var, 5);
                xfgVar4.g = obj;
                return xfgVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((xfg) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((xfg) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((xfg) create((gu7) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((xfg) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((xfg) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((xfg) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d1 A[Catch: SSLException -> 0x02df, TryCatch #1 {SSLException -> 0x02df, blocks: (B:107:0x02bc, B:110:0x02d1, B:112:0x02d9), top: B:121:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02d9 A[Catch: SSLException -> 0x02df, TRY_LEAVE, TryCatch #1 {SSLException -> 0x02df, blocks: (B:107:0x02bc, B:110:0x02d1, B:112:0x02d9), top: B:121:0x02bc }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x02b8 -> B:99:0x029f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xfg(long j, Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = j;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfg(vdh vdhVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 4;
        this.i = vdhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xfg(Object obj, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.h = j;
    }
}
