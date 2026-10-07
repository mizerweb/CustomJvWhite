package defpackage;

import ru.ok.android.externcalls.sdk.audio.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class b82 implements Logger {
    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void d(String str, String str2) {
        gm0.n(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void e(String str, String str2) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.g, str, str2, null, null, 8);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void i(String str, String str2) {
        gm0.x(str, str2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void v(String str, String str2) {
        gm0.U(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void w(String str, Throwable th) {
        gm0.Y(str, th.getMessage());
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void d(String str, String str2, Throwable th) {
        gm0.l(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void v(String str, String str2, Throwable th) {
        gm0.T(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void i(String str, String str2, Throwable th) {
        gm0.x(str, str2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void w(String str, String str2, Throwable th) {
        gm0.V(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void w(String str, String str2) {
        gm0.Y(str, str2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.Logger
    public final void e(String str, String str2, Throwable th) {
        gm0.r(str, str2, th);
    }
}
