package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class tfa implements Closeable {
    public final /* synthetic */ int a;
    public final boolean b;
    public final l31 c;
    public final Object d;
    public final Closeable e;

    public tfa(boolean z, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = z;
                l31 l31Var = new l31();
                this.c = l31Var;
                Inflater inflater = new Inflater(true);
                this.d = inflater;
                this.e = new hd8(new u8e(l31Var), inflater);
                break;
            default:
                this.b = z;
                l31 l31Var2 = new l31();
                this.c = l31Var2;
                Deflater deflater = new Deflater(-1, true);
                this.d = deflater;
                this.e = new ig5(l31Var2, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.a) {
            case 0:
                ((ig5) this.e).close();
                break;
            default:
                ((hd8) this.e).close();
                break;
        }
    }
}
