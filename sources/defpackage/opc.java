package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class opc {
    public PeerConnection.IceTransportsType A;
    public PeerConnection.VpnPreference B;
    public n91 C;
    public t32 D;
    public CropAndScaleParamsProvider E;
    public Integer F;
    public zzf a;
    public szf b;
    public ExecutorService c;
    public xt1 d;
    public Context e;
    public y3e f;
    public vn7 u;
    public an v;
    public hm w;
    public a5f x;
    public esh y;
    public a4f z;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public String[] n = null;
    public String[] o = null;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public int G = 4;

    public final qpc a() {
        if (this.a != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null && this.u != null && this.y != null && this.D != null) {
            return new qpc(this);
        }
        StringBuilder sb = new StringBuilder("failed to build peerConnectionClient");
        sb.append(this.a);
        sb.append(" ");
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.c);
        sb.append(" ");
        sb.append(this.d);
        sb.append(" ");
        sb.append(this.e);
        sb.append(" ");
        sb.append(this.f);
        sb.append(" ");
        sb.append(this.u);
        sb.append(" ");
        sb.append(this.y);
        t32 t32Var = this.D;
        sb.append(" ");
        sb.append(t32Var);
        throw new IllegalStateException(sb.toString());
    }
}
