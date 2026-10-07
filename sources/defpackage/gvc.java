package defpackage;

import android.net.Uri;
import android.view.animation.PathInterpolator;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.polls.screens.create.PollCreateScreen;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gvc implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ gvc(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                zv8[] zv8VarArr = PhotoEditScreen.s1;
                return new PathInterpolator(1.0f, 0.0f, 0.6f, 1.0f);
            case 1:
                zv8[] zv8VarArr2 = PickChatMembers.p;
                return y3f.CREATE_CHAT_MEMBERS_PICKER;
            case 2:
                return new r7g(false);
            case 3:
                return new r7g(true);
            case 4:
                return new qxc(Long.MIN_VALUE, (Long) null, (ynh) new tnh(R.string.shortcut_share_story), (ynh) null, (Uri) null, false, false, new xyc(7, 7, Long.MIN_VALUE), (CharSequence) "", Integer.valueOf(R.drawable.share_in_story), kpk.a, true);
            case 5:
                zv8[] zv8VarArr3 = PickerChatsListWidget.x;
                return null;
            case 6:
                zv8[] zv8VarArr4 = PickerContactsListWidget.q;
                return Boolean.FALSE;
            case 7:
                int i = a0d.z;
                return sbi.a;
            case 8:
                int i2 = uw8.a;
                return Boolean.valueOf(uw8.b(uw8.c));
            case 9:
                zv8[] zv8VarArr5 = PipScreen.f;
                return t3g.a;
            case 10:
                return Float.valueOf(yl5.d().getDisplayMetrics().density * 0.5f);
            case 11:
                return bc1.k(12.0f, yl5.d().getDisplayMetrics().density);
            case 12:
                return bc1.k(24.0f, yl5.d().getDisplayMetrics().density);
            case 13:
                return new lge("[\n\t]+");
            case 14:
                return bc1.k(24.0f, yl5.d().getDisplayMetrics().density);
            case 15:
                return bc1.k(16.0f, yl5.d().getDisplayMetrics().density);
            case 16:
                return bc1.k(24.0f, yl5.d().getDisplayMetrics().density);
            case 17:
                zv8[] zv8VarArr6 = PollCreateScreen.n;
                rb5 rb5Var = new rb5();
                rb5Var.g = false;
                return rb5Var;
            case 18:
                return bc1.k(64.0f, yl5.d().getDisplayMetrics().density);
            case 19:
                return bc1.k(78.0f, yl5.d().getDisplayMetrics().density);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return bc1.k(24.0f, yl5.d().getDisplayMetrics().density);
            case 21:
                return bc1.k(10.0f, yl5.d().getDisplayMetrics().density);
            case 22:
                return "onPreStart";
            case 23:
                return "No registered keys in poller. Exit";
            case 24:
                return "exception:";
            case 25:
                return "Unexpected exception: ";
            case 26:
                return "Failed to close channel";
            case 27:
                return "unregister";
            case 28:
                return new r7g(false);
            default:
                return new r7g(true);
        }
    }
}
