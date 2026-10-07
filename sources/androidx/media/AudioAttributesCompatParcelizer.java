package androidx.media;

import defpackage.wsi;
import defpackage.ysi;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(wsi wsiVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        ysi ysiVarH = audioAttributesCompat.a;
        if (wsiVar.e(1)) {
            ysiVarH = wsiVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) ysiVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, wsi wsiVar) {
        wsiVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        wsiVar.i(1);
        wsiVar.l(audioAttributesImpl);
    }
}
