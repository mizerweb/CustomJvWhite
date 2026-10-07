package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class a28 implements Closeable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Closeable d;

    public /* synthetic */ a28(int i, Object obj, Closeable closeable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.d = closeable;
    }

    private final void l() {
    }

    public flh A() {
        return (flh) this.d;
    }

    public s18 E() {
        return (s18) this.c;
    }

    public String I() {
        return (String) this.c;
    }

    public final int K() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                break;
            default:
                flh flhVar = (flh) this.d;
                if (flhVar != null) {
                    flhVar.close();
                }
                break;
        }
    }

    public pr6 y() {
        return (pr6) this.d;
    }
}
