package defpackage;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public interface r80 extends AudioManager.OnAudioFocusChangeListener {
    default boolean W() {
        return true;
    }

    float a();

    void b(float f);

    boolean d();

    void pause();

    void play();
}
