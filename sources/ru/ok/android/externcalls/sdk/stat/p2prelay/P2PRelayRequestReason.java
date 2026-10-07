package ru.ok.android.externcalls.sdk.stat.p2prelay;

import defpackage.cqk;
import defpackage.nbh;
import defpackage.qt4;
import defpackage.qv1;
import kotlin.Metadata;
import ru.ok.android.onelog.UploadService;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/p2prelay/P2PRelayRequestReason;", "", UploadService.EXTRA_TRIGGER, "", "threshold", "", "violationsCount", "", "<init>", "(Ljava/lang/String;JI)V", "getTrigger", "()Ljava/lang/String;", "getThreshold", "()J", "getViolationsCount", "()I", "asStatString", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class P2PRelayRequestReason {
    private final long threshold;
    private final String trigger;
    private final int violationsCount;

    public P2PRelayRequestReason(String str, long j, int i) {
        this.trigger = str;
        this.threshold = j;
        this.violationsCount = i;
    }

    public static /* synthetic */ P2PRelayRequestReason copy$default(P2PRelayRequestReason p2PRelayRequestReason, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = p2PRelayRequestReason.trigger;
        }
        if ((i2 & 2) != 0) {
            j = p2PRelayRequestReason.threshold;
        }
        if ((i2 & 4) != 0) {
            i = p2PRelayRequestReason.violationsCount;
        }
        return p2PRelayRequestReason.copy(str, j, i);
    }

    public final String asStatString() {
        return this.trigger + "_" + this.threshold + "_" + this.violationsCount;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrigger() {
        return this.trigger;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getThreshold() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getViolationsCount() {
        return this.violationsCount;
    }

    public final P2PRelayRequestReason copy(String trigger, long threshold, int violationsCount) {
        return new P2PRelayRequestReason(trigger, threshold, violationsCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof P2PRelayRequestReason)) {
            return false;
        }
        P2PRelayRequestReason p2PRelayRequestReason = (P2PRelayRequestReason) other;
        return cqk.d(this.trigger, p2PRelayRequestReason.trigger) && this.threshold == p2PRelayRequestReason.threshold && this.violationsCount == p2PRelayRequestReason.violationsCount;
    }

    public final long getThreshold() {
        return this.threshold;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public final int getViolationsCount() {
        return this.violationsCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.violationsCount) + qt4.g(this.trigger.hashCode() * 31, 31, this.threshold);
    }

    public String toString() {
        String str = this.trigger;
        long j = this.threshold;
        return qv1.o(nbh.B(j, "P2PRelayRequestReason(trigger=", str, ", threshold="), ", violationsCount=", this.violationsCount, ")");
    }
}
