package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class wki extends OutputStream {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public wki(pak pakVar) {
        this.a = 3;
        this.b = pakVar;
    }

    private final void l() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((OutputStream) obj).close();
                break;
            case 1:
            default:
                super.close();
                break;
            case 2:
                break;
            case 3:
                ((pak) obj).f.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((OutputStream) obj).flush();
                break;
            case 1:
            default:
                super.flush();
                break;
            case 2:
                ((FileOutputStream) obj).flush();
                break;
            case 3:
                ((pak) obj).f.flush();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                OutputStream outputStream = (OutputStream) obj;
                int i4 = i2 + i;
                int i5 = i;
                while (i < i4) {
                    byte b = bArr[i];
                    if (!iw8.j(b)) {
                        if (i > i5) {
                            outputStream.write(bArr, i5, i - i5);
                        }
                        outputStream.write(37);
                        int i6 = (b >> 4) & 15;
                        outputStream.write(i6 <= 9 ? i6 + 48 : i6 + 55);
                        int i7 = b & 15;
                        outputStream.write(i7 <= 9 ? i7 + 48 : i7 + 55);
                        i5 = i + 1;
                    }
                    i++;
                }
                if (i5 < i4) {
                    outputStream.write(bArr, i5, i4 - i5);
                }
                break;
            case 1:
                if (bArr == null || i + i2 > bArr.length) {
                    ore.p("wrong parameters for write");
                } else if (i >= 0 && i2 >= 0) {
                    ((MessageDigest) obj).update(bArr, i, i2);
                } else {
                    c.r("wrong index for write");
                }
                break;
            case 2:
                ((FileOutputStream) obj).write(bArr, i, i2);
                break;
            default:
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                abk abkVar = ((pak) obj).f;
                int iLimit = byteBufferWrap.limit();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                int iA = ti8.a(iLimit, byteBufferAllocate);
                int i8 = iA + 1;
                byte[] bArr2 = new byte[i8 + iLimit];
                bArr2[0] = 0;
                byteBufferAllocate.get(bArr2, 1, iA);
                byteBufferWrap.get(bArr2, i8, iLimit);
                abkVar.write(bArr2);
                break;
        }
    }

    public /* synthetic */ wki(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                ((FileOutputStream) obj).write(bArr);
                break;
            case 3:
                abk abkVar = ((pak) obj).f;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                int iLimit = byteBufferWrap.limit();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                int iA = ti8.a(iLimit, byteBufferAllocate);
                int i2 = iA + 1;
                byte[] bArr2 = new byte[i2 + iLimit];
                bArr2[0] = 0;
                byteBufferAllocate.get(bArr2, 1, iA);
                byteBufferWrap.get(bArr2, i2, iLimit);
                abkVar.write(bArr2);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                OutputStream outputStream = (OutputStream) obj;
                if (iw8.j(i)) {
                    outputStream.write(i);
                } else {
                    outputStream.write(37);
                    int i3 = (i >> 4) & 15;
                    outputStream.write(i3 <= 9 ? i3 + 48 : i3 + 55);
                    int i4 = i & 15;
                    outputStream.write(i4 <= 9 ? i4 + 48 : i4 + 55);
                }
                break;
            case 1:
                ((MessageDigest) obj).update((byte) i);
                break;
            case 2:
                ((FileOutputStream) obj).write(i);
                break;
            default:
                abk abkVar = ((pak) obj).f;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[]{(byte) i});
                int iLimit = byteBufferWrap.limit();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                int iA = ti8.a(iLimit, byteBufferAllocate);
                int i5 = iA + 1;
                byte[] bArr = new byte[i5 + iLimit];
                bArr[0] = 0;
                byteBufferAllocate.get(bArr, 1, iA);
                byteBufferWrap.get(bArr, i5, iLimit);
                abkVar.write(bArr);
                break;
        }
    }
}
