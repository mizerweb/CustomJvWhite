package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ehl implements qnk {
    /* JADX INFO: Fake field, exist only in values array */
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);

    public final int a;

    ehl(int i) {
        this.a = i;
    }

    @Override // defpackage.qnk
    public final int zza() {
        return this.a;
    }
}
