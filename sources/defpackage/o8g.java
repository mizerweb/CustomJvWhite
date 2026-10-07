package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class o8g implements si8 {
    public volatile Object a = qyj.d;

    @Override // defpackage.si8
    public final Object a(h5 h5Var) {
        Object objB;
        Object obj = this.a;
        Object obj2 = qyj.d;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objB = this.a;
            if (objB == obj2) {
                objB = b(h5Var);
                this.a = objB;
            }
        }
        return objB;
    }

    public abstract Object b(h5 h5Var);
}
