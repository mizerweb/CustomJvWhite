package ru.ok.android.externcalls.sdk.ml.config;

import defpackage.cqk;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.zo5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfig;", "", MLFeatureConfigProviderBase.URL_KEY, "", "checksum", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getUrl", "()Ljava/lang/String;", "getChecksum", "getEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MLFeatureConfig {
    private final String checksum;
    private final boolean enabled;
    private final String url;

    public MLFeatureConfig(String str, String str2, boolean z) {
        this.url = str;
        this.checksum = str2;
        this.enabled = z;
    }

    public static /* synthetic */ MLFeatureConfig copy$default(MLFeatureConfig mLFeatureConfig, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mLFeatureConfig.url;
        }
        if ((i & 2) != 0) {
            str2 = mLFeatureConfig.checksum;
        }
        if ((i & 4) != 0) {
            z = mLFeatureConfig.enabled;
        }
        return mLFeatureConfig.copy(str, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final MLFeatureConfig copy(String url, String checksum, boolean enabled) {
        return new MLFeatureConfig(url, checksum, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MLFeatureConfig)) {
            return false;
        }
        MLFeatureConfig mLFeatureConfig = (MLFeatureConfig) other;
        return cqk.d(this.url, mLFeatureConfig.url) && cqk.d(this.checksum, mLFeatureConfig.checksum) && this.enabled == mLFeatureConfig.enabled;
    }

    public final String getChecksum() {
        return this.checksum;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + zo5.d(this.url.hashCode() * 31, 31, this.checksum);
    }

    public String toString() {
        String str = this.url;
        String str2 = this.checksum;
        return qt4.r(qv1.q("MLFeatureConfig(url=", str, ", checksum=", str2, ", enabled="), this.enabled, ")");
    }
}
