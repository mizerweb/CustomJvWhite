package defpackage;

import android.text.GetChars;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class ckc extends Writer {
    public static final char[] e = {'n', 'u', 'l', 'l'};
    public final char[] a;
    public final byte[] b;
    public final OutputStream c;
    public final sqi d;

    public ckc(OutputStream outputStream) {
        sqi sqiVar = new sqi();
        this.a = new char[Math.max(np0.m, 1)];
        this.c = outputStream;
        this.d = sqiVar;
        this.b = new byte[Math.max(np0.m, 4)];
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        if (charSequence == null) {
            write(e, 0, 4);
            return this;
        }
        b(0, charSequence.length(), charSequence);
        return this;
    }

    public final void b(int i, int i2, CharSequence charSequence) {
        if (charSequence instanceof String) {
            write((String) charSequence, i, i2);
            return;
        }
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) charSequence;
            char[] cArr = this.a;
            int length = cArr.length;
            synchronized (((Writer) this).lock) {
                while (i2 > 0) {
                    try {
                        int iMin = Math.min(length, i2);
                        int i3 = i + iMin;
                        sb.getChars(i, i3, cArr, 0);
                        write(cArr, 0, iMin);
                        i2 -= iMin;
                        i = i3;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return;
        }
        if (charSequence instanceof StringBuffer) {
            StringBuffer stringBuffer = (StringBuffer) charSequence;
            char[] cArr2 = this.a;
            int length2 = cArr2.length;
            synchronized (((Writer) this).lock) {
                while (i2 > 0) {
                    try {
                        int iMin2 = Math.min(length2, i2);
                        int i4 = i + iMin2;
                        stringBuffer.getChars(i, i4, cArr2, 0);
                        write(cArr2, 0, iMin2);
                        i2 -= iMin2;
                        i = i4;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return;
        }
        if (charSequence instanceof GetChars) {
            GetChars getChars = (GetChars) charSequence;
            char[] cArr3 = this.a;
            int length3 = cArr3.length;
            synchronized (((Writer) this).lock) {
                while (i2 > 0) {
                    try {
                        int iMin3 = Math.min(length3, i2);
                        int i5 = i + iMin3;
                        getChars.getChars(i, i5, cArr3, 0);
                        write(cArr3, 0, iMin3);
                        i2 -= iMin3;
                        i = i5;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            return;
        }
        if (charSequence instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) charSequence;
            if (charBuffer.hasArray()) {
                write(charBuffer.array(), charBuffer.arrayOffset() + i, i2);
                return;
            }
        }
        char[] cArr4 = this.a;
        int length4 = cArr4.length;
        synchronized (((Writer) this).lock) {
            while (i2 > 0) {
                try {
                    int iMin4 = Math.min(length4, i2);
                    int i6 = i + iMin4;
                    int i7 = 0;
                    while (i7 < iMin4) {
                        cArr4[i7] = charSequence.charAt(i);
                        i7++;
                        i++;
                    }
                    write(cArr4, 0, iMin4);
                    i2 -= iMin4;
                    i = i6;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int iB;
        synchronized (((Writer) this).lock) {
            sqi sqiVar = this.d;
            byte[] bArr = this.b;
            int length = bArr.length;
            if (sqiVar.c != 0) {
                iB = sqiVar.b(0, bArr);
                sqiVar.c = (char) 0;
            } else {
                iB = 0;
            }
            this.c.write(this.b, 0, iB);
            this.c.close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        synchronized (((Writer) this).lock) {
            this.c.flush();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        synchronized (((Writer) this).lock) {
            int i3 = i + i2;
            int i4 = i;
            int i5 = i2;
            while (i4 < i3) {
                try {
                    sqi sqiVar = this.d;
                    byte[] bArr = this.b;
                    char[] cArr2 = cArr;
                    long jA = sqiVar.a(cArr2, i4, i5, bArr, bArr.length);
                    this.c.write(this.b, 0, (int) jA);
                    i4 = (int) (jA >> 32);
                    i5 = i3 - i4;
                    cArr = cArr2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            write(e, 0, 4);
            return this;
        }
        b(i, i2 - i, charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        char[] cArr = this.a;
        cArr[0] = (char) i;
        write(cArr, 0, 1);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        char[] cArr = this.a;
        int length = cArr.length;
        synchronized (((Writer) this).lock) {
            while (i2 > 0) {
                try {
                    int iMin = Math.min(length, i2);
                    int i3 = i + iMin;
                    str.getChars(i, i3, cArr, 0);
                    write(cArr, 0, iMin);
                    i2 -= iMin;
                    i = i3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public final void write(String str) {
        write(str, 0, str.length());
    }
}
