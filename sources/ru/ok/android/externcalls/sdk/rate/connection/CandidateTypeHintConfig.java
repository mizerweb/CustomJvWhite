package ru.ok.android.externcalls.sdk.rate.connection;

import defpackage.cqk;
import defpackage.j95;
import defpackage.s66;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0004HÖ\u0081\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/connection/CandidateTypeHintConfig;", "", "limits", "", "", "", "<init>", "(Ljava/util/Map;)V", "getLimits", "()Ljava/util/Map;", "isNotEmpty", "", "()Z", "isEmpty", "component1", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CandidateTypeHintConfig {
    public static final String TYPE_HOST = "host";
    public static final String TYPE_PRFLX = "prflx";
    public static final String TYPE_RELAY = "relay";
    public static final String TYPE_SRFLX = "srflx";
    private final Map<String, Long> limits;

    public /* synthetic */ CandidateTypeHintConfig(Map map, int i, j95 j95Var) {
        this((i & 1) != 0 ? s66.a : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CandidateTypeHintConfig copy$default(CandidateTypeHintConfig candidateTypeHintConfig, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = candidateTypeHintConfig.limits;
        }
        return candidateTypeHintConfig.copy(map);
    }

    public final Map<String, Long> component1() {
        return this.limits;
    }

    public final CandidateTypeHintConfig copy(Map<String, Long> limits) {
        return new CandidateTypeHintConfig(limits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CandidateTypeHintConfig) && cqk.d(this.limits, ((CandidateTypeHintConfig) other).limits);
    }

    public final Map<String, Long> getLimits() {
        return this.limits;
    }

    public int hashCode() {
        return this.limits.hashCode();
    }

    public final boolean isEmpty() {
        return this.limits.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.limits.isEmpty();
    }

    public String toString() {
        return "CandidateTypeHintConfig(limits=" + this.limits + ")";
    }

    public CandidateTypeHintConfig(Map<String, Long> map) {
        this.limits = map;
    }

    public CandidateTypeHintConfig() {
        this(null, 1, null);
    }
}
