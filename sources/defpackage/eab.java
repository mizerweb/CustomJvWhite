package defpackage;

import com.my.tracker.MyTracker;
import com.my.tracker.userlifecycle.MyTrackerUserLifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class eab extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eab(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                eab eabVar = new eab(2, lq4Var, 0);
                eabVar.f = ((Number) obj).longValue();
                return eabVar;
            default:
                eab eabVar2 = new eab(2, lq4Var, 1);
                eabVar2.f = ((Number) obj).longValue();
                return eabVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        long jLongValue = ((Number) obj).longValue();
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((eab) create(Long.valueOf(jLongValue), lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((eab) create(Long.valueOf(jLongValue), lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        long j = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                MyTracker.getTrackerParams().setCustomUserId(String.valueOf(j));
                break;
            default:
                ch3.d0(obj);
                MyTrackerUserLifecycle.trackLoginEvent(String.valueOf(j), null);
                break;
        }
        return sbiVar;
    }
}
