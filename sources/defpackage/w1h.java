package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import one.me.stories.publish.PublishStoryBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w1h extends tee implements eph {
    public final Context a;
    public final ih b;
    public final kbc c;
    public final Rect d = new Rect();
    public final TextPaint e = new TextPaint();
    public final int f = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
    public final int g = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
    public final v56 h = new v56(9, (byte) 0);

    public w1h(Context context, kbc kbcVar, ih ihVar, kbc kbcVar2) {
        this.a = context;
        this.b = ihVar;
        this.c = kbcVar2;
        onThemeChanged(kbcVar);
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        super.f(rect, view, recyclerView, hfeVar);
        int iP = RecyclerView.P(view);
        PublishStoryBottomSheet publishStoryBottomSheet = (PublishStoryBottomSheet) this.b.a;
        Integer numD1 = PublishStoryBottomSheet.D1(publishStoryBottomSheet, iP);
        int iK = 0;
        if (numD1 != null) {
            int iIntValue = numD1.intValue();
            Integer numD2 = PublishStoryBottomSheet.D1(publishStoryBottomSheet, iP - 1);
            if (iIntValue == R.id.oneme_stories_preset_whitelist_item && (numD2 == null || numD2.intValue() != R.id.oneme_stories_preset_whitelist_item)) {
                iK = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
            } else if (iIntValue == R.id.oneme_stories_preset_blacklist_item && (numD2 == null || numD2.intValue() != R.id.oneme_stories_preset_blacklist_item)) {
                iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
            }
        }
        rect.top = iK;
        this.h.J(rect, view, recyclerView);
    }

    @Override // defpackage.tee
    public final void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                ore.i();
                return;
            }
            int iP = RecyclerView.P(childAt);
            ih ihVar = this.b;
            PublishStoryBottomSheet publishStoryBottomSheet = (PublishStoryBottomSheet) ihVar.a;
            Integer numD1 = PublishStoryBottomSheet.D1(publishStoryBottomSheet, iP);
            String str = null;
            if (numD1 != null) {
                int iIntValue = numD1.intValue();
                Integer numD2 = PublishStoryBottomSheet.D1(publishStoryBottomSheet, iP - 1);
                String str2 = (String) ihVar.b;
                if (iIntValue == R.id.oneme_stories_preset_whitelist_item && (numD2 == null || numD2.intValue() != R.id.oneme_stories_preset_whitelist_item)) {
                    str = str2;
                }
            }
            if (str != null) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                v56 v56Var = this.h;
                Rect rect = this.d;
                v56Var.E(rect, childAt, iP);
                canvas.drawText(upperCase, rect.left + this.f, rect.bottom - this.g, this.e);
            }
            i = i2;
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc kbcVar2 = this.c;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        noh nohVarG = q9i.k.g();
        Context context = this.a;
        TextPaint textPaint = this.e;
        noh.d(nohVarG, context, textPaint, null, null, 12);
        textPaint.setColor(kbcVar.getText().d);
    }
}
