package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.animation.PathInterpolator;
import java.lang.annotation.Annotation;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cka implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ cka(hyh hyhVar, pec pecVar) {
        this.a = 17;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        float f = 1.0f;
        switch (this.a) {
            case 0:
                return new yv7();
            case 1:
                zv8[] zv8VarArr = MessageWriteWidget.I;
                return Boolean.valueOf(Build.VERSION.SDK_INT <= 30 && ((Boolean) msi.a.getValue()).booleanValue());
            case 2:
                zv8[] zv8VarArr2 = MessagesSettingsScreen.p;
                return y3f.SETTINGS_MESSAGES;
            case 3:
                int i = e1b.c;
                int i2 = e1b.d;
                if (i <= 0) {
                    ore.p("Failed requirement.");
                    return null;
                }
                if (i2 <= 0) {
                    ore.p("Failed requirement.");
                    return null;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = 0;
                    while (i4 < i) {
                        zo7 zo7Var = e1b.b;
                        float f2 = i2;
                        float f3 = i3 / f2;
                        float f4 = i4 / f2;
                        zo7Var.getClass();
                        double d = f3;
                        int iFloor = ((int) Math.floor(d)) & 255;
                        double d2 = f4;
                        float f5 = f;
                        int iFloor2 = ((int) Math.floor(d2)) & 255;
                        float fFloor = f3 - ((float) Math.floor(d));
                        float fFloor2 = f4 - ((float) Math.floor(d2));
                        float f6 = ((((fFloor * 6.0f) - 15.0f) * fFloor) + 10.0f) * fFloor * fFloor * fFloor;
                        float f7 = ((((6.0f * fFloor2) - 15.0f) * fFloor2) + 10.0f) * fFloor2 * fFloor2 * fFloor2;
                        int[] iArr = (int[]) zo7Var.b;
                        int i5 = iArr[iFloor] + iFloor2;
                        int i6 = iArr[i5];
                        int i7 = iArr[i5 + 1];
                        int i8 = iArr[iFloor + 1] + iFloor2;
                        int i9 = iArr[i8];
                        int i10 = iArr[i8 + 1];
                        float fJ = zo7.j(fFloor, fFloor2, i6);
                        float f8 = fFloor - f5;
                        float fC = tqk.c(fJ, zo7.j(f8, fFloor2, i9), f6);
                        float f9 = fFloor2 - f5;
                        bitmapCreateBitmap.setPixel(i3, i4, tre.I0(esk.c(0, (tqk.c(fC, tqk.c(zo7.j(fFloor, f9, i7), zo7.j(f8, f9, i10), f6), f7) + f5) / 2.0f, -1), 0.16f));
                        i4++;
                        f = f5;
                    }
                }
                Paint paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                Shader.TileMode tileMode = Shader.TileMode.MIRROR;
                paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                return paint;
            case 4:
                return new pc5(gbb.h, 1);
            case 5:
                return new pc5(gbb.h, 2);
            case 6:
                return new int[]{-15263716, -15329509, -14342611};
            case 7:
                return new float[]{0.0f, 0.32f, 1.0f};
            case 8:
                return ewl.a("one.me.webapp.domain.jsbridge.delegates.haptic.NotificationType", lnb.values(), new String[]{"error", "success", "warning"}, new Annotation[][]{null, null, null});
            case 9:
                zv8[] zv8VarArr3 = NotificationsSettingsScreen.m;
                return y3f.SETTINGS_NOTIFICATIONS;
            case 10:
                zv8[] zv8VarArr4 = NotificationsSettingsScreen.m;
                return Boolean.FALSE;
            case 11:
                return new ctf(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 0, new tnh(R.string.oneme_profile_section_official_org_title), null, osf.c, new tnh(R.string.oneme_profile_section_official_org_subtitle), aql.a(R.drawable.icon_verification), null, null, false, null, 1672);
            case 12:
                return new ctf(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 0, ynh.b, null, osf.b, null, aql.a(R.drawable.icon_case), null, null, false, new tnh(R.string.oneme_profile_section_org_title), 680);
            case 13:
                return new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
            case 14:
                lnh lnhVar = new lnh();
                new u6h(lnhVar);
                return lnhVar;
            case 15:
                return new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
            case 16:
                return new g5e();
            case 17:
                return null;
            case 18:
                return sbi.a;
            case 19:
                return new m48(new String[0]);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new StringBuilder(20);
            case 21:
                return new keh(0);
            case 22:
                return new keh(0);
            case 23:
                return new r7g(false);
            case 24:
                return new r7g(true);
            case 25:
                return new vj6();
            case 26:
                return new vj6();
            case 27:
                zv8[] zv8VarArr5 = PhotoEditScreen.s1;
                return new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
            case 28:
                zv8[] zv8VarArr6 = PhotoEditScreen.s1;
                return new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
            default:
                zv8[] zv8VarArr7 = PhotoEditScreen.s1;
                return new PathInterpolator(0.33f, 0.0f, 0.51f, 1.0f);
        }
    }

    public /* synthetic */ cka(int i) {
        this.a = i;
    }
}
