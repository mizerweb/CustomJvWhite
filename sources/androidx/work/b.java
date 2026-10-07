package androidx.work;

import defpackage.gsc;
import defpackage.mzj;
import defpackage.n1g;
import defpackage.oc9;
import defpackage.ore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b extends WorkRequest.Builder {
    public b(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        mzj workSpec = getWorkSpec();
        long millis = timeUnit.toMillis(j);
        workSpec.getClass();
        String str = mzj.z;
        if (millis < 900000) {
            n1g.x().j0(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j2 = millis < 900000 ? 900000L : millis;
        long j3 = millis < 900000 ? 900000L : millis;
        if (j2 < 900000) {
            n1g.x().j0(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        workSpec.h = j2 >= 900000 ? j2 : 900000L;
        if (j3 < 300000) {
            n1g.x().j0(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j3 > workSpec.h) {
            n1g.x().j0(str, "Flex duration greater than interval duration; Changed to " + j2);
        }
        workSpec.i = oc9.x(j3, 300000L, workSpec.h);
    }

    @Override // androidx.work.WorkRequest.Builder
    public final WorkRequest buildInternal$work_runtime_release() {
        if (getBackoffCriteriaSet() && getWorkSpec().j.d) {
            ore.p("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        if (!getWorkSpec().q) {
            return new gsc(getId(), getWorkSpec(), getTags$work_runtime_release());
        }
        ore.p("PeriodicWorkRequests cannot be expedited");
        return null;
    }

    @Override // androidx.work.WorkRequest.Builder
    public final WorkRequest.Builder getThisObject$work_runtime_release() {
        return this;
    }
}
