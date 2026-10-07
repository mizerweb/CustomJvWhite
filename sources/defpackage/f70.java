package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f70 {
    public List a;
    public kg8 b;
    public kke c;

    public final void a(e70 e70Var) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(e70Var);
    }

    public final int b() {
        List list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final c46 c() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return new c46(this);
    }

    public final e70 d(int i) {
        if (i >= 0 && i < b()) {
            return (e70) this.a.get(i);
        }
        ore.p("index < 0 or index >= attaches.size()");
        return null;
    }

    public final void e(int i, e70 e70Var) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (i < 0 || i >= b()) {
            ore.p("index < 0 or index >= attaches.size()");
        } else {
            this.a.set(i, e70Var);
        }
    }
}
