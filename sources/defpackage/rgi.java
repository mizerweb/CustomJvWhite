package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class rgi extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgi(sfe sfeVar, zui zuiVar, wec wecVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.e = 10;
        this.g = sfeVar;
        this.h = zuiVar;
        this.i = wecVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        Object obj4 = this.i;
        switch (i) {
            case 0:
                rgi rgiVar = new rgi((zgi) this.h, (AtomicReference) obj4, (lq4) obj3, 0);
                rgiVar.g = (Throwable) obj2;
                rgiVar.invokeSuspend(sbiVar);
                return hu4Var;
            case 1:
                rgi rgiVar2 = new rgi((lq4) obj3, (w82) obj4, 1);
                rgiVar2.g = (yx6) obj;
                rgiVar2.h = obj2;
                return rgiVar2.invokeSuspend(sbiVar);
            case 2:
                rgi rgiVar3 = new rgi((lq4) obj3, (q04) obj4, 2);
                rgiVar3.g = (yx6) obj;
                rgiVar3.h = obj2;
                return rgiVar3.invokeSuspend(sbiVar);
            case 3:
                ((Number) obj).longValue();
                rgi rgiVar4 = new rgi((rc5) this.h, (ny8) obj4, (lq4) obj3, 3);
                rgiVar4.g = (kih) obj2;
                return rgiVar4.invokeSuspend(sbiVar);
            case 4:
                rgi rgiVar5 = new rgi((lq4) obj3, (sr8) obj4, 4);
                rgiVar5.g = (yx6) obj;
                rgiVar5.h = obj2;
                return rgiVar5.invokeSuspend(sbiVar);
            case 5:
                rgi rgiVar6 = new rgi((c59) obj4, (lq4) obj3, 5);
                rgiVar6.h = (yx6) obj;
                rgiVar6.g = (Throwable) obj2;
                return rgiVar6.invokeSuspend(sbiVar);
            case 6:
                rgi rgiVar7 = new rgi((lq4) obj3, (LinkInterceptorWidget) obj4, 6);
                rgiVar7.g = (yx6) obj;
                rgiVar7.h = obj2;
                return rgiVar7.invokeSuspend(sbiVar);
            case 7:
                rgi rgiVar8 = new rgi((v9a) obj4, (lq4) obj3, 7);
                rgiVar8.g = (List) obj;
                rgiVar8.h = (x8a) obj2;
                return rgiVar8.invokeSuspend(sbiVar);
            case 8:
                rgi rgiVar9 = new rgi((lq4) obj3, (v9a) obj4, 8);
                rgiVar9.g = (yx6) obj;
                rgiVar9.h = obj2;
                return rgiVar9.invokeSuspend(sbiVar);
            case 9:
                rgi rgiVar10 = new rgi((lq4) obj3, (kob) obj4, 9);
                rgiVar10.g = (yx6) obj;
                rgiVar10.h = (Object[]) obj2;
                return rgiVar10.invokeSuspend(sbiVar);
            case 10:
                return new rgi((sfe) this.g, (zui) this.h, (wec) obj4, (lq4) obj3).invokeSuspend(sbiVar);
            case 11:
                rgi rgiVar11 = new rgi((lq4) obj3, (bpf) obj4, 11);
                rgiVar11.g = (yx6) obj;
                rgiVar11.h = obj2;
                return rgiVar11.invokeSuspend(sbiVar);
            case 12:
                rgi rgiVar12 = new rgi((lq4) obj3, (gbg) obj4, 12);
                rgiVar12.g = (yx6) obj;
                rgiVar12.h = obj2;
                return rgiVar12.invokeSuspend(sbiVar);
            case 13:
                rgi rgiVar13 = new rgi((lq4) obj3, (vvg) obj4, 13);
                rgiVar13.g = (yx6) obj;
                rgiVar13.h = obj2;
                return rgiVar13.invokeSuspend(sbiVar);
            case 14:
                rgi rgiVar14 = new rgi((TaskMonitor$TaskMonitorWorker) obj4, (lq4) obj3, 14);
                rgiVar14.h = (yx6) obj;
                rgiVar14.g = (Throwable) obj2;
                return rgiVar14.invokeSuspend(sbiVar);
            case 15:
                rgi rgiVar15 = new rgi((zgi) this.h, (wfe) obj4, (lq4) obj3, 15);
                rgiVar15.g = (Throwable) obj2;
                rgiVar15.invokeSuspend(sbiVar);
                return hu4Var;
            case 16:
                rgi rgiVar16 = new rgi((cii) this.h, (gka) obj4, (lq4) obj3, 16);
                rgiVar16.g = (Throwable) obj2;
                rgiVar16.invokeSuspend(sbiVar);
                return hu4Var;
            default:
                rgi rgiVar17 = new rgi((lq4) obj3, (ioj) obj4, 17);
                rgiVar17.g = (yx6) obj;
                rgiVar17.h = (Object[]) obj2;
                return rgiVar17.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0229, code lost:
    
        if (r2.emit(r1, r41) == r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0269, code lost:
    
        if (r2.emit(r1, r41) == r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x09b8, code lost:
    
        if (defpackage.rc5.a((defpackage.rc5) r41.h, (defpackage.akb) r2, r41) == r3) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x09e0, code lost:
    
        if (r2 == r3) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:?, code lost:
    
        return r3;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rgi(lq4 lq4Var, Object obj, int i) {
        super(3, lq4Var);
        this.e = i;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rgi(Object obj, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rgi(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }
}
