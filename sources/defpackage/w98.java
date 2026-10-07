package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w98 extends p1 {
    @Override // defpackage.gri
    public final int a() {
        return 5;
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
        if (((q1) griVar).a() != 5) {
            return false;
        }
        boolean z = griVar instanceof w98;
        byte[] bArr = this.a;
        if (z) {
            return Arrays.equals(bArr, ((w98) griVar).a);
        }
        byte[] bArr2 = griVar.o().a;
        return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.q1, defpackage.gri
    public final w98 o() {
        return this;
    }

    @Override // defpackage.q1, defpackage.y98
    /* JADX INFO: renamed from: s */
    public final w98 o() {
        return this;
    }
}
