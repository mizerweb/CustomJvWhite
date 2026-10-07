package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class axl {
    public static foh a(Context context, ky8 ky8Var) {
        int i;
        kbc kbcVar = pq3.j.e(context).j().a;
        String strQ = np4.q(context, R.string.oneme_text_story_label);
        TextPaint textPaint = new TextPaint(1);
        noh.d(q9i.d, context, textPaint, null, null, 12);
        textPaint.setColor(kbcVar.getText().b);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setPathEffect(new CornerPathEffect(yl5.d().getDisplayMetrics().density * 4.0f));
        c29 c29Var = new c29(strQ);
        if (!c29Var.hasNext()) {
            qr7.d();
            return null;
        }
        int iCeil = (int) Math.ceil(textPaint.measureText((String) c29Var.next()));
        loop0: while (true) {
            i = iCeil;
            do {
                if (!c29Var.hasNext()) {
                    break loop0;
                }
                iCeil = (int) Math.ceil(textPaint.measureText((String) c29Var.next()));
            } while (i >= iCeil);
        }
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        Layout layoutA = ky8.a(ky8Var, strQ, textPaint, i, Integer.MAX_VALUE, false, null, 0.0f, false, 480);
        enh enhVar = new enh(yl5.d().getDisplayMetrics().density * 4.0f, yl5.d().getDisplayMetrics().density * 4.0f);
        enhVar.b(layoutA, strQ);
        RectF rectF = new RectF();
        Path path = enhVar.d;
        path.computeBounds(rectF, true);
        int lineCount = layoutA.getLineCount() - 1;
        return new foh(paint, layoutA, path, rectF, lineCount >= 0 ? layoutA.getLineRight(lineCount) : 0.0f, lineCount >= 0 ? layoutA.getLineBottom(lineCount) : 0, lineCount >= 0, wk8.p(context, R.drawable.icon_thumb), wk8.p(context, R.drawable.icon_fire), (yl5.d().getDisplayMetrics().density * 32.0f) / 2.0f, yl5.d().getDisplayMetrics().density * 24.0f, yl5.d().getDisplayMetrics().density * 8.0f, (yl5.d().getDisplayMetrics().density * 32.0f) / 2.0f, yl5.d().getDisplayMetrics().density * 3.0f, yl5.d().getDisplayMetrics().density * 4.0f);
    }

    public static final String b(Bitmap bitmap) {
        String strH = zo5.h(System.identityHashCode(bitmap), "@");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String str = bitmap.isRecycled() ? "|recycled" : "";
        int generationId = bitmap.getGenerationId();
        StringBuilder sbR = c0a.r(width, "Bitmap", strH, "(", "x");
        sbR.append(height);
        sbR.append(str);
        sbR.append("|genId=");
        sbR.append(generationId);
        sbR.append(")");
        return sbR.toString();
    }
}
