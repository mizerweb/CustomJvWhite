package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k68 {
    public static final ny8 d = rx8.P(1, new j68(0));
    public int a;
    public ArrayList b;
    public final jb5 c = new jb5();

    public k68() {
        a();
    }

    public final void a() {
        this.a = this.c.a;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.a = Math.max(this.a, ((h68) it.next()).b());
            }
        }
    }
}
