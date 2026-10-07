package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum l4m implements x5l {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(np0.m),
    FORMAT_QR_CODE(np0.n),
    FORMAT_UPC_A(np0.o),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(np0.q),
    FORMAT_AZTEC(np0.r);

    private final int a;

    l4m(int i) {
        this.a = i;
    }

    @Override // defpackage.x5l
    public final int zza() {
        return this.a;
    }
}
