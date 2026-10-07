package androidx.media3.exoplayer.audio;

import defpackage.b87;
import defpackage.qt4;
import defpackage.qv1;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$InitializationException extends Exception {
    public final boolean a;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, b87 b87Var, boolean z, AudioOutputProvider$InitializationException audioOutputProvider$InitializationException) {
        StringBuilder sbP = qv1.p("AudioTrack init failed 0 Config(", i, ", ", i2, ", ");
        qt4.x(i3, i4, ", ", ") ", sbP);
        sbP.append(b87Var);
        sbP.append(z ? " (recoverable)" : "");
        super(sbP.toString(), audioOutputProvider$InitializationException);
        this.a = z;
    }
}
