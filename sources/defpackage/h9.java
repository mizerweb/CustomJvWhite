package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class h9 {
    public static final List d = xw3.P0("", "null", "libvpx", "unknown");
    public final gi1 a;
    public final m9 b;
    public final ih c;

    public h9(gi1 gi1Var, esh eshVar, CidLogger cidLogger) {
        eshVar.getClass();
        this.a = gi1Var;
        int i = 0;
        rea reaVar = new rea(2, this, h9.class, "onVideoCodec", "onVideoCodec(Lru/ok/android/webrtc/stat/codec/ActiveEncodersStats$NamedCodecInfo;J)V", i, 26);
        eshVar.getClass();
        m9 m9Var = new m9();
        m9Var.c = eshVar;
        m9Var.d = reaVar;
        this.b = m9Var;
        this.c = new ih(new ysj(1, this, h9.class, "onAudioCodec", "onAudioCodec(Lru/ok/android/webrtc/stat/codec/ActiveEncodersStats$NamedCodecInfo;)V", i, 1));
    }
}
