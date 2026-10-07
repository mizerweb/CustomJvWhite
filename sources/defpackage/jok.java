package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jok implements Iterator {
    public final /* synthetic */ int a;

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
