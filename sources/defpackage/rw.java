package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rw implements Iterable, uv8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new y1(1, (Object[]) obj);
            default:
                return new sv5((Iterator) ((af7) obj).invoke());
        }
    }
}
