package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public interface e3j {
    static /* synthetic */ void w(e3j e3jVar, rui ruiVar, boolean z, d3j d3jVar, float f, int i) {
        int i2 = (i & 8) != 0 ? 1 : 4;
        boolean z2 = (i & 16) != 0;
        if ((i & 32) != 0) {
            f = 1.0f;
        }
        e3jVar.x(ruiVar, z, d3jVar, i2, z2, f, false);
    }

    default void C(uvi uviVar) {
    }

    void H(Surface surface);

    boolean P();

    long V();

    void X(pgg pggVar);

    float a();

    void b(float f);

    void clear();

    boolean d();

    long e();

    long getDuration();

    boolean isIdle();

    float l0();

    void o0(boolean z);

    void pause();

    void play();

    void q(c3j c3jVar);

    void q0(c3j c3jVar);

    void release();

    void seekTo(long j);

    void setPlaybackSpeed(float f);

    void stop();

    void x(rui ruiVar, boolean z, d3j d3jVar, int i, boolean z2, float f, boolean z3);
}
