package androidx.datastore.preferences.protobuf;

import defpackage.l3f;
import defpackage.vu3;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(l3f l3fVar) {
        d dVar = (d) this;
        int i = dVar.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iB = l3fVar.b(this);
        dVar.memoizedSerializedSize = iB;
        return iB;
    }

    public abstract void c(vu3 vu3Var);
}
