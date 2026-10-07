package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h2c extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public Object h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2c(mbb mbbVar, tbb tbbVar, y3f y3fVar, int i, lmc lmcVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.h = mbbVar;
        this.i = tbbVar;
        this.j = y3fVar;
        this.g = i;
        this.k = lmcVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                h2c h2cVar = new h2c((m2c) obj2, lq4Var, 0);
                h2cVar.j = obj;
                return h2cVar;
            case 1:
                return new h2c((mbb) this.h, (tbb) this.i, (y3f) this.j, this.g, (lmc) obj2, lq4Var);
            case 2:
                h2c h2cVar2 = new h2c((wed) obj2, lq4Var, 2);
                h2cVar2.h = obj;
                return h2cVar2;
            default:
                h2c h2cVar3 = new h2c((p1g) obj2, lq4Var, 3);
                h2cVar3.h = obj;
                return h2cVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((h2c) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((h2c) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((h2c) create((LinkedHashMap) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((h2c) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0499 A[Catch: all -> 0x0514, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0514, blocks: (B:157:0x0499, B:165:0x04d9), top: B:205:0x04d9 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:192:0x0522  */
    /* JADX WARN: Code duplicated, block: B:194:0x0526  */
    /* JADX WARN: Code duplicated, block: B:197:0x0547  */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:191:0x0520 -> B:155:0x0491). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:195:0x0544 -> B:155:0x0491). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0335 -> B:91:0x0339). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2c(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.k = obj;
    }
}
