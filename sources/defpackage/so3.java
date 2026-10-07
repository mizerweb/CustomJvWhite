package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chats.tab.StoriesAppBarBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class so3 extends t8j {
    public final /* synthetic */ int a;
    public final Object b;

    public so3() {
        this.a = 1;
        this.b = new ArrayList(3);
    }

    @Override // defpackage.t8j
    public void h(int i) {
        switch (this.a) {
            case 1:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((t8j) it.next()).h(i);
                    }
                } catch (ConcurrentModificationException e) {
                    ore.l("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
        }
    }

    @Override // defpackage.t8j
    public void i(int i, float f, int i2) {
        switch (this.a) {
            case 1:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((t8j) it.next()).i(i, f, i2);
                    }
                } catch (ConcurrentModificationException e) {
                    ore.l("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
        }
    }

    @Override // defpackage.t8j
    public final void j(int i) {
        rs2 rs2Var;
        r17 r17VarK;
        lve lveVar;
        StoriesAppBarBehavior storiesAppBarBehaviorZ1;
        rq rqVar;
        switch (this.a) {
            case 0:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                zv8[] zv8VarArr = ChatsTabWidget.B1;
                a8j.x(chatsTabWidget.s1().e, si3.a);
                ((ChatsTabWidget) this.b).t1().B();
                if (((ChatsTabWidget) this.b).E1() && (storiesAppBarBehaviorZ1 = ((ChatsTabWidget) this.b).z1()) != null) {
                    pqg pqgVar = (pqg) storiesAppBarBehaviorZ1.w.getValue();
                    pqgVar.getClass();
                    if ((pqgVar == pqg.a || pqgVar == pqg.b || pqgVar == pqg.f) && (rqVar = storiesAppBarBehaviorZ1.s) != null) {
                        rqVar.g(false, true, true);
                    }
                }
                if (((Number) ((ChatsTabWidget) this.b).D1().p.a.getValue()).intValue() != i) {
                    String str = ((ChatsTabWidget) this.b).g;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.h(i, "ONEME-6453|chats_list_lf | tabs page selected, pos:"), null);
                        }
                    }
                    ((tbb) ((ChatsTabWidget) this.b).G.getValue()).f(y3f.CHATS_LIST_TAB, lmc.a(((ChatsTabWidget) this.b).u0(), 0, 125));
                    ChatsTabWidget.p1((ChatsTabWidget) this.b, i);
                    ((ChatsTabWidget) this.b).u1().L(i);
                    hve hveVarI = ((ChatsTabWidget) this.b).u1().I(i);
                    br4 br4Var = (hveVarI == null || (lveVar = (lve) ww3.t1(hveVarI.e())) == null) ? null : lveVar.a;
                    ChatsListWidget chatsListWidget = br4Var instanceof ChatsListWidget ? (ChatsListWidget) br4Var : null;
                    if (chatsListWidget != null) {
                        rl3 rl3VarT1 = chatsListWidget.t1();
                        if (((f5d) ((wo6) rl3VarT1.l.getValue())).o() && (r17VarK = rl3VarT1.K()) != null && r17VarK.s) {
                            yab.i0(rl3VarT1.b, null, 0, new sk3(1, rl3VarT1, null), 3);
                        }
                    }
                }
                mjg mjgVar = ((ChatsTabWidget) this.b).D1().o;
                Integer numValueOf = Integer.valueOf(i);
                mjgVar.getClass();
                mjgVar.j(null, numValueOf);
                q37 q37Var = (q37) ww3.u1(i, (List) ((ChatsTabWidget) this.b).D1().n.a.getValue());
                String str2 = q37Var != null ? q37Var.a : null;
                if (str2 != null && (rs2Var = ((ChatsTabWidget) this.b).X) != null) {
                    oub oubVar = rs2Var.a;
                    if (rs2Var.h()) {
                        ps2 ps2Var = (ps2) oubVar;
                        ps2Var.getClass();
                        if (str2.equals("chat.channel.folder")) {
                            rs2Var.b(true);
                            ps2Var.f();
                        }
                    }
                    break;
                }
                break;
            case 1:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((t8j) it.next()).j(i);
                    }
                } catch (ConcurrentModificationException e) {
                    ore.l("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
            default:
                mz4 mz4Var = (mz4) this.b;
                SparseArray sparseArray = mz4Var.h;
                hve hveVar = (hve) sparseArray.get(i);
                int i2 = mz4Var.i;
                if (i != i2) {
                    hve hveVar2 = (hve) sparseArray.get(i2);
                    if (hveVar2 != null) {
                        Iterator it2 = hveVar2.e().iterator();
                        while (it2.hasNext()) {
                            ((lve) it2.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (hveVar != null) {
                        Iterator it3 = hveVar.e().iterator();
                        while (it3.hasNext()) {
                            ((lve) it3.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    mz4Var.i = i;
                }
                break;
        }
    }

    public /* synthetic */ so3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
