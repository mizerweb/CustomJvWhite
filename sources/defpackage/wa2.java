package defpackage;

import android.content.Context;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class wa2 extends sr {
    public final /* synthetic */ int c = 1;
    public final CameraEnumerator d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(Context context, CidLogger cidLogger) {
        super(cidLogger);
        cidLogger.getClass();
        context.getClass();
        this.d = new Camera2Enumerator(context);
    }

    @Override // defpackage.sr
    public final CameraEnumerator F() {
        switch (this.c) {
            case 0:
                return (Camera1Enumerator) this.d;
            default:
                return (Camera2Enumerator) this.d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(CidLogger cidLogger, boolean z) {
        super(cidLogger);
        cidLogger.getClass();
        this.d = new Camera1Enumerator(z);
    }
}
