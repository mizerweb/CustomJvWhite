package defpackage;

import android.database.Cursor;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ws3 extends wm5 {
    public final tw5 h;
    public final due i;
    public final String j = "clear_task";

    public ws3(tw5 tw5Var, due dueVar) {
        this.h = tw5Var;
        this.i = dueVar;
    }

    @Override // defpackage.exe
    public final Object e() {
        tw5 tw5Var = this.h;
        synchronized (tw5Var.g) {
            try {
                y95 y95Var = (y95) tw5Var.e;
                if (y95Var != null) {
                    ArrayList arrayList = new ArrayList();
                    y95Var.b();
                    x95 x95Var = new x95(y95Var.c(y95.g(new int[0]), null));
                    while (true) {
                        try {
                            Cursor cursor = x95Var.a;
                            if (!cursor.moveToPosition(cursor.getPosition() + 1)) {
                                break;
                            }
                            arrayList.add(y95.e(x95Var.a).a.a);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                rx8.n(x95Var, th);
                                throw th2;
                            }
                        }
                    }
                    x95Var.close();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        y95Var.k((String) it.next());
                    }
                }
                ConcurrentHashMap concurrentHashMap = k6g.a;
                k6g.b((File) ((q36) tw5Var.a).b, (r95) tw5Var.b);
                tw5Var.d = k6g.a((File) ((q36) tw5Var.a).b, (ez8) tw5Var.c, (r95) tw5Var.b);
            } catch (Exception e) {
                Log.e("DiskCache", "Failed to clear cache/index.", e);
            }
        }
        dfd dfdVar = (dfd) this.i.a;
        dfdVar.b.K(new cfd(dfdVar));
        return sbi.a;
    }

    @Override // defpackage.wm5
    public final String f() {
        return this.j;
    }
}
