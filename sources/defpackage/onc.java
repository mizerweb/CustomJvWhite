package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class onc extends mdh implements cf7 {
    public enc e;
    public mw f;
    public pw g;
    public Map h;
    public LinkedHashMap i;
    public Object j;
    public Iterator k;
    public int l;
    public long m;
    public int n;
    public final /* synthetic */ pnc o;
    public final /* synthetic */ List p;
    public final /* synthetic */ hu1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onc(pnc pncVar, List list, hu1 hu1Var, lq4 lq4Var) {
        super(1, lq4Var);
        this.o = pncVar;
        this.p = list;
        this.q = hu1Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new onc(this.o, this.p, this.q, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((onc) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0112  */
    /* JADX WARN: Code duplicated, block: B:37:0x0144  */
    /* JADX WARN: Code duplicated, block: B:40:0x0151  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0144 -> B:11:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
