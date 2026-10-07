package defpackage;

import java.util.ArrayList;
import one.me.android.root.RootController;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class occ extends fg7 implements af7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public occ(rcc rccVar) {
        super(0, 0, rcc.class, rccVar, "restoreViews", "restoreViews()V");
        this.a = 0;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        hve hveVarU1;
        int i = this.a;
        int i2 = 0;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((rcc) this.receiver).r();
                return sbiVar;
            case 1:
                ((z8d) this.receiver).a();
                return sbiVar;
            case 2:
                br4 parentController = ((ej3) this.receiver).a;
                ml9.b(parentController);
                zv8[] zv8VarArr = BottomSheetWidget.t;
                ClearRecentSearchBottomSheet clearRecentSearchBottomSheet = new ClearRecentSearchBottomSheet();
                clearRecentSearchBottomSheet.setTargetController(parentController);
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(clearRecentSearchBottomSheet, null, null, null, false, -1);
                    p.k(false, lveVar, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar);
                }
                return sbiVar;
            case 3:
                bpf bpfVar = (bpf) this.receiver;
                ic6 ic6Var = bpfVar.z;
                if (((ivf) bpfVar.B.getValue()).b == null) {
                    a8j.x(ic6Var, guf.b);
                } else {
                    Long lE = bpfVar.E();
                    if (lE != null) {
                        a8j.x(ic6Var, new luf(lE.longValue()));
                    }
                }
                return sbiVar;
            case 4:
                bpf bpfVar2 = (bpf) this.receiver;
                dq4 dq4Var = bpfVar2.b;
                xt4 xt4VarA = ((n0c) bpfVar2.D()).a();
                yt4 yt4VarC = bpfVar2.C();
                xt4VarA.getClass();
                yab.i0(dq4Var, lvb.x0(xt4VarA, yt4VarC), 0, new apf(bpfVar2, null, 0), 2);
                return sbiVar;
            case 5:
                bpf bpfVar3 = (bpf) this.receiver;
                dq4 dq4Var2 = bpfVar3.b;
                xt4 xt4VarA2 = ((n0c) bpfVar3.D()).a();
                yt4 yt4VarC2 = bpfVar3.C();
                xt4VarA2.getClass();
                yab.i0(dq4Var2, lvb.x0(xt4VarA2, yt4VarC2), 0, new apf(bpfVar3, null, 1), 2);
                return sbiVar;
            case 6:
                k8g k8gVar = (k8g) this.receiver;
                k8gVar.getClass();
                int iK = gm0.K(1.0f * yl5.d().getDisplayMetrics().density);
                float[] fArrA = ((fea) k8gVar.getBackground()).a();
                ArrayList arrayList = new ArrayList(fArrA.length);
                int length = fArrA.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    arrayList.add(Float.valueOf((!n7j.o((ny8) k8gVar.b.b) || i3 >= 4) ? Math.max(0.0f, fArrA[i2] - iK) : 0.0f));
                    i2++;
                    i3 = i4;
                }
                return ww3.Q1(arrayList);
            case 7:
                l8g l8gVar = (l8g) this.receiver;
                l8gVar.getClass();
                int iK2 = gm0.K(1.0f * yl5.d().getDisplayMetrics().density);
                h8g h8gVar = (h8g) l8gVar.getModel();
                boolean z = h8gVar != null && h8gVar.e;
                float[] fArrA2 = ((fea) l8gVar.getBackground()).a();
                ArrayList arrayList2 = new ArrayList(fArrA2.length);
                int length2 = fArrA2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = i6 + 1;
                    arrayList2.add(Float.valueOf(((!z ? i6 < 4 : i6 >= 4) || (n7j.o((ny8) l8gVar.getMessageLinkDelegate().b) && i6 < 4)) ? 0.0f : Math.max(0.0f, fArrA2[i5] - iK2)));
                    i5++;
                    i6 = i7;
                }
                return ww3.Q1(arrayList2);
            case 8:
                zw8 zw8Var = (zw8) this.receiver;
                zw8Var.getClass();
                o65.c(rw8.b.b(), zo5.j(zw8Var.b.getLong("arg_key_chat_id"), ":stickers/search?chat_id="), null, null, 6);
                return sbiVar;
            case 9:
                KeyboardStickersWidget keyboardStickersWidget = ((zw8) this.receiver).a;
                zv8[] zv8VarArr2 = KeyboardStickersWidget.l;
                zv8[] zv8VarArr3 = BottomSheetWidget.t;
                jc4 jc4VarC = p.c(R.string.oneme_media_keyboard_recent_clear_title, null, null, 6);
                jc4VarC.a(new kc4(R.id.oneme_media_keyboard_recent_clear_confirmation_action, new tnh(R.string.oneme_media_keyboard_recent_clear_action), 1, 56), new kc4(R.id.oneme_media_keyboard_recent_clear_confirmation_cancel, new tnh(R.string.oneme_media_keyboard_recent_clear_cancel), 2, 56));
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(keyboardStickersWidget);
                confirmationBottomSheetF.setTargetController(keyboardStickersWidget);
                br4 parentController2 = keyboardStickersWidget;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar2 = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                    p.k(false, lveVar2, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar2);
                }
                return sbiVar;
            case 10:
                ((zw8) this.receiver).a();
                return sbiVar;
            case 11:
                wmg wmgVar = (wmg) this.receiver;
                switch (wmgVar.a) {
                    case 0:
                        ((zw8) ((nj1) wmgVar.b).h).a();
                    default:
                        return sbiVar;
                }
                break;
            case 12:
                oeh oehVar = (oeh) this.receiver;
                oehVar.h = false;
                oehVar.i = -1.0f;
                oehVar.j = -1.0f;
                return sbiVar;
            case 13:
                UserStoriesScreen userStoriesScreen = (UserStoriesScreen) this.receiver;
                zv8[] zv8VarArr4 = UserStoriesScreen.x1;
                if (userStoriesScreen.getView() != null) {
                    g8c g8cVar = userStoriesScreen.q1;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    h8c h8cVar = new h8c(userStoriesScreen);
                    h8cVar.m(new tnh(R.string.error_no_browser));
                    h8cVar.a(new tnh(R.string.error_no_browser_desc));
                    h8cVar.h(new w8c(R.drawable.icon_warning));
                    h8cVar.c(userStoriesScreen.N1());
                    userStoriesScreen.q1 = h8cVar.p();
                }
                return sbiVar;
            case 14:
                ((cch) this.receiver).close();
                return sbiVar;
            case 15:
                rej rejVarC = ((ioj) this.receiver).C();
                yab.i0(rejVarC.c, null, 0, new hpf(rejVarC, null, 26), 3);
                return sbiVar;
            case 16:
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.receiver;
                zv8[] zv8VarArr5 = WebAppRootScreen.G;
                return webAppRootScreen.E1();
            case 17:
                ((cpj) this.receiver).getClass();
                return sbiVar;
            case 18:
                ((Runnable) this.receiver).run();
                return sbiVar;
            case 19:
                return y5g.access$getOriginalEndpoint((y5g) this.receiver);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((y5g) this.receiver).i.f;
            case 21:
                return Boolean.valueOf(ew6.a((ew6) this.receiver));
            case 22:
                return Boolean.valueOf(ew6.a((ew6) this.receiver));
            case 23:
                return Boolean.valueOf(ew6.a((ew6) this.receiver));
            case 24:
                return Boolean.valueOf(ew6.a((ew6) this.receiver));
            default:
                return Integer.valueOf(((ru1) this.receiver).u());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ occ(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }
}
