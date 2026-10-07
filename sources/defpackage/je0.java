package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class je0 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public Object f;
    public int g;
    public int h;
    public Object i;
    public Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je0(lq4 lq4Var, int i, j0f j0fVar, ufe ufeVar, Integer num, int i2) {
        super(2, lq4Var);
        this.e = 6;
        this.g = i;
        this.i = j0fVar;
        this.j = ufeVar;
        this.k = num;
        this.h = i2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                je0 je0Var = new je0((le0) this.j, (String) obj2, this.h, lq4Var, 0);
                je0Var.f = obj;
                return je0Var;
            case 1:
                je0 je0Var2 = new je0((op2) this.j, (wy2) obj2, lq4Var, 1);
                je0Var2.i = obj;
                return je0Var2;
            case 2:
                je0 je0Var3 = new je0((k57) this.j, (r17) obj2, lq4Var, 2);
                je0Var3.i = obj;
                return je0Var3;
            case 3:
                je0 je0Var4 = new je0((k57) this.j, (String) obj2, this.h, lq4Var, 3);
                je0Var4.i = obj;
                return je0Var4;
            case 4:
                return new je0((jsa) obj2, lq4Var, 4);
            case 5:
                return new je0((lqe) obj2, lq4Var, 5);
            case 6:
                je0 je0Var5 = new je0(lq4Var, this.g, (j0f) this.i, (ufe) this.j, (Integer) obj2, this.h);
                je0Var5.f = obj;
                return je0Var5;
            case 7:
                je0 je0Var6 = new je0((aaf) this.i, (xx6) this.j, (xx6) obj2, this.h, lq4Var);
                je0Var6.f = obj;
                return je0Var6;
            case 8:
                je0 je0Var7 = new je0((String) obj2, (d9f) this.i, this.h, (Long) this.j, lq4Var);
                je0Var7.f = obj;
                return je0Var7;
            default:
                return new je0((gvf) obj2, lq4Var, 9);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((je0) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((je0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((je0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((je0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((je0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((je0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                ((je0) create((kyj) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                return ((je0) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((je0) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((je0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:227:0x072e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0738  */
    /* JADX WARN: Code duplicated, block: B:303:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:306:0x08ee  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x06d7 -> B:214:0x06db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x072c -> B:228:0x0730). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:218:0x06e8
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r62) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je0(aaf aafVar, xx6 xx6Var, xx6 xx6Var2, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 7;
        this.i = aafVar;
        this.j = xx6Var;
        this.k = xx6Var2;
        this.h = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je0(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je0(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je0(Object obj, String str, int i, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.j = obj;
        this.k = str;
        this.h = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je0(String str, d9f d9fVar, int i, Long l, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 8;
        this.k = str;
        this.i = d9fVar;
        this.h = i;
        this.j = l;
    }
}
