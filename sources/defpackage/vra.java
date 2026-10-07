package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vra extends mdh implements qf7 {
    public long e;
    public jsa f;
    public Collection g;
    public Iterator h;
    public sfa i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final /* synthetic */ List o;
    public final /* synthetic */ jsa p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vra(List list, jsa jsaVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.o = list;
        this.p = jsaVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new vra(this.o, this.p, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((vra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0161  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /* JADX WARN: Code duplicated, block: B:71:0x017a  */
    /* JADX WARN: Code duplicated, block: B:72:0x017c  */
    /* JADX WARN: Code duplicated, block: B:74:0x017f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x013a -> B:59:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0161 -> B:67:0x0162). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vra.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
