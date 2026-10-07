package defpackage;

import android.graphics.drawable.ShapeDrawable;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chatscreen.ChatScreen;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k82 implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ k82(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return e9i.a(1, 1, 2);
            case 1:
                return xw3.P0(":call-opponents-list", ":call-admin-settings", ":call-admin-waiting-room", ":call-active", ":call-user", ":call-chat", ":call-join-link");
            case 2:
                return Integer.valueOf(R.drawable.icon_call_mini);
            case 3:
                return Integer.valueOf(R.drawable.icon_video_call_fill_mini);
            case 4:
                return new qhe();
            case 5:
                return Class.forName("android.view.RecordingCanvas");
            case 6:
                return new String[]{"1.2.840.113549.1.1.2", "1.2.840.113549.1.1.3", "1.2.840.113549.1.1.4", "1.2.840.113549.1.1.5", "1.2.840.10040.4.3", "1.2.840.10045.4.1"};
            case 7:
                zv8[] zv8VarArr = ChangeOwnerScreen.k;
                return y3f.CHAT_INFO_CHANGE_OWNER;
            case 8:
                zv8[] zv8VarArr2 = ChangeOwnerScreen.k;
                return new tz(7, new i8a());
            case 9:
                return new kc4(R.id.oneme_confirm_cancel, new tnh(R.string.chat_leave_cancel), 2, 56);
            case 10:
                zv8[] zv8VarArr3 = ChatAdminsScreen.l;
                return y3f.CHAT_INFO_ADMINISTRATORS;
            case 11:
                return new ShapeDrawable();
            case 12:
                return new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(R.string.profile_media_cancel), 3, 56);
            case 13:
                return new rp4(R.id.profile_media_action_show_delete_confirmation, new tnh(R.string.profile_media_action_delete), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative));
            case 14:
                return new rp4(R.id.profile_media_action_goto_message, new tnh(R.string.profile_media_action_goto_message), Integer.valueOf(R.drawable.icon_message_forward), (Integer) null, 20);
            case 15:
                return new keh(0);
            case 16:
                return new keh(0);
            case 17:
                return new w13();
            case 18:
                zv8[] zv8VarArr4 = ChatMediaViewerScreen.Z;
                return y3f.CHAT_MEDIA_VIEWER;
            case 19:
                return new rp4(R.id.profile_members_list_action_select, new tnh(R.string.profile_members_list_action_select), Integer.valueOf(R.attr.text_primary), Integer.valueOf(R.drawable.icon_phone_book_big), Integer.valueOf(R.attr.icon_primary));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new rp4(R.id.profile_members_list_action_delete_from_chat, new tnh(R.string.profile_members_list_action_delete_from_chat), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative));
            case 21:
                return new rp4(R.id.profile_members_list_action_delete_from_channel, new tnh(R.string.profile_members_list_action_delete_from_channel), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative));
            case 22:
                return new rp4(R.id.profile_members_list_action_delete_from_admin, new tnh(R.string.profile_members_list_action_delete_from_admin), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative));
            case 23:
                zv8[] zv8VarArr5 = ChatMembersScreen.k;
                return y3f.CHAT_INFO_ALL_PARTICIPANTS;
            case 24:
                return xw3.P0(new kc4(R.id.chat_preview__confirm_mute_1_hour, new tnh(R.string.oneme_chat_notifications_disable_1_hour), 3, 56), new kc4(R.id.chat_preview__confirm_mute_4_hour, new tnh(R.string.oneme_chat_notifications_disable_4_hour), 3, 56), new kc4(R.id.chat_preview__confirm_mute_1_day, new tnh(R.string.oneme_chat_notifications_disable_1_day), 3, 56), new kc4(R.id.chat_preview__confirm_mute_infinite, new tnh(R.string.oneme_chat_notifications_disable_forever), 1, 56), new kc4(R.id.chat_screen__action_cancel, new tnh(R.string.oneme_chat_notifications_disable_cancel), 2, 56));
            case 25:
                return new mld();
            case 26:
                ou7 ou7Var = ChatScreen.L1;
                return new hn9();
            case 27:
                ou7 ou7Var2 = ChatScreen.L1;
                return new m5b();
            case 28:
                zv8[] zv8VarArr6 = ChatsListSearchScreen.F;
                return Boolean.FALSE;
            default:
                return new hj3();
        }
    }
}
