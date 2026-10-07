package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oy8 implements xwd {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile xwd b;

    public oy8(xwd xwdVar) {
        this.b = xwdVar;
    }

    @Override // defpackage.xwd
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.a = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
