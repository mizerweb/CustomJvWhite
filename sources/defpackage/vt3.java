package defpackage;

import android.os.SystemClock;
import java.util.List;
import one.me.chatscreen.ChatScreen;
import one.me.main.MainScreen;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.stories.edit.EditStoryScreen;
import one.me.stories.viewer.viewer.StoriesViewerScreen;
import one.me.transparent.TransparentWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class vt3 implements fr4 {
    public final /* synthetic */ int a;
    public final Object b;

    public vt3(br4 br4Var) {
        this.a = 0;
        this.b = br4Var.getInstanceId();
    }

    private final void a(br4 br4Var, br4 br4Var2, boolean z) {
    }

    private final void b(br4 br4Var, br4 br4Var2, boolean z) {
    }

    private final void c(br4 br4Var, br4 br4Var2, boolean z) {
    }

    private final void d(br4 br4Var, br4 br4Var2, boolean z) {
    }

    private final void e(br4 br4Var, br4 br4Var2, boolean z) {
    }

    private final void f(br4 br4Var, br4 br4Var2, boolean z) {
    }

    private final void g(br4 br4Var, br4 br4Var2, boolean z) {
    }

    @Override // defpackage.fr4
    public final void W0(br4 br4Var, br4 br4Var2, boolean z) {
        switch (this.a) {
            case 0:
                if (cqk.d(br4Var2 != null ? br4Var2.getInstanceId() : null, (String) this.b) && z) {
                    gm0.n(vt3.class.getName(), "Close controller:" + br4Var2.getClass().getName() + " after push new controller");
                    br4Var2.getRouter().C(br4Var2);
                    br4Var2.getRouter().M(this);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                EditStoryScreen editStoryScreen = (EditStoryScreen) this.b;
                if (br4Var2 != null && !br4Var2.equals(editStoryScreen) && cqk.d(br4Var, editStoryScreen)) {
                    if (editStoryScreen.getView() != null) {
                        zv8[] zv8VarArr = EditStoryScreen.A1;
                        editStoryScreen.y1().setVisibility(0);
                        editStoryScreen.x1().setDrawingLayersVisible(true);
                    }
                    zv8[] zv8VarArr2 = EditStoryScreen.A1;
                    mjg mjgVar = editStoryScreen.C1().H;
                    Boolean bool = Boolean.FALSE;
                    mjgVar.getClass();
                    mjgVar.j(null, bool);
                }
                if (cqk.d(br4Var2, editStoryScreen) && !cqk.d(br4Var, editStoryScreen) && !z) {
                    zv8[] zv8VarArr3 = EditStoryScreen.A1;
                    p26 p26VarC1 = editStoryScreen.C1();
                    p26VarC1.h.a();
                    xk2 xk2Var = p26VarC1.i;
                    xk2Var.a = null;
                    xk2Var.e();
                    mjg mjgVar2 = xk2Var.d;
                    List list = xk2Var.b;
                    mjgVar2.getClass();
                    mjgVar2.j(null, list);
                    break;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                if (cqk.d(br4Var2, (WebAppRootScreen) this.b) && !cqk.d(br4Var, (WebAppRootScreen) this.b)) {
                    qsj qsjVar = ((WebAppRootScreen) this.b).m;
                    String str = qsjVar.g;
                    owh owhVar = str != null ? new owh(str) : null;
                    String str2 = owhVar != null ? owhVar.a : null;
                    if (str2 != null && str2.length() != 0) {
                        qrc.o(qsjVar, psj.LEFT_BEFORE_INIT, str2, null, null, 28);
                        break;
                    } else {
                        String str3 = qsjVar.b;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str3, "Invoked 'left_before_init', but traceId is null or empty!", null);
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fr4
    public final void w(br4 br4Var, br4 br4Var2, boolean z) {
        boolean z2 = false;
        switch (this.a) {
            case 1:
                ChatScreen chatScreen = (ChatScreen) this.b;
                ou7 ou7Var = ChatScreen.L1;
                a8j.x(chatScreen.W1().i, aqa.a);
                if ((br4Var instanceof pbb) && !cqk.d(br4Var, chatScreen)) {
                    tbb.g(chatScreen.i, ((pbb) br4Var).o0());
                }
                if (!cqk.d(br4Var, chatScreen)) {
                    mvh mvhVar = chatScreen.n;
                    if (mvhVar != null) {
                        mvhVar.dismiss();
                    }
                    if (br4Var == 0 || (br4Var instanceof chb)) {
                        a8j.x(chatScreen.a2().f, hbe.a);
                    } else {
                        a8j.x(chatScreen.a2().f, ibe.a);
                    }
                    break;
                }
                break;
            case 2:
                EditStoryScreen editStoryScreen = (EditStoryScreen) this.b;
                if (cqk.d(br4Var2, editStoryScreen) && !z) {
                    zv8[] zv8VarArr = EditStoryScreen.A1;
                    editStoryScreen.D1(false);
                }
                if ((br4Var2 == null || (br4Var2.equals(editStoryScreen) && z)) && editStoryScreen.getView() != null) {
                    if (br4Var instanceof PhotoEditScreen) {
                        zv8[] zv8VarArr2 = EditStoryScreen.A1;
                        editStoryScreen.y1().setVisibility(8);
                    }
                    if (br4Var2 != null && !(br4Var instanceof BaseBottomSheetWidget)) {
                        zv8[] zv8VarArr3 = EditStoryScreen.A1;
                        editStoryScreen.x1().setDrawingLayersVisible(false);
                    }
                    if (br4Var2 != null) {
                        zv8[] zv8VarArr4 = EditStoryScreen.A1;
                        mjg mjgVar = editStoryScreen.C1().H;
                        Boolean bool = Boolean.TRUE;
                        mjgVar.getClass();
                        mjgVar.j(null, bool);
                        mvh mvhVar2 = editStoryScreen.I;
                        if (mvhVar2 != null) {
                            mvhVar2.dismiss();
                        }
                        editStoryScreen.I = null;
                    }
                }
                break;
            case 3:
                ProfileReactionsSettingsScreen profileReactionsSettingsScreen = (ProfileReactionsSettingsScreen) this.b;
                if (profileReactionsSettingsScreen.getView() != null) {
                    zv8[] zv8VarArr5 = ProfileReactionsSettingsScreen.p;
                    ((dc) profileReactionsSettingsScreen.m.m(profileReactionsSettingsScreen, ProfileReactionsSettingsScreen.p[4])).clearFocus();
                }
                break;
            case 4:
                ((o6g) this.b).dismiss();
                break;
            case 5:
                if (z && br4Var2 == ((StoriesViewerScreen) this.b)) {
                    z2 = true;
                } else if (br4Var != ((StoriesViewerScreen) this.b)) {
                }
                String str = ((StoriesViewerScreen) this.b).f;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        StringBuilder sbA = zo5.A("routerChangeListener: to=", br4Var != 0 ? br4Var.getClass().getSimpleName() : null, ", isPush=", ", covered=", z);
                        sbA.append(z2);
                        a4cVar.c(je9Var, str, sbA.toString(), null);
                    }
                }
                qt4.C(z2, ((StoriesViewerScreen) this.b).E1().o, null);
                break;
            case 6:
                x3i x3iVar = (x3i) this.b;
                if (!(br4Var2 instanceof TransparentWidget) && br4Var != 0) {
                    x3iVar.e().getClass();
                    if (br4Var instanceof MainScreen) {
                        x3iVar.h(SystemClock.elapsedRealtime());
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ vt3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
