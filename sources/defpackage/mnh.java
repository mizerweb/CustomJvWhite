package defpackage;

import android.text.Layout;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class mnh {
    public ifh a;
    public final bx5 b;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();

    public mnh(ifh ifhVar, bx5 bx5Var) {
        this.a = ifhVar;
        this.b = bx5Var;
    }

    public final Layout a() {
        return (Layout) this.a.getValue();
    }

    public final void b(Layout layout) {
        this.a = new ifh(new xlf(4, layout));
        for (qfb qfbVar : this.c) {
            rfb rfbVar = qfbVar.a;
            rfbVar.post(new d86(rfbVar, qfbVar.b, this, 18));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnh) && a() == ((mnh) obj).a();
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
