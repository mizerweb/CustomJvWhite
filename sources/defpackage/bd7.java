package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bd7 {
    public static final h40 i;
    public final long a;
    public final long b;
    public final long c;
    public final yc7 d;
    public final c79 e;
    public final i40 f;
    public final g40 g;
    public final CopyOnWriteArrayList h;

    static {
        h40 h40Var = new h40();
        h40Var.a = 0L;
        i = h40Var;
    }

    public bd7(jme jmeVar, long j, long j2, Set set) {
        Object next;
        this.a = j;
        this.b = j2;
        h40 h40Var = i;
        h40Var.getClass();
        this.c = h40.b.incrementAndGet(h40Var);
        this.d = new yc7(this);
        c79 c79VarW = yab.w();
        Iterator it = jmeVar.t0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i2 = ((j4h) it.next()).a;
            Iterator it2 = set.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((bi2) next).a != i2);
            bi2 bi2Var = (bi2) next;
            if (bi2Var != null) {
                ArrayList arrayList = bi2Var.b;
                g40 g40VarB = gvk.b(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    c79VarW.add(new zc7(this, i2, ((h4h) arrayList.get(i3)).a, g40VarB));
                }
            }
        }
        c79 c79VarJ = yab.j(c79VarW);
        this.e = c79VarJ;
        this.f = gvk.c(ad7.a);
        ArrayList arrayList2 = new ArrayList(yw3.W0(c79VarJ, 10));
        ListIterator listIterator = c79VarJ.listIterator(0);
        while (true) {
            b79 b79Var = (b79) listIterator;
            if (!b79Var.hasNext()) {
                this.g = gvk.b(ww3.k1(arrayList2).size());
                this.h = new CopyOnWriteArrayList();
                return;
            }
            arrayList2.add(new j4h(((zc7) b79Var.next()).c));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame-");
        sb.append((Object) ("FrameId(value=" + this.c + ')'));
        sb.append('(');
        sb.append(this.a);
        sb.append('@');
        return zo5.u(sb, this.b, ')');
    }
}
