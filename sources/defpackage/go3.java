package defpackage;

import one.me.android.root.RootController;
import one.me.chats.tab.ChatsTabWidget;
import org.apache.http.HttpStatus;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class go3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatsTabWidget b;

    public /* synthetic */ go3(ChatsTabWidget chatsTabWidget, int i) {
        this.a = i;
        this.b = chatsTabWidget;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0256  */
    /* JADX WARN: Code duplicated, block: B:92:0x02b4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [br4] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [br4] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r6v0, types: [br4, one.me.chats.tab.ChatsTabWidget, one.me.sdk.arch.Widget] */
    /* JADX WARN: Type inference failed for: r6v1, types: [br4] */
    /* JADX WARN: Type inference failed for: r6v10, types: [br4] */
    /* JADX WARN: Type inference failed for: r6v5, types: [br4] */
    /* JADX WARN: Type inference failed for: r6v6, types: [br4] */
    @Override // defpackage.af7
    public final Object invoke() {
        hve hveVarW1;
        lve lveVar;
        String str;
        lve lveVar2;
        String str2;
        int i = this.a;
        boolean z = false;
        ?? parentController = this.b;
        switch (i) {
            case 0:
                return (vi3) parentController.e.getAccessor().c(977);
            case 1:
                zv8[] zv8VarArr = ChatsTabWidget.B1;
                ?? parentController2 = parentController;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                RootController rootController = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 == null || !hveVarU1.o()) {
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController2 = parentController instanceof RootController ? (RootController) parentController : null;
                    hveVarW1 = rootController2 != null ? rootController2.w1() : null;
                    if (hveVarW1 != null && (lveVar = (lve) ww3.D1(hveVarW1.e())) != null && (str = lveVar.b) != null && !r5h.L0(str, ":chat-list", false)) {
                        z = true;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                zv8[] zv8VarArr2 = ChatsTabWidget.B1;
                ?? parentController3 = parentController;
                while (parentController3.getParentController() != null) {
                    parentController3 = parentController3.getParentController();
                }
                RootController rootController3 = parentController3 instanceof RootController ? (RootController) parentController3 : null;
                hve hveVarU2 = rootController3 != null ? rootController3.u1() : null;
                if (hveVarU2 == null || !hveVarU2.o()) {
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController4 = parentController instanceof RootController ? (RootController) parentController : null;
                    hveVarW1 = rootController4 != null ? rootController4.w1() : null;
                    if (hveVarW1 != null && (lveVar2 = (lve) ww3.D1(hveVarW1.e())) != null && (str2 = lveVar2.b) != null && !r5h.L0(str2, ":chat-list", false)) {
                        z = true;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                zv8[] zv8VarArr3 = ChatsTabWidget.B1;
                a8j.x(parentController.s1().e, si3.a);
                return sbi.a;
            case 4:
                zv8[] zv8VarArr4 = ChatsTabWidget.B1;
                return new lo3(parentController);
            case 5:
                zv8[] zv8VarArr5 = ChatsTabWidget.B1;
                boolean zBooleanValue = ((Boolean) parentController.y1().f().i()).booleanValue();
                ny8 ny8Var = parentController.t;
                if (zBooleanValue) {
                    av1 av1Var = (av1) ny8Var.getValue();
                    return new eo3(new go3(parentController, 1), av1Var.a, av1Var.b, new svj(parentController, 1), parentController.lifecycleOwner, av1Var.d, av1Var.c, av1Var.e);
                }
                av1 av1Var2 = (av1) ny8Var.getValue();
                return new ea2(av1Var2.a, av1Var2.b, new svj(parentController, 1), new go3(parentController, 2), parentController.lifecycleOwner, av1Var2.c);
            case 6:
                y67 y67Var = (y67) parentController.e.getAccessor().c(979);
                return new x67(y67Var.a, y67Var.b, y67Var.c, y67Var.d, y67Var.e, y67Var.f, y67Var.g, y67Var.h, y67Var.i, y67Var.j, y67Var.k, y67Var.l);
            case 7:
                ca2 ca2Var = parentController.e;
                return new ah3((in0) ca2Var.getAccessor().c(339), (jn0) ca2Var.getAccessor().c(335), ca2Var.c());
            case 8:
                jug jugVar = (jug) parentController.e.getAccessor().c(949);
                boolean zE1 = parentController.E1();
                gjg gjgVarH = parentController.y1().r().h();
                gjg gjgVarH2 = parentController.y1().O4.a(e5d.S6[302]).h();
                jugVar.getClass();
                return new iug(zE1, gjgVarH, gjgVarH2, jugVar.a, jugVar.b, jugVar.c, jugVar.d, jugVar.e, jugVar.f, jugVar.g, jugVar.h, jugVar.i, jugVar.j, jugVar.k);
            case 9:
                kvg kvgVar = (kvg) parentController.e.getAccessor().c(951);
                return new jvg(kvgVar.a, kvgVar.b, kvgVar.c, kvgVar.d, kvgVar.e, new pug());
            case 10:
                ca2 ca2Var2 = parentController.e;
                return new ps2(ca2Var2.d(), ca2Var2.getAccessor().d(85), ca2Var2.getAccessor().d(226), ca2Var2.e(), ca2Var2.getAccessor().d(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED), ca2Var2.getAccessor().d(180));
            case 11:
                Boolean bool = (Boolean) ((f5d) ((wo6) parentController.n.getValue())).a.L5.a(e5d.S6[351]).i();
                bool.getClass();
                return bool;
            default:
                ChatsTabWidget chatsTabWidget = this.b;
                t3f t3fVar = chatsTabWidget.a;
                ha9 ha9VarB = t3fVar.b();
                int i2 = chatsTabWidget.Z;
                int i3 = chatsTabWidget.n1;
                yad yadVar = new yad();
                yadVar.setMaxRecycledViews(R.id.chat_item_view_type, i2 * i3);
                yadVar.setMaxRecycledViews(R.id.chat_item_view_type_pinned, i3 * 5);
                double d = ((double) i2) * 1.5d;
                yadVar.setMaxRecycledViews(R.id.fake_chat_contact_item_view_type, gm0.J(d));
                yadVar.setMaxRecycledViews(R.id.fake_chat_phone_item_view_type, gm0.J(d));
                yadVar.setMaxRecycledViews(R.id.oneme_invite_action_view_type, 3);
                new c8b();
                return new n57(t3fVar, ha9VarB, chatsTabWidget, yadVar, null, new g3(11, chatsTabWidget), 32);
        }
    }
}
