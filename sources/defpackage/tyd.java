package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import one.me.login.avatar.RegistrationAvatarScreen;
import one.me.qrscanner.QrScannerWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.settings.battery.ui.SettingsBatteryScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tyd implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ tyd(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return oml.a(uyd.c);
            case 1:
                return oml.a(uyd.e);
            case 2:
                return oml.a(uyd.g);
            case 3:
                return new co6();
            case 4:
                return new na6("one.me.sdk.push.PushDeviceType", syd.values());
            case 5:
                zv8[] zv8VarArr = QrScannerWidget.w;
                return new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
            case 6:
                return new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
            case 7:
                zv8[] zv8VarArr2 = y5e.o;
                return sbiVar;
            case 8:
                zv8[] zv8VarArr3 = RecordControlsWidget.x1;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                return gradientDrawable;
            case 9:
                zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(1);
                return gradientDrawable2;
            case 10:
                zv8[] zv8VarArr5 = RecordControlsWidget.x1;
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(1);
                return gradientDrawable3;
            case 11:
                zv8[] zv8VarArr6 = RecordControlsWidget.x1;
                return new ll6();
            case 12:
                zv8[] zv8VarArr7 = RecordControlsWidget.x1;
                return new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
            case 13:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(704595023);
                return shapeDrawable;
            case 14:
                zv8[] zv8VarArr8 = RegistrationAvatarScreen.q;
                return y3f.AUTH_AVATARS;
            case 15:
                zv8[] zv8VarArr9 = RegistrationAvatarScreen.q;
                return new lmc(null, 0, null, null, 0L, null, 111);
            case 16:
                n5h n5hVar = n5h.a;
                return new e69(n5hVar, n5hVar);
            case 17:
                n5h n5hVar2 = n5h.a;
                return new e69(n5hVar2, n5hVar2);
            case 18:
                return ht6.e();
            case 19:
                float fC = yl5.c() * 24.0f;
                return new float[]{fC, fC, fC, fC, fC, fC, fC, fC};
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new ShapeDrawable(new OvalShape());
            case 21:
                zv8[] zv8VarArr10 = s4f.r;
                return 1L;
            case 22:
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = w5f.k;
                return sbiVar;
            case 23:
                return new gqd(R.string.oneme_profile_section_members, (noh) null, 6);
            case 24:
                zv8[] zv8VarArr11 = SettingRingtoneScreen.i;
                return y3f.SETTINGS_RINGTONE;
            case 25:
                return new wpf();
            case 26:
                return new fw(qof.a);
            case 27:
                zv8[] zv8VarArr12 = SettingsBatteryScreen.g;
                return y3f.SETTINGS_BATTERY;
            case 28:
                return new r7g(false);
            default:
                return new r7g(true);
        }
    }
}
