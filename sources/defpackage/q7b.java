package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q7b {
    public final int a(byte[] bArr) {
        int i;
        int length = bArr.length;
        int i2 = length / 4;
        int i3 = 0;
        int iRotateLeft = 0;
        while (true) {
            i = i2 * 4;
            if (i3 >= i) {
                break;
            }
            iRotateLeft = (Integer.rotateLeft(iRotateLeft ^ (Integer.rotateLeft(((((bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8)) | ((bArr[i3 + 2] & 255) << 16)) | ((bArr[i3 + 3] & 255) << 24)) * (-862048943), 15) * 461845907), 13) * 5) - 430675100;
            i3 += 4;
        }
        int i4 = length - i;
        int i5 = i4 == 3 ? (bArr[i + 2] & 255) << 16 : 0;
        if (i4 >= 2) {
            i5 ^= (bArr[i + 1] & 255) << 8;
        }
        if (i4 >= 1) {
            iRotateLeft ^= Integer.rotateLeft(((bArr[i] & 255) ^ i5) * (-862048943), 15) * 461845907;
        }
        int i6 = length ^ iRotateLeft;
        int i7 = (i6 ^ (i6 >>> 16)) * (-2048144789);
        int i8 = (i7 ^ (i7 >>> 13)) * (-1028477387);
        return i8 ^ (i8 >>> 16);
    }
}
