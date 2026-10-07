package defpackage;

import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class sr7 {
    public static final byte[] e = {0, 0, 1};
    public int a;
    public int b;
    public boolean c;
    public Serializable d;

    public Size a(v68 v68Var) {
        int iY = v68Var.y(0);
        Size size = (Size) v68Var.b(v68.z0, null);
        int i = this.b;
        int i2 = this.a;
        if (size != null) {
            int iB = njl.b(njl.c(iY), i2, 1 == i);
            if (iB == 90 || iB == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], java.io.Serializable] */
    public void b(int i, byte[] bArr, int i2) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.d;
            int length = bArr2.length;
            int i4 = this.a + i3;
            if (length < i4) {
                this.d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.d, this.a, i3);
            this.a += i3;
        }
    }
}
