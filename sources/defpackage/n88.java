package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class n88 extends p1 {
    public n88(byte[] bArr) {
        super(bArr);
    }

    @Override // defpackage.gri
    public final int a() {
        return 6;
    }

    @Override // defpackage.gri
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gri)) {
            return false;
        }
        gri griVar = (gri) obj;
        int iA = ((q1) griVar).a();
        if (iA == 0) {
            throw null;
        }
        if (iA != 6) {
            return false;
        }
        boolean z = griVar instanceof n88;
        byte[] bArr = this.a;
        if (z) {
            return Arrays.equals(bArr, ((n88) griVar).a);
        }
        byte[] bArr2 = griVar.r().a;
        return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.q1, defpackage.gri
    public final n88 r() {
        return this;
    }

    @Override // defpackage.q1
    /* JADX INFO: renamed from: w */
    public final n88 r() {
        return this;
    }
}
