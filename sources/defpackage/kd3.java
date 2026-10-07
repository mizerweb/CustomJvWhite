package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class kd3 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public Object g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd3(wec wecVar, zui zuiVar, File file, String str, String str2, String str3, uhi uhiVar, wze wzeVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = wecVar;
        this.j = zuiVar;
        this.k = file;
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.o = uhiVar;
        this.p = wzeVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.m;
        Object obj6 = this.l;
        Object obj7 = this.k;
        Object obj8 = this.j;
        switch (i) {
            case 0:
                kd3 kd3Var = new kd3((lad) obj8, (Long) obj7, (xd3) obj4, (q87) obj3, (Long) obj6, (g4b) obj2, (Long) obj5, lq4Var);
                kd3Var.i = obj;
                return kd3Var;
            default:
                kd3 kd3Var2 = new kd3((wec) this.i, (zui) obj8, (File) obj7, (String) obj6, (String) obj5, (String) obj4, (uhi) obj3, (wze) obj2, lq4Var);
                kd3Var2.g = obj;
                return kd3Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((kd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((kd3) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0321  */
    /* JADX WARN: Code duplicated, block: B:77:0x032e  */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0371, code lost:
    
        if (r0 == r9) goto L79;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd3(lad ladVar, Long l, xd3 xd3Var, q87 q87Var, Long l2, g4b g4bVar, Long l3, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = ladVar;
        this.k = l;
        this.n = xd3Var;
        this.o = q87Var;
        this.l = l2;
        this.p = g4bVar;
        this.m = l3;
    }
}
