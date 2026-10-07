package defpackage;

import android.animation.AnimatorSet;
import android.os.Handler;
import android.os.Looper;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes2.dex */
public final class fs4 {
    public final ny8 a;
    public final xw1 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final jj2 d = new jj2(7, this);
    public bz1 e;
    public boolean f;
    public boolean g;

    public fs4(ny8 ny8Var, xw1 xw1Var) {
        this.a = ny8Var;
        this.b = xw1Var;
    }

    public final void a() {
        bz1 bz1Var = this.e;
        if (this.f && this.g && bz1Var != null) {
            this.f = false;
            if (b().b != null) {
                AnimatorSet animatorSet = b().b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    return;
                }
                return;
            }
            if (((Boolean) this.b.invoke()).booleanValue()) {
                return;
            }
            if (p90.F(bz1Var)) {
                b().e(true);
                return;
            }
            if (p90.E(bz1Var) && b().g) {
                Handler handler = this.c;
                jj2 jj2Var = this.d;
                handler.removeCallbacks(jj2Var);
                handler.postDelayed(jj2Var, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
            }
        }
    }

    public final es4 b() {
        return (es4) this.a.getValue();
    }
}
