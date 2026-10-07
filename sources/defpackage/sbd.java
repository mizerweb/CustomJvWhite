package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sbd extends rbd {
    public final Object c;

    public sbd(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.rbd, defpackage.qbd
    public final Object a() {
        Object objA;
        synchronized (this.c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.rbd, defpackage.qbd
    public final boolean d(Object obj) {
        boolean zD;
        synchronized (this.c) {
            zD = super.d(obj);
        }
        return zD;
    }
}
