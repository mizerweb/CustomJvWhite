package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f7d extends ViewGroup {
    public final h7d a;
    public final q9c b;
    public final int c;

    public f7d(Context context) {
        super(context, null);
        h7d h7dVar = new h7d(context);
        this.a = h7dVar;
        q9c q9cVar = new q9c(context);
        q9cVar.setAvatarSize(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        q9cVar.setClipLastAvatar(true);
        this.b = q9cVar;
        this.c = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        addView(h7dVar, new ViewGroup.LayoutParams(-2, -2));
        addView(q9cVar, new ViewGroup.LayoutParams(-2, -2));
    }

    public final int getCounterWidth() {
        return this.a.getCounterWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        q9c q9cVar = this.b;
        if (q9cVar.getVisibility() == 0) {
            qyj.M(q9cVar, 0, (getMeasuredHeight() / 2) - (q9cVar.getMeasuredHeight() / 2), 0, 12);
            measuredWidth = q9cVar.getMeasuredWidth() - this.c;
        } else {
            measuredWidth = 0;
        }
        int measuredHeight = getMeasuredHeight() / 2;
        h7d h7dVar = this.a;
        qyj.M(h7dVar, measuredWidth, measuredHeight - (h7dVar.getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        q9c q9cVar = this.b;
        if (q9cVar.getVisibility() == 0) {
            q9cVar.measure(i, i2);
            measuredWidth = q9cVar.getMeasuredWidth() - this.c;
            measuredHeight = q9cVar.getMeasuredHeight();
        } else {
            measuredWidth = 0;
            measuredHeight = 0;
        }
        h7d h7dVar = this.a;
        h7dVar.measure(i, i2);
        setMeasuredDimension(h7dVar.getMeasuredWidth() + measuredWidth, Math.max(measuredHeight, h7dVar.getMeasuredHeight()));
    }

    public final void setAvatars(List<ylc> list) {
        q9c q9cVar = this.b;
        q9cVar.setAvatars(list);
        List<ylc> list2 = list;
        q9cVar.setVisibility(list2 == null || list2.isEmpty() ? 8 : 0);
    }
}
