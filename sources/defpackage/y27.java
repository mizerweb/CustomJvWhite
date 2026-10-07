package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y27 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public int g;
    public int h;
    public int i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public final /* synthetic */ a8j n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y27(long[] jArr, f37 f37Var, ny8 ny8Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = jArr;
        this.n = f37Var;
        this.o = ny8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.o;
        a8j a8jVar = this.n;
        switch (i) {
            case 0:
                return new y27((long[]) this.l, (f37) a8jVar, (ny8) obj2, lq4Var);
            default:
                return new y27((ej7) a8jVar, (List) obj2, lq4Var);
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
        }
        return ((y27) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x012a  */
    /* JADX WARN: Code duplicated, block: B:42:0x014a  */
    /* JADX WARN: Code duplicated, block: B:43:0x014c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0156  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00da -> B:27:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x014c -> B:44:0x0152). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y27.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y27(ej7 ej7Var, List list, lq4 lq4Var) {
        super(2, lq4Var);
        this.n = ej7Var;
        this.o = list;
    }
}
