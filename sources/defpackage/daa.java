package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class daa extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public m8b f;
    public int g;
    public int h;
    public int i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daa(cic cicVar, m8b m8bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.n = cicVar;
        this.o = m8bVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                daa daaVar = new daa((r00) this.m, lq4Var);
                daaVar.o = obj;
                return daaVar;
            default:
                return new daa((cic) this.n, (m8b) this.o, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((daa) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((daa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x018e  */
    /* JADX WARN: Code duplicated, block: B:64:0x019e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01c6 -> B:70:0x01c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daa(r00 r00Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = r00Var;
    }
}
