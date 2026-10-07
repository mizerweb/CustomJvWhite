package defpackage;

import java.util.ArrayList;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chats.picker.stories.PickStoryPresetScreen;
import one.me.devmenu.utils.FeatureValueInfoBottomSheet;
import one.me.devmenu.utils.JsonBottomSheet;
import one.me.devmenu.utils.ValueBottomSheet;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet;
import one.me.sdk.permissionhost.PermissionBottomSheet;
import one.me.settings.multilang.LocaleBottomSheet;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.startconversation.channel.PickSubscribersScreen;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class bb extends wq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public bb(ir4 ir4Var, ArrayList arrayList) {
        this.a = 15;
        this.b = ir4Var;
        this.c = arrayList;
    }

    @Override // defpackage.wq4
    public void a(br4 br4Var, gr4 gr4Var, hr4 hr4Var) {
        switch (this.a) {
            case 15:
                ArrayList arrayList = (ArrayList) this.c;
                if (hr4Var == hr4.f) {
                    for (int size = arrayList.size() - 1; size > 0; size--) {
                        ((ir4) this.b).A(null, (lve) arrayList.get(size), true, new r7g());
                    }
                }
                break;
        }
    }

    @Override // defpackage.wq4
    public void h(br4 br4Var) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((AddChatMembersScreen) obj2).getRouter().a((ln5) obj);
                break;
            case 1:
                ((ContactsPickerScreen) obj2).getRouter().a((ln5) obj);
                break;
            case 2:
                ((ContextMenuBottomSheet) obj2).getRouter().a((ln5) obj);
                break;
            case 3:
                ((FakeInAppReviewBottomSheet) obj2).getRouter().a((ln5) obj);
                break;
            case 4:
                ((FeatureValueInfoBottomSheet) obj2).getRouter().a((ln5) obj);
                break;
            case 5:
                ((FolderMemberPickerScreen) obj2).getRouter().a((ln5) obj);
                break;
            case 6:
                ((ForwardPickerScreen) obj2).getRouter().a((ln5) obj);
                break;
            case 7:
                ((LocaleBottomSheet) obj2).getRouter().a((ln5) obj);
                break;
            case 8:
                ((JsonBottomSheet) obj2).getRouter().a((ln5) obj);
                break;
            case 9:
                ((br4) obj2).getRouter().a((ln5) obj);
                break;
            case 10:
                ((MessageContextMenuBottomSheet) obj2).getRouter().a((ln5) obj);
                break;
            case 11:
                ((PermissionBottomSheet) obj2).getRouter().a((ln5) obj);
                break;
            case 12:
                ((PickChatMembers) obj2).getRouter().a((ln5) obj);
                break;
            case 13:
                ((PickStoryPresetScreen) obj2).getRouter().a((ln5) obj);
                break;
            case 14:
                ((PickSubscribersScreen) obj2).getRouter().a((ln5) obj);
                break;
            case 16:
                ((ShareDataPickerScreen) obj2).getRouter().a((ln5) obj);
                break;
            case 17:
                ((ConfirmationBottomSheet) obj2).getRouter().a((ln5) obj);
                break;
            case 18:
                ((TwoFACheckPassScreen) obj2).getRouter().a((ln5) obj);
                break;
            case 19:
                ((ValueBottomSheet) obj2).getRouter().a((ln5) obj);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((br4) obj2).getRouter().a((vt3) obj);
                break;
        }
    }

    public /* synthetic */ bb(br4 br4Var, fr4 fr4Var, int i) {
        this.a = i;
        this.c = br4Var;
        this.b = fr4Var;
    }
}
