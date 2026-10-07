package defpackage;

import java.nio.ByteBuffer;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class jr3 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public jr3() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.c = iHighestOneBit - 1;
        this.d = new int[iHighestOneBit];
    }

    public void a(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        int i2 = this.c;
        int i3 = i2 + i;
        int i4 = this.a;
        if (i3 < 8) {
            this.a = i4 << i;
            this.b -= i;
            this.c = i2 + i;
            return;
        }
        this.a = i4 << (8 - i2);
        int iRemaining = byteBuffer.remaining();
        int i5 = this.a;
        if (iRemaining > 0) {
            this.a = (byteBuffer.get() & 255) | i5;
            this.b += 8;
        } else {
            this.a = i5 | 255;
        }
        int i6 = i - (8 - this.c);
        this.a <<= i6;
        this.b -= i;
        this.c = i6;
    }

    public void b(ko5 ko5Var) {
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) this.d;
        int i = this.a;
        int iHashCode = ko5Var.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj3 = objArr[i2];
        if (obj3 != null) {
            if (obj3.equals(ko5Var)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj2 = objArr[i2];
                if (obj2 == null) {
                }
            } while (!obj2.equals(ko5Var));
            return;
        }
        objArr[i2] = ko5Var;
        int i3 = this.b + 1;
        this.b = i3;
        if (i3 < this.c) {
            return;
        }
        Object[] objArr2 = (Object[]) this.d;
        int length = objArr2.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        Object[] objArr3 = new Object[i4];
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                this.a = i5;
                this.c = (int) (i4 * 0.75f);
                this.d = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i7 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i5;
            if (objArr3[i7] != null) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (objArr3[i7] != null);
            }
            objArr3[i7] = objArr2[length];
            i3 = i6;
        }
    }

    public void c(int i) {
        int[] iArr = (int[]) this.d;
        int i2 = this.b;
        iArr[i2] = i;
        int i3 = this.c & (i2 + 1);
        this.b = i3;
        int i4 = this.a;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                ore.q("Max array capacity exceeded");
                return;
            }
            int[] iArr2 = new int[i6];
            a.P0(0, i4, length, iArr, iArr2);
            a.P0(i5, 0, this.a, (int[]) this.d, iArr2);
            this.d = iArr2;
            this.a = 0;
            this.b = length;
            this.c = i6 - 1;
        }
    }

    public void d(Object[] objArr, int i, int i2) {
        int i3;
        Object obj;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i5 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        } else {
                            i4 = i3 + 1;
                        }
                    } else if (i >= i5 || i5 > i3) {
                        break;
                    } else {
                        i4 = i3 + 1;
                    }
                } else {
                    objArr[i] = null;
                    return;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
