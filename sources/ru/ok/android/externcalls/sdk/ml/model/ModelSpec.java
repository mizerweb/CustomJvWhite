package ru.ok.android.externcalls.sdk.ml.model;

import defpackage.j95;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/model/ModelSpec;", "", "requiredExtensions", "", "Lru/ok/android/externcalls/sdk/ml/model/ExtensionRule;", "minFileSize", "", "<init>", "(Ljava/util/Set;J)V", "getRequiredExtensions", "()Ljava/util/Set;", "getMinFileSize", "()J", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ModelSpec {
    private final long minFileSize;
    private final Set<ExtensionRule> requiredExtensions;

    public /* synthetic */ ModelSpec(Set set, long j, int i, j95 j95Var) {
        this(set, (i & 2) != 0 ? 1L : j);
    }

    public final long getMinFileSize() {
        return this.minFileSize;
    }

    public final Set<ExtensionRule> getRequiredExtensions() {
        return this.requiredExtensions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModelSpec(Set<? extends ExtensionRule> set, long j) {
        this.requiredExtensions = set;
        this.minFileSize = j;
    }
}
