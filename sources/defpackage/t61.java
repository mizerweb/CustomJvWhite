package defpackage;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class t61 extends FilterOutputStream {
    public final /* synthetic */ int a = 0;
    public ByteOrder b;
    public final OutputStream c;

    public t61(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.c = new DataOutputStream(outputStream);
        this.b = byteOrder;
    }

    public void A(int i) throws IOException {
        if (i <= 65535) {
            l((short) i);
        } else {
            ore.p("val is larger than the maximum value of a 16-bit unsigned integer");
        }
    }

    public void b(int i) throws IOException {
        ((DataOutputStream) this.c).write(i);
    }

    public final void g(int i) throws IOException {
        int i2 = this.a;
        OutputStream outputStream = this.c;
        switch (i2) {
            case 0:
                ByteOrder byteOrder = this.b;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    outputStream.write(i & 255);
                    outputStream.write((i >>> 8) & 255);
                    outputStream.write((i >>> 16) & 255);
                    outputStream.write((i >>> 24) & 255);
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((i >>> 24) & 255);
                    outputStream.write((i >>> 16) & 255);
                    outputStream.write((i >>> 8) & 255);
                    outputStream.write(i & 255);
                }
                break;
            default:
                DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
                ByteOrder byteOrder2 = this.b;
                if (byteOrder2 == ByteOrder.LITTLE_ENDIAN) {
                    dataOutputStream.write(i & 255);
                    dataOutputStream.write((i >>> 8) & 255);
                    dataOutputStream.write((i >>> 16) & 255);
                    dataOutputStream.write((i >>> 24) & 255);
                } else if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                    dataOutputStream.write((i >>> 24) & 255);
                    dataOutputStream.write((i >>> 16) & 255);
                    dataOutputStream.write((i >>> 8) & 255);
                    dataOutputStream.write(i & 255);
                }
                break;
        }
    }

    public final void l(short s) throws IOException {
        int i = this.a;
        OutputStream outputStream = this.c;
        switch (i) {
            case 0:
                ByteOrder byteOrder = this.b;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    outputStream.write(s & 255);
                    outputStream.write((s >>> 8) & 255);
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((s >>> 8) & 255);
                    outputStream.write(s & 255);
                }
                break;
            default:
                DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
                ByteOrder byteOrder2 = this.b;
                if (byteOrder2 == ByteOrder.LITTLE_ENDIAN) {
                    dataOutputStream.write(s & 255);
                    dataOutputStream.write((s >>> 8) & 255);
                } else if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                    dataOutputStream.write((s >>> 8) & 255);
                    dataOutputStream.write(s & 255);
                }
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        switch (this.a) {
            case 0:
                this.c.write(bArr);
                break;
            default:
                ((DataOutputStream) this.c).write(bArr);
                break;
        }
    }

    public void y(long j) throws IOException {
        if (j <= 4294967295L) {
            g((int) j);
        } else {
            ore.p("val is larger than the maximum value of a 32-bit unsigned integer");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t61(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.c = outputStream;
        this.b = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                this.c.write(bArr, i, i2);
                break;
            default:
                ((DataOutputStream) this.c).write(bArr, i, i2);
                break;
        }
    }
}
