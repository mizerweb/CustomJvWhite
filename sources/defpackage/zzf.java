package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzf {
    public final ExecutorService a;
    public final CidLogger b;
    public volatile String c;
    public volatile PeerConnectionFactory d;
    public final tpb h;
    public b1k i;
    public JavaAudioDeviceModule j;
    public tw5 k;
    public EglBase l;
    public final ug5 m;
    public final ioc n;
    public volatile vx8 p;
    public ewj q;
    public final boolean s;
    public volatile boolean e = false;
    public volatile boolean f = false;
    public final ArrayList g = new ArrayList();
    public int o = 0;
    public final CopyOnWriteArrayList r = new CopyOnWriteArrayList();

    public zzf(Context context, ExecutorService executorService, EglBase eglBase, CidLogger cidLogger, xt1 xt1Var, ug5 ug5Var, gi1 gi1Var, boolean z, due dueVar, ou7 ou7Var, b1k b1kVar) {
        this.a = executorService;
        this.b = cidLogger;
        this.m = ug5Var;
        v88 v88Var = xt1Var.r;
        this.s = v88Var.c0;
        Float f = v88Var.V;
        if (f != null) {
            HardwareVideoEncoderFactory.bitrateAdjusterFactory = new foc(f.floatValue(), cidLogger);
        }
        this.h = new tpb(eglBase.getEglBaseContext(), cidLogger, xt1Var);
        EglBase.Context eglBaseContext = eglBase.getEglBaseContext();
        ih ihVar = xt1Var.p;
        ioc iocVar = new ioc(eglBaseContext, ((n11) ihVar.a).b || ((n11) ihVar.b).b, gi1Var, xt1Var, cidLogger, dueVar, ou7Var, b1kVar);
        this.n = iocVar;
        ug5Var.a(iocVar);
        cidLogger.log("SharedPeerConnectionFac", "System supports ll audio: " + z);
        executorService.execute(new i5a(this, context, eglBase, cidLogger, xt1Var, z, 1));
    }

    public final void a(Consumer consumer, Consumer consumer2) {
        this.a.execute(new d86(this, consumer2, consumer, 26));
    }
}
