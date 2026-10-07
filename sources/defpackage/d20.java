package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d20 {
    public static final c20 h = new c20(0);
    public final a89 a;
    public final ki3 b;
    public final Executor c;
    public List e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.EMPTY_LIST;

    public d20(a89 a89Var, ki3 ki3Var) {
        this.a = a89Var;
        this.b = ki3Var;
        Executor executor = (Executor) ki3Var.a;
        if (executor != null) {
            this.c = executor;
        } else {
            this.c = h;
        }
    }

    public final void a(List list, Runnable runnable) {
        for (x69 x69Var : this.d) {
            x69Var.a.G(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f;
        a89 a89Var = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            a89Var.d(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            ((Executor) this.b.b).execute(new b20(this, list2, list, i, runnable));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        a89Var.b(0, list.size());
        a(list3, runnable);
    }
}
