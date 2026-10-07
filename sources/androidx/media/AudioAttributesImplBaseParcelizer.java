package androidx.media;

import defpackage.wsi;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(wsi wsiVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = 0;
        audioAttributesImplBase.b = 0;
        audioAttributesImplBase.c = 0;
        audioAttributesImplBase.d = -1;
        audioAttributesImplBase.a = wsiVar.f(0, 1);
        audioAttributesImplBase.b = wsiVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = wsiVar.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = wsiVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, wsi wsiVar) {
        wsiVar.getClass();
        wsiVar.j(audioAttributesImplBase.a, 1);
        wsiVar.j(audioAttributesImplBase.b, 2);
        wsiVar.j(audioAttributesImplBase.c, 3);
        wsiVar.j(audioAttributesImplBase.d, 4);
    }
}
