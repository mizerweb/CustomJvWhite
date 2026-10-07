package defpackage;

import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class g02 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g02(Object obj, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.g = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new g02((h02) obj2, this.g, lq4Var, 0);
            case 1:
                return new g02((lv2) obj2, this.g, lq4Var, 1);
            case 2:
                return new g02((ah3) obj2, this.g, lq4Var, 2);
            case 3:
                return new g02((f37) obj2, this.g, lq4Var, 3);
            case 4:
                return new g02((bwa) obj2, this.g, lq4Var, 4);
            case 5:
                return new g02((dqd) obj2, this.g, lq4Var, 5);
            case 6:
                return new g02((gvf) obj2, this.g, lq4Var, 6);
            case 7:
                g02 g02Var = new g02((TaskMonitor$TaskMonitorWorker) obj2, lq4Var);
                g02Var.g = ((Boolean) obj).booleanValue();
                return g02Var;
            case 8:
                return new g02((wei) obj2, this.g, lq4Var, 8);
            default:
                return new g02((cpj) obj2, this.g, lq4Var, 9);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((g02) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((g02) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((g02) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((g02) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((g02) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((g02) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((g02) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((g02) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((g02) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((g02) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0250  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:60:0x0121  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x013d  */
    /* JADX WARN: Code duplicated, block: B:71:0x014a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0162  */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0399, code lost:
    
        if (r1.a(r16, r0) == r2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03a8, code lost:
    
        if (r1.a(r16, r0) == r2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03b3, code lost:
    
        if (r1.a(r16, r0) == r2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0163, code lost:
    
        if (r0 == r11) goto L76;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g02.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g02(TaskMonitor$TaskMonitorWorker taskMonitor$TaskMonitorWorker, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 7;
        this.h = taskMonitor$TaskMonitorWorker;
    }
}
