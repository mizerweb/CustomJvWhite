package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum cam implements x5l {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);

    private final int a;

    cam(int i) {
        this.a = i;
    }

    @Override // defpackage.x5l
    public final int zza() {
        return this.a;
    }
}
