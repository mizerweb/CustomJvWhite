package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h46 extends svl {
    public final /* synthetic */ i46 a;

    public h46(i46 i46Var) {
        this.a = i46Var;
    }

    @Override // defpackage.svl
    public final void b(Throwable th) {
        ((l46) this.a.a).d(th);
    }

    @Override // defpackage.svl
    public final void c(ljf ljfVar) {
        i46 i46Var = this.a;
        i46Var.c = ljfVar;
        ljf ljfVar2 = (ljf) i46Var.c;
        l46 l46Var = (l46) i46Var.a;
        ou7 ou7Var = l46Var.g;
        va5 va5Var = l46Var.i;
        Set<int[]> setA = Build.VERSION.SDK_INT >= 34 ? p46.a() : uvl.b();
        kr6 kr6Var = new kr6();
        kr6Var.a = ou7Var;
        kr6Var.b = ljfVar2;
        kr6Var.c = va5Var;
        if (!setA.isEmpty()) {
            for (int[] iArr : setA) {
                String str = new String(iArr, 0, iArr.length);
                kr6Var.K(str, 0, str.length(), 1, true, new qd2(str, false));
            }
        }
        i46Var.b = kr6Var;
        l46 l46Var2 = (l46) i46Var.a;
        ArrayList arrayList = new ArrayList();
        l46Var2.a.writeLock().lock();
        try {
            l46Var2.c = 1;
            arrayList.addAll(l46Var2.b);
            l46Var2.b.clear();
            l46Var2.a.writeLock().unlock();
            l46Var2.d.post(new v72(arrayList, l46Var2.c, (Throwable) null));
        } catch (Throwable th) {
            l46Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
