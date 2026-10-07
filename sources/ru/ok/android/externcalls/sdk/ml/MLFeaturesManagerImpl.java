package ru.ok.android.externcalls.sdk.ml;

import android.content.Context;
import defpackage.af7;
import defpackage.c79;
import defpackage.cf7;
import defpackage.d80;
import defpackage.dx4;
import defpackage.edd;
import defpackage.fqb;
import defpackage.hg7;
import defpackage.hh6;
import defpackage.i3f;
import defpackage.idl;
import defpackage.ifh;
import defpackage.k36;
import defpackage.nrb;
import defpackage.ny8;
import defpackage.occ;
import defpackage.oqb;
import defpackage.qqb;
import defpackage.rg4;
import defpackage.sbi;
import defpackage.sf7;
import defpackage.sqb;
import defpackage.thb;
import defpackage.tv0;
import defpackage.tv8;
import defpackage.uhb;
import defpackage.uik;
import defpackage.v7g;
import defpackage.vhb;
import defpackage.vx8;
import defpackage.w07;
import defpackage.w14;
import defpackage.w74;
import defpackage.xj9;
import defpackage.y3e;
import defpackage.yab;
import defpackage.ylc;
import defpackage.z9g;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.ml.config.ns.NSFeatureConfigProvider;
import ru.ok.android.externcalls.sdk.ml.delegate.NSFeatureDelegate;
import ru.ok.android.externcalls.sdk.ml.model.MLModelCheckResult;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 92\u00020\u0001:\u00019Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010'R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R4\u00107\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020+\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u001a0605048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/MLFeaturesManagerImpl;", "Lru/ok/android/externcalls/sdk/ml/MLFeaturesManager;", "Lxj9;", "mlFeaturesInfoDataSource", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "downloadService", "Landroid/content/Context;", "context", "Ly3e;", "logger", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "settings", "Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "conversationStats", "Lru/ok/android/externcalls/sdk/audio/NoiseSuppressionManager;", "noiseSuppressionManager", "Lhh6;", "experiments", "Lkotlin/Function0;", "", "isMeInWaitingHall", "isCallDestroyed", "<init>", "(Lxj9;Lru/ok/android/externcalls/sdk/net/DownloadService;Landroid/content/Context;Ly3e;Lru/ok/android/externcalls/sdk/api/RemoteSettings;Lru/ok/android/externcalls/sdk/stat/ConversationStats;Lru/ok/android/externcalls/sdk/audio/NoiseSuppressionManager;Lhh6;Laf7;Laf7;)V", "Ljava/io/File;", "file", "Lsbi;", "setNsParams", "(Ljava/io/File;)V", "start", "()V", "dispose", "Lxj9;", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "Landroid/content/Context;", "Ly3e;", "Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "Lru/ok/android/externcalls/sdk/audio/NoiseSuppressionManager;", "Lhh6;", "Laf7;", "Lw74;", "disposables", "Lw74;", "Lru/ok/android/externcalls/sdk/ml/delegate/NSFeatureDelegate;", "nsFeatureDelegate$delegate", "Lny8;", "getNsFeatureDelegate", "()Lru/ok/android/externcalls/sdk/ml/delegate/NSFeatureDelegate;", "nsFeatureDelegate", "Lv7g;", "awaitLeftWaitingHall", "Lv7g;", "", "Lylc;", "Lkotlin/reflect/KFunction1;", "delegates", "Ljava/util/List;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MLFeaturesManagerImpl implements MLFeaturesManager {
    private static final String LOG_TAG = "MLFeaturesManagerImpl";
    private final Context context;
    private final ConversationStats conversationStats;
    private final List<ylc> delegates;
    private final DownloadService downloadService;
    private final hh6 experiments;
    private final af7 isCallDestroyed;
    private final af7 isMeInWaitingHall;
    private final y3e logger;
    private final xj9 mlFeaturesInfoDataSource;
    private final NoiseSuppressionManager noiseSuppressionManager;

    /* JADX INFO: renamed from: nsFeatureDelegate$delegate, reason: from kotlin metadata */
    private final ny8 nsFeatureDelegate;
    private final w74 disposables = new w74();
    private final v7g awaitLeftWaitingHall = new oqb(new sqb(fqb.a(0, 1, TimeUnit.SECONDS, i3f.a()), new edd() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl$awaitLeftWaitingHall$1
        @Override // defpackage.edd
        public final boolean test(Long l) {
            return (((Boolean) this.this$0.isMeInWaitingHall.invoke()).booleanValue() || ((Boolean) this.this$0.isCallDestroyed.invoke()).booleanValue()) ? false : true;
        }
    }, 0)).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl$awaitLeftWaitingHall$2
        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public /* bridge */ /* synthetic */ Object mo41apply(Object obj) {
            apply((Long) obj);
            return sbi.a;
        }

        public final void apply(Long l) {
        }
    });

    public MLFeaturesManagerImpl(xj9 xj9Var, DownloadService downloadService, Context context, y3e y3eVar, RemoteSettings remoteSettings, ConversationStats conversationStats, NoiseSuppressionManager noiseSuppressionManager, hh6 hh6Var, af7 af7Var, af7 af7Var2) {
        this.mlFeaturesInfoDataSource = xj9Var;
        this.downloadService = downloadService;
        this.context = context;
        this.logger = y3eVar;
        this.conversationStats = conversationStats;
        this.noiseSuppressionManager = noiseSuppressionManager;
        this.experiments = hh6Var;
        this.isMeInWaitingHall = af7Var;
        this.isCallDestroyed = af7Var2;
        this.nsFeatureDelegate = new ifh(new dx4(this, 28, remoteSettings));
        c79 c79VarW = yab.w();
        if (hh6Var.h().a) {
            c79VarW.add(new ylc(getNsFeatureDelegate(), new MLFeaturesManagerImpl$delegates$1$1(this)));
        }
        this.delegates = yab.j(c79VarW);
    }

    private final NSFeatureDelegate getNsFeatureDelegate() {
        return (NSFeatureDelegate) this.nsFeatureDelegate.getValue();
    }

    public static final NSFeatureDelegate nsFeatureDelegate_delegate$lambda$0(MLFeaturesManagerImpl mLFeaturesManagerImpl, RemoteSettings remoteSettings) {
        return new NSFeatureDelegate(mLFeaturesManagerImpl.mlFeaturesInfoDataSource, new NSFeatureConfigProvider(remoteSettings, mLFeaturesManagerImpl.experiments.h().b, mLFeaturesManagerImpl.logger), mLFeaturesManagerImpl.downloadService, mLFeaturesManagerImpl.conversationStats.mlDownloadStat, mLFeaturesManagerImpl.context, mLFeaturesManagerImpl.experiments.h().b, mLFeaturesManagerImpl.logger);
    }

    public final void setNsParams(File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        this.noiseSuppressionManager.setNoiseSuppressionParams(new w14(new k36(20, this), 25, path));
    }

    public static final void setNsParams$lambda$0(MLFeaturesManagerImpl mLFeaturesManagerImpl) {
        mLFeaturesManagerImpl.conversationStats.audioErrorStat.report(new d80("ns", "run", "disabled due to stutter"));
    }

    public static final vhb setNsParams$lambda$1(Runnable runnable, String str, uhb uhbVar) {
        PeerConnectionFactory.EnhancerKind enhancerKind;
        uhbVar.m = false;
        uhbVar.b = false;
        uhbVar.c = true;
        uhbVar.d = true;
        uhbVar.h = 48000;
        uhbVar.i = 48000;
        uhbVar.e = 2;
        int i = thb.$EnumSwitchMapping$0[1];
        if (i == 1) {
            enhancerKind = PeerConnectionFactory.EnhancerKind.NONE;
        } else if (i != 2) {
            enhancerKind = i != 3 ? null : PeerConnectionFactory.EnhancerKind.BASELINE;
        } else {
            enhancerKind = PeerConnectionFactory.EnhancerKind.PIPELINE;
        }
        uhbVar.f = enhancerKind;
        uhbVar.j = 13;
        uhbVar.k = 25;
        uhbVar.l = 600;
        if (runnable != null) {
            uhbVar.n = new occ(0, runnable, Runnable.class, "run", "run()V", 0, 18);
        }
        uhbVar.g = str;
        return uhbVar.a();
    }

    @Override // ru.ok.android.externcalls.sdk.ml.MLFeaturesManager
    public void dispose() {
        this.disposables.dispose();
    }

    @Override // ru.ok.android.externcalls.sdk.ml.MLFeaturesManager
    public void start() {
        for (ylc ylcVar : this.delegates) {
            final NSFeatureDelegate nSFeatureDelegate = (NSFeatureDelegate) ylcVar.a;
            final tv8 tv8Var = (tv8) ylcVar.b;
            z9g z9gVarCheckModel = nSFeatureDelegate.checkModel();
            z9gVarCheckModel.getClass();
            fqb fqbVarB = z9gVarCheckModel instanceof hg7 ? ((hg7) z9gVarCheckModel).b() : new qqb(1, z9gVarCheckModel);
            z9g z9gVar = this.awaitLeftWaitingHall;
            z9gVar.getClass();
            fqb fqbVarB2 = z9gVar instanceof hg7 ? ((hg7) z9gVar).b() : new qqb(1, z9gVar);
            Object obj = new tv0() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl$start$1$1
                @Override // defpackage.tv0
                public final MLModelCheckResult apply(MLModelCheckResult mLModelCheckResult, sbi sbiVar) {
                    return mLModelCheckResult;
                }
            };
            Objects.requireNonNull(obj, "zipper is null");
            uik uikVar = new uik(13, obj);
            int i = w07.a;
            idl.d(i, "bufferSize");
            nrb nrbVar = new nrb(new fqb[]{fqbVarB, fqbVarB2}, uikVar, i);
            vx8 vx8Var = new vx8(new rg4() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl$start$1$2
                @Override // defpackage.rg4, defpackage.tg4
                public final void accept(MLModelCheckResult mLModelCheckResult) {
                    this.this$0.logger.log("MLFeaturesManagerImpl", "delegate " + nSFeatureDelegate + ", on success. Model check result " + mLModelCheckResult);
                    cf7 cf7Var = (cf7) tv8Var;
                    MLModelCheckResult.Enabled enabled = mLModelCheckResult instanceof MLModelCheckResult.Enabled ? (MLModelCheckResult.Enabled) mLModelCheckResult : null;
                    cf7Var.invoke(enabled != null ? enabled.getFile() : null);
                }
            }, new rg4() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl$start$1$3
                @Override // defpackage.rg4, defpackage.tg4
                public final void accept(Throwable th) {
                    this.this$0.logger.log("MLFeaturesManagerImpl", "delegate " + nSFeatureDelegate + ", on error " + th);
                    ((cf7) tv8Var).invoke(null);
                }
            });
            nrbVar.f(vx8Var);
            this.disposables.a(vx8Var);
        }
    }
}
