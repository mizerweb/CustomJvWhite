package ru.ok.android.externcalls.sdk.stat.signaling;

import android.os.SystemClock;
import defpackage.esh;
import defpackage.gsh;
import defpackage.ww3;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTracker;", "", "Lesh;", "timeProvider", "<init>", "(Lesh;)V", "", SdkMetricStatEvent.NAME_KEY, "Lsbi;", "onRequest", "(Ljava/lang/String;)V", "onAnswer", "", "Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTracker$StatisticsInfo;", "extractStatistics", "()Ljava/util/Collection;", "Lesh;", "lock", "Ljava/lang/Object;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "requestTimestampMs", "Ljava/util/concurrent/ConcurrentHashMap;", "", "requestInfos", "Ljava/util/Map;", "StatisticsInfo", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SignalingTracker {
    private final esh timeProvider;
    private final Object lock = new Object();
    private final ConcurrentHashMap<String, Long> requestTimestampMs = new ConcurrentHashMap<>();
    private final Map<String, StatisticsInfo> requestInfos = new LinkedHashMap();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010#\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0013\u0010&\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010(\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTracker$StatisticsInfo;", "", "", SdkMetricStatEvent.NAME_KEY, "", "firstValue", "<init>", "(Ljava/lang/String;J)V", SdkMetricStatEvent.VALUE_KEY, "Lsbi;", "update", "(J)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "count", "I", "getCount", "()I", "setCount", "(I)V", "", "sum", "D", "Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator;", "approximator50", "Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator;", "approximator95", "getMinValue", "()J", "minValue", "getMaxValue", "maxValue", "getAverage", "average", "getMedian", "()Ljava/lang/Long;", "median", "getQuantile95", "quantile95", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StatisticsInfo {
        private final OnlineQuantilesApproximator approximator50;
        private final OnlineQuantilesApproximator approximator95;
        private int count = 1;
        private final String name;
        private double sum;

        public StatisticsInfo(String str, long j) {
            this.name = str;
            this.sum = j;
            float f = j;
            this.approximator50 = new OnlineQuantilesApproximator(f, 0.5f, 0, 4, null);
            this.approximator95 = new OnlineQuantilesApproximator(f, 0.95f, 0, 4, null);
        }

        public final long getAverage() {
            return (long) (this.sum / ((double) this.count));
        }

        public final int getCount() {
            return this.count;
        }

        public final long getMaxValue() {
            return (long) this.approximator50.getMax();
        }

        public final Long getMedian() {
            Float fValueOf = Float.valueOf(this.approximator50.get());
            if (Math.abs(fValueOf.floatValue()) > Float.MAX_VALUE) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                return Long.valueOf((long) fValueOf.floatValue());
            }
            return null;
        }

        public final long getMinValue() {
            return (long) this.approximator50.getMin();
        }

        public final String getName() {
            return this.name;
        }

        public final Long getQuantile95() {
            Float fValueOf = Float.valueOf(this.approximator95.get());
            if (Math.abs(fValueOf.floatValue()) > Float.MAX_VALUE) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                return Long.valueOf((long) fValueOf.floatValue());
            }
            return null;
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public final void update(long value) {
            this.count++;
            this.sum += value;
            float f = value;
            this.approximator50.submit(f);
            this.approximator95.submit(f);
        }
    }

    public SignalingTracker(esh eshVar) {
        this.timeProvider = eshVar;
    }

    public final Collection<StatisticsInfo> extractStatistics() {
        List list;
        synchronized (this.lock) {
            List listT1 = ww3.T1(this.requestInfos.values());
            this.requestInfos.clear();
            this.requestTimestampMs.clear();
            list = listT1;
        }
        return list;
    }

    public final void onAnswer(String name) {
        Long lRemove = this.requestTimestampMs.remove(name);
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            ((gsh) this.timeProvider).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
            synchronized (this.lock) {
                try {
                    StatisticsInfo statisticsInfo = this.requestInfos.get(name);
                    if (statisticsInfo != null) {
                        statisticsInfo.update(jElapsedRealtime);
                    } else {
                        this.requestInfos.put(name, new StatisticsInfo(name, jElapsedRealtime));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void onRequest(String name) {
        ConcurrentHashMap<String, Long> concurrentHashMap = this.requestTimestampMs;
        ((gsh) this.timeProvider).getClass();
        concurrentHashMap.put(name, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
