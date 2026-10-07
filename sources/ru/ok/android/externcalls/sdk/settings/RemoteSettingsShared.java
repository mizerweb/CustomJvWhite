package ru.ok.android.externcalls.sdk.settings;

import android.os.SystemClock;
import defpackage.af7;
import defpackage.ahc;
import defpackage.cqk;
import defpackage.e8g;
import defpackage.esh;
import defpackage.gsh;
import defpackage.i3f;
import defpackage.j95;
import defpackage.ko5;
import defpackage.l66;
import defpackage.nxe;
import defpackage.oie;
import defpackage.p8g;
import defpackage.poe;
import defpackage.q8g;
import defpackage.qv1;
import defpackage.rg4;
import defpackage.s66;
import defpackage.sbi;
import defpackage.sf7;
import defpackage.th;
import defpackage.v7g;
import defpackage.x7g;
import defpackage.y3e;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.api.request.GetSettings;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 62\u00020\u0001:\u00016B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001e\u001a\u00020\u00162\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010\u0018J!\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u0010H\u0002¢\u0006\u0004\b!\u0010\u0015J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\"\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R(\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R*\u00102\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ok/android/externcalls/sdk/settings/RemoteSettingsShared;", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "Lnxe;", "rxApiClient", "Lesh;", "timeProvider", "Lkotlin/Function0;", "Ly3e;", "log", "", "", ApiProtocol.PARAM_KEYS, "", "keepSharedSettingsMs", "<init>", "(Lnxe;Lesh;Laf7;Ljava/util/Set;Ljava/lang/Long;)V", "Lv7g;", "", "getSettings", "(Ljava/util/Set;)Lv7g;", "getSettingsSource", "()Lv7g;", "Lsbi;", "scheduleCreateNewSettings", "()V", "settings", "Lroe;", "readSettings-IoAF18A", "(Lv7g;)Ljava/lang/Object;", "readSettings", "applySettings", "(Lv7g;)V", "rememberLastUpdateTime", "createSettingsSource", "key", "get", "(Ljava/lang/String;)Lv7g;", "release", "Lnxe;", "Lesh;", "Laf7;", "Ljava/util/Set;", "Ljava/lang/Long;", "Ljava/util/concurrent/locks/ReentrantLock;", "settingsLock", "Ljava/util/concurrent/locks/ReentrantLock;", "settingsLastUpdateTime", "J", "cachedSettingsSource", "Lv7g;", "newSettings", "Lko5;", "readSettingsDisposable", "Lko5;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RemoteSettingsShared implements RemoteSettings {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "RemoteSettingsShared";

    @Deprecated
    public static final long SETTINGS_REREAD_DELAY_MS = 5000;
    private volatile v7g cachedSettingsSource;
    private final Long keepSharedSettingsMs;
    private final Set<String> keys;
    private final af7 log;
    private v7g newSettings;
    private ko5 readSettingsDisposable;
    private final nxe rxApiClient;
    private long settingsLastUpdateTime;
    private final ReentrantLock settingsLock;
    private final esh timeProvider;

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$createSettingsSource$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1<T> implements rg4 {
        public AnonymousClass1() {
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(ko5 ko5Var) {
            ((y3e) RemoteSettingsShared.this.log.invoke()).log(RemoteSettingsShared.LOG_TAG, "Will now read settings by keys " + RemoteSettingsShared.this.keys);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$createSettingsSource$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements rg4 {
        public AnonymousClass2() {
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(Map<String, String> map) {
            ((y3e) RemoteSettingsShared.this.log.invoke()).log(RemoteSettingsShared.LOG_TAG, map.size() + " keys were loaded: " + map);
            RemoteSettingsShared.this.rememberLastUpdateTime();
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$createSettingsSource$3 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass3<T> implements rg4 {
        public AnonymousClass3() {
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(Throwable th) {
            ((y3e) RemoteSettingsShared.this.log.invoke()).logException(RemoteSettingsShared.LOG_TAG, "Error reading remote SDK settings", th);
            RemoteSettingsShared.this.scheduleCreateNewSettings();
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$get$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C00451<T, R> implements sf7 {
        final /* synthetic */ String $key;

        public C00451() {
            str = str;
        }

        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public final String mo41apply(Map<String, String> map) {
            String str = map.get(str);
            return str == null ? "" : str;
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$get$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C00462<T> implements rg4 {
        final /* synthetic */ String $key;

        public C00462() {
            str = str;
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(String str) {
            ((y3e) RemoteSettingsShared.this.log.invoke()).log(RemoteSettingsShared.LOG_TAG, qv1.l("got value for key ", str, ": ", str));
        }
    }

    public RemoteSettingsShared(nxe nxeVar, esh eshVar, af7 af7Var, Set<String> set, Long l) {
        this.rxApiClient = nxeVar;
        this.timeProvider = eshVar;
        this.log = af7Var;
        this.keys = set;
        this.keepSharedSettingsMs = l;
        this.settingsLock = new ReentrantLock();
        this.cachedSettingsSource = createSettingsSource();
        this.readSettingsDisposable = l66.a;
        if (l != null) {
            ((y3e) af7Var.invoke()).log(LOG_TAG, "Schedule settings update");
            i3f.b().b(new oie(this, 1));
        }
    }

    public static final void _init_$lambda$0(RemoteSettingsShared remoteSettingsShared) {
        remoteSettingsShared.m134readSettingsIoAF18A(remoteSettingsShared.cachedSettingsSource);
    }

    public final void applySettings(v7g settings) {
        if (this.keepSharedSettingsMs != null) {
            ReentrantLock reentrantLock = this.settingsLock;
            reentrantLock.lock();
            try {
                boolean zD = cqk.d(settings, this.newSettings);
                af7 af7Var = this.log;
                if (zD) {
                    ((y3e) af7Var.invoke()).log(LOG_TAG, "Apply new settings source");
                    this.newSettings = null;
                    this.cachedSettingsSource = settings;
                } else {
                    ((y3e) af7Var.invoke()).log(LOG_TAG, "Received settings update doesn't match expected one. Ignore");
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    private final v7g createSettingsSource() {
        return new x7g(new p8g(new e8g(new e8g(new e8g(getSettings(this.keys).j(i3f.b()), new rg4() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared.createSettingsSource.1
            public AnonymousClass1() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(ko5 ko5Var) {
                ((y3e) RemoteSettingsShared.this.log.invoke()).log(RemoteSettingsShared.LOG_TAG, "Will now read settings by keys " + RemoteSettingsShared.this.keys);
            }
        }, 1), new rg4() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared.createSettingsSource.2
            public AnonymousClass2() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Map<String, String> map) {
                ((y3e) RemoteSettingsShared.this.log.invoke()).log(RemoteSettingsShared.LOG_TAG, map.size() + " keys were loaded: " + map);
                RemoteSettingsShared.this.rememberLastUpdateTime();
            }
        }, 2), new rg4() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared.createSettingsSource.3
            public AnonymousClass3() {
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Throwable th) {
                ((y3e) RemoteSettingsShared.this.log.invoke()).logException(RemoteSettingsShared.LOG_TAG, "Error reading remote SDK settings", th);
                RemoteSettingsShared.this.scheduleCreateNewSettings();
            }
        }, 0), new ahc(11), 1));
    }

    public static final Map createSettingsSource$lambda$0(Throwable th) {
        return s66.a;
    }

    private final v7g getSettings(Set<String> set) {
        return this.rxApiClient.a(new GetSettings.Request(set));
    }

    private final v7g getSettingsSource() {
        if (this.keepSharedSettingsMs != null) {
            ReentrantLock reentrantLock = this.settingsLock;
            reentrantLock.lock();
            try {
                if (this.settingsLastUpdateTime > 0) {
                    ((gsh) this.timeProvider).getClass();
                    if (SystemClock.elapsedRealtime() - this.settingsLastUpdateTime >= this.keepSharedSettingsMs.longValue() && this.newSettings == null) {
                        scheduleCreateNewSettings();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return this.cachedSettingsSource;
    }

    /* JADX INFO: renamed from: readSettings-IoAF18A */
    private final Object m134readSettingsIoAF18A(final v7g settings) {
        try {
            ((y3e) this.log.invoke()).log(LOG_TAG, "Recreate remote settings cache (scheduled action)");
            ReentrantLock reentrantLock = this.settingsLock;
            reentrantLock.lock();
            try {
                this.readSettingsDisposable.dispose();
                this.readSettingsDisposable = settings.g(new rg4() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$readSettings$1$1$1
                    @Override // defpackage.rg4, defpackage.tg4
                    public final void accept(Map<String, String> map) {
                        ((y3e) this.$this_runCatching.log.invoke()).log(RemoteSettingsShared.LOG_TAG, "Got updated settings, apply");
                        this.$this_runCatching.applySettings(settings);
                    }
                }, new rg4() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$readSettings$1$1$2
                    @Override // defpackage.rg4, defpackage.tg4
                    public final void accept(Throwable th) {
                        ((y3e) this.$this_runCatching.log.invoke()).log(RemoteSettingsShared.LOG_TAG, "Error on settings update. Try again later");
                        this.$this_runCatching.scheduleCreateNewSettings();
                    }
                });
                return sbi.a;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th) {
            return new poe(th);
        }
    }

    public final void rememberLastUpdateTime() {
        if (this.keepSharedSettingsMs != null) {
            ReentrantLock reentrantLock = this.settingsLock;
            reentrantLock.lock();
            try {
                ((gsh) this.timeProvider).getClass();
                this.settingsLastUpdateTime = SystemClock.elapsedRealtime();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void scheduleCreateNewSettings() {
        ReentrantLock reentrantLock = this.settingsLock;
        reentrantLock.lock();
        try {
            this.newSettings = createSettingsSource();
            ((y3e) this.log.invoke()).log(LOG_TAG, "Expired cached settings found. Schedule reread in 5000ms");
            i3f.b().c(new oie(this, 0), 5000L, TimeUnit.MILLISECONDS);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void scheduleCreateNewSettings$lambda$0$0(RemoteSettingsShared remoteSettingsShared) {
        ReentrantLock reentrantLock = remoteSettingsShared.settingsLock;
        reentrantLock.lock();
        try {
            v7g v7gVar = remoteSettingsShared.newSettings;
            if (v7gVar != null) {
                remoteSettingsShared.m134readSettingsIoAF18A(v7gVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.api.RemoteSettings
    public v7g get(String key) {
        return new q8g(new e8g(getSettingsSource().f(new sf7() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared.get.1
            final /* synthetic */ String $key;

            public C00451() {
                str = key;
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply */
            public final String mo41apply(Map<String, String> map) {
                String str = map.get(str);
                return str == null ? "" : str;
            }
        }), new rg4() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared.get.2
            final /* synthetic */ String $key;

            public C00462() {
                str = key;
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(String str) {
                ((y3e) RemoteSettingsShared.this.log.invoke()).log(RemoteSettingsShared.LOG_TAG, qv1.l("got value for key ", str, ": ", str));
            }
        }, 2), th.a(), 0);
    }

    @Override // ru.ok.android.externcalls.sdk.api.RemoteSettings
    public void release() {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/settings/RemoteSettingsShared$Companion;", "", "<init>", "()V", "LOG_TAG", "", "SETTINGS_REREAD_DELAY_MS", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ RemoteSettingsShared(nxe nxeVar, esh eshVar, af7 af7Var, Set set, Long l, int i, j95 j95Var) {
        this(nxeVar, eshVar, af7Var, set, (i & 16) != 0 ? null : l);
    }
}
