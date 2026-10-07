package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xwb implements rba {
    public final /* synthetic */ ny8 a;

    public xwb(ny8 ny8Var) {
        this.a = ny8Var;
    }

    @Override // defpackage.rba
    public final void a(int i) {
        ny8 ny8Var = this.a;
        if (!ny8Var.d()) {
            return;
        }
        v6h v6hVar = (v6h) ny8Var.getValue();
        v6hVar.b.i(-1);
        l8b l8bVar = v6hVar.a;
        Object[] objArr = l8bVar.c;
        long[] jArr = l8bVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        ((t6h) objArr[(i2 << 3) + i4]).b = false;
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }
}
