package androidx.media3.exoplayer.audio;

import defpackage.b87;
import defpackage.zo5;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {
    public final int a;
    public final boolean b;
    public final b87 c;

    public AudioSink$WriteException(int i, b87 b87Var, boolean z) {
        super(zo5.h(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = b87Var;
    }
}
