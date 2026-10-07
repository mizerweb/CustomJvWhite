package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.BoringLayout;
import android.view.animation.PathInterpolator;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yfi implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ yfi(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return "no new chunks are available yet";
            case 1:
                return "start upload called";
            case 2:
                return "upload is about to start";
            case 3:
                return "Failed to get file size for upload";
            case 4:
                return "Failed to submit upload to execution";
            case 5:
                return "start upload sync called";
            case 6:
                return "Exception while getting and closing the FileSizeUpdateSender";
            case 7:
                return "Internal pipe creation failed";
            case 8:
                return new vb8();
            case 9:
                return Float.valueOf(dri.a(1, 6.0f));
            case 10:
                return Integer.valueOf((int) dri.a(1, 14.0f));
            case 11:
                return Integer.valueOf((int) dri.a(1, 16.0f));
            case 12:
                return Integer.valueOf((int) dri.a(1, 32.0f));
            case 13:
                return Integer.valueOf((int) dri.a(1, 480.0f));
            case 14:
                return Float.valueOf(dri.a(1, 12.0f));
            case 15:
                return Integer.valueOf((int) dri.a(1, 4.0f));
            case 16:
                return Integer.valueOf((int) ((Number) dri.a.getValue()).floatValue());
            case 17:
                return Integer.valueOf((int) dri.a(1, 8.0f));
            case 18:
                return Integer.valueOf((int) dri.a(1, 10.0f));
            case 19:
                return Integer.valueOf((int) dri.a(1, 11.0f));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return Integer.valueOf((int) ((Number) dri.b.getValue()).floatValue());
            case 21:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 22:
                BoringLayout.Metrics metrics = new BoringLayout.Metrics();
                wti.p.getFontMetricsInt(metrics);
                return metrics;
            case 23:
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.FILL);
                return paint2;
            case 24:
                return new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
            case 25:
                zv8[] zv8VarArr = izi.y1;
                return sbi.a;
            case 26:
                return new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
            case 27:
                return new Rect();
            case 28:
                return new Path();
            default:
                return new RectF();
        }
    }
}
