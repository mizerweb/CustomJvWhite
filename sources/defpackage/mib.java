package defpackage;

import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public final class mib extends Writer {
    public static final mib a = new mib();

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return mib.class.getName();
    }

    @Override // java.io.Writer
    public final void write(int i) {
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        return this;
    }
}
