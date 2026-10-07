package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface n76 extends AutoCloseable {
    MediaCodec.BufferInfo C();

    boolean H();

    long U();

    ByteBuffer o();

    long size();
}
