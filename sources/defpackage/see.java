package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class see {
    public w4 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void a(lfe lfeVar) {
        int i = lfeVar.j;
        if (!lfeVar.q() && (i & 4) == 0) {
            lfeVar.k();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0082, please report this as an issue */
    public final void b(lfe lfeVar) {
        w4 w4Var = this.a;
        if (w4Var != null) {
            RecyclerView recyclerView = (RecyclerView) w4Var.a;
            boolean z = true;
            lfeVar.y(true);
            View view = lfeVar.a;
            if (lfeVar.h != null && lfeVar.i == null) {
                lfeVar.h = null;
            }
            lfeVar.i = null;
            if ((lfeVar.j & 16) != 0) {
                return;
            }
            recyclerView.B0();
            vyh vyhVar = recyclerView.f;
            xp3 xp3Var = (xp3) vyhVar.d;
            p3c p3cVar = (p3c) vyhVar.c;
            int i = vyhVar.b;
            if (i != 1) {
                if (i == 2) {
                    ore.k("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    vyhVar.b = 2;
                    int iIndexOfChild = ((RecyclerView) p3cVar.b).indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        vyhVar.L(view);
                    } else if (xp3Var.d(iIndexOfChild)) {
                        xp3Var.g(iIndexOfChild);
                        vyhVar.L(view);
                        p3cVar.q(iIndexOfChild);
                    } else {
                        vyhVar.b = 0;
                    }
                    vyhVar.b = 0;
                    if (z) {
                        lfe lfeVarT = RecyclerView.T(view);
                        recyclerView.c.l(lfeVarT);
                        recyclerView.c.i(lfeVarT);
                        if (RecyclerView.a2) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.C0(!z);
                    if (z && lfeVar.u()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    vyhVar.b = 0;
                    throw th;
                }
            }
            if (((View) vyhVar.f) != view) {
                ore.k("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
                lfe lfeVarT2 = RecyclerView.T(view);
                recyclerView.c.l(lfeVarT2);
                recyclerView.c.i(lfeVarT2);
                if (RecyclerView.a2) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.C0(!z);
            if (z) {
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            ore.m();
        }
    }

    public abstract void d(lfe lfeVar);

    public abstract void e();

    public long f() {
        return this.e;
    }

    public abstract boolean g();

    public abstract void h();
}
