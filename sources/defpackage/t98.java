package defpackage;

import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t98 extends q88 {
    public t98() {
        super(4);
    }

    @Override // defpackage.r88
    public final /* bridge */ /* synthetic */ r88 a(Object obj) {
        h(obj);
        return this;
    }

    public final void h(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final void i(Collection collection) {
        collection.getClass();
        f(collection);
    }

    public final u98 j() {
        int i = this.b;
        if (i == 0) {
            int i2 = u98.c;
            return nhe.j;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            u98 u98VarL = u98.l(objArr, i);
            this.b = u98VarL.size();
            this.c = true;
            return u98VarL;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = u98.c;
        return new jag(obj);
    }
}
