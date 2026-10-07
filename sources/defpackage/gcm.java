package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gcm {
    public static final gcm a;

    static {
        m().l();
        fcm fcmVarM = m();
        fcmVarM.h(false);
        a = fcmVarM.l();
    }

    public static fcm m() {
        xbm xbmVar = new xbm();
        xbmVar.m(10);
        xbmVar.e(5);
        xbmVar.f(0.25f);
        xbmVar.d(0.8f);
        xbmVar.h(true);
        xbmVar.c(0.5f);
        xbmVar.b(0.8f);
        xbmVar.j(1500L);
        xbmVar.g(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        xbmVar.a(true);
        xbmVar.i(0.1f);
        xbmVar.k(0.05f);
        return xbmVar;
    }

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public abstract float d();

    public abstract float e();

    public abstract float f();

    public abstract int g();

    public abstract int h();

    public abstract long i();

    public abstract long j();

    public abstract boolean k();

    public abstract boolean l();
}
