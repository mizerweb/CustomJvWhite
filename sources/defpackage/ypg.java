package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class ypg extends pee {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ypg(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.pee
    public void a() {
        switch (this.a) {
            case 0:
                zpg.i((zpg) this.b);
                break;
        }
    }

    @Override // defpackage.pee
    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                zpg.i((zpg) this.b);
                break;
        }
    }

    @Override // defpackage.pee
    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                zpg.i((zpg) this.b);
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    @Override // defpackage.pee
    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                je9 je9Var = je9.d;
                String name = ypg.class.getName();
                RecyclerView recyclerView = (RecyclerView) this.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.s("onItemRangeInserted start. isComputingLayout:", recyclerView.Y()), null);
                }
                zpg.i((zpg) this.b);
                String name2 = ypg.class.getName();
                RecyclerView recyclerView2 = (RecyclerView) this.c;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, name2, zo5.s("onItemRangeInserted end. isComputingLayout:", recyclerView2.Y()), null);
                }
                break;
            default:
                NeuroAvatarsScreen neuroAvatarsScreen = (NeuroAvatarsScreen) this.b;
                if (i2 != 0 && neuroAvatarsScreen.x.N(i) != null) {
                    neuroAvatarsScreen.s1().G();
                    ((nee) this.c).E(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pee
    public void e(int i, int i2) {
        switch (this.a) {
            case 0:
                zpg.i((zpg) this.b);
                break;
        }
    }

    @Override // defpackage.pee
    public void f(int i, int i2) {
        switch (this.a) {
            case 0:
                zpg.i((zpg) this.b);
                break;
        }
    }
}
