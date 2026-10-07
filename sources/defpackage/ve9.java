package defpackage;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public final class ve9 extends Writer {
    public final StringBuilder b = new StringBuilder(np0.m);
    public final String a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        l();
    }

    public final void l() {
        StringBuilder sb = this.b;
        if (sb.length() > 0) {
            Log.d(this.a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                l();
            } else {
                this.b.append(c);
            }
        }
    }
}
