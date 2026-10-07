package defpackage;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import one.me.android.root.RootController;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.contactadddialog.ContactAddBottomSheet;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;
import one.me.devmenu.utils.FeatureValueInfoBottomSheet;
import one.me.folders.edit.FolderEditScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import one.me.stories.edit.EditStoryScreen;
import one.me.stories.edit.link.AddStoryLinkBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r4v1, types: [hve] */
    /* JADX WARN: Type inference failed for: r4v2, types: [hve] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, InvocationTargetException {
        vd2 vd2Var;
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        ?? U1 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((v8) obj).a0();
                break;
            case 1:
                AddChatMembersScreen addChatMembersScreen = (AddChatMembersScreen) obj;
                zv8[] zv8VarArr = AddChatMembersScreen.r;
                boolean z = ((za) addChatMembersScreen.x1().d).i;
                int i4 = R.id.profile_add_members_show_history_positive_action;
                if (!z) {
                    zv8[] zv8VarArr2 = BottomSheetWidget.t;
                    jc4 jc4VarC = p.c(R.string.dlg_add_participants_show_history_message, null, null, 6);
                    int i5 = 56;
                    jc4VarC.a(new kc4(i4, new tnh(R.string.dlg_add_participants_show_history_positive), i2, i5));
                    jc4VarC.a(new kc4(R.id.profile_add_members_show_history_negative_action, new tnh(R.string.dlg_add_participants_show_history_negative), i2, i5));
                    jc4VarC.a(new kc4(R.id.profile_add_members_show_history_cancel_action, new tnh(R.string.dlg_add_participants_show_history_cancel), i2, i5));
                    jc4VarC.a.putBoolean("memorize_keyboard", false);
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(addChatMembersScreen);
                    confirmationBottomSheetF.setTargetController(addChatMembersScreen);
                    br4 parentController = addChatMembersScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    U1 = rootController != null ? rootController.u1() : 0;
                    if (U1 != 0) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        U1.I(lveVar);
                    }
                } else {
                    addChatMembersScreen.e(R.id.profile_add_members_show_history_positive_action, null);
                }
                break;
            case 2:
                AddLinkBottomSheet addLinkBottomSheet = (AddLinkBottomSheet) obj;
                zv8[] zv8VarArr3 = AddLinkBottomSheet.s;
                addLinkBottomSheet.v1(true);
                hn9 hn9Var = (hn9) addLinkBottomSheet.q.getValue();
                jb jbVar = addLinkBottomSheet.n;
                a8j.x(hn9Var.c, new jb(jbVar.a, jbVar.b, addLinkBottomSheet.D1().getText().toString()));
                break;
            case 3:
                zv8[] zv8VarArr4 = AddStoryLinkBottomSheet.s;
                ((AddStoryLinkBottomSheet) obj).E1().B();
                break;
            case 4:
                ac acVar = (ac) obj;
                p0m.a(acVar, kt7.CLOCK_TICK);
                yb ybVar = acVar.c;
                if (ybVar != null) {
                    EditStoryScreen editStoryScreen = (EditStoryScreen) ((s63) ybVar).b;
                    zv8[] zv8VarArr5 = EditStoryScreen.A1;
                    editStoryScreen.C1().U();
                }
                break;
            case 5:
                ((vc) obj).z();
                break;
            case 6:
                CallIndicatorWidget callIndicatorWidget = (CallIndicatorWidget) obj;
                zv8[] zv8VarArr6 = CallIndicatorWidget.g;
                ml9.c(callIndicatorWidget.requireActivity());
                callIndicatorWidget.q1().F(null);
                break;
            case 7:
                ((vv1) obj).y.invoke();
                break;
            case 8:
                zv8[] zv8VarArr7 = CallRateBottomSheet.F;
                ((CallRateBottomSheet) obj).G1().C(false);
                break;
            case 9:
                CallScreen callScreen = (CallScreen) obj;
                l6m l6mVar = CallScreen.D1;
                fj1 fj1Var = ((a9j) callScreen.D.getValue()).a;
                if (fj1Var != null) {
                    fj1Var.u.h(0, false);
                }
                callScreen.R1().N(0);
                break;
            case 10:
                wd2 wd2Var = (wd2) obj;
                k2e k2eVar = wd2Var.a;
                if (k2eVar == null) {
                    k2eVar = null;
                }
                n2e n2eVar = k2eVar.d;
                n2e n2eVar2 = n2eVar != null ? n2eVar : null;
                boolean zI = n2eVar2.r.i();
                if (!zI) {
                    a8j.x(n2eVar2.p, e2e.a);
                }
                if (zI) {
                    boolean z2 = wd2Var.n;
                    wd2Var.d(!z2, true);
                    if (!z2 && (vd2Var = wd2Var.m) != null) {
                        vd2Var.V();
                        break;
                    }
                }
                break;
            case 11:
                ((rod) obj).invoke();
                break;
            case 12:
                ((zn2) obj).u.invoke();
                break;
            case 13:
                zpe zpeVar = BaseBottomSheetWidget.i;
                ((ChangeDisabledDialog) obj).v1(true);
                break;
            case 14:
                View.OnClickListener onClickListener = ((xu2) obj).h;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            case 15:
                ((vpd) obj).invoke();
                break;
            case 16:
                ei5 ei5Var = (ei5) obj;
                zv8[] zv8VarArr8 = ChatTitleIconScreen.q;
                ei5Var.requestFocus();
                ei5Var.j.post(new jj2(25, ei5Var));
                break;
            case 17:
                ((zo3) obj).c.toggle();
                break;
            case 18:
                af7 af7Var = ((i24) obj).d;
                if (af7Var != null) {
                    af7Var.invoke();
                }
                break;
            case 19:
                int i6 = ConfirmAddOpponentToCallBottomSheet.x;
                ((ConfirmAddOpponentToCallBottomSheet) obj).v1(true);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zv8[] zv8VarArr9 = ContactAddBottomSheet.x;
                fh4 fh4VarE1 = ((ContactAddBottomSheet) obj).E1();
                fh4VarE1.g.B(fh4VarE1, fh4.k[0], yab.i0(fh4VarE1.b, null, 2, new qy3(fh4VarE1, U1, 5), 1));
                break;
            case 21:
                xm4 xm4Var = (xm4) obj;
                xm4Var.u.z();
                xm4Var.v.a(2, 3, 2);
                break;
            case 22:
                ((bn4) obj).u.getClass();
                break;
            case 23:
                ((vn4) obj).u.getClass();
                break;
            case 24:
                zv8[] zv8VarArr10 = ContactsPickerScreen.o;
                do4 do4Var = (do4) ((ContactsPickerScreen) obj).x1().d;
                gu4 gu4Var = do4Var.h;
                do4Var.i.B(do4Var, do4.l[0], gu4Var != null ? yab.h0(gu4Var, ((n0c) ((xhh) do4Var.e.getValue())).b(), 2, new co4(do4Var, U1, i3)) : null);
                break;
            case 25:
                ((ri) obj).dismiss();
                break;
            case 26:
                ((al5) obj).a.invoke();
                break;
            case 27:
                ek6 ek6Var = (ek6) obj;
                Long l = ek6Var.a;
                if (l != null) {
                    long jLongValue = l.longValue();
                    cf7 cf7Var = ek6Var.d;
                    if (cf7Var != null) {
                        cf7Var.invoke(Long.valueOf(jLongValue));
                    }
                }
                break;
            case 28:
                FeatureValueInfoBottomSheet featureValueInfoBottomSheet = (FeatureValueInfoBottomSheet) obj;
                zv8[] zv8VarArr11 = FeatureValueInfoBottomSheet.C;
                br4 targetController = featureValueInfoBottomSheet.getTargetController();
                DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen = targetController instanceof DevMenuFeatureTogglesPageScreen ? (DevMenuFeatureTogglesPageScreen) targetController : null;
                if (devMenuFeatureTogglesPageScreen != null) {
                    vv vvVar = featureValueInfoBottomSheet.u;
                    zv8 zv8Var = FeatureValueInfoBottomSheet.C[0];
                    i5d i5dVar = (i5d) wm9.N0(devMenuFeatureTogglesPageScreen.e, Long.valueOf(((Number) vvVar.a(featureValueInfoBottomSheet)).longValue()));
                    i5dVar.g().edit().remove(i5dVar.a).commit();
                    i5dVar.k();
                    devMenuFeatureTogglesPageScreen.t1();
                }
                featureValueInfoBottomSheet.v1(true);
                break;
            default:
                FolderEditScreen folderEditScreen = (FolderEditScreen) obj;
                zv8[] zv8VarArr12 = FolderEditScreen.i;
                folderEditScreen.e(R.id.oneme_folders_edit_create_button, null);
                folderEditScreen.q1();
                break;
        }
    }

    public /* synthetic */ t8(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
    }
}
