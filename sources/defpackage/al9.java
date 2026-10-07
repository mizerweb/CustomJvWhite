package defpackage;

import one.me.main.MainScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class al9 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainScreen b;

    public /* synthetic */ al9(MainScreen mainScreen, int i) {
        this.a = i;
        this.b = mainScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                MainScreen mainScreen = this.b;
                a8g a8gVar = MainScreen.u;
                a8j.x(mainScreen.u1().f, new im3(iIntValue));
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                MainScreen mainScreen2 = this.b;
                a8g a8gVar2 = MainScreen.u;
                km3 km3VarU1 = mainScreen2.u1();
                km3VarU1.getClass();
                if (iIntValue2 == R.id.oneme_chat_action_mute) {
                    i = R.string.chat_list_multiselect_tooltip_mute;
                } else if (iIntValue2 == R.id.oneme_chat_action_unmute) {
                    i = R.string.chat_list_multiselect_tooltip_unmute;
                } else if (iIntValue2 == R.id.oneme_chat_action_add_favorite) {
                    i = R.string.chat_list_multiselect_tooltip_pin;
                } else if (iIntValue2 == R.id.oneme_chat_action_remove_favorite) {
                    i = R.string.chat_list_multiselect_tooltip_unpin;
                } else if (iIntValue2 == R.id.oneme_chat_action_mark_as_unread) {
                    i = R.string.chat_list_multiselect_tooltip_unread;
                } else if (iIntValue2 == R.id.oneme_chat_action_mark_as_read) {
                    i = R.string.chat_list_multiselect_tooltip_read;
                } else if (iIntValue2 == R.id.oneme_chat_action_delete_chat) {
                    i = R.string.chat_list_multiselect_tooltip_delete;
                } else if (iIntValue2 == R.id.oneme_chat_action_add_to_folder) {
                    i = R.string.chat_list_multiselect_tooltip_add_to_folder;
                } else if (iIntValue2 == R.id.oneme_bottom_bar_overflow_button) {
                    i = R.string.chat_list_multiselect_tooltip_more;
                } else {
                    String str = km3VarU1.c;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Long click unknown action chat multiselect", null);
                        }
                    }
                    i = -1;
                }
                if (i != -1) {
                    a8j.x(km3VarU1.f, new jm3(iIntValue2, new tnh(i)));
                }
                break;
        }
        return sbi.a;
    }
}
