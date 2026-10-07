package defpackage;

import android.content.Context;
import java.util.List;
import one.me.android.OneMeApplication;
import one.me.android.initialization.AccountInitializer;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class qob extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qob(njd njdVar, Object obj, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 26;
        this.h = njdVar;
        this.g = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                qob qobVar = new qob((rob) obj2, lq4Var, 0);
                qobVar.g = obj;
                return qobVar;
            case 1:
                return new qob((OneMeApplication) this.g, (v6) obj2, lq4Var, 1);
            case 2:
                return new qob((AccountInitializer) this.g, (OneMeApplication) obj2, lq4Var, 2);
            case 3:
                qob qobVar2 = new qob((pvb) obj2, lq4Var, 3);
                qobVar2.g = obj;
                return qobVar2;
            case 4:
                qob qobVar3 = new qob((gue) obj2, lq4Var, 4);
                qobVar3.g = obj;
                return qobVar3;
            case 5:
                qob qobVar4 = new qob((b00) obj2, lq4Var, 5);
                qobVar4.g = obj;
                return qobVar4;
            case 6:
                qob qobVar5 = new qob((y10) obj2, lq4Var, 6);
                qobVar5.g = obj;
                return qobVar5;
            case 7:
                return new qob((gq0) this.g, (sh3) obj2, lq4Var, 7);
            case 8:
                qob qobVar6 = new qob((Context) obj2, lq4Var, 8);
                qobVar6.g = obj;
                return qobVar6;
            case 9:
                return new qob((m31) this.g, (List) obj2, lq4Var, 9);
            case 10:
                return new qob((ua2) obj2, lq4Var, 10);
            case 11:
                qob qobVar7 = new qob((mr2) obj2, lq4Var, 11);
                qobVar7.g = obj;
                return qobVar7;
            case 12:
                return new qob((xx6) this.g, (mhf) obj2, lq4Var, 12);
            case 13:
                return new qob((ps2) this.g, (af7) obj2, lq4Var, 13);
            case 14:
                return new qob((t83) this.g, (pw) obj2, lq4Var, 14);
            case 15:
                return new qob((ah3) this.g, (jn0) obj2, lq4Var, 15);
            case 16:
                qob qobVar8 = new qob((pq3) obj2, lq4Var, 16);
                qobVar8.g = obj;
                return qobVar8;
            case 17:
                qob qobVar9 = new qob((wd4) obj2, lq4Var, 17);
                qobVar9.g = obj;
                return qobVar9;
            case 18:
                return new qob((ij4) this.g, (so4) obj2, lq4Var, 18);
            case 19:
                return new qob((ij4) this.g, (l8b) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                qob qobVar10 = new qob((v45) obj2, lq4Var, 20);
                qobVar10.g = obj;
                return qobVar10;
            case 21:
                return new qob((o1c) this.g, (ex5) obj2, lq4Var, 21);
            case 22:
                qob qobVar11 = new qob((dd6) obj2, lq4Var, 22);
                qobVar11.g = obj;
                return qobVar11;
            case 23:
                qob qobVar12 = new qob((um6) obj2, lq4Var, 23);
                qobVar12.g = obj;
                return qobVar12;
            case 24:
                qob qobVar13 = new qob((qn6) obj2, lq4Var, 24);
                qobVar13.g = obj;
                return qobVar13;
            case 25:
                return new qob((xx6) this.g, (njd) obj2, lq4Var, 25);
            case 26:
                return new qob((njd) obj2, this.g, lq4Var);
            case 27:
                qob qobVar14 = new qob((xx6) obj2, lq4Var, 27);
                qobVar14.g = obj;
                return qobVar14;
            case 28:
                qob qobVar15 = new qob((w17) obj2, lq4Var, 28);
                qobVar15.g = obj;
                return qobVar15;
            default:
                return new qob((gp7) this.g, (ny8) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((qob) create((nob) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((qob) create((hih) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((qob) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((qob) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((qob) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((qob) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((qob) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((qob) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((qob) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((qob) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((qob) create((s45) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((qob) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((qob) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((qob) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((qob) create((r17) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((qob) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:239:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:240:0x04a6  */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0356, code lost:
    
        if (defpackage.np4.b(r2, r5, r14) == r7) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r4.collect(r5, r14) == r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0492, code lost:
    
        if (r14 == r1) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x06d5, code lost:
    
        if (defpackage.np4.b(r0, r5, r14) == r1) goto L361;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qob.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qob(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qob(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
