package defpackage;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class dq9 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq9) && Double.compare(90.0d, 90.0d) == 0 && Double.compare(0.02d, 0.02d) == 0 && Double.compare(700.0d, 700.0d) == 0 && Double.compare(0.02d, 0.02d) == 0;
    }

    public final int hashCode() {
        return Long.hashCode(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) + tfb.a(tfb.a(tfb.a(Double.hashCode(90.0d) * 31, 0.02d), 700.0d), 0.02d);
    }

    public final String toString() {
        return "GoodNetworkCondition(rttLowBound=90.0, lostPacketsLimitForRttLowBound=0.02, rttHighBound=700.0, lostPacketsLimitForRttHighBound=0.02, recoveryTimeoutMs=30000)";
    }
}
