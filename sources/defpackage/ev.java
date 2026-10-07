package defpackage;

import android.content.ComponentCallbacks2;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.mediapicker.MediaPickerScreen;
import one.me.mediapicker.crop.CropPhotoScreen;
import one.me.polls.screens.create.PollCreateScreen;
import one.me.profile.screens.discussionsblacklist.CommentsBlackListScreen;
import one.me.profile.screens.joinrequests.JoinRequestsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.qrscanner.QrScannerWidget;
import one.me.settings.multilang.SettingsLocaleScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.stories.edit.EditStoryScreen;
import one.me.stories.viewer.viewer.StoriesViewerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class ev extends dtb {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(StartConversationScreen startConversationScreen, boolean z) {
        super(z);
        this.d = 18;
        this.e = startConversationScreen;
    }

    @Override // defpackage.dtb
    public final void b() throws IllegalAccessException, InvocationTargetException {
        Object value;
        ltb ltbVarD;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = AppearanceSettingsMultiThemeScreen.i;
                a8j.x(((AppearanceSettingsMultiThemeScreen) obj).o1().s, rt3.b);
                break;
            case 1:
                ou7 ou7Var = CallIncomingScreen.m;
                mjg mjgVar = ((CallIncomingScreen) obj).q1().n;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, new fm1(false, false)));
                break;
            case 2:
                l6m l6mVar = CallScreen.D1;
                ((CallScreen) obj).K1(false);
                break;
            case 3:
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                zv8[] zv8VarArr2 = ChatMembersScreen.k;
                if (!chatMembersScreen.q1().C()) {
                    chatMembersScreen.getRouter().D();
                } else {
                    chatMembersScreen.q1().B();
                }
                break;
            case 4:
                CommentsBlackListScreen commentsBlackListScreen = (CommentsBlackListScreen) obj;
                zv8[] zv8VarArr3 = CommentsBlackListScreen.k;
                if (!commentsBlackListScreen.q1().l()) {
                    commentsBlackListScreen.getRouter().D();
                } else {
                    t7c searchView = commentsBlackListScreen.q1().getSearchView();
                    if (searchView != null) {
                        searchView.b();
                    }
                }
                break;
            case 5:
                zv8[] zv8VarArr4 = CropPhotoScreen.p;
                rx4 rx4VarV1 = ((CropPhotoScreen) obj).v1();
                if (!((Boolean) rx4VarV1.z.getValue()).booleanValue()) {
                    a8j.x(rx4VarV1.j, ow4.a);
                } else {
                    a8j.x(rx4VarV1.i, rt3.b);
                }
                break;
            case 6:
                EditStoryScreen editStoryScreen = (EditStoryScreen) obj;
                zv8[] zv8VarArr5 = EditStoryScreen.A1;
                if (!(editStoryScreen.C1().s.j.a.getValue() instanceof kyg)) {
                    editStoryScreen.C1().Q();
                } else if (editStoryScreen.getView() != null) {
                    gy8 gy8Var = editStoryScreen.x1().n1;
                    if (gy8Var.I == 2) {
                        gy8Var.u = false;
                        gy8Var.d(true);
                    }
                }
                break;
            case 7:
                zv8[] zv8VarArr6 = InputNameScreen.r;
                ((InputNameScreen) obj).t1();
                break;
            case 8:
                JoinRequestsScreen joinRequestsScreen = (JoinRequestsScreen) obj;
                zv8[] zv8VarArr7 = JoinRequestsScreen.k;
                j8e j8eVar = joinRequestsScreen.f;
                zv8[] zv8VarArr8 = JoinRequestsScreen.k;
                if (!((rcc) j8eVar.m(joinRequestsScreen, zv8VarArr8[1])).l()) {
                    joinRequestsScreen.getRouter().D();
                } else {
                    t7c searchView2 = ((rcc) j8eVar.m(joinRequestsScreen, zv8VarArr8[1])).getSearchView();
                    if (searchView2 != null) {
                        searchView2.b();
                    }
                }
                break;
            case 9:
                MediaPickerScreen mediaPickerScreen = (MediaPickerScreen) obj;
                ev evVar = mediaPickerScreen.C;
                if (mediaPickerScreen.r1() && mediaPickerScreen.q1().n) {
                    mediaPickerScreen.q1().d(false, true);
                } else {
                    evVar.f(false);
                    ComponentCallbacks2 activity = mediaPickerScreen.getActivity();
                    mtb mtbVar = activity instanceof mtb ? (mtb) activity : null;
                    if (mtbVar != null && (ltbVarD = mtbVar.d()) != null) {
                        ltbVarD.d();
                    }
                    evVar.f(true);
                }
                break;
            case 10:
                mjg mjgVar2 = ((p5b) obj).a;
                o5b o5bVar = new o5b((LinkedHashSet) null, true, 3);
                mjgVar2.getClass();
                mjgVar2.j(null, o5bVar);
                break;
            case 11:
                ((cf7) obj).invoke(this);
                break;
            case 12:
                zv8[] zv8VarArr9 = PhotoEditScreen.s1;
                pw pwVar = ((PhotoEditScreen) obj).g;
                pwVar.getClass();
                hw hwVar = new hw(pwVar);
                while (hwVar.hasNext()) {
                    qvc qvcVar = (qvc) hwVar.next();
                    if (qvcVar != null) {
                        a8j.x(((lvc) qvcVar.c.b).n, wuc.b);
                    }
                }
                break;
            case 13:
                zv8[] zv8VarArr10 = PollCreateScreen.n;
                ((PollCreateScreen) obj).p1().B();
                break;
            case 14:
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) obj;
                zv8[] zv8VarArr11 = ProfileEditAdminPermissionsWidget.n;
                int iOrdinal = profileEditAdminPermissionsWidget.o1().ordinal();
                if (iOrdinal == 0) {
                    profileEditAdminPermissionsWidget.getRouter().D();
                } else if (iOrdinal != 1) {
                    ore.o();
                } else {
                    profileEditAdminPermissionsWidget.p1().I();
                }
                break;
            case 15:
                zv8[] zv8VarArr12 = QrScannerWidget.w;
                ((QrScannerWidget) obj).t1().B(k1f.a);
                break;
            case 16:
                ((u8f) obj).B();
                break;
            case 17:
                zv8[] zv8VarArr13 = SettingsLocaleScreen.k;
                ((SettingsLocaleScreen) obj).q1();
                break;
            case 18:
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj;
                t7c searchView3 = ((rcc) startConversationScreen.n.m(startConversationScreen, StartConversationScreen.A[4])).getSearchView();
                if (searchView3 != null) {
                    searchView3.b();
                }
                break;
            case 19:
                zv8[] zv8VarArr14 = StoriesViewerScreen.t;
                ((StoriesViewerScreen) obj).E1().C();
                break;
            default:
                ioj iojVar = (ioj) obj;
                if (!((Boolean) iojVar.J.getValue()).booleanValue()) {
                    a8j.t(iojVar, null, new boj(iojVar, null, 1), 3);
                } else {
                    js8 js8Var = iojVar.G;
                    yab.i0((gu4) js8Var.a, null, 0, new ur8(js8Var, null, 1), 3);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ev(Object obj, boolean z, int i) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ev(int i, Object obj) {
        super(true);
        this.d = i;
        this.e = obj;
    }
}
