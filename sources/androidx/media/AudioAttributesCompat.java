package androidx.media;

import android.util.SparseIntArray;
import defpackage.ysi;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesCompat implements ysi {
    public static final /* synthetic */ int b = 0;
    public AudioAttributesImpl a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat(AudioAttributesImplApi26 audioAttributesImplApi26) {
        this.a = audioAttributesImplApi26;
    }

    public static int b(int i, int i2) {
        if ((i & 1) == 1) {
            return 7;
        }
        if ((i & 4) == 4) {
            return 6;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).a;
        if (audioAttributesImpl == null) {
            return audioAttributesImpl2 == null;
        }
        return audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
