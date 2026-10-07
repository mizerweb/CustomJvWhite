package ru.ok.android.externcalls.sdk.stat.signaling;

import android.os.SystemClock;
import defpackage.af7;
import defpackage.c0a;
import defpackage.esh;
import defpackage.fi1;
import defpackage.gsh;
import defpackage.j95;
import defpackage.q5g;
import defpackage.r5g;
import defpackage.r5h;
import defpackage.ww3;
import defpackage.y3e;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 B2\u00020\u0001:\u0001BB/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001b\u0010\u0015\u001a\u00020\r*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010\"J)\u0010'\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010\u00172\u0006\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(J)\u0010*\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010\u00172\u0006\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010(J\u0017\u0010+\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b+\u0010\"J\u000f\u0010,\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010\u000fJ\u0017\u0010-\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b-\u0010\"J\u001f\u00100\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b2\u0010\"R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0018\u0010<\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u0004\u0018\u00010>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u0004\u0018\u00010>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@¨\u0006C"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTransportStat;", "Lr5g;", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "Lesh;", "timeProvider", "Ly3e;", "log", "", "isSummaryStatsEnabled", "<init>", "(Laf7;Lesh;Ly3e;Z)V", "Lsbi;", "onFailed", "()V", "reportCommandSummary", "reportPingSummary", "Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTracker$StatisticsInfo;", "info", "addCommonStats", "(Lru/ok/android/externcalls/analytics/events/EventItemsMap;Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTracker$StatisticsInfo;)V", "", "eventName", "", SdkMetricStatEvent.VALUE_KEY, "report", "(Ljava/lang/String;Ljava/lang/Integer;)V", "stringValue", "(Ljava/lang/String;Ljava/lang/String;)V", "Lq5g;", "type", "onRestart", "(Lq5g;)V", "onConnect", "onConnected", SdkMetricStatEvent.NAME_KEY, "isPing", "onMessageReceived", "(Lq5g;Ljava/lang/String;Z)V", "isPong", "onCommandSent", "onDisconnectedSuccessfully", "onCallFinished", "onFailedByPings", "", "t", "onFailedByException", "(Lq5g;Ljava/lang/Throwable;)V", "onTimeout", "Laf7;", "Lesh;", "Ly3e;", "Z", "connectedAtLeastOnceInCall", "", "startConnectTime", "J", "lastMessageReceived", "firstFailTime", "Ljava/lang/Long;", "Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTracker;", "signalingTracker", "Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTracker;", "signalingPingTracker", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SignalingTransportStat implements r5g {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "SignalingTransportStat";
    private boolean connectedAtLeastOnceInCall;
    private Long firstFailTime;
    private final af7 getEventualStatSender;
    private final boolean isSummaryStatsEnabled;
    private long lastMessageReceived;
    private final y3e log;
    private final SignalingTracker signalingPingTracker;
    private final SignalingTracker signalingTracker;
    private long startConnectTime;
    private final esh timeProvider;

    public SignalingTransportStat(af7 af7Var, esh eshVar, y3e y3eVar, boolean z) {
        this.getEventualStatSender = af7Var;
        this.timeProvider = eshVar;
        this.log = y3eVar;
        this.isSummaryStatsEnabled = z;
        this.signalingTracker = z ? new SignalingTracker(eshVar) : null;
        this.signalingPingTracker = z ? new SignalingTracker(eshVar) : null;
    }

    private final void addCommonStats(EventItemsMap eventItemsMap, SignalingTracker.StatisticsInfo statisticsInfo) {
        eventItemsMap.set("min_value", Long.valueOf(statisticsInfo.getMinValue()));
        eventItemsMap.set("max_value", Long.valueOf(statisticsInfo.getMaxValue()));
        eventItemsMap.set("avg_value", Long.valueOf(statisticsInfo.getAverage()));
        Long median = statisticsInfo.getMedian();
        Long quantile95 = statisticsInfo.getQuantile95();
        if (median == null || quantile95 == null) {
            this.log.reportException(LOG_TAG, "issue with OnlineQuantilesApproximator", new IllegalStateException(c0a.o("NaN or Inf in statistics tracking ", statisticsInfo.getName(), " signaling request")));
        }
        eventItemsMap.set("median_value", median);
        eventItemsMap.set("p95_value", quantile95);
        eventItemsMap.set("values_count", Integer.valueOf(statisticsInfo.getCount()));
    }

    private final void onFailed() {
        if (this.firstFailTime == null) {
            ((gsh) this.timeProvider).getClass();
            this.firstFailTime = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    private final void report(String eventName, Integer value) {
        fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
        if (fi1Var != null) {
            fi1.a(fi1Var, eventName, value != null ? EventItemValueKt.toEventItemValue(value.intValue()) : null, null, 4);
        }
    }

    public static /* synthetic */ void report$default(SignalingTransportStat signalingTransportStat, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        signalingTransportStat.report(str, num);
    }

    private final void reportCommandSummary() {
        SignalingTracker signalingTracker;
        Collection<SignalingTracker.StatisticsInfo> collectionExtractStatistics;
        if (!this.isSummaryStatsEnabled || (signalingTracker = this.signalingTracker) == null || (collectionExtractStatistics = signalingTracker.extractStatistics()) == null) {
            return;
        }
        for (SignalingTracker.StatisticsInfo statisticsInfo : collectionExtractStatistics) {
            fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
            if (fi1Var != null) {
                EventItemsMap eventItemsMap = new EventItemsMap();
                eventItemsMap.set("api_method", statisticsInfo.getName());
                addCommonStats(eventItemsMap, statisticsInfo);
                fi1.a(fi1Var, "signaling_command_summary", null, eventItemsMap, 2);
            }
        }
    }

    private final void reportPingSummary() {
        SignalingTracker signalingTracker;
        Collection<SignalingTracker.StatisticsInfo> collectionExtractStatistics;
        SignalingTracker.StatisticsInfo statisticsInfo;
        fi1 fi1Var;
        if (!this.isSummaryStatsEnabled || (signalingTracker = this.signalingPingTracker) == null || (collectionExtractStatistics = signalingTracker.extractStatistics()) == null || (statisticsInfo = (SignalingTracker.StatisticsInfo) ww3.s1(collectionExtractStatistics)) == null || (fi1Var = (fi1) this.getEventualStatSender.invoke()) == null) {
            return;
        }
        EventItemsMap eventItemsMap = new EventItemsMap();
        addCommonStats(eventItemsMap, statisticsInfo);
        fi1.a(fi1Var, "signaling_ping_summary", null, eventItemsMap, 2);
    }

    public void onCallFinished() {
        reportCommandSummary();
    }

    @Override // defpackage.r5g
    public void onCommandSent(q5g type, String name, boolean isPong) {
        SignalingTracker signalingTracker;
        if (!this.isSummaryStatsEnabled || name == null || isPong || (signalingTracker = this.signalingTracker) == null) {
            return;
        }
        signalingTracker.onRequest(name);
    }

    @Override // defpackage.r5g
    public void onConnect(q5g type) {
        ((gsh) this.timeProvider).getClass();
        this.startConnectTime = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.r5g
    public void onConnected(q5g type) {
        this.firstFailTime = null;
        this.lastMessageReceived = 0L;
        ((gsh) this.timeProvider).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.startConnectTime;
        if (this.connectedAtLeastOnceInCall) {
            report(type.a(3), Integer.valueOf((int) jElapsedRealtime));
        } else {
            this.connectedAtLeastOnceInCall = true;
            report(type.a(2), Integer.valueOf((int) jElapsedRealtime));
        }
    }

    @Override // defpackage.r5g
    public void onDisconnectedSuccessfully(q5g type) {
        reportPingSummary();
    }

    @Override // defpackage.r5g
    public void onFailedByException(q5g type, Throwable t) {
        onFailed();
        String message = t.getMessage();
        if (message == null) {
            StringWriter stringWriter = new StringWriter();
            t.printStackTrace(new PrintWriter(stringWriter));
            message = stringWriter.toString();
        }
        report(type.a(5), r5h.u1(300, message));
        reportPingSummary();
    }

    @Override // defpackage.r5g
    public void onFailedByPings(q5g type) {
        ((gsh) this.timeProvider).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.lastMessageReceived;
        onFailed();
        report(type.a(4), Integer.valueOf((int) jElapsedRealtime));
        reportPingSummary();
    }

    @Override // defpackage.r5g
    public void onMessageReceived(q5g type, String name, boolean isPing) {
        ((gsh) this.timeProvider).getClass();
        this.lastMessageReceived = SystemClock.elapsedRealtime();
        if (!this.isSummaryStatsEnabled || name == null) {
            return;
        }
        if (!isPing) {
            SignalingTracker signalingTracker = this.signalingTracker;
            if (signalingTracker != null) {
                signalingTracker.onAnswer(name);
                return;
            }
            return;
        }
        SignalingTracker signalingTracker2 = this.signalingPingTracker;
        if (signalingTracker2 != null) {
            signalingTracker2.onAnswer(name);
        }
        SignalingTracker signalingTracker3 = this.signalingPingTracker;
        if (signalingTracker3 != null) {
            signalingTracker3.onRequest(name);
        }
    }

    @Override // defpackage.r5g
    public void onRestart(q5g type) {
        report$default(this, type.a(1), null, 2, null);
    }

    @Override // defpackage.r5g
    public void onTimeout(q5g type) {
        Long lValueOf;
        Long l = this.firstFailTime;
        if (l != null) {
            long jLongValue = l.longValue();
            ((gsh) this.timeProvider).getClass();
            lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - jLongValue);
        } else {
            lValueOf = null;
        }
        report(type.a(6), Integer.valueOf(lValueOf != null ? (int) lValueOf.longValue() : 0));
        reportPingSummary();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTransportStat$Companion;", "", "<init>", "()V", "LOG_TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    private final void report(String eventName, String stringValue) {
        fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
        if (fi1Var != null) {
            fi1.a(fi1Var, eventName, EventItemValueKt.toEventItemValue(stringValue), null, 4);
        }
    }
}
