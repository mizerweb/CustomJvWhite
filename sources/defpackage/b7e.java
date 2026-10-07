package defpackage;

import android.graphics.Rect;
import android.util.Size;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class b7e extends afe {
    public final RecyclerView a;
    public final e6e b;
    public final ch8 c;
    public final String d = b7e.class.getName();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedList f = new LinkedList();
    public boolean g;

    public b7e(k96 k96Var, e6e e6eVar, ch8 ch8Var) {
        this.a = k96Var;
        this.b = e6eVar;
        this.c = ch8Var;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    public static final void c(b7e b7eVar, String str, long j, Rect rect) {
        long j2;
        String str2 = b7eVar.d;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            j2 = j;
        } else {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                j2 = j;
                a4cVar.c(je9Var, str2, zo5.j(j2, "Play message "), null);
            } else {
                j2 = j;
            }
        }
        RLottieFactory rLottieFactory = RLottieFactory.INSTANCE;
        Size size = n6e.b;
        RLottieDrawable rLottieDrawableCreateByUrl$default = RLottieFactory.createByUrl$default(str, gm0.K(size.getWidth() * yl5.d().getDisplayMetrics().density), gm0.K(size.getHeight() * yl5.d().getDisplayMetrics().density), false, false, true, false, true, false, 72, null);
        rLottieDrawableCreateByUrl$default.setAutoRepeat(0);
        e6e.a(b7eVar.b, j2, rLottieDrawableCreateByUrl$default, rect, 16);
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.b.setScrollOffset(-i2);
        if (!this.g) {
            f(false);
        } else {
            this.g = false;
            bdc.a(recyclerView, new rda(9, recyclerView, this));
        }
    }

    public final void d(long j, s5e s5eVar, String str) {
        String str2 = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "Add reaction effect, reaction:" + ((Object) s5eVar) + ", " + j, null);
            }
        }
        this.e.add(new y6e(j, s5eVar, str));
    }

    public final boolean e(int i) {
        RecyclerView recyclerView = this.a;
        LinearLayoutManager linearLayoutManagerE0 = tre.e0(recyclerView);
        int iX0 = linearLayoutManagerE0 != null ? linearLayoutManagerE0.X0() : -1;
        LinearLayoutManager linearLayoutManagerE1 = tre.e0(recyclerView);
        return i == -1 || iX0 > i || i > (linearLayoutManagerE1 != null ? linearLayoutManagerE1.Z0() : -1);
    }

    public final void f(boolean z) {
        long jLongValue;
        lfe lfeVarL;
        Object next;
        LinkedList linkedList = this.f;
        Long l = (Long) linkedList.peek();
        if (l == null || (lfeVarL = this.a.L((jLongValue = l.longValue()))) == null) {
            return;
        }
        Iterator it = this.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((y6e) next).a != jLongValue);
        y6e y6eVar = (y6e) next;
        if (y6eVar == null) {
            linkedList.remove(l);
        } else {
            RecyclerView recyclerView = this.a;
            bdc.a(recyclerView, new z6e(recyclerView, this, lfeVarL, jLongValue, y6eVar, z));
        }
    }
}
