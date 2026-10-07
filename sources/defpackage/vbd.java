package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vbd implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ vbd(ecd ecdVar) {
        this.a = 1;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                int i2 = ecd.i;
                return sbiVar;
            case 1:
                return sbiVar;
            case 2:
                return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new jk(1));
            case 3:
                return yid.a();
            case 4:
                return Long.valueOf(Os.sysconf(OsConstants._SC_NPROCESSORS_CONF));
            case 5:
                return Long.valueOf(Os.sysconf(OsConstants._SC_PAGESIZE) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            case 6:
                return Long.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
            case 7:
                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
            case 8:
                return sbiVar;
            case 9:
                return new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(R.string.oneme_contact_block_bottom_sheet_cancel), 3, 56);
            case 10:
                return new lyb(R.id.profile_more_action_share_contact, Integer.valueOf(R.string.share_contact_menu), (Integer) null, Integer.valueOf(R.drawable.icon_forward), (Integer) null, 52);
            case 11:
                return new lyb(R.id.profile_more_action_leave_chat, Integer.valueOf(R.string.oneme_profile_more_action_leave_chat), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_autorization_leave), Integer.valueOf(R.attr.icon_negative), 32);
            case 12:
                return new lyb(R.id.profile_more_action_leave_channel, Integer.valueOf(R.string.oneme_profile_more_action_leave_channel), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_autorization_leave), Integer.valueOf(R.attr.icon_negative), 32);
            case 13:
                return new lyb(R.id.profile_more_action_leave_channel, Integer.valueOf(R.string.oneme_profile_more_action_unsubscribe_channel), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_autorization_leave), Integer.valueOf(R.attr.icon_negative), 32);
            case 14:
                return new rp4(R.id.profile_members_list_action_delete_from_chat, new tnh(R.string.profile_members_list_action_delete_from_chat), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative));
            case 15:
                return new lyb(R.id.profile_more_action_add_to_folder, Integer.valueOf(R.string.oneme_profile_more_action_add_to_folder), (Integer) null, Integer.valueOf(R.drawable.icon_folder_add_to), (Integer) null, 52);
            case 16:
                return new lyb(R.id.profile_more_action_clear_history, Integer.valueOf(R.string.oneme_profile_more_action_clear_history), (Integer) null, Integer.valueOf(R.drawable.icon_clear_history), (Integer) null, 52);
            case 17:
                return new lyb(R.id.profile_more_action_clear_history, Integer.valueOf(R.string.oneme_profile_more_action_clear_channel_history), (Integer) null, Integer.valueOf(R.drawable.icon_clear_history), (Integer) null, 52);
            case 18:
                return new lyb(R.id.profile_more_action_report, Integer.valueOf(R.string.oneme_profile_more_action_report), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_report), Integer.valueOf(R.attr.icon_negative), 32);
            case 19:
                return new lyb(R.id.profile_more_action_block, Integer.valueOf(R.string.oneme_profile_more_action_block), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_block), Integer.valueOf(R.attr.icon_negative), 32);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new lyb(R.id.profile_more_action_delete_chat, Integer.valueOf(R.string.oneme_profile_more_action_delete_chat), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative), 32);
            case 21:
                return new lyb(R.id.profile_more_action_delete_channel, Integer.valueOf(R.string.oneme_profile_more_action_delete_channel), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative), 32);
            case 22:
                return new keh(0);
            case 23:
                return new keh(0);
            case 24:
                zv8[] zv8VarArr = ProfileInviteScreen.g;
                return y3f.CHAT_INFO_INVITE_LINK;
            case 25:
                zv8[] zv8VarArr2 = ProfileReactionsSettingsScreen.p;
                return null;
            case 26:
                ku8 ku8Var = ProfileScreen.B;
                return y3f.CHAT_INFO;
            case 27:
                return new mld();
            case 28:
                return new grd();
            default:
                return oml.a(uyd.a);
        }
    }

    public /* synthetic */ vbd(int i) {
        this.a = i;
    }
}
