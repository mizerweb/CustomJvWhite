package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gc0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gc0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                break;
            case 1:
                CallsAudioManagerV3Impl.startTrackingAudioDevices$lambda$4$lambda$3((CallsAudioManagerV3Impl) obj, runnable);
                break;
            case 2:
                vqi.d0(((d3a) obj).l, runnable);
                break;
            default:
                omi omiVar = (omi) obj;
                omiVar.c.execute(new ewg(omiVar, 13, runnable));
                break;
        }
    }
}
