package ru.ok.android.externcalls.sdk;

import android.os.Handler;
import defpackage.cvj;
import defpackage.dlc;
import defpackage.vxa;

/* JADX INFO: loaded from: classes3.dex */
public class AudioLevelListener implements vxa {
    private final Handler handler;
    private boolean isActive;
    private final cvj noise;
    private final Runnable reporter;
    private final short triggerDiff;

    public AudioLevelListener(short s, Handler handler, Runnable runnable) {
        cvj cvjVar = new cvj();
        cvjVar.a = Float.NaN;
        this.noise = cvjVar;
        this.isActive = true;
        this.reporter = runnable;
        this.triggerDiff = s;
        this.handler = handler;
        cvjVar.a = Float.isNaN(cvjVar.a) ? 0.0f : 0.0f + (0.95f * cvjVar.a);
    }

    public void listen() {
        this.isActive = true;
    }

    @Override // defpackage.vxa
    public void onSample(int i, int i2, int i3, dlc dlcVar) {
        if (this.isActive) {
            float f = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
            for (int i4 = 0; i4 < dlcVar.a; i4++) {
                float fAbs = Math.abs((int) dlcVar.a(i4));
                f = Float.isNaN(f) ? fAbs : (0.3f * fAbs) + (0.7f * f);
                cvj cvjVar = this.noise;
                if (!Float.isNaN(cvjVar.a)) {
                    fAbs = (fAbs * 0.05f) + (0.95f * cvjVar.a);
                }
                cvjVar.a = fAbs;
                if (f - this.noise.a > this.triggerDiff) {
                    this.handler.post(this.reporter);
                    return;
                }
            }
        }
    }

    public void stop() {
        this.isActive = false;
    }
}
