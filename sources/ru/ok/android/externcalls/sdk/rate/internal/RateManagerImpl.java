package ru.ok.android.externcalls.sdk.rate.internal;

import defpackage.af7;
import defpackage.cg7;
import defpackage.cqk;
import defpackage.dp9;
import defpackage.ep9;
import defpackage.fg7;
import defpackage.iwl;
import defpackage.ko5;
import defpackage.kp9;
import defpackage.ore;
import defpackage.qyb;
import defpackage.rg4;
import defpackage.th;
import defpackage.uf7;
import defpackage.vqb;
import defpackage.vx8;
import defpackage.y3e;
import defpackage.z2f;
import defpackage.zvh;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat;
import ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.rate.RateManagerConfig;
import ru.ok.android.externcalls.sdk.rate.RateManagerConfigProvider;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u0000 32\u00020\u0001:\u00013B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00150/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RateManagerImpl;", "Lru/ok/android/externcalls/sdk/rate/RateManager;", "Ly3e;", "log", "Lru/ok/android/externcalls/sdk/rate/RateManagerConfigProvider;", "configProvider", "Lkotlin/Function0;", "Lzvh;", "currentTopology", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;", "statMonitor", "<init>", "(Ly3e;Lru/ok/android/externcalls/sdk/rate/RateManagerConfigProvider;Laf7;Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;)V", "Lru/ok/android/externcalls/sdk/rate/RateManagerConfig;", "config", "Lsbi;", "onConfigReceived", "(Lru/ok/android/externcalls/sdk/rate/RateManagerConfig;)V", "Lko5;", "observeStats", "()Lko5;", "Lru/ok/android/externcalls/sdk/rate/RateHint;", "rateHint", "addRateHint", "(Lru/ok/android/externcalls/sdk/rate/RateHint;)V", "logHints", "()V", "release", "Ly3e;", "Laf7;", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;", "Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger;", "rttTrigger", "Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger;", "Lru/ok/android/externcalls/sdk/rate/internal/LossHintTrigger;", "lossTrigger", "Lru/ok/android/externcalls/sdk/rate/internal/LossHintTrigger;", "Lru/ok/android/externcalls/sdk/rate/internal/CandidateTypeHintTrigger;", "directCandidateTypeTrigger", "Lru/ok/android/externcalls/sdk/rate/internal/CandidateTypeHintTrigger;", "serverCandidateTypeTrigger", "initDisposable", "Lko5;", "observeDisposable", "", "_rateHints", "Ljava/util/List;", "", "rateHints", "getRateHints", "()Ljava/util/List;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RateManagerImpl implements RateManager {
    public static final String LOG_TAG = "RateManager";
    private final List<RateHint> _rateHints;
    private final af7 currentTopology;
    private CandidateTypeHintTrigger directCandidateTypeTrigger;
    private final ko5 initDisposable;
    private final y3e log;
    private LossHintTrigger lossTrigger;
    private ko5 observeDisposable;
    private final List<RateHint> rateHints;
    private RttRateHintTrigger rttTrigger;
    private CandidateTypeHintTrigger serverCandidateTypeTrigger;
    private final StatMonitor statMonitor;

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements rg4 {
        public AnonymousClass2() {
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(Throwable th) {
            RateManagerImpl.this.log.reportException("RateManager", "Can't get rate manager config", th);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$observeStats$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C00411<T> implements rg4 {

        /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$observeStats$1$WhenMappings */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[zvh.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[0] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C00411() {
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(NetworkStat networkStat) {
            RttRateHintTrigger rttRateHintTrigger = RateManagerImpl.this.rttTrigger;
            if (rttRateHintTrigger != null) {
                rttRateHintTrigger.onNetworkStat(networkStat);
            }
            LossHintTrigger lossHintTrigger = RateManagerImpl.this.lossTrigger;
            if (lossHintTrigger != null) {
                lossHintTrigger.onNetworkStat(networkStat);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[((zvh) RateManagerImpl.this.currentTopology.invoke()).ordinal()];
            if (i == 1) {
                CandidateTypeHintTrigger candidateTypeHintTrigger = RateManagerImpl.this.directCandidateTypeTrigger;
                if (candidateTypeHintTrigger != null) {
                    candidateTypeHintTrigger.onNetworkStat(networkStat);
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    return;
                }
                ore.o();
            } else {
                CandidateTypeHintTrigger candidateTypeHintTrigger2 = RateManagerImpl.this.serverCandidateTypeTrigger;
                if (candidateTypeHintTrigger2 != null) {
                    candidateTypeHintTrigger2.onNetworkStat(networkStat);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$observeStats$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C00422<T> implements rg4 {
        public C00422() {
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(Throwable th) {
            RateManagerImpl.this.log.reportException("RateManager", "Can't get rate manager config", th);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$onConfigReceived$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C00431 implements RateHintCollection, cg7 {
        public C00431() {
        }

        @Override // ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection
        public final void addRateHint(RateHint rateHint) {
            RateManagerImpl.this.addRateHint(rateHint);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof RateHintCollection) && (obj instanceof cg7)) {
                return cqk.d(getFunctionDelegate(), ((cg7) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // defpackage.cg7
        public final uf7 getFunctionDelegate() {
            return new fg7(1, 0, RateManagerImpl.class, RateManagerImpl.this, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$onConfigReceived$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C00442 implements RateHintCollection, cg7 {
        public C00442() {
        }

        @Override // ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection
        public final void addRateHint(RateHint rateHint) {
            RateManagerImpl.this.addRateHint(rateHint);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof RateHintCollection) && (obj instanceof cg7)) {
                return cqk.d(getFunctionDelegate(), ((cg7) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // defpackage.cg7
        public final uf7 getFunctionDelegate() {
            return new fg7(1, 0, RateManagerImpl.class, RateManagerImpl.this, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$onConfigReceived$3 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass3 implements RateHintCollection, cg7 {
        public AnonymousClass3() {
        }

        @Override // ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection
        public final void addRateHint(RateHint rateHint) {
            RateManagerImpl.this.addRateHint(rateHint);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof RateHintCollection) && (obj instanceof cg7)) {
                return cqk.d(getFunctionDelegate(), ((cg7) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // defpackage.cg7
        public final uf7 getFunctionDelegate() {
            return new fg7(1, 0, RateManagerImpl.class, RateManagerImpl.this, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$onConfigReceived$4 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass4 implements RateHintCollection, cg7 {
        public AnonymousClass4() {
        }

        @Override // ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection
        public final void addRateHint(RateHint rateHint) {
            RateManagerImpl.this.addRateHint(rateHint);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof RateHintCollection) && (obj instanceof cg7)) {
                return cqk.d(getFunctionDelegate(), ((cg7) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // defpackage.cg7
        public final uf7 getFunctionDelegate() {
            return new fg7(1, 0, RateManagerImpl.class, RateManagerImpl.this, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public RateManagerImpl(y3e y3eVar, RateManagerConfigProvider rateManagerConfigProvider, af7 af7Var, StatMonitor statMonitor) {
        this.log = y3eVar;
        this.currentTopology = af7Var;
        this.statMonitor = statMonitor;
        ArrayList arrayList = new ArrayList();
        this._rateHints = arrayList;
        this.rateHints = arrayList;
        dp9 config = rateManagerConfigProvider.getConfig();
        z2f z2fVarA = th.a();
        config.getClass();
        ep9 ep9Var = new ep9(new rg4() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl.1
            public AnonymousClass1() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(RateManagerConfig rateManagerConfig) {
                RateManagerImpl.this.onConfigReceived(rateManagerConfig);
            }
        }, new rg4() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl.2
            public AnonymousClass2() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Throwable th) {
                RateManagerImpl.this.log.reportException("RateManager", "Can't get rate manager config", th);
            }
        }, new qyb(16, this));
        try {
            config.a(new kp9(ep9Var, z2fVarA, 0));
            this.initDisposable = ep9Var;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            iwl.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public static final void _init_$lambda$0(RateManagerImpl rateManagerImpl) {
        rateManagerImpl.log.log("RateManager", "Remote config has not been provided");
    }

    public final void addRateHint(RateHint rateHint) {
        this._rateHints.add(rateHint);
        this.log.log("RateManager", "addRateHint " + rateHint);
    }

    private final ko5 observeStats() {
        vqb vqbVarE = this.statMonitor.observeStat().e(th.a());
        vx8 vx8Var = new vx8(new rg4() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl.observeStats.1

            /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$observeStats$1$WhenMappings */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[zvh.values().length];
                    try {
                        iArr[1] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[2] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[0] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public C00411() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(NetworkStat networkStat) {
                RttRateHintTrigger rttRateHintTrigger = RateManagerImpl.this.rttTrigger;
                if (rttRateHintTrigger != null) {
                    rttRateHintTrigger.onNetworkStat(networkStat);
                }
                LossHintTrigger lossHintTrigger = RateManagerImpl.this.lossTrigger;
                if (lossHintTrigger != null) {
                    lossHintTrigger.onNetworkStat(networkStat);
                }
                int i = WhenMappings.$EnumSwitchMapping$0[((zvh) RateManagerImpl.this.currentTopology.invoke()).ordinal()];
                if (i == 1) {
                    CandidateTypeHintTrigger candidateTypeHintTrigger = RateManagerImpl.this.directCandidateTypeTrigger;
                    if (candidateTypeHintTrigger != null) {
                        candidateTypeHintTrigger.onNetworkStat(networkStat);
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    if (i == 3) {
                        return;
                    }
                    ore.o();
                } else {
                    CandidateTypeHintTrigger candidateTypeHintTrigger2 = RateManagerImpl.this.serverCandidateTypeTrigger;
                    if (candidateTypeHintTrigger2 != null) {
                        candidateTypeHintTrigger2.onNetworkStat(networkStat);
                    }
                }
            }
        }, new rg4() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl.observeStats.2
            public C00422() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Throwable th) {
                RateManagerImpl.this.log.reportException("RateManager", "Can't get rate manager config", th);
            }
        });
        vqbVarE.f(vx8Var);
        return vx8Var;
    }

    public final void onConfigReceived(RateManagerConfig config) {
        if (config.getRttRateHintConfig().isNotEmpty()) {
            this.rttTrigger = new RttRateHintTrigger(this.log, config.getRttRateHintConfig(), new C00431());
        }
        if (config.getLossHintConfig().isNotEmpty()) {
            this.lossTrigger = new LossHintTrigger(this.log, config.getLossHintConfig(), new C00442());
        }
        if (config.getDirectCandidateTypeHintConfig().isNotEmpty()) {
            this.directCandidateTypeTrigger = new CandidateTypeHintTrigger(this.log, config.getDirectCandidateTypeHintConfig(), new AnonymousClass3(), "");
        }
        if (config.getServerCandidateTypeHintConfig().isNotEmpty()) {
            this.serverCandidateTypeTrigger = new CandidateTypeHintTrigger(this.log, config.getServerCandidateTypeHintConfig(), new AnonymousClass4(), "s");
        }
        this.observeDisposable = observeStats();
    }

    @Override // ru.ok.android.externcalls.sdk.rate.RateManager
    public List<RateHint> getRateHints() {
        return this.rateHints;
    }

    @Override // ru.ok.android.externcalls.sdk.rate.RateManager
    public /* bridge */ boolean getShouldRateConversation() {
        return super.getShouldRateConversation();
    }

    public final void logHints() {
        this.log.log("RateManager", "rateHints = " + getRateHints() + ", shouldRateConversation=" + getShouldRateConversation());
    }

    public final void release() {
        this.initDisposable.dispose();
        ko5 ko5Var = this.observeDisposable;
        if (ko5Var != null) {
            ko5Var.dispose();
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1<T> implements rg4 {
        public AnonymousClass1() {
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(RateManagerConfig rateManagerConfig) {
            RateManagerImpl.this.onConfigReceived(rateManagerConfig);
        }
    }
}
