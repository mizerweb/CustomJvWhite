package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l9f extends mdh implements tf7 {
    public List e;
    public ulc f;
    public xn3 g;
    public Collection h;
    public Iterator i;
    public f9f j;
    public int k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ yx6 o;
    public /* synthetic */ sh3 p;
    public final /* synthetic */ ulc q;
    public final /* synthetic */ xn3 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9f(ulc ulcVar, xn3 xn3Var, lq4 lq4Var) {
        super(3, lq4Var);
        this.q = ulcVar;
        this.r = xn3Var;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        l9f l9fVar = new l9f(this.q, this.r, (lq4) obj3);
        l9fVar.o = (yx6) obj;
        l9fVar.p = (sh3) obj2;
        return l9fVar.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00dd -> B:38:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e4 -> B:40:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00f9 -> B:46:0x00fa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
