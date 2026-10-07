package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import one.me.chats.list.ChatsListWidget;

/* JADX INFO: loaded from: classes.dex */
public final class v66 extends pee {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v66(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pee
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((w66) obj).F0();
                break;
            case 1:
                ChatsListWidget.o1((ChatsListWidget) obj);
                break;
            case 2:
                ybb ybbVar = (ybb) obj;
                ybbVar.e = ybbVar.c.l();
                t84 t84Var = ybbVar.d;
                ((r84) t84Var.e).o();
                t84Var.d();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.G1.g = true;
                recyclerView.j0(true);
                if (!recyclerView.e.s()) {
                    recyclerView.requestLayout();
                }
                break;
        }
    }

    @Override // defpackage.pee
    public void b(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 1:
                ChatsListWidget.o1((ChatsListWidget) obj);
                break;
            case 2:
                ybb ybbVar = (ybb) obj;
                t84 t84Var = ybbVar.d;
                ((r84) t84Var.e).q(i + t84Var.e(ybbVar), i2, null);
                break;
        }
    }

    @Override // defpackage.pee
    public void c(int i, int i2, Object obj) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 1:
                ChatsListWidget.o1((ChatsListWidget) obj2);
                break;
            case 2:
                ybb ybbVar = (ybb) obj2;
                t84 t84Var = ybbVar.d;
                ((r84) t84Var.e).q(i + t84Var.e(ybbVar), i2, obj);
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) obj2;
                recyclerView.l(null);
                ma maVar = recyclerView.e;
                ArrayList arrayList = (ArrayList) maVar.c;
                if (i2 >= 1) {
                    arrayList.add(maVar.v(obj, 4, i, i2));
                    maVar.a |= 4;
                    if (arrayList.size() == 1) {
                        h();
                    }
                    break;
                }
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
                String name = v66.class.getName();
                w66 w66Var = (w66) this.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.s("onItemRangeInserted start. isComputingLayout:", w66Var.Y()), null);
                }
                ((w66) this.b).F0();
                String name2 = v66.class.getName();
                w66 w66Var2 = (w66) this.b;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, name2, zo5.s("onItemRangeInserted end. isComputingLayout:", w66Var2.Y()), null);
                }
                break;
            case 1:
                ChatsListWidget.o1((ChatsListWidget) this.b);
                break;
            case 2:
                ybb ybbVar = (ybb) this.b;
                ybbVar.e += i2;
                t84 t84Var = ybbVar.d;
                ((r84) t84Var.e).r(i + t84Var.e(ybbVar), i2);
                if (ybbVar.e > 0 && ybbVar.c.c == 2) {
                    t84Var.d();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ma maVar = recyclerView.e;
                ArrayList arrayList = (ArrayList) maVar.c;
                if (i2 >= 1) {
                    arrayList.add(maVar.v(null, 1, i, i2));
                    maVar.a |= 1;
                    if (arrayList.size() == 1) {
                        h();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pee
    public void e(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 1:
                ChatsListWidget.o1((ChatsListWidget) obj);
                break;
            case 2:
                ybb ybbVar = (ybb) obj;
                t84 t84Var = ybbVar.d;
                int iE = t84Var.e(ybbVar);
                ((r84) t84Var.e).p(i + iE, i2 + iE);
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ma maVar = recyclerView.e;
                ArrayList arrayList = (ArrayList) maVar.c;
                if (i != i2) {
                    arrayList.add(maVar.v(null, 8, i, i2));
                    maVar.a |= 8;
                    if (arrayList.size() == 1) {
                        h();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pee
    public final void f(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((w66) obj).F0();
                break;
            case 1:
                ChatsListWidget.o1((ChatsListWidget) obj);
                break;
            case 2:
                ybb ybbVar = (ybb) obj;
                ybbVar.e -= i2;
                t84 t84Var = ybbVar.d;
                ((r84) t84Var.e).s(i + t84Var.e(ybbVar), i2);
                if (ybbVar.e < 1 && ybbVar.c.c == 2) {
                    t84Var.d();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ma maVar = recyclerView.e;
                ArrayList arrayList = (ArrayList) maVar.c;
                if (i2 >= 1) {
                    arrayList.add(maVar.v(null, 2, i, i2));
                    maVar.a |= 2;
                    if (arrayList.size() == 1) {
                        h();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pee
    public void g() {
        nee neeVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ChatsListWidget.o1((ChatsListWidget) obj);
                break;
            case 2:
                ((ybb) obj).d.d();
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) obj;
                if (recyclerView.d != null && (neeVar = recyclerView.m) != null) {
                    int iD = qt4.D(neeVar.c);
                    if (iD != 1) {
                        if (iD == 2) {
                        }
                    } else if (neeVar.l() <= 0) {
                    }
                    recyclerView.requestLayout();
                }
                break;
        }
    }

    public void h() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!RecyclerView.e2 || !recyclerView.t || !recyclerView.s) {
            recyclerView.A = true;
            recyclerView.requestLayout();
        } else {
            lee leeVar = recyclerView.i;
            WeakHashMap weakHashMap = i7j.a;
            recyclerView.postOnAnimation(leeVar);
        }
    }
}
