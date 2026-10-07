package androidx.media3.exoplayer.audio;

import defpackage.b87;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final b87 a;

    public AudioSink$ConfigurationException(Exception exc, b87 b87Var) {
        super(exc);
        this.a = b87Var;
    }

    public AudioSink$ConfigurationException(b87 b87Var, String str) {
        super(str);
        this.a = b87Var;
    }
}
