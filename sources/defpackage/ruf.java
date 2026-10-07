package defpackage;

import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.startconversation.chat.PickChatMembers;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import one.me.webview.FaqWebViewWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ruf implements t65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha9 b;

    public /* synthetic */ ruf(int i, ha9 ha9Var) {
        this.a = i;
        this.b = ha9Var;
    }

    @Override // defpackage.t65
    public final Object t() {
        int i = this.a;
        ha9 ha9Var = this.b;
        switch (i) {
            case 0:
                return new SetupPinCodeScreen(ha9Var);
            case 1:
                return new SettingRingtoneScreen(ha9Var);
            case 2:
                return new SettingsStorageScreen(ha9Var);
            case 3:
                return new StartConversationScreen(ha9Var);
            case 4:
                return new PickChatMembers(ha9Var);
            case 5:
                return new ChatTitleIconScreen(null, jhg.CHANNEL, ha9Var);
            case 6:
                return new StickersSettingsScreen(ha9Var);
            case 7:
                return new StickersScreen(kng.RECENT, 0L, false, this.b, 6, null);
            case 8:
                return new StickersScreen(kng.FAVORITE, 0L, false, this.b, 6, null);
            case 9:
                return new ProfileDeletionInfoScreen(ha9Var);
            case 10:
                return new WebAppsSettingScreen(ha9Var);
            default:
                return new FaqWebViewWidget(ha9Var);
        }
    }
}
