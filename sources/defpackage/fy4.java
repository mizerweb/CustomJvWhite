package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fy4 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ yx6 g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fy4(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        yx6 yx6Var = (yx6) obj;
        switch (i) {
            case 0:
                fy4 fy4Var = new fy4(i2, (lq4) obj3, 0);
                fy4Var.g = yx6Var;
                fy4Var.h = (Object[]) obj2;
                return fy4Var.invokeSuspend(sbiVar);
            case 1:
                fy4 fy4Var2 = new fy4(i2, (lq4) obj3, 1);
                fy4Var2.g = yx6Var;
                fy4Var2.h = (Object[]) obj2;
                return fy4Var2.invokeSuspend(sbiVar);
            case 2:
                fy4 fy4Var3 = new fy4(i2, (lq4) obj3, 2);
                fy4Var3.g = yx6Var;
                fy4Var3.h = (Object[]) obj2;
                return fy4Var3.invokeSuspend(sbiVar);
            case 3:
                fy4 fy4Var4 = new fy4(i2, (lq4) obj3, i2);
                fy4Var4.g = yx6Var;
                fy4Var4.h = (Object[]) obj2;
                return fy4Var4.invokeSuspend(sbiVar);
            case 4:
                fy4 fy4Var5 = new fy4(i2, (lq4) obj3, 4);
                fy4Var5.g = yx6Var;
                fy4Var5.h = (Object[]) obj2;
                return fy4Var5.invokeSuspend(sbiVar);
            default:
                fy4 fy4Var6 = new fy4(i2, (lq4) obj3, 5);
                fy4Var6.g = yx6Var;
                fy4Var6.h = (ahb) obj2;
                return fy4Var6.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a5 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
