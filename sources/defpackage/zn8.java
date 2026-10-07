package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zn8 extends pci {
    public final Object b;
    public boolean c;

    public zn8(Object obj) {
        super(0);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c) {
            qr7.d();
            return null;
        }
        this.c = true;
        return this.b;
    }
}
