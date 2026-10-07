package defpackage;

import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.discussionsblacklist.CommentsBlackListScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profile.screens.joinrequests.JoinRequestsScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import one.me.startconversation.channel.PickSubscribersScreen;
import one.me.webapp.settings.WebAppSettingsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ak1 implements t65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ha9 c;

    public /* synthetic */ ak1(long j, int i, ha9 ha9Var) {
        this.a = i;
        this.b = j;
        this.c = ha9Var;
    }

    @Override // defpackage.t65
    public final Object t() {
        int i = this.a;
        ha9 ha9Var = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                return new CallPresettingsScreen(j, ha9Var);
            case 1:
                return new ChatMediaTabWidget(j, mg5.REGULAR, ha9Var);
            case 2:
                return new JoinRequestsScreen(j, ha9Var);
            case 3:
                return new CommentsBlackListScreen(j, ha9Var);
            case 4:
                return new ProfileInviteScreen(j, ha9Var);
            case 5:
                return new AddChatAdminsScreen(j, ha9Var);
            case 6:
                return new ProfileMemberPermissionsScreen(j, ha9Var);
            case 7:
                return new ProfileReactionsSettingsScreen(j, ha9Var);
            case 8:
                return new PickSubscribersScreen(j, ha9Var);
            default:
                return new WebAppSettingsScreen(j, ha9Var);
        }
    }
}
