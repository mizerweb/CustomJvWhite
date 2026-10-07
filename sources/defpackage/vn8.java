package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class vn8 extends c2i {
    public final /* synthetic */ mf7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn8(Iterator it, mf7 mf7Var) {
        super(it);
        this.b = mf7Var;
    }

    @Override // defpackage.c2i
    public final Object a(Object obj) {
        return this.b.mo41apply(obj);
    }
}
