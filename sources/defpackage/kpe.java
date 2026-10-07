package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class kpe implements si8 {
    public SoftReference a;

    @Override // defpackage.si8
    public final Object a(h5 h5Var) {
        SoftReference softReference = this.a;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj != null) {
            return obj;
        }
        Object objB = b(h5Var);
        this.a = objB != null ? new SoftReference(objB) : null;
        return objB;
    }

    public abstract Object b(h5 h5Var);
}
