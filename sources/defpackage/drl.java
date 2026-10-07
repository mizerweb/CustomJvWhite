package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public abstract class drl {
    public static oa0 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return oa0.d;
        }
        na0 na0Var = new na0();
        na0Var.a = true;
        na0Var.c = z;
        return na0Var.a();
    }

    public static final bw b(SparseArray sparseArray) {
        return new bw(3, sparseArray);
    }
}
