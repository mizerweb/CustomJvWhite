package com.my.tracker.core.proto;

import defpackage.np0;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class ProtoWriter {
    private static final Charset a = StandardCharsets.UTF_8;
    protected final OutputStream outputStream;

    /* JADX INFO: loaded from: classes2.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface WireType {
        public static final int INT_SIZE_WIRE_TYPE = 5;
        public static final int LENGTH_DELIMITED_WIRE_TYPE = 2;
        public static final int LONG_SIZE_WIRE_TYPE = 1;
        public static final int VARINT_WIRE_TYPE = 0;
    }

    public ProtoWriter(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    private int a(double d) throws IOException {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        this.outputStream.write(((int) jDoubleToRawLongBits) & 255);
        this.outputStream.write(((int) (jDoubleToRawLongBits >> 8)) & 255);
        this.outputStream.write(((int) (jDoubleToRawLongBits >> 16)) & 255);
        this.outputStream.write(((int) (jDoubleToRawLongBits >> 24)) & 255);
        this.outputStream.write(((int) (jDoubleToRawLongBits >> 32)) & 255);
        this.outputStream.write(((int) (jDoubleToRawLongBits >> 40)) & 255);
        this.outputStream.write(((int) (jDoubleToRawLongBits >> 48)) & 255);
        this.outputStream.write(((int) (jDoubleToRawLongBits >> 56)) & 255);
        return 8;
    }

    private int b(int i) {
        return i < 0 ? a(i) : a(i);
    }

    public int writeField(int i, ByteArrayProtoWriter byteArrayProtoWriter) {
        if (byteArrayProtoWriter == null) {
            return 0;
        }
        int iA = a(i, 2);
        int size = byteArrayProtoWriter.size();
        int iB = b(size) + size + iA;
        byteArrayProtoWriter.writeTo(this.outputStream);
        return iB;
    }

    public int writeMapStringString(int i, Map<String, String> map, ByteArrayProtoWriter byteArrayProtoWriter) {
        int iWriteField = 0;
        if (map != null && !map.isEmpty()) {
            for (String str : new TreeSet(map.keySet())) {
                byteArrayProtoWriter.reset();
                byteArrayProtoWriter.writeField(1, str);
                byteArrayProtoWriter.writeField(2, map.get(str));
                if (byteArrayProtoWriter.size() > 0) {
                    iWriteField += writeField(i, byteArrayProtoWriter);
                }
            }
        }
        return iWriteField;
    }

    public int writeRawBlob(byte[] bArr) throws IOException {
        this.outputStream.write(bArr);
        return bArr.length;
    }

    public int writeRepeatedField(int i, String[] strArr) {
        if (strArr == null) {
            return 0;
        }
        int iWriteField = 0;
        for (String str : strArr) {
            iWriteField += writeField(i, str);
        }
        return iWriteField;
    }

    public int writeField(int i, long j) {
        return a(i, 0) + a(j);
    }

    public int writeField(int i, double d) {
        return a(i, 1) + a(d);
    }

    public int writeField(int i, float f) {
        return a(i, 5) + a(f);
    }

    public int writeField(int i, byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return a(i, 2) + a(bArr);
    }

    public int writeField(int i, int i2) {
        return a(i, 0) + b(i2);
    }

    public int writeField(int i, String str) {
        if (str == null) {
            return 0;
        }
        return a(i, 2) + a(str.getBytes(a));
    }

    private int a(long j) throws IOException {
        int i = 0;
        while (true) {
            i++;
            long j2 = (-128) & j;
            OutputStream outputStream = this.outputStream;
            if (j2 == 0) {
                outputStream.write((int) j);
                return i;
            }
            outputStream.write(((int) (127 & j)) | np0.m);
            j >>>= 7;
        }
    }

    private int a(float f) throws IOException {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        this.outputStream.write(iFloatToRawIntBits & 255);
        this.outputStream.write((iFloatToRawIntBits >> 8) & 255);
        this.outputStream.write((iFloatToRawIntBits >> 16) & 255);
        this.outputStream.write((iFloatToRawIntBits >> 24) & 255);
        return 4;
    }

    private int a(byte[] bArr) throws IOException {
        int iB = b(bArr.length) + bArr.length;
        this.outputStream.write(bArr);
        return iB;
    }

    private int a(int i, int i2) {
        return a((i << 3) | i2);
    }

    private int a(int i) throws IOException {
        int i2 = 0;
        while (true) {
            i2++;
            int i3 = i & (-128);
            OutputStream outputStream = this.outputStream;
            if (i3 == 0) {
                outputStream.write(i);
                return i2;
            }
            outputStream.write((i & 127) | np0.m);
            i >>>= 7;
        }
    }
}
