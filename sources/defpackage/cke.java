package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cke extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public Serializable g;
    public Object h;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cke(i19 i19Var, n09 n09Var, gu4 gu4Var, qf7 qf7Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = i19Var;
        this.j = n09Var;
        this.k = gu4Var;
        this.l = qf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                return new cke((i19) this.i, (n09) this.j, (gu4) obj3, (qf7) obj2, lq4Var);
            default:
                cke ckeVar = new cke((vdh) obj3, (List) obj2, lq4Var);
                ckeVar.j = obj;
                return ckeVar;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((cke) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((cke) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX WARN: Code duplicated, block: B:17:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:50:0x011f A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:36:0x00d9, B:45:0x0113, B:54:0x0129, B:50:0x011f, B:52:0x0123, B:53:0x0126, B:41:0x0109, B:43:0x010d, B:44:0x0110), top: B:74:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0123 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:36:0x00d9, B:45:0x0113, B:54:0x0129, B:50:0x011f, B:52:0x0123, B:53:0x0126, B:41:0x0109, B:43:0x010d, B:44:0x0110), top: B:74:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0126 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:36:0x00d9, B:45:0x0113, B:54:0x0129, B:50:0x011f, B:52:0x0123, B:53:0x0126, B:41:0x0109, B:43:0x010d, B:44:0x0110), top: B:74:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:57:0x0142  */
    /* JADX WARN: Code duplicated, block: B:60:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x0152  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0087 -> B:18:0x0089). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cke.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cke(vdh vdhVar, List list, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = vdhVar;
        this.l = list;
    }
}
