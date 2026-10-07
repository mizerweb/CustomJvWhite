package defpackage;

import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.webkit.WebView;
import androidx.work.Worker;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import one.me.calls.impl.service.VoIpCallService;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import one.me.webapp.util.WebAppNfcService;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0j implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ o0j(Worker worker) {
        this.a = 29;
    }

    @Override // defpackage.af7
    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        String str;
        switch (this.a) {
            case 0:
                return "captureFrame";
            case 1:
                return "setStencil";
            case 2:
                return new ude(1);
            case 3:
                return new vde(1);
            case 4:
                zv8[] zv8VarArr = VideoMessageWidget.B;
                int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setSize(iK, iK);
                return new InsetDrawable((Drawable) gradientDrawable, iK);
            case 5:
                return new r7g(false);
            case 6:
                int i = VoIpCallService.g;
                return new ga2(2);
            case 7:
                return new ga2(2);
            case 8:
                return n8h.Companion.serializer();
            case 9:
                return new fw(n5h.a);
            case 10:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
            case 11:
                return Cipher.getInstance("AES/CBC/PKCS7Padding");
            case 12:
                return aa8.Companion.serializer();
            case 13:
                return lnb.Companion.serializer();
            case 14:
                return ojj.Companion.serializer();
            case 15:
                return ewl.a("one.me.webapp.domain.jsbridge.delegates.haptic.WebAppHapticFeedbackStatus", ojj.values(), new String[]{"impactOccured", "notificationOccured", "selectionChanged"}, new Annotation[][]{null, null, null});
            case 16:
                return pqj.Companion.serializer();
            case 17:
                return new rp4(R.id.web_app_root_choose_media_bottomsheet_camera, new tnh(R.string.make_a_shot), Integer.valueOf(R.drawable.icon_camera), Integer.valueOf(R.attr.button_primary), 4);
            case 18:
                return new rp4(R.id.web_app_root_choose_media_bottomsheet_gallery, new tnh(R.string.web_app_root_choose_media_bottomsheet_gallery), Integer.valueOf(R.drawable.icon_image_add), Integer.valueOf(R.attr.button_primary), 4);
            case 19:
                return new rp4(R.id.web_app_root_choose_media_bottomsheet_file_manager, new tnh(R.string.attach_file), Integer.valueOf(R.drawable.icon_folder), Integer.valueOf(R.attr.button_primary), 4);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                int i2 = WebAppNfcService.c;
                r7 r7Var = r7.a;
                return new ahj(r7.d(ha9.b));
            case 21:
                return new g5e();
            case 22:
                return new okj();
            case 23:
                zv8[] zv8VarArr2 = WebAppSettingsScreen.j;
                return y3f.SETTINGS_PRIVACY_MINIAPP;
            case 24:
                return pqj.Companion.serializer();
            case 25:
                return ewl.a("one.me.webapp.domain.jsbridge.delegates.share.WebAppShareStatus", pqj.values(), new String[]{"shared", "cancelled"}, new Annotation[][]{null, null});
            case 26:
                n5h n5hVar = n5h.a;
                return new e69(n5hVar, n5hVar);
            case 27:
                zv8[] zv8VarArr3 = WebAppsSettingScreen.f;
                return y3f.SETTINGS_PRIVACY_MINIAPPS;
            case 28:
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                return (currentWebViewPackage == null || (str = currentWebViewPackage.versionName) == null) ? "0" : str;
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }

    public /* synthetic */ o0j(int i) {
        this.a = i;
    }
}
