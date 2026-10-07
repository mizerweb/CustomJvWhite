package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import org.webrtc.HardwareVideoEncoderV2;
import ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kb0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ob0 ob0Var = (ob0) ((v2a) obj).c;
                String str = vqi.a;
                ob0Var.q(j);
                break;
            case 1:
                ((AudioSampleEnergyCalculator) obj).lambda$onSample$0(j);
                break;
            case 2:
                ((FeedbackListenerManagerImpl) obj).tryToRemoveOld(j);
                break;
            case 3:
                ((HardwareVideoEncoderV2) obj).lambda$requestKeyFrame$5(j);
                break;
            default:
                ((MessagesListWidget) obj).D.a(j);
                break;
        }
    }
}
