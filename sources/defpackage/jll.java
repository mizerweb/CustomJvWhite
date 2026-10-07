package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jll {
    public static rp4 a(ut2 ut2Var) {
        Integer numValueOf = Integer.valueOf(R.drawable.icon_authorization);
        Integer numValueOf2 = Integer.valueOf(R.drawable.icon_delete);
        Integer numValueOf3 = Integer.valueOf(R.attr.icon_negative);
        Integer numValueOf4 = Integer.valueOf(R.attr.text_negative);
        Integer numValueOf5 = Integer.valueOf(R.attr.icon_primary);
        switch (wt2.$EnumSwitchMapping$0[ut2Var.ordinal()]) {
            case 1:
                return new rp4(R.id.oneme_chat_action_add_to_folder, new tnh(R.string.oneme_chat_modal_action_add_to_folder), Integer.valueOf(R.drawable.icon_folder_add_to), numValueOf5, 4);
            case 2:
                return new rp4(R.id.oneme_chat_action_remove_from_folder, new tnh(R.string.oneme_chat_modal_action_remove_from_folder), Integer.valueOf(R.drawable.icon_folder_exclude_from), numValueOf5, 4);
            case 3:
                return new rp4(R.id.oneme_chat_action_add_favorite, new tnh(R.string.oneme_chat_modal_action_modal_pin), Integer.valueOf(R.drawable.icon_pin), numValueOf5, 4);
            case 4:
                return new rp4(R.id.oneme_chat_action_remove_favorite, new tnh(R.string.oneme_chat_modal_action_modal_unpin), Integer.valueOf(R.drawable.icon_pin_crossed), numValueOf5, 4);
            case 5:
                return new rp4(R.id.oneme_chat_action_mark_as_unread, new tnh(R.string.oneme_chat_modal_action_mark_as_unread), Integer.valueOf(R.drawable.icon_message_unread), numValueOf5, 4);
            case 6:
                return new rp4(R.id.oneme_chat_action_mark_as_read, new tnh(R.string.oneme_chat_modal_action_mark_as_read), Integer.valueOf(R.drawable.mark_as_read_24), numValueOf5, 4);
            case 7:
                return new rp4(R.id.oneme_chat_action_mute, new tnh(R.string.oneme_chat_modal_action_mute), Integer.valueOf(R.drawable.icon_notifications_crossed), numValueOf5, 4);
            case 8:
                return new rp4(R.id.oneme_chat_action_unmute, new tnh(R.string.oneme_chat_modal_action_unmute), Integer.valueOf(R.drawable.icon_notifications), numValueOf5, 4);
            case 9:
                return new rp4(R.id.oneme_chat_action_leave, new tnh(R.string.oneme_chat_modal_action_leave_chanel), numValueOf4, numValueOf, numValueOf3);
            case 10:
                return new rp4(R.id.oneme_chat_action_leave, new tnh(R.string.oneme_chat_modal_action_unsubscribe_chanel), numValueOf4, numValueOf, numValueOf3);
            case 11:
                return new rp4(R.id.oneme_chat_action_leave, new tnh(R.string.oneme_chat_modal_action_leave_chat), numValueOf4, numValueOf, numValueOf3);
            case 12:
            case 13:
                return new rp4(R.id.oneme_chat_action_delete_chat, new tnh(R.string.delete), numValueOf4, numValueOf2, numValueOf3);
            case 14:
            case 15:
                return new rp4(R.id.oneme_chat_action_delete_chat, new tnh(R.string.oneme_chat_modal_action_delete_chat), numValueOf4, numValueOf2, numValueOf3);
            case 16:
                return new rp4(R.id.oneme_chat_action_delete_channel, new tnh(R.string.oneme_chat_modal_action_delete_channel), numValueOf4, numValueOf2, numValueOf3);
            case 17:
                return new rp4(R.id.oneme_chat_action_block, new tnh(R.string.action_block), numValueOf4, Integer.valueOf(R.drawable.icon_block_contact), numValueOf3);
            case 18:
                return new rp4(R.id.oneme_chat_action_unblock, new tnh(R.string.action_unblock), Integer.valueOf(R.drawable.icon_privacy), numValueOf5, 4);
            case 19:
                return new rp4(R.id.oneme_chat_action_select, new tnh(R.string.oneme_chat_modal_action_select), Integer.valueOf(R.drawable.icon_check_round), numValueOf5, 4);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new rp4(R.id.oneme_action_complaint, new tnh(R.string.oneme_chat_modal_action_report), Integer.valueOf(R.drawable.icon_report), numValueOf5, 4);
            case 21:
                return new rp4(R.id.oneme_chat_action_clear_chat_history, new tnh(R.string.oneme_chat_modal_action_clear_chat_history), Integer.valueOf(R.drawable.icon_clear_history), numValueOf5, 4);
            case 22:
                return new rp4(R.id.oneme_chat_action_suspend_bot, new tnh(R.string.oneme_chat_modal_action_suspend_bot), numValueOf4, Integer.valueOf(R.drawable.icon_minus_round), numValueOf3);
            case 23:
                return new rp4(R.id.oneme_chat_action_suspend_and_delete_bot, new tnh(R.string.oneme_chat_modal_action_suspend_and_delete_bot), numValueOf4, numValueOf2, numValueOf3);
            case 24:
                return new rp4(R.id.oneme_chat_action_clear_saved_messages, new tnh(R.string.oneme_chat_modal_action_clear_saved_messages), numValueOf4, numValueOf2, numValueOf3);
            case 25:
                return new rp4(R.id.oneme_chat_action_dump_meta, new tnh(R.string.oneme_chat_modal_action_dump_meta), Integer.valueOf(R.drawable.icon_placeholder), numValueOf5, 4);
            default:
                ore.o();
                return null;
        }
    }

    public static String b(int i) {
        return c0a.k(i, "ProfileItemId(value=", ")");
    }
}
