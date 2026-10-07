package androidx.media3.common.audio;

import defpackage.cb0;

/* JADX INFO: loaded from: classes.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public final cb0 a;

    public AudioProcessor$UnhandledAudioFormatException(String str, cb0 cb0Var) {
        super(str + " " + cb0Var);
        this.a = cb0Var;
    }

    public AudioProcessor$UnhandledAudioFormatException(cb0 cb0Var) {
        this("Unhandled input format:", cb0Var);
    }
}
