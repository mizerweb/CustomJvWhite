package defpackage;

import android.net.Uri;
import io.antmedia.rtmp_client.RtmpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class dwe extends pq0 {
    public static final /* synthetic */ int g = 0;
    public RtmpClient e;
    public Uri f;

    static {
        sz9.a("media3.datasource.rtmp");
    }

    public dwe() {
        super(true);
    }

    @Override // defpackage.u25
    public final void close() {
        if (this.f != null) {
            this.f = null;
            b();
        }
        RtmpClient rtmpClient = this.e;
        if (rtmpClient != null) {
            rtmpClient.a();
            this.e = null;
        }
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) throws RtmpClient.RtmpIOException {
        c(a35Var);
        RtmpClient rtmpClient = new RtmpClient();
        rtmpClient.a = 0L;
        this.e = rtmpClient;
        rtmpClient.b(a35Var.a.toString());
        this.f = a35Var.a;
        d(a35Var);
        return -1L;
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) throws RtmpClient.RtmpIOException {
        RtmpClient rtmpClient = this.e;
        String str = vqi.a;
        int iC = rtmpClient.c(bArr, i, i2);
        if (iC == -1) {
            return -1;
        }
        a(iC);
        return iC;
    }
}
