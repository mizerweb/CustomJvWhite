package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class h99 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public long g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h99(zqh zqhVar, cf7 cf7Var, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 12;
        this.h = zqhVar;
        this.i = cf7Var;
        this.g = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new h99((i99) this.h, this.g, (String) obj2, lq4Var, 0);
            case 1:
                return new h99((jsa) obj2, this.g, lq4Var, 1);
            case 2:
                return new h99((jsa) obj2, this.g, lq4Var, 2);
            case 3:
                return new h99((gnb) this.h, this.g, (CharSequence) obj2, lq4Var, 3);
            case 4:
                return new h99((gnb) this.h, this.g, (Intent) obj2, lq4Var, 4);
            case 5:
                return new h99((String) obj2, (cic) this.h, this.g, lq4Var);
            case 6:
                return new h99((eef) this.h, (dhe) obj2, lq4Var);
            case 7:
                return new h99((hff) this.h, this.g, (CharSequence) obj2, lq4Var, 7);
            case 8:
                h99 h99Var = new h99((brf) obj2, this.g, lq4Var, 8);
                h99Var.h = obj;
                return h99Var;
            case 9:
                h99 h99Var2 = new h99((amg) obj2, this.g, lq4Var, 9);
                h99Var2.h = obj;
                return h99Var2;
            case 10:
                h99 h99Var3 = new h99((rog) obj2, this.g, lq4Var, 10);
                h99Var3.h = obj;
                return h99Var3;
            case 11:
                h99 h99Var4 = new h99((spg) obj2, this.g, lq4Var, 11);
                h99Var4.h = obj;
                return h99Var4;
            case 12:
                return new h99((zqh) this.h, (cf7) obj2, this.g, lq4Var);
            default:
                h99 h99Var5 = new h99((e3j) obj2, this.g, lq4Var, 13);
                h99Var5.h = obj;
                return h99Var5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((h99) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                ((h99) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return hu4.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:191:0x0446  */
    /* JADX WARN: Code duplicated, block: B:197:0x0468  */
    /* JADX WARN: Code duplicated, block: B:199:0x046c  */
    /* JADX WARN: Code duplicated, block: B:200:0x0470  */
    /* JADX WARN: Code duplicated, block: B:202:0x0473  */
    /* JADX WARN: Code duplicated, block: B:204:0x0477  */
    /* JADX WARN: Code duplicated, block: B:205:0x0479  */
    /* JADX WARN: Code duplicated, block: B:207:0x047d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0487 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x0489  */
    /* JADX WARN: Code duplicated, block: B:211:0x048b  */
    /* JADX WARN: Code duplicated, block: B:212:0x048f  */
    /* JADX WARN: Code duplicated, block: B:215:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:216:0x04a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:222:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:310:0x069d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005c -> B:12:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h99.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h99(eef eefVar, dhe dheVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 6;
        this.h = eefVar;
        this.i = dheVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h99(Object obj, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h99(Object obj, long j, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.g = j;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h99(String str, cic cicVar, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 5;
        this.i = str;
        this.h = cicVar;
        this.g = j;
    }
}
