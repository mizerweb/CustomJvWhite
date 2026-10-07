package defpackage;

import java.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public final class mck extends qck {
    public byte[] i;

    @Override // defpackage.qck
    public final pbk a(byte[] bArr, byte[] bArr2) {
        e8k e8kVar = this.a.a;
        byte[] bArr3 = this.i;
        mbk mbkVar = new mbk(e8kVar, bArr, bArr2);
        mbkVar.h = bArr3;
        s8 s8Var = this.e;
        long j = s8Var.a;
        s8Var.a = 1 + j;
        if (j >= 0) {
            mbkVar.b = j;
            return mbkVar;
        }
        ore.a();
        return null;
    }

    @Override // defpackage.qck
    public final Optional b(byte[] bArr, int i, byte[] bArr2, int i2) {
        return i2 < 1200 ? Optional.empty() : super.b(bArr, i, bArr2, i2);
    }
}
