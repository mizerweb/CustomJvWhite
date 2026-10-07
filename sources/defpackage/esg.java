package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class esg extends ViewGroup implements eph {
    public final kwb a;
    public final TextView b;
    public final int c;
    public final int d;
    public boolean e;
    public String f;

    public esg(Context context) {
        super(context);
        kwb kwbVar = new kwb(context);
        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.a = kwbVar;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setTextColor(pq3.j.h(textView).getText().b);
        q9i.a(q9i.k, textView);
        this.b = textView;
        this.c = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        this.d = gm0.K(62.0f * yl5.d().getDisplayMetrics().density);
        addView(kwbVar);
        addView(textView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth() / 2;
        kwb kwbVar = this.a;
        qyj.M(kwbVar, measuredWidth - (kwbVar.getMeasuredWidth() / 2), 0, 0, 12);
        int measuredWidth2 = getMeasuredWidth() / 2;
        TextView textView = this.b;
        qyj.M(textView, measuredWidth2 - (textView.getMeasuredWidth() / 2), (getMeasuredHeight() - this.c) - textView.getMeasuredHeight(), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.d;
        this.a.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(gm0.K(yl5.d().getDisplayMetrics().density * 62.0f), 1073741824), i2);
        setMeasuredDimension(gm0.K(62.0f * yl5.d().getDisplayMetrics().density), gm0.K(88.0f * yl5.d().getDisplayMetrics().density));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b.setTextColor(kbcVar.getText().b);
        this.a.onThemeChanged(kbcVar);
    }

    public final void setIconState(msg msgVar) {
        msg msgVar2 = msg.a;
        msg msgVar3 = msg.b;
        this.a.x(msgVar == msgVar2 || msgVar == msgVar3, msgVar == msgVar3);
    }

    public final void setModel(osg osgVar) {
        String str = osgVar.c;
        setId(Long.hashCode(osgVar.i));
        int i = osgVar.e;
        int i2 = osgVar.f;
        this.e = i == i2;
        boolean zD = cqk.d(this.f, str);
        kwb kwbVar = this.a;
        if (!zD) {
            this.f = str;
            kwbVar.p1 = null;
            kwbVar.b.i(null);
        }
        kwb.u(kwbVar, str, osgVar.b);
        kwbVar.z(i, i2);
        int iOrdinal = osgVar.g.ordinal();
        if (iOrdinal == 0) {
            kwbVar.x(true, false);
        } else if (iOrdinal == 1) {
            kwbVar.x(true, true);
        } else {
            if (iOrdinal != 2) {
                ore.o();
                return;
            }
            kwbVar.x(false, false);
        }
        kwbVar.setLoading(osgVar.h);
        this.b.setText(osgVar.d.d(this));
    }

    public final void setPublishProgress(Float f) {
        this.a.setLoading(f);
    }

    public final void setStoriesBadgeAlpha(int i) {
        if (isAttachedToWindow()) {
            this.a.setStoriesBadgeAlpha(i);
        }
    }

    public final void setStoriesStrokeAlpha(int i) {
        if (isAttachedToWindow()) {
            this.a.setStoriesStrokeAlpha(i);
        }
    }

    public final void setStoryAddListener(af7 af7Var) {
        this.a.setNewStoriesClickListener(af7Var);
    }

    public final void setTitleAlpha(float f) {
        this.b.setAlpha(f);
    }
}
