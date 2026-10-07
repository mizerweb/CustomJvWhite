package defpackage;

import androidx.media3.muxer.MuxerException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class s2b implements q9b {
    public static final ghe g;
    public static final ghe h;
    public final yr6 a;
    public final ljf b;
    public final y2b c;
    public final ArrayList d;
    public final ArrayList e;
    public int f;

    static {
        a98 a98Var = c98.b;
        Object[] objArr = {"video/av01", "video/3gpp", "video/avc", "video/hevc", "video/mp4v-es", "video/x-vnd.on2.vp9", "video/apv", "video/dolby-vision"};
        ch3.e(objArr, 8);
        g = c98.j(objArr, 8);
        h = c98.w("audio/mp4a-latm", "audio/3gpp", "audio/amr-wb", "audio/opus", "audio/vorbis", "audio/raw");
    }

    public s2b(yr6 yr6Var) {
        this.a = yr6Var;
        ljf ljfVar = new ljf(20);
        this.b = ljfVar;
        this.c = new y2b(yr6Var, ljfVar);
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    @Override // defpackage.q9b
    public final int b0(b87 b87Var) {
        int i = this.f;
        this.f = i + 1;
        y2b y2bVar = this.c;
        y2bVar.getClass();
        ayh ayhVar = new ayh(i, b87Var, false);
        ArrayList arrayList = y2bVar.c;
        arrayList.add(ayhVar);
        Collections.sort(arrayList, new ps0(18));
        this.d.add(ayhVar);
        return i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        MuxerException muxerException;
        try {
            byte[] bArr = new byte[8];
            int i = 7;
            while (true) {
                if (i < 0) {
                    break;
                }
                bArr[i] = 0;
                i--;
            }
            lvb.R(bArr.length == 8);
            this.c.b();
            muxerException = null;
        } catch (IOException e) {
            muxerException = new MuxerException("Failed to finish writing data", e);
        }
        try {
            this.a.close();
        } catch (IOException e2) {
            if (muxerException == null) {
                muxerException = new MuxerException("Failed to close output stream", e2);
            } else {
                lvb.l0("Mp4Muxer", "Failed to close output stream", e2);
            }
        }
        if (muxerException != null) {
            throw muxerException;
        }
    }

    @Override // defpackage.q9b
    public final void k(jwa jwaVar) {
        lvb.O("Unsupported metadata", hwk.c(jwaVar));
        this.b.m(jwaVar);
    }

    @Override // defpackage.q9b
    public final void w0(int i, ByteBuffer byteBuffer, u31 u31Var) {
        ArrayList arrayList = this.d;
        lvb.O("Track id is invalid", i < arrayList.size());
        byteBuffer.getClass();
        int i2 = u31Var.b;
        lvb.R(byteBuffer.remaining() == i2);
        ayh ayhVar = (ayh) arrayList.get(i);
        try {
            if (this.e.contains(ayhVar)) {
                throw null;
            }
            this.c.h(ayhVar, byteBuffer, u31Var);
        } catch (IOException e) {
            throw new MuxerException("Failed to write sample for presentationTimeUs=" + u31Var.a + ", size=" + i2, e);
        }
    }
}
