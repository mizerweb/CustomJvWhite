package ru.ok.android.externcalls.sdk.config;

import defpackage.dp9;
import defpackage.fp9;
import defpackage.gp9;
import defpackage.ip9;
import defpackage.jp9;
import defpackage.op9;
import defpackage.sf7;
import defpackage.v7g;
import defpackage.y3e;
import java.util.Objects;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\bH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/config/BaseConfigProvider;", "", "T", "Lru/ok/android/externcalls/sdk/config/ConfigProvider;", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "settings", "Ly3e;", "log", "", "configKey", "logTag", "<init>", "(Lru/ok/android/externcalls/sdk/api/RemoteSettings;Ly3e;Ljava/lang/String;Ljava/lang/String;)V", "config", "parseConfig", "(Ljava/lang/String;)Ljava/lang/Object;", "Ldp9;", "getConfig", "()Ldp9;", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "Ly3e;", "getLog", "()Ly3e;", "Ljava/lang/String;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BaseConfigProvider<T> implements ConfigProvider<T> {
    private final String configKey;
    private final y3e log;
    private final String logTag;
    private final RemoteSettings settings;

    public BaseConfigProvider(RemoteSettings remoteSettings, y3e y3eVar, String str, String str2) {
        this.settings = remoteSettings;
        this.log = y3eVar;
        this.configKey = str;
        this.logTag = str2;
    }

    @Override // ru.ok.android.externcalls.sdk.config.ConfigProvider
    public dp9 getConfig() {
        v7g v7gVar = this.settings.get(this.configKey);
        sf7 sf7Var = new sf7(this) { // from class: ru.ok.android.externcalls.sdk.config.BaseConfigProvider.getConfig.1
            final /* synthetic */ BaseConfigProvider<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final op9 mo41apply(String str) {
                if (str.length() == 0) {
                    return fp9.a;
                }
                try {
                    T config = this.this$0.parseConfig(str);
                    Objects.requireNonNull(config, "item is null");
                    return new jp9(config);
                } catch (Throwable th) {
                    this.this$0.getLog().reportException(((BaseConfigProvider) this.this$0).logTag, "Can't parse JSON configuration from ".concat(str), th);
                    return new gp9(th);
                }
            }
        };
        v7gVar.getClass();
        return new ip9(v7gVar, sf7Var, 1);
    }

    public final y3e getLog() {
        return this.log;
    }

    public abstract T parseConfig(String config);
}
