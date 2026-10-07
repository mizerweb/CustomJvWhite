package androidx.media3.exoplayer.audio;

import defpackage.zo5;

/* JADX INFO: loaded from: classes.dex */
public final class AudioOutput$WriteException extends Exception {
    public final int a;
    public final boolean b;

    public AudioOutput$WriteException(int i, boolean z) {
        super(zo5.h(i, "AudioOutput write failed: "));
        this.b = z;
        this.a = i;
    }
}
