package ru.ok.android.externcalls.sdk.p2prelay;

import defpackage.af7;
import defpackage.dp9;
import defpackage.ep9;
import defpackage.iwl;
import defpackage.ko5;
import defpackage.kp9;
import defpackage.qyb;
import defpackage.rg4;
import defpackage.th;
import defpackage.vqb;
import defpackage.vx8;
import defpackage.y3e;
import defpackage.z2f;
import defpackage.zo5;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat;
import ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;
import ru.ok.android.externcalls.sdk.stat.p2prelay.P2PRelayRequestReason;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001f¨\u0006("}, d2 = {"Lru/ok/android/externcalls/sdk/p2prelay/P2pRelaySwitchTrigger;", "", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;", "statMonitor", "Ly3e;", "logger", "Lkotlin/Function0;", "Lsbi;", "onSwitchTrigger", "Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "conversationStats", "Lru/ok/android/externcalls/sdk/p2prelay/P2PRelaySwitchConfigProvider;", "p2PRelaySwitchConfigProvider", "<init>", "(Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;Ly3e;Laf7;Lru/ok/android/externcalls/sdk/stat/ConversationStats;Lru/ok/android/externcalls/sdk/p2prelay/P2PRelaySwitchConfigProvider;)V", "Lru/ok/android/externcalls/sdk/p2prelay/P2PRelaySwitchConfig;", "config", "maybeStartObserveStat", "(Lru/ok/android/externcalls/sdk/p2prelay/P2PRelaySwitchConfig;)V", "Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "networkStat", "handleStats", "(Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;Lru/ok/android/externcalls/sdk/p2prelay/P2PRelaySwitchConfig;)V", "release", "()V", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;", "Ly3e;", "Laf7;", "Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "Lko5;", "statObserveDisposable", "Lko5;", "", "rttViolationCount", "I", "", "isActive", "Z", "getConfigDisposable", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class P2pRelaySwitchTrigger {
    private static final String LOG_TAG = "P2pRelaySwitchTrigger";
    private final ConversationStats conversationStats;
    private final ko5 getConfigDisposable;
    private boolean isActive = true;
    private final y3e logger;
    private final af7 onSwitchTrigger;
    private int rttViolationCount;
    private final StatMonitor statMonitor;
    private ko5 statObserveDisposable;

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger$maybeStartObserveStat$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1<T> implements rg4 {
        final /* synthetic */ P2PRelaySwitchConfig $config;

        public AnonymousClass1() {
            p2PRelaySwitchConfig = p2PRelaySwitchConfig;
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(NetworkStat networkStat) {
            P2pRelaySwitchTrigger.this.handleStats(networkStat, p2PRelaySwitchConfig);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger$maybeStartObserveStat$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements rg4 {
        public AnonymousClass2() {
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(Throwable th) {
            P2pRelaySwitchTrigger.this.logger.logException(P2pRelaySwitchTrigger.LOG_TAG, "Error during stat observing", th);
        }
    }

    public P2pRelaySwitchTrigger(StatMonitor statMonitor, y3e y3eVar, af7 af7Var, ConversationStats conversationStats, P2PRelaySwitchConfigProvider p2PRelaySwitchConfigProvider) {
        this.statMonitor = statMonitor;
        this.logger = y3eVar;
        this.onSwitchTrigger = af7Var;
        this.conversationStats = conversationStats;
        dp9 config = p2PRelaySwitchConfigProvider.getConfig();
        z2f z2fVarA = th.a();
        config.getClass();
        ep9 ep9Var = new ep9(new rg4() { // from class: ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger$getConfigDisposable$1
            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(P2PRelaySwitchConfig p2PRelaySwitchConfig) {
                this.$tmp0.maybeStartObserveStat(p2PRelaySwitchConfig);
            }
        }, new rg4() { // from class: ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger$getConfigDisposable$2
            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Throwable th) {
                this.this$0.logger.reportException("P2pRelaySwitchTrigger", "Error getting p2p relay switch config", th);
            }
        }, new qyb(2, this));
        try {
            config.a(new kp9(ep9Var, z2fVarA, 0));
            this.getConfigDisposable = ep9Var;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            iwl.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public static final void getConfigDisposable$lambda$0(P2pRelaySwitchTrigger p2pRelaySwitchTrigger) {
        p2pRelaySwitchTrigger.logger.log(LOG_TAG, "Remote config has not been provided");
    }

    public final void handleStats(NetworkStat networkStat, P2PRelaySwitchConfig config) {
        Long rttMs = config.getRttMs();
        if (rttMs != null) {
            long jLongValue = rttMs.longValue();
            Integer rttMs2 = networkStat.getRttMs();
            if (rttMs2 != null) {
                int iIntValue = rttMs2.intValue();
                if (iIntValue >= jLongValue) {
                    this.rttViolationCount++;
                } else {
                    this.rttViolationCount = 0;
                }
                if (this.rttViolationCount >= config.getRttViolationCount()) {
                    y3e y3eVar = this.logger;
                    int i = this.rttViolationCount;
                    StringBuilder sbX = zo5.x(iIntValue, jLongValue, "p2p relay switch triggered. actual rtt ", ", threshold ");
                    sbX.append(", violations ");
                    sbX.append(i);
                    y3eVar.log(LOG_TAG, sbX.toString());
                    this.onSwitchTrigger.invoke();
                    this.conversationStats.p2pRelayRequestedStat.onP2PRelayRequested(new P2PRelayRequestReason(RttRateHintConfig.RTT, jLongValue, config.getRttViolationCount()));
                    release();
                }
            }
        }
    }

    public final void maybeStartObserveStat(P2PRelaySwitchConfig config) {
        this.logger.log(LOG_TAG, "got remote p2p relay config " + config);
        if (config.getRttMs() == null) {
            release();
            return;
        }
        ko5 ko5Var = this.statObserveDisposable;
        if (ko5Var != null) {
            ko5Var.dispose();
        }
        vqb vqbVarE = this.statMonitor.observeStat().e(th.a());
        vx8 vx8Var = new vx8(new rg4() { // from class: ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger.maybeStartObserveStat.1
            final /* synthetic */ P2PRelaySwitchConfig $config;

            public AnonymousClass1() {
                p2PRelaySwitchConfig = config;
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(NetworkStat networkStat) {
                P2pRelaySwitchTrigger.this.handleStats(networkStat, p2PRelaySwitchConfig);
            }
        }, new rg4() { // from class: ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger.maybeStartObserveStat.2
            public AnonymousClass2() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Throwable th) {
                P2pRelaySwitchTrigger.this.logger.logException(P2pRelaySwitchTrigger.LOG_TAG, "Error during stat observing", th);
            }
        });
        vqbVarE.f(vx8Var);
        this.statObserveDisposable = vx8Var;
    }

    public final void release() {
        if (this.isActive) {
            this.isActive = false;
            this.logger.log(LOG_TAG, "Releasing");
            this.getConfigDisposable.dispose();
            ko5 ko5Var = this.statObserveDisposable;
            if (ko5Var != null) {
                ko5Var.dispose();
            }
        }
    }
}
