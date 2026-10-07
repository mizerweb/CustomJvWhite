package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum z1m implements x5l {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);

    private final int a;

    z1m(int i) {
        this.a = i;
    }

    @Override // defpackage.x5l
    public final int zza() {
        return this.a;
    }
}
