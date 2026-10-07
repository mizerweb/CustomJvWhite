package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ksk {
    public static rp4 a(hda hdaVar, boolean z) {
        Integer numValueOf = Integer.valueOf(R.attr.icon_negative);
        Integer numValueOf2 = Integer.valueOf(R.drawable.icon_delete);
        Integer numValueOf3 = Integer.valueOf(R.attr.text_negative);
        Integer numValueOf4 = Integer.valueOf(R.drawable.icon_copy);
        Integer numValueOf5 = Integer.valueOf(R.drawable.icon_link);
        int i = z ? R.attr.icon_primary : R.attr.icon_themed;
        switch (hdaVar.ordinal()) {
            case 0:
                return new rp4(R.id.messages_list_context_action_forward, new tnh(R.string.chat_screen_action_forward), Integer.valueOf(R.drawable.icon_forward), Integer.valueOf(i), 4);
            case 1:
                return new rp4(R.id.messages_list_context_action_copy, new tnh(R.string.chat_screen_action_copy), numValueOf4, Integer.valueOf(i), 4);
            case 2:
                return new rp4(R.id.messages_list_context_action_report, new tnh(R.string.chat_screen_action_report), Integer.valueOf(R.drawable.icon_report), Integer.valueOf(i), 4);
            case 3:
                return new rp4(R.id.messages_list_context_action_mark_as_unread, new tnh(R.string.chat_screen_action_mark_as_unread), Integer.valueOf(R.drawable.icon_message_unread), Integer.valueOf(i), 4);
            case 4:
                return new rp4(R.id.messages_list_context_action_reply, new tnh(R.string.chat_screen_action_reply), Integer.valueOf(R.drawable.icon_reply), Integer.valueOf(i), 4);
            case 5:
                return new rp4(R.id.messages_list_context_action_delete, new tnh(R.string.chat_screen_action_delete), numValueOf3, numValueOf2, numValueOf);
            case 6:
                return new rp4(R.id.messages_list_context_action_delete_for_all, new tnh(R.string.chat_screen_action_delete_for_all), numValueOf3, numValueOf2, numValueOf);
            case 7:
                return new rp4(R.id.messages_list_context_action_pin, new tnh(R.string.chat_screen_action_pin), Integer.valueOf(R.drawable.icon_pin), Integer.valueOf(i), 4);
            case 8:
                return new rp4(R.id.messages_list_context_action_unpin, new tnh(R.string.chat_screen_action_unpin), Integer.valueOf(R.drawable.icon_pin_crossed), Integer.valueOf(i), 4);
            case 9:
                return new rp4(R.id.messages_list_context_action_select, new tnh(R.string.chat_screen_action_select), Integer.valueOf(R.drawable.icon_check_round), Integer.valueOf(i), 4);
            case 10:
                return new rp4(R.id.messages_list_context_action_edit, new tnh(R.string.chat_screen_action_edit), Integer.valueOf(R.drawable.icon_edit), Integer.valueOf(i), 4);
            case 11:
                return new rp4(R.id.messages_list_context_action_save_to_gallery, new tnh(R.string.chat_screen_action_save_to_gallery), Integer.valueOf(R.drawable.icon_download), Integer.valueOf(i), 4);
            case 12:
                return new rp4(R.id.messages_list_context_action_copy_photo, new tnh(R.string.chat_screen_action_copy_photo), numValueOf4, Integer.valueOf(i), 4);
            case 13:
                return new rp4(R.id.messages_list_context_action_share_externally, new tnh(R.string.chat_screen_action_share_externally), Integer.valueOf(R.drawable.icon_share_android), Integer.valueOf(i), 4);
            case 14:
                return new rp4(R.id.messages_list_context_action_share_post, new tnh(R.string.chat_screen_action_share_post), numValueOf5, Integer.valueOf(i), 4);
            case 15:
                return new rp4(R.id.messages_list_context_action_share_message, new tnh(R.string.chat_screen_action_share_message), numValueOf5, Integer.valueOf(i), 4);
            case 16:
                return new rp4(R.id.messages_list_context_action_scheduled_send_now, new tnh(R.string.scheduled_send_now), Integer.valueOf(R.drawable.icon_send), Integer.valueOf(i), 4);
            case 17:
                return new rp4(R.id.messages_list_context_action_scheduled_edit_time, new tnh(R.string.scheduled_edit_fire_time), Integer.valueOf(R.drawable.icon_clock), Integer.valueOf(i), 4);
            case 18:
                return new rp4(R.id.messages_list_context_action_poll_revote, new tnh(R.string.chat_screen_action_poll_revote), Integer.valueOf(R.drawable.icon_revote), Integer.valueOf(i), 4);
            case 19:
                return new rp4(R.id.messages_list_context_action_poll_finish, new tnh(R.string.chat_screen_action_poll_finish), Integer.valueOf(R.drawable.icon_flag_finish), Integer.valueOf(i), 4);
            default:
                ore.o();
                return null;
        }
    }

    public static final void b(ViewGroup viewGroup, View view, View view2, View view3, float f, boolean z) {
        if (view2 != null) {
            view2.setTranslationY(wk8.t(viewGroup.getContext()) * f);
        }
        if (view3 != null) {
            view3.setAlpha(1.0f - Math.abs(f));
        }
        if (z) {
            float fAbs = Math.abs(f) * 3.0f;
            if (fAbs > 1.0f) {
                fAbs = 1.0f;
            }
            if (view != null) {
                view.setPivotX(view.getWidth() / 2.0f);
            }
            if (view != null) {
                view.setPivotY(view.getHeight() / 2.0f);
            }
            if (view != null) {
                view.setScaleX(((1.0f - fAbs) * 0.1f) + 1.0f);
            }
            if (view != null) {
                view.setScaleY(((1.0f - fAbs) * 0.1f) + 1.0f);
            }
        }
    }
}
