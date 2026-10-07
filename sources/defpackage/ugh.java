package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ugh {
    public int a;
    public View b;
    public xgh c;
    public wgh d;

    public final void a() {
        xgh xghVar = this.c;
        if (xghVar != null) {
            xghVar.n(this, true);
        } else {
            ore.p("Tab not attached to a TabLayout");
        }
    }

    public final void b(ViewGroup viewGroup) {
        this.b = viewGroup;
        c();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0022  */
    public final void c() {
        boolean z;
        wgh wghVar = this.d;
        if (wghVar != null) {
            wghVar.e();
            ugh ughVar = wghVar.a;
            if (ughVar == null) {
                z = false;
            } else {
                xgh xghVar = ughVar.c;
                if (xghVar == null) {
                    ore.p("Tab not attached to a TabLayout");
                    return;
                }
                int selectedTabPosition = xghVar.getSelectedTabPosition();
                if (selectedTabPosition == -1 || selectedTabPosition != ughVar.a) {
                    z = false;
                } else {
                    z = true;
                }
            }
            wghVar.setSelected(z);
        }
    }
}
