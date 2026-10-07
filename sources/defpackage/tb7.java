package defpackage;

import android.util.SparseArray;
import androidx.media3.muxer.MuxerException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class tb7 implements q9b {
    public static final ghe d;
    public static final ghe e;
    public final xb7 a;
    public final ljf b;
    public final SparseArray c;

    static {
        a98 a98Var = c98.b;
        Object[] objArr = {"video/av01", "video/3gpp", "video/avc", "video/hevc", "video/mp4v-es", "video/x-vnd.on2.vp9", "video/apv", "video/dolby-vision"};
        ch3.e(objArr, 8);
        d = c98.j(objArr, 8);
        e = c98.w("audio/mp4a-latm", "audio/3gpp", "audio/amr-wb", "audio/opus", "audio/vorbis", "audio/raw");
    }

    public tb7(FileChannel fileChannel, long j) {
        ljf ljfVar = new ljf(20);
        this.b = ljfVar;
        this.a = new xb7(fileChannel, ljfVar, j);
        this.c = new SparseArray();
    }

    @Override // defpackage.q9b
    public final int b0(b87 b87Var) {
        xb7 xb7Var = this.a;
        int i = xb7Var.k;
        xb7Var.k = i + 1;
        ayh ayhVar = new ayh(i, b87Var, true);
        xb7Var.d.add(ayhVar);
        if (uya.m(b87Var.n)) {
            xb7Var.f = ayhVar;
        }
        this.c.append(i, ayhVar);
        return i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        try {
            xb7 xb7Var = this.a;
            ub7 ub7Var = xb7Var.a;
            try {
                xb7Var.a();
            } finally {
                ub7Var.close();
            }
        } catch (IOException e2) {
            throw new MuxerException("Failed to close the muxer", e2);
        }
    }

    @Override // defpackage.q9b
    public final void k(jwa jwaVar) {
        lvb.O("Unsupported metadata", hwk.c(jwaVar));
        this.b.m(jwaVar);
    }

    @Override // defpackage.q9b
    public final void w0(int i, ByteBuffer byteBuffer, u31 u31Var) throws MuxerException {
        try {
            this.a.b((ayh) this.c.get(i), byteBuffer, u31Var);
        } catch (IOException e2) {
            throw new MuxerException("Failed to write sample for presentationTimeUs=" + u31Var.a + ", size=" + u31Var.b, e2);
        }
    }
}
