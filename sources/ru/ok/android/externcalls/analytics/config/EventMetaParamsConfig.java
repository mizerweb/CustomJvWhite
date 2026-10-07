package ru.ok.android.externcalls.analytics.config;

import defpackage.af7;
import defpackage.j95;
import defpackage.s35;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;", "", "Lkotlin/Function0;", "", "appName", "<init>", "(Laf7;)V", "Laf7;", "getAppName", "()Laf7;", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventMetaParamsConfig {
    private final af7 appName;

    public /* synthetic */ EventMetaParamsConfig(af7 af7Var, int i, j95 j95Var) {
        this((i & 1) != 0 ? new s35(14) : af7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return null;
    }

    public final af7 getAppName() {
        return this.appName;
    }

    public EventMetaParamsConfig(af7 af7Var) {
        this.appName = af7Var;
    }

    public EventMetaParamsConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
