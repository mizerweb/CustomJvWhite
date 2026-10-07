package com.my.tracker.core.proto;

import com.my.tracker.core.Tracer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ByteArrayProtoWriter extends ProtoWriter {
    private final a b;

    public static class a extends ByteArrayOutputStream {
        private final int a;
        private int b;
        private int c;

        public a(int i) {
            super(i);
            this.a = i;
            this.b = Integer.MAX_VALUE;
            this.c = -1;
        }

        public synchronized void l() {
            try {
                reset();
                if (Tracer.isEnabled()) {
                    StringBuilder sb = new StringBuilder("SimpleByteArrayOutputStream: minSize=");
                    int i = this.b;
                    if (i == Integer.MAX_VALUE) {
                        i = 0;
                    }
                    sb.append(i);
                    sb.append(", maxSize=");
                    sb.append(this.c);
                    sb.append(", truncate=");
                    sb.append(this.a);
                    Tracer.d(sb.toString());
                }
                this.b = Integer.MAX_VALUE;
                this.c = -1;
                int length = ((ByteArrayOutputStream) this).buf.length;
                int i2 = this.a;
                if (length > i2) {
                    ((ByteArrayOutputStream) this).buf = new byte[i2];
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            try {
                int i = ((ByteArrayOutputStream) this).count;
                if (i > 0) {
                    this.b = Integer.min(this.b, i);
                }
                this.c = Integer.max(((ByteArrayOutputStream) this).count, this.c);
                super.reset();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ByteArrayProtoWriter(int i) {
        super(new a(i));
        this.b = (a) this.outputStream;
    }

    public void reset() {
        this.b.reset();
    }

    public int size() {
        return this.b.size();
    }

    public byte[] toByteArray() {
        return this.b.toByteArray();
    }

    public void trimToDefaultSize() {
        this.b.l();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        this.b.writeTo(outputStream);
    }
}
