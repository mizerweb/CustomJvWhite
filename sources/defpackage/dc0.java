package defpackage;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class dc0 {
    public final cc0 a;
    public final int b;
    public final c7k c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public dc0(AudioTrack audioTrack, c7k c7kVar) {
        this.a = new cc0(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = c7kVar;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i == 1) {
            this.f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000L;
        } else if (i == 4) {
            this.f = 500000L;
        } else {
            c.t();
        }
    }
}
