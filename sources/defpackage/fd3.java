package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class fd3 extends mdh implements qf7 {
    public wfe e;
    public Serializable f;
    public LinkedList g;
    public int h;
    public final /* synthetic */ xd3 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ Long k;
    public final /* synthetic */ ArrayList l;
    public final /* synthetic */ ArrayList m;
    public final /* synthetic */ q87 n;
    public final /* synthetic */ g4b o;
    public final /* synthetic */ Long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd3(xd3 xd3Var, long j, Long l, ArrayList arrayList, ArrayList arrayList2, q87 q87Var, g4b g4bVar, Long l2, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = xd3Var;
        this.j = j;
        this.k = l;
        this.l = arrayList;
        this.m = arrayList2;
        this.n = q87Var;
        this.o = g4bVar;
        this.p = l2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new fd3(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((fd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017a, code lost:
    
        if (r0 == r10) goto L51;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
