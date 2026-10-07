package androidx.media;

import android.media.AudioAttributes;
import defpackage.wsi;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(wsi wsiVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) wsiVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = wsiVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, wsi wsiVar) {
        wsiVar.getClass();
        wsiVar.k(audioAttributesImplApi21.a, 1);
        wsiVar.j(audioAttributesImplApi21.b, 2);
    }
}
