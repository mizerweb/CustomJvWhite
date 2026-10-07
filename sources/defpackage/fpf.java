package defpackage;

import java.util.List;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class fpf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpf(lq4 lq4Var, hli hliVar) {
        super(2, lq4Var);
        this.e = 15;
        this.g = hliVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new fpf((ipf) obj2, lq4Var, 0);
            case 1:
                return new fpf((xqf) obj2, lq4Var, 1);
            case 2:
                return new fpf((brf) obj2, lq4Var, 2);
            case 3:
                return new fpf((y2g) obj2, lq4Var, 3);
            case 4:
                return new fpf((iug) obj2, lq4Var, 4);
            case 5:
                return new fpf((vvg) obj2, lq4Var, 5);
            case 6:
                return new fpf((jah) obj2, lq4Var, 6);
            case 7:
                return new fpf((vdh) obj2, lq4Var, 7);
            case 8:
                return new fpf((okh) obj2, lq4Var, 8);
            case 9:
                return new fpf((eoh) obj2, lq4Var, 9);
            case 10:
                return new fpf((cf7) obj2, lq4Var, 10);
            case 11:
                return new fpf((yf5) obj2, lq4Var, 11);
            case 12:
                return new fpf((guh) obj2, lq4Var, 12);
            case 13:
                return new fpf((p8i) obj2, lq4Var, 13);
            case 14:
                return new fpf((ohi) obj2, lq4Var, 14);
            case 15:
                return new fpf(lq4Var, (hli) obj2);
            case 16:
                return new fpf((List) obj2, lq4Var, 16);
            case 17:
                return new fpf((mvi) obj2, lq4Var, 17);
            case 18:
                return new fpf((i6j) obj2, lq4Var, 18);
            case 19:
                return new fpf((v30) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new fpf((cpj) obj2, lq4Var, 20);
            case 21:
                return new fpf((xo9) obj2, lq4Var, 21);
            default:
                return new fpf((efk) obj2, lq4Var, 22);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        Object obj3 = this.g;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return hu4.a;
            case 10:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((fpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                ((Boolean) obj).getClass();
                return new fpf((xo9) obj3, (lq4) obj2, 21).invokeSuspend(sbiVar);
            default:
                return new fpf((efk) obj3, (lq4) obj2, 22).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03cf, code lost:
    
        if (r15.invoke(r14) == r0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r15.a(r4, r6, r1, r14) == r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0657, code lost:
    
        if (defpackage.yab.K0(((defpackage.n0c) ((defpackage.xhh) r0.m.getValue())).c(), new defpackage.w2g(r0, null, 1), r14) == r1) goto L330;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fpf(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }
}
