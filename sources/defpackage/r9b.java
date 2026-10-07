package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface r9b {
    void b(int i);

    void e(int i, String str);

    void h(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    int i(MediaFormat mediaFormat);

    void j(int i);

    void release();

    void start();

    void stop();
}
