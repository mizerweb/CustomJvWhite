package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jv extends mdh implements qf7 {
    public final /* synthetic */ int e = 2;
    public Object f;
    public Object g;
    public Object h;
    public int i;
    public int j;
    public final /* synthetic */ Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(ArrayList arrayList, wbg wbgVar, dyd dydVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = arrayList;
        this.g = wbgVar;
        this.k = dydVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                return new jv((lv) obj2, lq4Var);
            case 1:
                return new jv((lv) obj2, (aqh) this.o, lq4Var);
            default:
                jv jvVar = new jv((ArrayList) this.f, (wbg) this.g, (dyd) obj2, lq4Var);
                jvVar.h = obj;
                return jvVar;
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
        }
        return ((jv) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0339  */
    /* JADX WARN: Code duplicated, block: B:103:0x033b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0350  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x033b -> B:104:0x0340). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0091 -> B:23:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0225 -> B:78:0x0228). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(lv lvVar, aqh aqhVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = lvVar;
        this.o = aqhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(lv lvVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = lvVar;
    }
}
