package ru.rustore.sdk.metrics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/rustore/sdk/metrics/MetricsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "MetricsDbError", "NetworkError", "SaveMetricsEventError", "Lru/rustore/sdk/metrics/MetricsException$MetricsDbError;", "Lru/rustore/sdk/metrics/MetricsException$NetworkError;", "Lru/rustore/sdk/metrics/MetricsException$SaveMetricsEventError;", "sdk-public-metrics_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class MetricsException extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/metrics/MetricsException$MetricsDbError;", "Lru/rustore/sdk/metrics/MetricsException;", "sdk-public-metrics_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class MetricsDbError extends MetricsException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/metrics/MetricsException$NetworkError;", "Lru/rustore/sdk/metrics/MetricsException;", "sdk-public-metrics_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class NetworkError extends MetricsException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/metrics/MetricsException$SaveMetricsEventError;", "Lru/rustore/sdk/metrics/MetricsException;", "sdk-public-metrics_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class SaveMetricsEventError extends MetricsException {
    }
}
