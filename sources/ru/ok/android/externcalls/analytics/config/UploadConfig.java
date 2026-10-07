package ru.ok.android.externcalls.analytics.config;

import defpackage.af7;
import defpackage.cqk;
import defpackage.j95;
import defpackage.np0;
import defpackage.qt4;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b*\b\u0086\b\u0018\u0000 P2\u00020\u0001:\u0001PBÑ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u001a\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u001a\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u001a\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u001a\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u001a\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u001a\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010\u001dJÚ\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t2\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t2\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0016J\u001a\u0010,\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b4\u0010\u001aR!\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u001dR!\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b7\u0010\u001dR!\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b8\u0010\u001dR!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b9\u0010\u001dR!\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b:\u0010\u001dR!\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b;\u0010\u001dR!\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b<\u0010\u001dR!\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b=\u0010\u001dR\u0011\u0010?\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b>\u0010\u0016R\u0011\u0010A\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b@\u0010\u0016R\u0011\u0010C\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bB\u0010\u0016R\u0013\u0010F\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010I\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010K\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0011\u0010M\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bL\u0010HR\u0011\u0010O\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bN\u0010H¨\u0006Q"}, d2 = {"Lru/ok/android/externcalls/analytics/config/UploadConfig;", "", "", "uploadJobId", "Ljava/util/concurrent/Executor;", "uploadExecutor", "", "maxTimeToUploadMillis", "silenceToUploadMillis", "Lkotlin/Function0;", "maxFileLengthKbProvider", "maxEventCountProvider", "maxLocalCacheFileCountProvider", "timeToUploadNextMsProvider", "", "compressContentProvider", "disableUploadWhenCallIsActiveProvider", "autoDetectFileCompressionProvider", "useDbCacheProvider", "<init>", "(ILjava/util/concurrent/Executor;JJLaf7;Laf7;Laf7;Laf7;Laf7;Laf7;Laf7;Laf7;)V", "component1", "()I", "component2", "()Ljava/util/concurrent/Executor;", "component3", "()J", "component4", "component5", "()Laf7;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ILjava/util/concurrent/Executor;JJLaf7;Laf7;Laf7;Laf7;Laf7;Laf7;Laf7;Laf7;)Lru/ok/android/externcalls/analytics/config/UploadConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getUploadJobId", "Ljava/util/concurrent/Executor;", "getUploadExecutor", "J", "getMaxTimeToUploadMillis", "getSilenceToUploadMillis", "Laf7;", "getMaxFileLengthKbProvider", "getMaxEventCountProvider", "getMaxLocalCacheFileCountProvider", "getTimeToUploadNextMsProvider", "getCompressContentProvider", "getDisableUploadWhenCallIsActiveProvider", "getAutoDetectFileCompressionProvider", "getUseDbCacheProvider", "getFileLengthTriggerToUploadBytes", "fileLengthTriggerToUploadBytes", "getEventCountToUploadNumber", "eventCountToUploadNumber", "getMaxLocalCacheFileCount", "maxLocalCacheFileCount", "getTimeToUploadNextMs", "()Ljava/lang/Long;", "timeToUploadNextMs", "getCompressContent", "()Z", "compressContent", "getAutoDetectFileCompression", "autoDetectFileCompression", "getDisableUploadWhenCallIsActive", "disableUploadWhenCallIsActive", "getUseDbCache", "useDbCache", "Companion", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UploadConfig {
    public static final boolean DEFAULT_COMPRESS_CONTENT = false;
    public static final boolean DEFAULT_DISABLE_UPLOAD_IN_CALL = true;
    public static final int DEFAULT_LOCAL_FILE_COUNT = 100;
    public static final int DEFAULT_MAX_EVENT_COUNT = 800;
    public static final int DEFAULT_MAX_FILE_SIZE_KB = 15;
    public static final boolean DEFAULT_USE_DB_CACHE = false;
    private final af7 autoDetectFileCompressionProvider;
    private final af7 compressContentProvider;
    private final af7 disableUploadWhenCallIsActiveProvider;
    private final af7 maxEventCountProvider;
    private final af7 maxFileLengthKbProvider;
    private final af7 maxLocalCacheFileCountProvider;
    private final long maxTimeToUploadMillis;
    private final long silenceToUploadMillis;
    private final af7 timeToUploadNextMsProvider;
    private final Executor uploadExecutor;
    private final int uploadJobId;
    private final af7 useDbCacheProvider;

    public /* synthetic */ UploadConfig(int i, Executor executor, long j, long j2, af7 af7Var, af7 af7Var2, af7 af7Var3, af7 af7Var4, af7 af7Var5, af7 af7Var6, af7 af7Var7, af7 af7Var8, int i2, j95 j95Var) {
        this((i2 & 1) != 0 ? 3815413 : i, (i2 & 2) != 0 ? null : executor, (i2 & 4) != 0 ? BuildConfig.MAX_TIME_TO_UPLOAD : j, (i2 & 8) != 0 ? BuildConfig.SILENCE_TIME_TO_UPLOAD : j2, (i2 & 16) != 0 ? null : af7Var, (i2 & 32) != 0 ? null : af7Var2, (i2 & 64) != 0 ? null : af7Var3, (i2 & np0.m) != 0 ? null : af7Var4, (i2 & np0.n) != 0 ? null : af7Var5, (i2 & np0.o) != 0 ? null : af7Var6, (i2 & 1024) != 0 ? null : af7Var7, (i2 & np0.q) != 0 ? null : af7Var8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUploadJobId() {
        return this.uploadJobId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final af7 getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final af7 getAutoDetectFileCompressionProvider() {
        return this.autoDetectFileCompressionProvider;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final af7 getUseDbCacheProvider() {
        return this.useDbCacheProvider;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Executor getUploadExecutor() {
        return this.uploadExecutor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMaxTimeToUploadMillis() {
        return this.maxTimeToUploadMillis;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSilenceToUploadMillis() {
        return this.silenceToUploadMillis;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final af7 getMaxFileLengthKbProvider() {
        return this.maxFileLengthKbProvider;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final af7 getMaxEventCountProvider() {
        return this.maxEventCountProvider;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final af7 getMaxLocalCacheFileCountProvider() {
        return this.maxLocalCacheFileCountProvider;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final af7 getTimeToUploadNextMsProvider() {
        return this.timeToUploadNextMsProvider;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final af7 getCompressContentProvider() {
        return this.compressContentProvider;
    }

    public final UploadConfig copy(int uploadJobId, Executor uploadExecutor, long maxTimeToUploadMillis, long silenceToUploadMillis, af7 maxFileLengthKbProvider, af7 maxEventCountProvider, af7 maxLocalCacheFileCountProvider, af7 timeToUploadNextMsProvider, af7 compressContentProvider, af7 disableUploadWhenCallIsActiveProvider, af7 autoDetectFileCompressionProvider, af7 useDbCacheProvider) {
        return new UploadConfig(uploadJobId, uploadExecutor, maxTimeToUploadMillis, silenceToUploadMillis, maxFileLengthKbProvider, maxEventCountProvider, maxLocalCacheFileCountProvider, timeToUploadNextMsProvider, compressContentProvider, disableUploadWhenCallIsActiveProvider, autoDetectFileCompressionProvider, useDbCacheProvider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadConfig)) {
            return false;
        }
        UploadConfig uploadConfig = (UploadConfig) other;
        return this.uploadJobId == uploadConfig.uploadJobId && cqk.d(this.uploadExecutor, uploadConfig.uploadExecutor) && this.maxTimeToUploadMillis == uploadConfig.maxTimeToUploadMillis && this.silenceToUploadMillis == uploadConfig.silenceToUploadMillis && cqk.d(this.maxFileLengthKbProvider, uploadConfig.maxFileLengthKbProvider) && cqk.d(this.maxEventCountProvider, uploadConfig.maxEventCountProvider) && cqk.d(this.maxLocalCacheFileCountProvider, uploadConfig.maxLocalCacheFileCountProvider) && cqk.d(this.timeToUploadNextMsProvider, uploadConfig.timeToUploadNextMsProvider) && cqk.d(this.compressContentProvider, uploadConfig.compressContentProvider) && cqk.d(this.disableUploadWhenCallIsActiveProvider, uploadConfig.disableUploadWhenCallIsActiveProvider) && cqk.d(this.autoDetectFileCompressionProvider, uploadConfig.autoDetectFileCompressionProvider) && cqk.d(this.useDbCacheProvider, uploadConfig.useDbCacheProvider);
    }

    public final boolean getAutoDetectFileCompression() {
        Boolean bool;
        af7 af7Var = this.autoDetectFileCompressionProvider;
        if (af7Var == null || (bool = (Boolean) af7Var.invoke()) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final af7 getAutoDetectFileCompressionProvider() {
        return this.autoDetectFileCompressionProvider;
    }

    public final boolean getCompressContent() {
        Boolean bool;
        af7 af7Var = this.compressContentProvider;
        if (af7Var != null && (bool = (Boolean) af7Var.invoke()) != null) {
            return bool.booleanValue();
        }
        af7 af7Var2 = this.useDbCacheProvider;
        Boolean bool2 = af7Var2 != null ? (Boolean) af7Var2.invoke() : null;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public final af7 getCompressContentProvider() {
        return this.compressContentProvider;
    }

    public final boolean getDisableUploadWhenCallIsActive() {
        Boolean bool;
        af7 af7Var = this.disableUploadWhenCallIsActiveProvider;
        if (af7Var == null || (bool = (Boolean) af7Var.invoke()) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final af7 getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final int getEventCountToUploadNumber() {
        Integer num;
        af7 af7Var = this.maxEventCountProvider;
        return (af7Var == null || (num = (Integer) af7Var.invoke()) == null) ? DEFAULT_MAX_EVENT_COUNT : num.intValue();
    }

    public final int getFileLengthTriggerToUploadBytes() {
        Integer num;
        af7 af7Var = this.maxFileLengthKbProvider;
        return ((af7Var == null || (num = (Integer) af7Var.invoke()) == null) ? 15 : num.intValue()) * 1000;
    }

    public final af7 getMaxEventCountProvider() {
        return this.maxEventCountProvider;
    }

    public final af7 getMaxFileLengthKbProvider() {
        return this.maxFileLengthKbProvider;
    }

    public final int getMaxLocalCacheFileCount() {
        Integer num;
        af7 af7Var = this.maxLocalCacheFileCountProvider;
        if (af7Var == null || (num = (Integer) af7Var.invoke()) == null) {
            return 100;
        }
        return num.intValue();
    }

    public final af7 getMaxLocalCacheFileCountProvider() {
        return this.maxLocalCacheFileCountProvider;
    }

    public final long getMaxTimeToUploadMillis() {
        return this.maxTimeToUploadMillis;
    }

    public final long getSilenceToUploadMillis() {
        return this.silenceToUploadMillis;
    }

    public final Long getTimeToUploadNextMs() {
        af7 af7Var = this.timeToUploadNextMsProvider;
        if (af7Var != null) {
            return (Long) af7Var.invoke();
        }
        return null;
    }

    public final af7 getTimeToUploadNextMsProvider() {
        return this.timeToUploadNextMsProvider;
    }

    public final Executor getUploadExecutor() {
        return this.uploadExecutor;
    }

    public final int getUploadJobId() {
        return this.uploadJobId;
    }

    public final boolean getUseDbCache() {
        Boolean bool;
        af7 af7Var = this.useDbCacheProvider;
        if (af7Var == null || (bool = (Boolean) af7Var.invoke()) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final af7 getUseDbCacheProvider() {
        return this.useDbCacheProvider;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.uploadJobId) * 31;
        Executor executor = this.uploadExecutor;
        int iG = qt4.g(qt4.g((iHashCode + (executor == null ? 0 : executor.hashCode())) * 31, 31, this.maxTimeToUploadMillis), 31, this.silenceToUploadMillis);
        af7 af7Var = this.maxFileLengthKbProvider;
        int iHashCode2 = (iG + (af7Var == null ? 0 : af7Var.hashCode())) * 31;
        af7 af7Var2 = this.maxEventCountProvider;
        int iHashCode3 = (iHashCode2 + (af7Var2 == null ? 0 : af7Var2.hashCode())) * 31;
        af7 af7Var3 = this.maxLocalCacheFileCountProvider;
        int iHashCode4 = (iHashCode3 + (af7Var3 == null ? 0 : af7Var3.hashCode())) * 31;
        af7 af7Var4 = this.timeToUploadNextMsProvider;
        int iHashCode5 = (iHashCode4 + (af7Var4 == null ? 0 : af7Var4.hashCode())) * 31;
        af7 af7Var5 = this.compressContentProvider;
        int iHashCode6 = (iHashCode5 + (af7Var5 == null ? 0 : af7Var5.hashCode())) * 31;
        af7 af7Var6 = this.disableUploadWhenCallIsActiveProvider;
        int iHashCode7 = (iHashCode6 + (af7Var6 == null ? 0 : af7Var6.hashCode())) * 31;
        af7 af7Var7 = this.autoDetectFileCompressionProvider;
        int iHashCode8 = (iHashCode7 + (af7Var7 == null ? 0 : af7Var7.hashCode())) * 31;
        af7 af7Var8 = this.useDbCacheProvider;
        return iHashCode8 + (af7Var8 != null ? af7Var8.hashCode() : 0);
    }

    public String toString() {
        int i = this.uploadJobId;
        Executor executor = this.uploadExecutor;
        long j = this.maxTimeToUploadMillis;
        long j2 = this.silenceToUploadMillis;
        af7 af7Var = this.maxFileLengthKbProvider;
        af7 af7Var2 = this.maxEventCountProvider;
        af7 af7Var3 = this.maxLocalCacheFileCountProvider;
        af7 af7Var4 = this.timeToUploadNextMsProvider;
        af7 af7Var5 = this.compressContentProvider;
        af7 af7Var6 = this.disableUploadWhenCallIsActiveProvider;
        af7 af7Var7 = this.autoDetectFileCompressionProvider;
        af7 af7Var8 = this.useDbCacheProvider;
        StringBuilder sb = new StringBuilder("UploadConfig(uploadJobId=");
        sb.append(i);
        sb.append(", uploadExecutor=");
        sb.append(executor);
        sb.append(", maxTimeToUploadMillis=");
        sb.append(j);
        qt4.z(j2, ", silenceToUploadMillis=", ", maxFileLengthKbProvider=", sb);
        sb.append(af7Var);
        sb.append(", maxEventCountProvider=");
        sb.append(af7Var2);
        sb.append(", maxLocalCacheFileCountProvider=");
        sb.append(af7Var3);
        sb.append(", timeToUploadNextMsProvider=");
        sb.append(af7Var4);
        sb.append(", compressContentProvider=");
        sb.append(af7Var5);
        sb.append(", disableUploadWhenCallIsActiveProvider=");
        sb.append(af7Var6);
        sb.append(", autoDetectFileCompressionProvider=");
        sb.append(af7Var7);
        sb.append(", useDbCacheProvider=");
        sb.append(af7Var8);
        sb.append(")");
        return sb.toString();
    }

    public UploadConfig(int i, Executor executor, long j, long j2, af7 af7Var, af7 af7Var2, af7 af7Var3, af7 af7Var4, af7 af7Var5, af7 af7Var6, af7 af7Var7, af7 af7Var8) {
        this.uploadJobId = i;
        this.uploadExecutor = executor;
        this.maxTimeToUploadMillis = j;
        this.silenceToUploadMillis = j2;
        this.maxFileLengthKbProvider = af7Var;
        this.maxEventCountProvider = af7Var2;
        this.maxLocalCacheFileCountProvider = af7Var3;
        this.timeToUploadNextMsProvider = af7Var4;
        this.compressContentProvider = af7Var5;
        this.disableUploadWhenCallIsActiveProvider = af7Var6;
        this.autoDetectFileCompressionProvider = af7Var7;
        this.useDbCacheProvider = af7Var8;
    }

    public UploadConfig() {
        this(0, null, 0L, 0L, null, null, null, null, null, null, null, null, 4095, null);
    }
}
