package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d29 implements Iterator, uv8 {
    public String a;
    public boolean b;
    public final /* synthetic */ tw c;

    public d29(tw twVar) {
        this.c = twVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.a == null && !this.b) {
            String line = ((BufferedReader) this.c.b).readLine();
            this.a = line;
            if (line == null) {
                this.b = true;
            }
        }
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            qr7.d();
            return null;
        }
        String str = this.a;
        this.a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
