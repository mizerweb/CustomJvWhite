package androidx.work;

import defpackage.cdc;
import defpackage.ore;

/* JADX INFO: loaded from: classes.dex */
public final class a extends WorkRequest.Builder {
    @Override // androidx.work.WorkRequest.Builder
    public final WorkRequest buildInternal$work_runtime_release() {
        if (!getBackoffCriteriaSet() || !getWorkSpec().j.d) {
            return new cdc(getId(), getWorkSpec(), getTags$work_runtime_release());
        }
        ore.p("Cannot set backoff criteria on an idle mode job");
        return null;
    }

    @Override // androidx.work.WorkRequest.Builder
    public final WorkRequest.Builder getThisObject$work_runtime_release() {
        return this;
    }
}
