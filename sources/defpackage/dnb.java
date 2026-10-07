package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.BitSet;
import java.util.LinkedHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class dnb extends ViewGroup implements eph {
    public final Path a;
    public final Rect b;
    public final LinkedHashMap c;
    public cnb d;
    public final BitSet e;
    public final int f;
    public final int g;
    public final dn9 h;
    public final dn9 i;
    public final v0c j;

    public dnb(Context context) {
        super(context, null);
        this.a = new Path();
        this.b = new Rect();
        this.c = new LinkedHashMap();
        this.d = new cnb(0, false, false, false);
        BitSet bitSet = new BitSet(3);
        this.e = bitSet;
        this.f = 1;
        this.g = 2;
        dn9 dn9Var = new dn9(context);
        dn9Var.setId(R.id.oneme_notification_stack__mention_id);
        dn9Var.setIcon(R.drawable.icon_mention_mini);
        dn9Var.setFocusable(0);
        this.h = dn9Var;
        dn9 dn9Var2 = new dn9(context);
        dn9Var2.setId(R.id.oneme_notification_stack__reaction_id);
        dn9Var2.setIcon(R.drawable.icon_heart_fill_mini);
        dn9Var2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        dn9Var2.setFocusable(0);
        dn9Var2.setLayoutParams(new ViewGroup.MarginLayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
        this.i = dn9Var2;
        v0c v0cVar = new v0c(context);
        v0cVar.setId(R.id.oneme_notification_stack__counter_id);
        v0cVar.setFocusable(0);
        this.j = v0cVar;
        addView(v0cVar);
        addView(dn9Var);
        addView(dn9Var2);
        bitSet.set(0, bitSet.size(), false);
    }

    public static /* synthetic */ void getHasCounter$annotations() {
    }

    private final void setupMention(boolean z) {
        BitSet bitSet = this.e;
        boolean z2 = false;
        bitSet.set(0, z);
        if (!z && this.d.b) {
            z2 = true;
        }
        bitSet.set(this.f, z2);
        a8g a8gVar = pq3.j;
        dn9 dn9Var = this.h;
        dn9Var.setBackgroundColor(a8gVar.h(dn9Var).h().a);
        a8gVar.h(dn9Var);
        dn9Var.setIconColor(-1);
        requestLayout();
    }

    private final void setupReaction(boolean z) {
        this.e.set(this.f, z && !this.d.c);
        boolean z2 = this.d.d;
        a8g a8gVar = pq3.j;
        dn9 dn9Var = this.i;
        int i = z2 ? a8gVar.h(dn9Var).getIcon().d : -1;
        boolean z3 = this.d.d;
        yac yacVarH = a8gVar.h(dn9Var).h();
        dn9Var.setBackgroundColor(z3 ? yacVarH.b : yacVarH.d);
        dn9Var.setIconColor(i);
        requestLayout();
    }

    public final void a(View view) {
        dn9 dn9Var;
        Path path = this.a;
        path.reset();
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.b;
        rect.set(left, top, right, bottom);
        if (view instanceof dn9) {
            path.addCircle(rect.exactCenterX(), rect.exactCenterY(), Math.min(rect.width(), rect.height()) / 2.0f, Path.Direction.CCW);
        } else if (view instanceof v0c) {
            float f = rect.left;
            float f2 = rect.top;
            float f3 = rect.right;
            float f4 = rect.bottom;
            Path.Direction direction = Path.Direction.CCW;
            path.addRect(f, f2, f3, f4, direction);
            BitSet bitSet = this.e;
            if (bitSet.get(0)) {
                dn9Var = this.h;
            } else {
                dn9Var = bitSet.get(this.f) ? this.i : null;
            }
            if (dn9Var != null) {
                Rect rect2 = new Rect(dn9Var.getLeft(), dn9Var.getTop(), dn9Var.getRight(), dn9Var.getBottom());
                Path path2 = new Path();
                path2.addCircle(rect2.exactCenterX(), rect2.exactCenterY(), (Math.min(rect2.width(), rect2.height()) / 2.0f) + gm0.K(2.0f * yl5.d().getDisplayMetrics().density), direction);
                path.op(path2, Path.Op.DIFFERENCE);
            }
        }
        Path path3 = (Path) this.c.get(view);
        if (path3 != null) {
            path3.set(path);
        }
    }

    public final void b(boolean z, kbc kbcVar) {
        int i = z ? kbcVar.getIcon().d : -1;
        yac yacVarH = kbcVar.h();
        int i2 = z ? yacVarH.b : yacVarH.d;
        dn9 dn9Var = this.i;
        dn9Var.setBackgroundColor(i2);
        dn9Var.setIconColor(i);
        int i3 = kbcVar.h().a;
        dn9 dn9Var2 = this.h;
        dn9Var2.setBackgroundColor(i3);
        dn9Var2.setIconColor(-1);
        p0c p0cVar = p0c.a;
        v0c v0cVar = this.j;
        v0cVar.setAppearance(p0cVar);
        v0cVar.setMute(z);
        invalidate();
    }

    public final void c(boolean z) {
        cnb cnbVar = this.d;
        boolean z2 = cnbVar.c;
        this.d = cnb.a(cnbVar, 0, false, z, false, 11);
        if (z2 != z) {
            setupMention(z);
        }
    }

    public final void d(boolean z) {
        cnb cnbVar = this.d;
        boolean z2 = cnbVar.b;
        this.d = cnb.a(cnbVar, 0, z, false, false, 13);
        if (z2 != z) {
            setupReaction(z);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Object obj = this.c.get(view);
        if (obj == null) {
            ore.p("Required value was null.");
            return false;
        }
        int iSave = canvas.save();
        canvas.clipPath((Path) obj);
        try {
            return super.drawChild(canvas, view, j);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final boolean getHasCounter() {
        return this.d.a > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int i5 = this.f;
        BitSet bitSet = this.e;
        if (bitSet.get(i5)) {
            int paddingStart2 = getPaddingStart();
            int paddingTop = getPaddingTop();
            int paddingStart3 = getPaddingStart();
            dn9 dn9Var = this.i;
            yab.j0(paddingStart2, paddingTop, paddingStart3 + dn9Var.getMeasuredWidth(), getPaddingTop() + dn9Var.getMeasuredHeight(), this.i, this);
            a(dn9Var);
            paddingStart += dn9Var.getMeasuredWidth();
        }
        if (bitSet.get(0)) {
            int paddingStart4 = getPaddingStart();
            int paddingTop2 = getPaddingTop();
            int paddingStart5 = getPaddingStart();
            dn9 dn9Var2 = this.h;
            yab.j0(paddingStart4, paddingTop2, paddingStart5 + dn9Var2.getMeasuredWidth(), getPaddingTop() + dn9Var2.getMeasuredHeight(), this.h, this);
            a(dn9Var2);
            paddingStart += dn9Var2.getMeasuredWidth();
        }
        int i6 = paddingStart;
        if (bitSet.get(this.g)) {
            int measuredWidth = getMeasuredWidth() - getPaddingEnd();
            int paddingTop3 = getPaddingTop();
            int paddingTop4 = getPaddingTop();
            v0c v0cVar = this.j;
            yab.j0(i6, paddingTop3, measuredWidth, paddingTop4 + v0cVar.getMeasuredHeight(), this.j, this);
            a(v0cVar);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        BitSet bitSet = this.e;
        int i3 = bitSet.get(0) ? 0 : 8;
        dn9 dn9Var = this.h;
        dn9Var.setVisibility(i3);
        int i4 = bitSet.get(this.f) ? 0 : 8;
        dn9 dn9Var2 = this.i;
        dn9Var2.setVisibility(i4);
        int i5 = this.g;
        int i6 = bitSet.get(i5) ? 0 : 8;
        v0c v0cVar = this.j;
        v0cVar.setVisibility(i6);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
        if (bitSet.get(0)) {
            dn9Var.measure(qv1.a(20.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), 1073741824));
            measuredWidth = dn9Var.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        if (dn9Var2.getVisibility() == 0) {
            dn9Var2.measure(qv1.a(20.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), 1073741824));
            measuredWidth += dn9Var2.getMeasuredWidth();
        }
        if (bitSet.get(i5)) {
            v0cVar.measure(0, View.MeasureSpec.makeMeasureSpec(gm0.K(20.0f * yl5.d().getDisplayMetrics().density), 1073741824));
            measuredWidth += v0cVar.getMeasuredWidth();
        }
        setMeasuredDimension(measuredWidth, iK);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        b(this.d.d, kbcVar);
        this.j.onThemeChanged(kbcVar);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.c.put(view, new Path());
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
