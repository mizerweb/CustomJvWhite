package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.TextView;
import org.webrtc.MediaStreamTrack;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rgb implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ rgb(Context context, tgb tgbVar) {
        this.a = 0;
        this.b = context;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Display defaultDisplay = null;
        Context context = this.b;
        switch (i) {
            case 0:
                try {
                    return NfcAdapter.getDefaultAdapter(context);
                } catch (IllegalArgumentException e) {
                    gm0.V(tgb.class.getName(), "Couldn't get default nfc adapter", new sgb("Couldn't get default nfc adapter", e));
                    return null;
                }
            case 1:
                return (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 2:
                SharedPreferences sharedPreferences = context.getSharedPreferences("one.me.sdk.design.theme", 0);
                sharedPreferences.getAll();
                return sharedPreferences;
            case 3:
                if (Build.VERSION.SDK_INT >= 30) {
                    defaultDisplay = context.getDisplay();
                } else {
                    WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
                    if (windowManager != null) {
                        defaultDisplay = windowManager.getDefaultDisplay();
                    }
                }
                float refreshRate = defaultDisplay != null ? defaultDisplay.getRefreshRate() : 0.0f;
                return Long.valueOf(refreshRate > 0.0f ? gm0.L(1.0E9f / refreshRate) : 160000000L);
            case 4:
                try {
                    return context.getSharedPreferences("exc_count.prefs", 0);
                } catch (Throwable th) {
                    Log.e("ExceptionCountStat", "fail to fetch shared prefs", th);
                    return null;
                }
            case 5:
                return context.getExternalCacheDir();
            case 6:
                return context.getFilesDir();
            case 7:
                return context.getCacheDir();
            case 8:
                return context.getDataDir();
            case 9:
                return new xc8(context);
            case 10:
                return new b1g(context);
            case 11:
                TextView textViewE = qv1.e(context, R.id.oneme_tab_item_textview_id);
                q9i.a(q9i.f, textViewE);
                textViewE.setLetterSpacing(0.0f);
                textViewE.setSingleLine(true);
                l8j.a(textViewE);
                return textViewE;
            case 12:
                return qv1.d(context, R.id.oneme_tab_item__start_imageview_id);
            case 13:
                v0c v0cVar = new v0c(context);
                v0cVar.setId(R.id.oneme_tab_item_end_imageview_id);
                v0cVar.setAppearance(p0c.a);
                return v0cVar;
            case 14:
                return qv1.d(context, R.id.oneme_tab_item_end_action_imageview_id);
            default:
                return new as6(context.getDir("file_prefs", 0), new bs6("watchdog"), new gcj(), null);
        }
    }

    public /* synthetic */ rgb(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
