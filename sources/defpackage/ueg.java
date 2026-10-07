package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import one.me.chatmedia.viewer.video.playbackSpeed.PlaybackSettingsBottomSheet;

/* JADX INFO: loaded from: classes4.dex */
public final class ueg extends wf4 {
    public teg s;
    public final DecimalFormat t;

    public ueg(Context context) {
        super(context);
        DecimalFormat decimalFormat = new DecimalFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(',');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setGroupingUsed(false);
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setMinimumFractionDigits(0);
        this.t = decimalFormat;
        setLayoutParams(new uf4(-1, -2));
    }

    public final void setButtons(float[] fArr) {
        removeAllViews();
        ArrayList arrayList = new ArrayList();
        for (final float f : fArr) {
            final TextView textView = new TextView(getContext());
            textView.setId(View.generateViewId());
            textView.setGravity(17);
            q9i.a(q9i.h, textView);
            a8g a8gVar = pq3.j;
            textView.setTextColor(a8gVar.l(textView).b.getText().b);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            sb8.m0(a8gVar.l(textView).b.h().b, shapeDrawable);
            textView.setBackground(shapeDrawable);
            textView.setText(this.t.format(Float.valueOf(f)));
            qe7.H(textView, 300L, new View.OnClickListener() { // from class: seg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p0m.a(textView, kt7.CLOCK_TICK);
                    teg tegVar = this.s;
                    if (tegVar != null) {
                        PlaybackSettingsBottomSheet playbackSettingsBottomSheet = (PlaybackSettingsBottomSheet) ((xva) tegVar).b;
                        qeg qegVar = (qeg) playbackSettingsBottomSheet.p.getValue();
                        float f2 = f;
                        qegVar.a(1, f2);
                        l63 l63VarD1 = playbackSettingsBottomSheet.D1();
                        mjg mjgVar = l63VarD1.E1;
                        Float fValueOf = Float.valueOf(f2);
                        mjgVar.getClass();
                        mjgVar.j(null, fValueOf);
                        a8j.x(l63VarD1.Y, new ub6(f2));
                        playbackSettingsBottomSheet.v1(true);
                    }
                }
            });
            arrayList.add(textView);
            addView(textView, gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
        }
        eg4 eg4VarH = ch3.h(this);
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            TextView textView2 = (TextView) obj;
            if (i == 0) {
                int id = textView2.getId();
                eg4VarH.d(id, 6, 0, 6);
                eg4VarH.d(id, 7, ((TextView) arrayList.get(1)).getId(), 6);
                eg4VarH.g(id).d.V = 1;
            } else if (i == arrayList.size() - 1) {
                int id2 = textView2.getId();
                eg4VarH.d(id2, 6, ((TextView) arrayList.get(i - 1)).getId(), 7);
                eg4VarH.d(id2, 7, 0, 7);
            } else {
                int id3 = textView2.getId();
                eg4VarH.d(id3, 6, ((TextView) arrayList.get(i - 1)).getId(), 7);
                eg4VarH.d(id3, 7, ((TextView) arrayList.get(i2)).getId(), 6);
            }
            i = i2;
        }
        eg4VarH.a(this);
        invalidate();
        requestLayout();
    }

    public final void setListener(teg tegVar) {
        this.s = tegVar;
    }
}
