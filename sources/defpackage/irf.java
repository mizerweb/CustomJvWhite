package defpackage;

import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import one.me.settings.media.SettingsMediaScreen;
import one.me.settings.multilang.SettingsLocaleScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class irf implements af7 {
    public final /* synthetic */ int a;

    @Override // defpackage.af7
    public final Object invoke() {
        int i = 2;
        switch (this.a) {
            case 0:
                return y3f.SETTINGS_DEVICES;
            case 1:
                return new mrf();
            case 2:
                return new Matrix();
            case 3:
                return Collections.singletonList(pof.INVITE_FRIENDS);
            case 4:
                c79 c79VarW = yab.w();
                c79VarW.add(pof.SUPPORT);
                c79VarW.add(pof.ABOUT);
                return yab.j(c79VarW);
            case 5:
                c79 c79VarW2 = yab.w();
                c79VarW2.add(pof.BATTERY);
                c79VarW2.add(pof.MEDIA);
                return yab.j(c79VarW2);
            case 6:
                return Collections.singletonList(pof.MAX_BUSINESS);
            case 7:
                zv8[] zv8VarArr = SettingsLocaleScreen.k;
                return y3f.SETTINGS_LOCALE;
            case 8:
                zv8[] zv8VarArr2 = SettingsMediaScreen.h;
                return y3f.SETTINGS_MEDIA;
            case 9:
                return new lge("\\bvec([234])\\b");
            case 10:
                return new vj6();
            case 11:
                return new vj6();
            case 12:
                zv8[] zv8VarArr3 = ShareDataPickerScreen.C;
                return y3f.CHAT_FORWARD;
            case 13:
                return new nvh(yl5.d().getDisplayMetrics().density * 12.0f);
            case 14:
                return new bzf(new tnh(R.string.call_share_screen_warning_title_bottom_sheet), xw3.P0(new kc4(1, new tnh(R.string.call_share_screen_warning_do_not_show_button_bottom_sheet), 3, true, 3, 3), new kc4(i, new tnh(R.string.call_share_screen_warning_show_button_bottom_sheet), i, 32)));
            case 15:
                return new ConcurrentHashMap();
            case 16:
                return new AccelerateDecelerateInterpolator();
            case 17:
                return new ldg(new hdg(1, Integer.valueOf(R.raw.call_finished)), new hdg(2, Integer.valueOf(R.raw.ios_call_finished)), new hdg(3, Integer.valueOf(R.raw.call_incoming)), new hdg(4, Integer.valueOf(R.raw.call_ringing)), new hdg(6, Integer.valueOf(R.raw.call_connecting)), new hdg(7, Integer.valueOf(R.raw.call_connected)), new hdg(5, Integer.valueOf(R.raw.call_busy)), new hdg(8, Integer.valueOf(R.raw.call_record_start)), new hdg(9, Integer.valueOf(R.raw.call_record_stop)), true, new hdg(10, Integer.valueOf(R.raw.call_waiting)));
            case 18:
                zv8[] zv8VarArr4 = StartConversationScreen.A;
                return y3f.CREATE_CHAT;
            case 19:
                zv8[] zv8VarArr5 = StartConversationScreen.A;
                return Boolean.FALSE;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new r7g(false);
            case 21:
                return new r7g(true);
            case 22:
                zv8[] zv8VarArr6 = StickersSettingsScreen.g;
                return y3f.SETTINGS_STICKERS;
            case 23:
                return new r7g(false);
            case 24:
                return new r7g(true);
            case 25:
                return new r7g(false);
            case 26:
                return new r7g(true);
            case 27:
                return new r7g(true);
            case 28:
                return new vj6();
            default:
                return new fr3(true, 2);
        }
    }
}
