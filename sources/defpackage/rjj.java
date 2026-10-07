package defpackage;

import com.vk.push.common.clientid.ClientId;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.domain.model.CallingAppIds;

/* JADX INFO: loaded from: classes3.dex */
public final class rjj extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rjj(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                return new rjj((tij) this.i, (ujj) obj3, (pjj) obj2, lq4Var, 0);
            case 1:
                return new rjj((uij) this.i, (ujj) obj3, (pjj) obj2, lq4Var, 1);
            case 2:
                return new rjj((vij) this.i, (ujj) obj3, (pjj) obj2, lq4Var, 2);
            case 3:
                return new rjj((qlj) this.i, (tlj) obj3, (klj) obj2, lq4Var, 3);
            case 4:
                rjj rjjVar = new rjj((nmj) obj3, (qmj) obj2, lq4Var, 4);
                rjjVar.i = obj;
                return rjjVar;
            case 5:
                rjj rjjVar2 = new rjj((ioj) obj3, (bsj) obj2, lq4Var, 5);
                rjjVar2.i = obj;
                return rjjVar2;
            case 6:
                return new rjj((dqj) this.i, (jqj) obj3, (xpj) obj2, lq4Var, 6);
            case 7:
                return new rjj((sqj) this.i, (krj) obj3, (frj) obj2, lq4Var, 7);
            case 8:
                return new rjj((nrj) this.i, (krj) obj3, (frj) obj2, lq4Var, 8);
            case 9:
                rjj rjjVar3 = new rjj((dsj) obj3, (gsj) obj2, lq4Var, 9);
                rjjVar3.i = obj;
                return rjjVar3;
            case 10:
                rjj rjjVar4 = new rjj((String) obj3, (qf7) obj2, lq4Var, 10);
                rjjVar4.i = obj;
                return rjjVar4;
            case 11:
                return new rjj((jw8) this.i, (mzj) obj3, (qtb) obj2, lq4Var, 11);
            case 12:
                rjj rjjVar5 = new rjj((i1k) obj3, (dle) obj2, lq4Var, 12);
                rjjVar5.i = obj;
                return rjjVar5;
            case 13:
                return new rjj((xde) obj3, (String) obj2, lq4Var, 13);
            case 14:
                return new rjj((xde) this.i, (String) obj3, (ClientId) obj2, lq4Var, 14);
            default:
                return new rjj((kdk) this.i, (CallingAppIds) obj3, (AsyncCallback) obj2, lq4Var, 15);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((rjj) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((rjj) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((rjj) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((rjj) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((rjj) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((rjj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((rjj) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((rjj) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((rjj) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((rjj) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((rjj) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((rjj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((rjj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return new rjj((xde) this.g, (String) this.h, (lq4) obj2, 13).invokeSuspend(sbiVar);
            case 14:
                return ((rjj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((rjj) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r15 == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0111, code lost:
    
        if (r0.e(r14) == r2) goto L54;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rjj(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
