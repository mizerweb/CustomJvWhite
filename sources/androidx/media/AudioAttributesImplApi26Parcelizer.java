package androidx.media;

import android.media.AudioAttributes;
import defpackage.wsi;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(wsi wsiVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) wsiVar.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = wsiVar.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, wsi wsiVar) {
        wsiVar.getClass();
        wsiVar.k(audioAttributesImplApi26.a, 1);
        wsiVar.j(audioAttributesImplApi26.b, 2);
    }
}
