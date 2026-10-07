package defpackage;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class ze6 extends af6 {
    public final kr6 E;
    public final LogSessionId F;
    public boolean G;

    public ze6(kr6 kr6Var, gj2 gj2Var, dy dyVar, LogSessionId logSessionId) {
        super(1, gj2Var, dyVar);
        this.E = kr6Var;
        this.F = logSessionId;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    @Override // defpackage.af6
    public final boolean H() throws ExportException {
        u55 u55VarA = this.t.a();
        if (u55VarA != null) {
            if (this.G) {
                if (this.t.c()) {
                    this.G = false;
                    return true;
                }
            } else {
                if (this.u.e()) {
                    ByteBuffer byteBuffer = u55VarA.d;
                    byteBuffer.getClass();
                    byteBuffer.limit(0);
                    u55VarA.a(4);
                    this.v = this.t.c();
                    return false;
                }
                ByteBuffer byteBufferD = this.u.d();
                if (byteBufferD != null) {
                    u55VarA.s(byteBufferD.limit());
                    u55VarA.d.put(byteBufferD).flip();
                    i95 i95Var = this.u;
                    MediaCodec.BufferInfo bufferInfo = i95Var.g(false) ? i95Var.a : null;
                    bufferInfo.getClass();
                    u55VarA.f = bufferInfo.presentationTimeUs;
                    u55VarA.a = bufferInfo.flags;
                    this.u.j();
                    this.G = true;
                    if (this.t.c()) {
                        this.G = false;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.af6
    public final void I(b87 b87Var) {
        this.u = this.E.d(b87Var, this.F);
    }

    @Override // defpackage.af6
    public final boolean P(u55 u55Var) {
        if (u55Var.d(4)) {
            return false;
        }
        long j = u55Var.f - this.s;
        u55Var.f = j;
        if (this.u == null || j >= 0) {
            return false;
        }
        u55Var.q();
        return true;
    }

    @Override // defpackage.ks0
    public final String h() {
        return "ExoAssetLoaderAudioRenderer";
    }
}
