package ru.ok.android.externcalls.sdk.di;

import defpackage.af7;
import defpackage.esh;
import defpackage.et7;
import defpackage.fsb;
import defpackage.gsb;
import defpackage.gsh;
import defpackage.ifh;
import defpackage.j95;
import defpackage.mo;
import defpackage.np0;
import defpackage.nxe;
import defpackage.ny8;
import defpackage.sg9;
import defpackage.ww3;
import defpackage.wxe;
import defpackage.x3e;
import defpackage.y3e;
import defpackage.yo;
import defpackage.yp;
import defpackage.z18;
import defpackage.z2;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.delegate.HangupDelegateImpl;
import ru.ok.android.externcalls.sdk.api.interceptor.LoginInterceptorListener;
import ru.ok.android.externcalls.sdk.api.interceptor.MethodListenerInterceptor;
import ru.ok.android.externcalls.sdk.api.log.LoggingApiRequestDebugger;
import ru.ok.android.externcalls.sdk.di.ApiModuleImpl;
import ru.ok.android.externcalls.sdk.stat.api.ApiStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R!\u00109\u001a\b\u0012\u0004\u0012\u000205048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00108R\u001b\u0010=\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b@\u0010AR\u001b\u0010\u0012\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00100\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lru/ok/android/externcalls/sdk/di/ApiModuleImpl;", "Lru/ok/android/externcalls/sdk/di/ApiModule;", "Lfsb;", "api", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "me", "Lru/ok/android/externcalls/sdk/api/OkApiService;", "okApiService", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "Ly3e;", "rtcLog", "Lesh;", "timeProvider", "Lwxe;", "callSslProvider", "Let7;", "hangupDelegate", "", "anonToken", "<init>", "(Lfsb;Lru/ok/android/externcalls/sdk/ConversationParticipant;Lru/ok/android/externcalls/sdk/api/OkApiService;Laf7;Ly3e;Lesh;Lwxe;Let7;Ljava/lang/String;)V", "Lnxe;", "getRxApiClient", "()Lnxe;", "Lyo;", "getDeviceIdProvider", "()Lyo;", "Lmo;", "getAppKeyProvider", "()Lmo;", "Lgsb;", "getOkApiHolder", "()Lgsb;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "getOkApiServiceInternal", "()Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "Lfsb;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "Lru/ok/android/externcalls/sdk/api/OkApiService;", "Laf7;", "Ly3e;", "Lesh;", "Lwxe;", "Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/api/interceptor/LoginInterceptorListener;", "loginInterceptorListener$delegate", "Lny8;", "getLoginInterceptorListener", "()Lru/ok/android/externcalls/sdk/api/interceptor/LoginInterceptorListener;", "loginInterceptorListener", "Lru/ok/android/externcalls/sdk/api/interceptor/MethodListenerInterceptor;", "Lsg9;", "loginApiInterceptor$delegate", "getLoginApiInterceptor", "()Lru/ok/android/externcalls/sdk/api/interceptor/MethodListenerInterceptor;", "loginApiInterceptor", "apiImpl$delegate", "getApiImpl", "()Lfsb;", "apiImpl", "Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "apiStats$delegate", "getApiStats", "()Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "apiStats", "hangupDelegate$delegate", "getHangupDelegate", "()Let7;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ApiModuleImpl implements ApiModule {
    private final String anonToken;
    private final fsb api;

    /* JADX INFO: renamed from: apiImpl$delegate, reason: from kotlin metadata */
    private final ny8 apiImpl;

    /* JADX INFO: renamed from: apiStats$delegate, reason: from kotlin metadata */
    private final ny8 apiStats;
    private final wxe callSslProvider;
    private final af7 getEventualStatSender;

    /* JADX INFO: renamed from: hangupDelegate$delegate, reason: from kotlin metadata */
    private final ny8 hangupDelegate;

    /* JADX INFO: renamed from: loginApiInterceptor$delegate, reason: from kotlin metadata */
    private final ny8 loginApiInterceptor;

    /* JADX INFO: renamed from: loginInterceptorListener$delegate, reason: from kotlin metadata */
    private final ny8 loginInterceptorListener;
    private final ConversationParticipant me;
    private final OkApiService okApiService;
    private final y3e rtcLog;
    private final esh timeProvider;

    public ApiModuleImpl(fsb fsbVar, ConversationParticipant conversationParticipant, OkApiService okApiService, af7 af7Var, y3e y3eVar, esh eshVar, wxe wxeVar, et7 et7Var, String str) {
        this.api = fsbVar;
        this.me = conversationParticipant;
        this.okApiService = okApiService;
        this.getEventualStatSender = af7Var;
        this.rtcLog = y3eVar;
        this.timeProvider = eshVar;
        this.callSslProvider = wxeVar;
        this.anonToken = str;
        final int i = 0;
        this.loginInterceptorListener = new ifh(new af7(this) { // from class: lp
            public final /* synthetic */ ApiModuleImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                ApiModuleImpl apiModuleImpl = this.b;
                switch (i2) {
                    case 0:
                        return ApiModuleImpl.loginInterceptorListener_delegate$lambda$0(apiModuleImpl);
                    case 1:
                        return ApiModuleImpl.loginApiInterceptor_delegate$lambda$0(apiModuleImpl);
                    case 2:
                        return ApiModuleImpl.apiImpl_delegate$lambda$0(apiModuleImpl);
                    default:
                        return ApiModuleImpl.apiStats_delegate$lambda$0(apiModuleImpl);
                }
            }
        });
        final int i2 = 1;
        this.loginApiInterceptor = new ifh(new af7(this) { // from class: lp
            public final /* synthetic */ ApiModuleImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                ApiModuleImpl apiModuleImpl = this.b;
                switch (i3) {
                    case 0:
                        return ApiModuleImpl.loginInterceptorListener_delegate$lambda$0(apiModuleImpl);
                    case 1:
                        return ApiModuleImpl.loginApiInterceptor_delegate$lambda$0(apiModuleImpl);
                    case 2:
                        return ApiModuleImpl.apiImpl_delegate$lambda$0(apiModuleImpl);
                    default:
                        return ApiModuleImpl.apiStats_delegate$lambda$0(apiModuleImpl);
                }
            }
        });
        final int i3 = 2;
        this.apiImpl = new ifh(new af7(this) { // from class: lp
            public final /* synthetic */ ApiModuleImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                ApiModuleImpl apiModuleImpl = this.b;
                switch (i4) {
                    case 0:
                        return ApiModuleImpl.loginInterceptorListener_delegate$lambda$0(apiModuleImpl);
                    case 1:
                        return ApiModuleImpl.loginApiInterceptor_delegate$lambda$0(apiModuleImpl);
                    case 2:
                        return ApiModuleImpl.apiImpl_delegate$lambda$0(apiModuleImpl);
                    default:
                        return ApiModuleImpl.apiStats_delegate$lambda$0(apiModuleImpl);
                }
            }
        });
        final int i4 = 3;
        this.apiStats = new ifh(new af7(this) { // from class: lp
            public final /* synthetic */ ApiModuleImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                ApiModuleImpl apiModuleImpl = this.b;
                switch (i5) {
                    case 0:
                        return ApiModuleImpl.loginInterceptorListener_delegate$lambda$0(apiModuleImpl);
                    case 1:
                        return ApiModuleImpl.loginApiInterceptor_delegate$lambda$0(apiModuleImpl);
                    case 2:
                        return ApiModuleImpl.apiImpl_delegate$lambda$0(apiModuleImpl);
                    default:
                        return ApiModuleImpl.apiStats_delegate$lambda$0(apiModuleImpl);
                }
            }
        });
        this.hangupDelegate = new ifh(new z2(et7Var, 5, this));
    }

    public static final fsb apiImpl_delegate$lambda$0(ApiModuleImpl apiModuleImpl) {
        z18 z18VarG = apiModuleImpl.api.g();
        z18VarG.d = new LoggingApiRequestDebugger(apiModuleImpl.rtcLog, (yp) z18VarG.g);
        z18VarG.h = ww3.H1(apiModuleImpl.getLoginApiInterceptor(), (List) z18VarG.h);
        z18VarG.i = apiModuleImpl.callSslProvider;
        return z18VarG.a();
    }

    public static final ApiStats apiStats_delegate$lambda$0(ApiModuleImpl apiModuleImpl) {
        return new ApiStats(apiModuleImpl.getEventualStatSender);
    }

    private final fsb getApiImpl() {
        return (fsb) this.apiImpl.getValue();
    }

    private final ApiStats getApiStats() {
        return (ApiStats) this.apiStats.getValue();
    }

    private final et7 getHangupDelegate() {
        return (et7) this.hangupDelegate.getValue();
    }

    private final MethodListenerInterceptor<sg9> getLoginApiInterceptor() {
        return (MethodListenerInterceptor) this.loginApiInterceptor.getValue();
    }

    private final LoginInterceptorListener getLoginInterceptorListener() {
        return (LoginInterceptorListener) this.loginInterceptorListener.getValue();
    }

    public static final et7 hangupDelegate_delegate$lambda$0(et7 et7Var, ApiModuleImpl apiModuleImpl) {
        return et7Var == null ? new HangupDelegateImpl(apiModuleImpl.getApiImpl().b(), apiModuleImpl.anonToken) : et7Var;
    }

    public static final MethodListenerInterceptor loginApiInterceptor_delegate$lambda$0(ApiModuleImpl apiModuleImpl) {
        MethodListenerInterceptor methodListenerInterceptor = new MethodListenerInterceptor("auth.anonymLogin", sg9.class);
        methodListenerInterceptor.addListener(apiModuleImpl.getLoginInterceptorListener());
        return methodListenerInterceptor;
    }

    public static final LoginInterceptorListener loginInterceptorListener_delegate$lambda$0(ApiModuleImpl apiModuleImpl) {
        return new LoginInterceptorListener(apiModuleImpl.me, apiModuleImpl.rtcLog);
    }

    @Override // ru.ok.android.externcalls.sdk.di.ApiModule
    public mo getAppKeyProvider() {
        return getApiImpl().c();
    }

    @Override // ru.ok.android.externcalls.sdk.di.ApiModule
    public yo getDeviceIdProvider() {
        return getApiImpl().d();
    }

    @Override // ru.ok.android.externcalls.sdk.di.ApiModule
    public gsb getOkApiHolder() {
        return getApiImpl().e();
    }

    @Override // ru.ok.android.externcalls.sdk.di.ApiModule
    public OkApiServiceInternal getOkApiServiceInternal() {
        return new OkApiServiceInternal(getRxApiClient(), this.okApiService, getApiStats(), this.rtcLog, this.timeProvider, getHangupDelegate());
    }

    @Override // ru.ok.android.externcalls.sdk.di.ApiModule
    public nxe getRxApiClient() {
        return getApiImpl().f();
    }

    public ApiModuleImpl(fsb fsbVar, ConversationParticipant conversationParticipant, OkApiService okApiService, af7 af7Var, y3e y3eVar, esh eshVar, wxe wxeVar, et7 et7Var, String str, int i, j95 j95Var) {
        this(fsbVar, conversationParticipant, okApiService, af7Var, (i & 16) != 0 ? x3e.a : y3eVar, (i & 32) != 0 ? new gsh() : eshVar, wxeVar, (i & np0.m) != 0 ? null : et7Var, (i & np0.n) != 0 ? null : str);
    }
}
