package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ri9 implements Iterator, uv8 {
    public final long a;
    public final long b;
    public boolean c;
    public long d;

    public ri9(long j, long j2, long j3) {
        this.a = j3;
        this.b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.c = z;
        this.d = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.d;
        if (j != this.b) {
            this.d = this.a + j;
        } else {
            if (!this.c) {
                qr7.d();
                return null;
            }
            this.c = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
