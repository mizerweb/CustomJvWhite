package defpackage;

import java.util.Iterator;
import java.util.Map;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class jta extends mdh implements qf7 {
    public StringBuilder e;
    public Map f;
    public kta g;
    public Iterator h;
    public MessageModel i;
    public sfa j;
    public int k;
    public int l;
    public int m;
    public final /* synthetic */ gjg n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Map p;
    public final /* synthetic */ kta q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jta(gjg gjgVar, int i, Map map, kta ktaVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.n = gjgVar;
        this.o = i;
        this.p = map;
        this.q = ktaVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new jta(this.n, this.o, this.p, this.q, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((jta) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x0207  */
    /* JADX WARN: Code duplicated, block: B:71:0x020c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0296  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0207 -> B:165:0x049a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0296 -> B:75:0x029c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jta.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
