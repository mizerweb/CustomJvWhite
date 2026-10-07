package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class be9 {
    public final long a;
    public final byte[] b;
    public final int c;

    public be9(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
        this.c = bArr.length + 36;
    }

    public final void a(OutputStream outputStream, int i) throws IOException {
        SimpleDateFormat simpleDateFormat = de9.a;
        outputStream.write(35);
        String strValueOf = String.valueOf(i);
        for (int i2 = 0; i2 < strValueOf.length(); i2++) {
            outputStream.write(strValueOf.charAt(i2));
        }
        outputStream.write(32);
        byte[] bytes = de9.a.format(new Date(this.a)).getBytes(pt2.a);
        int length = bytes.length - 2;
        outputStream.write(bytes, 0, length);
        outputStream.write(58);
        outputStream.write(bytes, length, 2);
        for (int i3 = 0; i3 < 3; i3++) {
            outputStream.write(" | ".charAt(i3));
        }
        outputStream.write(this.b);
        outputStream.write(10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof be9)) {
            return false;
        }
        be9 be9Var = (be9) obj;
        return this.a == be9Var.a && Arrays.equals(this.b, be9Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) | Long.hashCode(this.a);
    }

    public final String toString() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(byteArrayOutputStream, 0);
        return byteArrayOutputStream.toString();
    }
}
