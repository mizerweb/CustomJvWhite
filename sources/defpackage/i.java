package defpackage;

import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.appupdate.forceupdate.ForceUpdateScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.devmenu.DevMenuScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.devmenu.memorydebugger.MemoryDebuggerScreen;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.devmenu.tools.server.ServerHostBottomSheet;
import one.me.devmenu.tools.server.ServerPortBottomSheet;
import one.me.folders.list.FoldersListScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.settings.battery.ui.SettingsBatteryScreen;
import one.me.settings.devices.SettingsDevicesScreen;
import one.me.settings.devices.hintdialog.QrAuthHintBottomSheet;
import one.me.settings.media.SettingsMediaScreen;
import one.me.settings.media.video.SettingMediaVideoScreen;
import one.me.settings.multilang.SettingsLocaleScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.showroom.ShowroomScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements t65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha9 b;

    public /* synthetic */ i(int i, ha9 ha9Var) {
        this.a = i;
        this.b = ha9Var;
    }

    @Override // defpackage.t65
    public final Object t() {
        int i = this.a;
        ha9 ha9Var = this.b;
        switch (i) {
            case 0:
                return new AboutAppSettingsScreen(ha9Var);
            case 1:
                return new ForceUpdateScreen(ha9Var);
            case 2:
                return new AppearanceSettingsMultiThemeScreen(ha9Var);
            case 3:
                return new AdminWaitingRoomScreen(ha9Var);
            case 4:
                return new ChatsListSearchScreen(ha9Var);
            case 5:
                return new DevMenuScreen(ha9Var);
            case 6:
                return new LogsViewerScreen(ha9Var);
            case 7:
                return new ServerHostBottomSheet(ha9Var);
            case 8:
                return new ServerPortBottomSheet(ha9Var);
            case 9:
                return new ShowroomScreen(ha9Var);
            case 10:
                return new ThreadsStateViewerScreen(ha9Var);
            case 11:
                return new MemoryDebuggerScreen(ha9Var);
            case 12:
                return new FoldersListScreen(ha9Var);
            case 13:
                return new FakeInAppReviewBottomSheet(ha9Var);
            case 14:
                return new InviteByPhoneScreen(ha9Var);
            case 15:
                return new InviteFriendsToMaxBottomSheet(ha9Var);
            case 16:
                return new MessagesSettingsScreen(ha9Var);
            case 17:
                return new NotificationsSettingsScreen(ha9Var);
            case 18:
                return new ChatNotificationsSettingsScreen(ha9Var);
            case 19:
                return new DialogNotificationsSettingsScreen(ha9Var);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new OtherNotificationsSettingsScreen(ha9Var);
            case 21:
                return new SettingsBatteryScreen(ha9Var);
            case 22:
                return new SettingsDevicesScreen(ha9Var);
            case 23:
                return new QrAuthHintBottomSheet(ha9Var);
            case 24:
                return new SettingsLocaleScreen(false, this.b, null, 4, null);
            case 25:
                return new SettingsMediaScreen(ha9Var);
            case 26:
                return new SettingMediaVideoScreen(ha9Var);
            case 27:
                return new SettingsPrivacyScreen(ha9Var);
            case 28:
                return new SettingsBlacklistScreen(ha9Var);
            default:
                return new SafeModeOnboardingScreen(ha9Var);
        }
    }
}
