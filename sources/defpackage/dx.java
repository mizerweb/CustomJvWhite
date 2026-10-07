package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dx extends tee {
    public static final int g = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
    public static final int h = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
    public static final int i = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
    public final Context a;
    public final Rect b;
    public final TextPaint c;
    public final ny8 d;
    public final ny8 e;
    public final v56 f;

    public dx(Context context) {
        this.a = context;
        kbc kbcVar = pq3.j.e(context).j().b;
        this.b = new Rect();
        TextPaint textPaint = new TextPaint();
        noh.d(q9i.k.g(), context, textPaint, null, null, 12);
        textPaint.setColor(kbcVar.getText().d);
        this.c = textPaint;
        final int i2 = 0;
        this.d = rx8.P(3, new af7(this) { // from class: cx
            public final /* synthetic */ dx b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                dx dxVar = this.b;
                switch (i3) {
                    case 0:
                        return dxVar.a.getString(R.string.media_picker_aspect_ratios_bottom_sheet_portrait_header).toUpperCase(Locale.ROOT);
                    default:
                        return dxVar.a.getString(R.string.media_picker_aspect_ratios_bottom_sheet_album_header).toUpperCase(Locale.ROOT);
                }
            }
        });
        final int i3 = 1;
        this.e = rx8.P(3, new af7(this) { // from class: cx
            public final /* synthetic */ dx b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                dx dxVar = this.b;
                switch (i4) {
                    case 0:
                        return dxVar.a.getString(R.string.media_picker_aspect_ratios_bottom_sheet_portrait_header).toUpperCase(Locale.ROOT);
                    default:
                        return dxVar.a.getString(R.string.media_picker_aspect_ratios_bottom_sheet_album_header).toUpperCase(Locale.ROOT);
                }
            }
        });
        this.f = new v56(9, (byte) 0);
    }

    public static Integer i(RecyclerView recyclerView, int i2) {
        nee adapter = recyclerView.getAdapter();
        if (adapter == null || i2 == 0 || i2 == -1 || i2 >= adapter.l()) {
            return null;
        }
        return Integer.valueOf(adapter.n(i2));
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        super.f(rect, view, recyclerView, hfeVar);
        int iP = RecyclerView.P(view);
        Integer numI = i(recyclerView, iP);
        if (numI != null) {
            int iIntValue = numI.intValue();
            Integer numI2 = i(recyclerView, iP - 1);
            if ((iIntValue == R.id.media_editor_aspect_ratio_portrait_view_type && (numI2 == null || numI2.intValue() != R.id.media_editor_aspect_ratio_portrait_view_type)) || (iIntValue == R.id.media_editor_aspect_ratio_album_view_type && (numI2 == null || numI2.intValue() != R.id.media_editor_aspect_ratio_album_view_type))) {
                rect.top = i;
            }
        }
        this.f.J(rect, view, recyclerView);
    }

    @Override // defpackage.tee
    public final void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        int i2 = 0;
        while (true) {
            if (!(i2 < recyclerView.getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = recyclerView.getChildAt(i2);
            if (childAt == null) {
                ore.i();
                return;
            }
            int iP = RecyclerView.P(childAt);
            Integer numI = i(recyclerView, iP);
            String str = null;
            if (numI != null) {
                int iIntValue = numI.intValue();
                Integer numI2 = i(recyclerView, iP - 1);
                if (iIntValue == R.id.media_editor_aspect_ratio_portrait_view_type && (numI2 == null || numI2.intValue() != R.id.media_editor_aspect_ratio_portrait_view_type)) {
                    str = (String) this.d.getValue();
                } else if (iIntValue == R.id.media_editor_aspect_ratio_album_view_type && (numI2 == null || numI2.intValue() != R.id.media_editor_aspect_ratio_album_view_type)) {
                    str = (String) this.e.getValue();
                }
            }
            if (str != null) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                v56 v56Var = this.f;
                Rect rect = this.b;
                v56Var.E(rect, childAt, iP);
                canvas.drawText(upperCase, rect.left + g, rect.bottom - h, this.c);
            }
            i2 = i3;
        }
    }
}
