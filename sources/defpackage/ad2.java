package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ad2 extends zc2 {
    public final /* synthetic */ int a;
    public final Object b;

    public ad2(List list) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zc2 zc2Var = (zc2) it.next();
            if (!(zc2Var instanceof bd2)) {
                ((ArrayList) this.b).add(zc2Var);
            }
        }
    }

    @Override // defpackage.zc2
    public void a(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((zc2) it.next()).a(i);
                }
                break;
        }
    }

    @Override // defpackage.zc2
    public void b(int i, gd2 gd2Var) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((zc2) it.next()).b(i, gd2Var);
                }
                return;
            case 1:
            default:
                return;
            case 2:
                qwa qwaVar = (qwa) this.b;
                synchronized (qwaVar.a) {
                    try {
                        if (qwaVar.e) {
                            return;
                        }
                        qwaVar.i.put(gd2Var.getTimestamp(), new hd2(gd2Var));
                        qwaVar.h();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 3:
                faj fajVar = (faj) ((WeakReference) this.b).get();
                if (fajVar != null) {
                    Iterator it2 = fajVar.a.iterator();
                    while (it2.hasNext()) {
                        lmf lmfVar = ((cli) it2.next()).s;
                        Iterator it3 = lmfVar.g.d.iterator();
                        while (it3.hasNext()) {
                            ((zc2) it3.next()).b(i, new t28(gd2Var, lmfVar.g.e, -1L));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.zc2
    public void c(int i, zpe zpeVar) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((zc2) it.next()).c(i, zpeVar);
                }
                break;
        }
    }

    @Override // defpackage.zc2
    public void d(int i, int i2) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((zc2) it.next()).d(i, i2);
                }
                break;
            case 1:
                zjl.d().execute(new ai(this, i2, 6));
                break;
        }
    }

    @Override // defpackage.zc2
    public void e(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((zc2) it.next()).e(i);
                }
                break;
            case 1:
                zjl.d().execute(new jj2(1, this));
                break;
        }
    }

    public ad2(faj fajVar) {
        this.a = 3;
        this.b = new WeakReference(fajVar);
    }

    public /* synthetic */ ad2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
