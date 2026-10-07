package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import one.me.rlottie.RLottie;

/* JADX INFO: loaded from: classes3.dex */
public final class rn5 {
    public static ArrayList j;
    public static rn5 k;
    public static final ArrayList l = new ArrayList();
    public static final qn5 m = new qn5(0);
    public final int d;
    public int e;
    public int g;
    public boolean h;
    public final ArrayList a = new ArrayList(10);
    public final SparseIntArray b = new SparseIntArray();
    public final ArrayList c = new ArrayList(10);
    public final pi i = new pi(13, this);
    public final int f = pn5.j.nextInt();

    public rn5(int i) {
        this.d = i;
    }

    public static void a(Runnable runnable, boolean z) {
        if (!di.b()) {
            RLottie.getLogger().h(new RuntimeException("wrong thread"));
            return;
        }
        ArrayList arrayList = j;
        qn5 qn5Var = m;
        if (arrayList == null) {
            ArrayList arrayList2 = l;
            if (arrayList2.isEmpty()) {
                j = new ArrayList(100);
            } else {
                j = (ArrayList) arrayList2.remove(arrayList2.size() - 1);
            }
            if (!z) {
                di.d(qn5Var);
            }
        }
        j.add(runnable);
        if (z) {
            di.a.removeCallbacks(qn5Var);
            qn5Var.run();
        }
    }
}
