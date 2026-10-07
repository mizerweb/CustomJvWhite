package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tn8 extends k17 {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ ddd b;

    public tn8(Iterable iterable, ddd dddVar) {
        this.a = iterable;
        this.b = dddVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        return new un8(it, this.b);
    }
}
