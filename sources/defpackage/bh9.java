package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.mediapicker.MediaPickerScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bh9 implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ bh9(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new vj6(0);
            case 1:
                return new vj6(0);
            case 2:
                DecimalFormat decimalFormat = new DecimalFormat();
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(',');
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                decimalFormat.setGroupingUsed(false);
                decimalFormat.setMaximumFractionDigits(2);
                decimalFormat.setMinimumFractionDigits(2);
                decimalFormat.setPositiveSuffix("×");
                return decimalFormat;
            case 3:
                return xo9.A();
            case 4:
                return xo9.G();
            case 5:
                return xo9.B();
            case 6:
                return xo9.D();
            case 7:
                return xo9.E();
            case 8:
                return xo9.F();
            case 9:
                return xo9.f();
            case 10:
                return xo9.y();
            case 11:
                return "Dolby Vision-capable encoder is found";
            case 12:
                return new byte[65536];
            case 13:
                return new na6("one.me.sdk.prefs.models.media.MediaAutoSaveSettings.ChatType", nq9.values());
            case 14:
                return new na6("one.me.sdk.prefs.models.media.MediaAutoSaveSettings.MediaType", pq9.values());
            case 15:
                zv8[] zv8VarArr = MediaBarPermissionWidget.g;
                return new er9();
            case 16:
                return new Path();
            case 17:
                return new float[8];
            case 18:
                return new Paint(1);
            case 19:
                return new vj6();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new vj6();
            case 21:
                zv8[] zv8VarArr2 = MediaPickerScreen.J;
                return Boolean.FALSE;
            case 22:
                return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            case 23:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 24:
                int[] iArr = tea.X;
                return Boolean.FALSE;
            case 25:
                float[] fArr = new float[8];
                for (int i = 0; i < 8; i++) {
                    fArr[i] = yl5.d().getDisplayMetrics().density * 16.0f;
                }
                return fArr;
            case 26:
                return new ac4(1);
            case 27:
                return new ArrayList(1);
            case 28:
                return new nt4(yl5.d().getDisplayMetrics().density * 4.0f);
            default:
                return new nt4(yl5.d().getDisplayMetrics().density * 76.0f);
        }
    }
}
