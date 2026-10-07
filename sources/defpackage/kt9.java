package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface kt9 {
    void e(int i, ty4 ty4Var, long j, int i2);

    void flush();

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void h(long j, int i, int i2, int i3);

    void i();

    void k(int i);

    void l(Surface surface);

    void m(int i);

    default boolean o(due dueVar) {
        return false;
    }

    void p(int i, long j);

    int q();

    int r(MediaCodec.BufferInfo bufferInfo);

    void release();

    default void s(su6 su6Var) {
        su6Var.run();
    }

    void setParameters(Bundle bundle);

    void t(ArrayList arrayList);

    void u(yt9 yt9Var, Handler handler);

    void v(ArrayList arrayList);
}
