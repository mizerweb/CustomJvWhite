package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum mae implements Serializable {
    UNKNOWN(0),
    EMOJI(1),
    STICKER(2),
    GIF(3),
    ANIMOJI(4);

    public final int a;

    mae(int i) {
        this.a = i;
    }
}
