package ru.ok.android.externcalls.sdk;

import android.os.Handler;
import defpackage.dlc;
import defpackage.eb0;
import defpackage.kb0;
import defpackage.vxa;

/* JADX INFO: loaded from: classes3.dex */
public class AudioSampleEnergyCalculator implements vxa {
    private final Handler mainThreadHandler;
    private final eb0 processor = new eb0();

    public AudioSampleEnergyCalculator(Handler handler) {
        this.mainThreadHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSample$0(long j) {
        this.processor.a(j);
    }

    public eb0 getProcessor() {
        return this.processor;
    }

    @Override // defpackage.vxa
    public void onSample(int i, int i2, int i3, dlc dlcVar) {
        long j = 0;
        int i4 = 0;
        while (true) {
            int i5 = dlcVar.a;
            if (i4 >= i5) {
                this.mainThreadHandler.post(new kb0(this, (long) Math.sqrt(j / ((long) i5)), 1));
                return;
            } else {
                short sA = dlcVar.a(i4);
                j += (long) (sA * sA);
                i4++;
            }
        }
    }
}
