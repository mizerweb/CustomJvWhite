package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class un0 implements Iterable, uv8 {
    public final ArrayDeque a = new ArrayDeque();
    public gve b;

    public final lve a() {
        return (lve) this.a.peek();
    }

    public final lve b() {
        Object objPop = this.a.pop();
        lve lveVar = (lve) objPop;
        gve gveVar = this.b;
        if (gveVar != null) {
            gveVar.d();
        }
        lveVar.a.destroy();
        return (lve) objPop;
    }

    public final Iterator c() {
        return ww3.J1(this.a).iterator();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y1(1, this.a.toArray(new lve[0]));
    }
}
