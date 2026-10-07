package ru.ok.android.externcalls.sdk.settings;

import defpackage.a8d;
import defpackage.ahc;
import defpackage.e8g;
import defpackage.i3f;
import defpackage.ifh;
import defpackage.j95;
import defpackage.ko5;
import defpackage.ny8;
import defpackage.p8g;
import defpackage.q8g;
import defpackage.qv1;
import defpackage.rg4;
import defpackage.s66;
import defpackage.sf7;
import defpackage.th;
import defpackage.v7g;
import defpackage.x7g;
import defpackage.y3e;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R-\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00150\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/settings/RemoteSettingsImplV2;", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "okApiService", "Ly3e;", "log", "", "", ApiProtocol.PARAM_KEYS, "<init>", "(Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;Ly3e;Ljava/util/Set;)V", "key", "Lv7g;", "get", "(Ljava/lang/String;)Lv7g;", "Lsbi;", "release", "()V", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "Ly3e;", "Ljava/util/Set;", "", "settingsSource$delegate", "Lny8;", "getSettingsSource", "()Lv7g;", "settingsSource", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RemoteSettingsImplV2 implements RemoteSettings {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "RemoteSettingsImplV2";
    private final Set<String> keys;
    private final y3e log;
    private final OkApiServiceInternal okApiService;

    /* JADX INFO: renamed from: settingsSource$delegate, reason: from kotlin metadata */
    private final ny8 settingsSource = new ifh(new a8d(25, this));

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2$get$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1<T, R> implements sf7 {
        final /* synthetic */ String $key;

        public AnonymousClass1() {
            str = str;
        }

        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public final String mo41apply(Map<String, String> map) {
            String str = map.get(str);
            return str == null ? "" : str;
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2$get$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements rg4 {
        final /* synthetic */ String $key;

        public AnonymousClass2() {
            str = str;
        }

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(String str) {
            RemoteSettingsImplV2.this.log.log(RemoteSettingsImplV2.LOG_TAG, qv1.l("got value for key ", str, ": ", str));
        }
    }

    public RemoteSettingsImplV2(OkApiServiceInternal okApiServiceInternal, y3e y3eVar, Set<String> set) {
        this.okApiService = okApiServiceInternal;
        this.log = y3eVar;
        this.keys = set;
    }

    private final v7g getSettingsSource() {
        return (v7g) this.settingsSource.getValue();
    }

    public static final v7g settingsSource_delegate$lambda$0(final RemoteSettingsImplV2 remoteSettingsImplV2) {
        return new x7g(new p8g(new e8g(new e8g(new e8g(remoteSettingsImplV2.okApiService.getSettings(remoteSettingsImplV2.keys).j(i3f.b()), new rg4() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2$settingsSource$2$1
            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(ko5 ko5Var) {
                this.this$0.log.log(RemoteSettingsImplV2.LOG_TAG, "Will now read settings by keys " + this.this$0.keys);
            }
        }, 1), new rg4() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2$settingsSource$2$2
            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Map<String, String> map) {
                this.this$0.log.log(RemoteSettingsImplV2.LOG_TAG, map.size() + " keys were loaded: " + map);
            }
        }, 2), new rg4() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2$settingsSource$2$3
            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Throwable th) {
                this.this$0.log.logException(RemoteSettingsImplV2.LOG_TAG, "Error reading remote SDK settings", th);
            }
        }, 0), new ahc(10), 1));
    }

    public static final Map settingsSource_delegate$lambda$0$0(Throwable th) {
        return s66.a;
    }

    @Override // ru.ok.android.externcalls.sdk.api.RemoteSettings
    public v7g get(String key) {
        return new q8g(new e8g(getSettingsSource().f(new sf7() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2.get.1
            final /* synthetic */ String $key;

            public AnonymousClass1() {
                str = key;
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply */
            public final String mo41apply(Map<String, String> map) {
                String str = map.get(str);
                return str == null ? "" : str;
            }
        }), new rg4() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2.get.2
            final /* synthetic */ String $key;

            public AnonymousClass2() {
                str = key;
            }

            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(String str) {
                RemoteSettingsImplV2.this.log.log(RemoteSettingsImplV2.LOG_TAG, qv1.l("got value for key ", str, ": ", str));
            }
        }, 2), th.a(), 0);
    }

    @Override // ru.ok.android.externcalls.sdk.api.RemoteSettings
    public void release() {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/settings/RemoteSettingsImplV2$Companion;", "", "<init>", "()V", "LOG_TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
