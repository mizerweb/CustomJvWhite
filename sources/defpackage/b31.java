package defpackage;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class b31 {
    public final int a;
    public final int b;
    public final LinkedList c;
    public int d;

    public b31(int i, int i2, int i3) {
        oc9.r(i > 0);
        oc9.r(i2 >= 0);
        oc9.r(i3 >= 0);
        this.a = i;
        this.b = i2;
        this.c = new LinkedList();
        this.d = i3;
    }

    public void a(Object obj) {
        this.c.add(obj);
    }

    public Object b() {
        return this.c.poll();
    }
}
