package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fw6 implements bw6 {
    public final List a;

    public fw6(List list) {
        this.a = list;
    }

    @Override // defpackage.bw6
    public final void a() {
        if (b()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bw6) it.next()).a();
        }
    }

    @Override // defpackage.bw6
    public final boolean b() {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((bw6) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bw6
    public final void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bw6) it.next()).c();
        }
    }

    @Override // defpackage.bw6
    public final void d() {
        if (b()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bw6) it.next()).d();
        }
    }

    @Override // defpackage.bw6
    public final void e() {
        if (b()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bw6) it.next()).e();
        }
    }
}
