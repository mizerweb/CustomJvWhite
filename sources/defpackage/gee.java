package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class gee extends InputStream {
    public final x25 a;
    public final ByteArrayOutputStream b = new ByteArrayOutputStream();

    public gee(x25 x25Var) {
        this.a = x25Var;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.a.read();
        if (i != -1) {
            this.b.write(i);
        }
        return i;
    }
}
