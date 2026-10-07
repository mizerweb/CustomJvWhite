package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class he0 extends hih {
    public final int c;

    public he0(byte[] bArr, int i, int i2, String str) {
        String str2;
        super(kfc.l);
        this.c = i2;
        h("phone", str);
        if (i == 1) {
            str2 = "START_AUTH";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "RESEND";
        }
        h("type", str2);
        if (bArr != null) {
            this.a.put("mode", bArr);
        }
    }

    @Override // defpackage.hih
    public final boolean o() {
        return false;
    }

    @Override // defpackage.hih
    public final int p() {
        return this.c;
    }
}
