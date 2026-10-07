package ru.ok.android.externcalls.sdk.analytics;

import defpackage.bc1;
import defpackage.cqk;
import defpackage.j95;
import defpackage.nbh;
import defpackage.np0;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.zo5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J`\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006*"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsUploadConfig;", "", "maxLocalFileSizeKb", "", "maxEventCount", "maxLocalFileCount", "timeToUploadNextFileMs", "", "compressContent", "", "disableUploadWhenCallIsActiveProvider", "autoDetectContentCompression", "useDbCache", "<init>", "(IIILjava/lang/Long;ZZZZ)V", "getMaxLocalFileSizeKb", "()I", "getMaxEventCount", "getMaxLocalFileCount", "getTimeToUploadNextFileMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCompressContent", "()Z", "getDisableUploadWhenCallIsActiveProvider", "getAutoDetectContentCompression", "getUseDbCache", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(IIILjava/lang/Long;ZZZZ)Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsUploadConfig;", "equals", "other", "hashCode", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ConversationAnalyticsUploadConfig {
    private final boolean autoDetectContentCompression;
    private final boolean compressContent;
    private final boolean disableUploadWhenCallIsActiveProvider;
    private final int maxEventCount;
    private final int maxLocalFileCount;
    private final int maxLocalFileSizeKb;
    private final Long timeToUploadNextFileMs;
    private final boolean useDbCache;

    public /* synthetic */ ConversationAnalyticsUploadConfig(int i, int i2, int i3, Long l, boolean z, boolean z2, boolean z3, boolean z4, int i4, j95 j95Var) {
        this(i, i2, (i4 & 4) != 0 ? 1 : i3, (i4 & 8) != 0 ? null : l, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? false : z2, (i4 & 64) != 0 ? false : z3, (i4 & np0.m) != 0 ? false : z4);
    }

    public static /* synthetic */ ConversationAnalyticsUploadConfig copy$default(ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig, int i, int i2, int i3, Long l, boolean z, boolean z2, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = conversationAnalyticsUploadConfig.maxLocalFileSizeKb;
        }
        if ((i4 & 2) != 0) {
            i2 = conversationAnalyticsUploadConfig.maxEventCount;
        }
        if ((i4 & 4) != 0) {
            i3 = conversationAnalyticsUploadConfig.maxLocalFileCount;
        }
        if ((i4 & 8) != 0) {
            l = conversationAnalyticsUploadConfig.timeToUploadNextFileMs;
        }
        if ((i4 & 16) != 0) {
            z = conversationAnalyticsUploadConfig.compressContent;
        }
        if ((i4 & 32) != 0) {
            z2 = conversationAnalyticsUploadConfig.disableUploadWhenCallIsActiveProvider;
        }
        if ((i4 & 64) != 0) {
            z3 = conversationAnalyticsUploadConfig.autoDetectContentCompression;
        }
        if ((i4 & np0.m) != 0) {
            z4 = conversationAnalyticsUploadConfig.useDbCache;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z;
        boolean z8 = z2;
        return conversationAnalyticsUploadConfig.copy(i, i2, i3, l, z7, z8, z5, z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxLocalFileSizeKb() {
        return this.maxLocalFileSizeKb;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxEventCount() {
        return this.maxEventCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxLocalFileCount() {
        return this.maxLocalFileCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTimeToUploadNextFileMs() {
        return this.timeToUploadNextFileMs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCompressContent() {
        return this.compressContent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAutoDetectContentCompression() {
        return this.autoDetectContentCompression;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getUseDbCache() {
        return this.useDbCache;
    }

    public final ConversationAnalyticsUploadConfig copy(int maxLocalFileSizeKb, int maxEventCount, int maxLocalFileCount, Long timeToUploadNextFileMs, boolean compressContent, boolean disableUploadWhenCallIsActiveProvider, boolean autoDetectContentCompression, boolean useDbCache) {
        return new ConversationAnalyticsUploadConfig(maxLocalFileSizeKb, maxEventCount, maxLocalFileCount, timeToUploadNextFileMs, compressContent, disableUploadWhenCallIsActiveProvider, autoDetectContentCompression, useDbCache);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationAnalyticsUploadConfig)) {
            return false;
        }
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) other;
        return this.maxLocalFileSizeKb == conversationAnalyticsUploadConfig.maxLocalFileSizeKb && this.maxEventCount == conversationAnalyticsUploadConfig.maxEventCount && this.maxLocalFileCount == conversationAnalyticsUploadConfig.maxLocalFileCount && cqk.d(this.timeToUploadNextFileMs, conversationAnalyticsUploadConfig.timeToUploadNextFileMs) && this.compressContent == conversationAnalyticsUploadConfig.compressContent && this.disableUploadWhenCallIsActiveProvider == conversationAnalyticsUploadConfig.disableUploadWhenCallIsActiveProvider && this.autoDetectContentCompression == conversationAnalyticsUploadConfig.autoDetectContentCompression && this.useDbCache == conversationAnalyticsUploadConfig.useDbCache;
    }

    public final boolean getAutoDetectContentCompression() {
        return this.autoDetectContentCompression;
    }

    public final boolean getCompressContent() {
        return this.compressContent;
    }

    public final boolean getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final int getMaxEventCount() {
        return this.maxEventCount;
    }

    public final int getMaxLocalFileCount() {
        return this.maxLocalFileCount;
    }

    public final int getMaxLocalFileSizeKb() {
        return this.maxLocalFileSizeKb;
    }

    public final Long getTimeToUploadNextFileMs() {
        return this.timeToUploadNextFileMs;
    }

    public final boolean getUseDbCache() {
        return this.useDbCache;
    }

    public int hashCode() {
        int iC = zo5.c(this.maxLocalFileCount, zo5.c(this.maxEventCount, Integer.hashCode(this.maxLocalFileSizeKb) * 31, 31), 31);
        Long l = this.timeToUploadNextFileMs;
        return Boolean.hashCode(this.useDbCache) + nbh.n(nbh.n(nbh.n((iC + (l == null ? 0 : l.hashCode())) * 31, 31, this.compressContent), 31, this.disableUploadWhenCallIsActiveProvider), 31, this.autoDetectContentCompression);
    }

    public String toString() {
        int i = this.maxLocalFileSizeKb;
        int i2 = this.maxEventCount;
        int i3 = this.maxLocalFileCount;
        Long l = this.timeToUploadNextFileMs;
        boolean z = this.compressContent;
        boolean z2 = this.disableUploadWhenCallIsActiveProvider;
        boolean z3 = this.autoDetectContentCompression;
        boolean z4 = this.useDbCache;
        StringBuilder sbP = qv1.p("ConversationAnalyticsUploadConfig(maxLocalFileSizeKb=", i, ", maxEventCount=", i2, ", maxLocalFileCount=");
        sbP.append(i3);
        sbP.append(", timeToUploadNextFileMs=");
        sbP.append(l);
        sbP.append(", compressContent=");
        qt4.B(", disableUploadWhenCallIsActiveProvider=", ", autoDetectContentCompression=", sbP, z, z2);
        return bc1.m(", useDbCache=", ")", sbP, z3, z4);
    }

    public ConversationAnalyticsUploadConfig(int i, int i2, int i3, Long l, boolean z, boolean z2, boolean z3, boolean z4) {
        this.maxLocalFileSizeKb = i;
        this.maxEventCount = i2;
        this.maxLocalFileCount = i3;
        this.timeToUploadNextFileMs = l;
        this.compressContent = z;
        this.disableUploadWhenCallIsActiveProvider = z2;
        this.autoDetectContentCompression = z3;
        this.useDbCache = z4;
    }
}
