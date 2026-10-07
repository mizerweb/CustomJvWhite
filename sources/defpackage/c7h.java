package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class c7h extends RecyclerView implements eph {
    public static final /* synthetic */ zv8[] p2 = {new z8b(c7h.class, "pickerOverlayColor", "getPickerOverlayColor()I"), zo5.e(zfe.a, c7h.class, "isInfinite", "isInfinite()Z")};
    public static final PathInterpolator q2 = new PathInterpolator(0.22f, 0.6f, 0.36f, 1.0f);
    public final b7h j2;
    public final b7h k2;
    public Long l2;
    public final LinearLayoutManager m2;
    public final a7h n2;
    public w6h o2;

    static {
        new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.33f, 0.0f, 0.51f, 1.0f);
        new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    }

    public c7h(Context context, v6h v6hVar) {
        super(context);
        pq3.j.e(context).j();
        this.j2 = new b7h(this, 0);
        this.k2 = new b7h(this, 1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.m2 = linearLayoutManager;
        a7h a7hVar = new a7h(v6hVar, new rea(2, this, c7h.class, "onStyleClicked", "onStyleClicked(Lone/me/sdk/uikit/common/stylepicker/StylePickerView$StyleItem;I)V", 0, 18));
        this.n2 = a7hVar;
        setLayoutManager(linearLayoutManager);
        setAdapter(a7hVar);
        setItemAnimator(null);
        setOverScrollMode(2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 28.0f);
        gradientDrawable.setColor(getPickerOverlayColor());
        setBackground(gradientDrawable);
        setClipToOutline(true);
    }

    public static void I0(c7h c7hVar, long j) {
        a7h a7hVar = c7hVar.n2;
        List list = a7hVar.h;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((x6h) it.next()).a == j) {
                Long l = c7hVar.l2;
                if (l != null && l.longValue() == j) {
                    return;
                }
                c7hVar.l2 = Long.valueOf(j);
                a7hVar.F(Long.valueOf(j), true);
                Integer selectedAdapterPosition = c7hVar.getSelectedAdapterPosition();
                if (selectedAdapterPosition != null) {
                    c7hVar.F0(selectedAdapterPosition.intValue());
                    return;
                }
                return;
            }
        }
    }

    private final int getCenterOffset() {
        Integer numValueOf = Integer.valueOf(getWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        return ((numValueOf != null ? numValueOf.intValue() : gm0.K(240.0f * yl5.d().getDisplayMetrics().density)) / 2) - (gm0.K(48.0f * yl5.d().getDisplayMetrics().density) / 2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
    private final Integer getSelectedAdapterPosition() {
        Integer selectedStyleIndex = getSelectedStyleIndex();
        if (selectedStyleIndex == null) {
            return null;
        }
        int iIntValue = selectedStyleIndex.intValue();
        zv8 zv8Var = p2[1];
        if (!((Boolean) this.k2.b).booleanValue()) {
            return selectedStyleIndex;
        }
        View viewF = F(getWidth() / 2.0f, getHeight() / 2.0f);
        a7h a7hVar = this.n2;
        if (viewF != null) {
            int iP = RecyclerView.P(viewF);
            Integer numValueOf = Integer.valueOf(iP);
            if (iP == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue2 = numValueOf.intValue();
                int size = a7hVar.h.size();
                if (size > 1) {
                    int i = iIntValue2 - (iIntValue2 % size);
                    pu6 pu6Var = new pu6(yhf.m0(a.K0(new Integer[]{Integer.valueOf((i - size) + iIntValue), Integer.valueOf(i + iIntValue), Integer.valueOf(i + size + iIntValue)}), new ptf(15, this)));
                    if (!pu6Var.hasNext()) {
                        qr7.d();
                        return null;
                    }
                    Object next = pu6Var.next();
                    if (pu6Var.hasNext()) {
                        int iAbs = Math.abs(((Number) next).intValue() - iIntValue2);
                        do {
                            Object next2 = pu6Var.next();
                            int iAbs2 = Math.abs(((Number) next2).intValue() - iIntValue2);
                            if (iAbs > iAbs2) {
                                next = next2;
                                iAbs = iAbs2;
                            }
                        } while (pu6Var.hasNext());
                    }
                    iIntValue = ((Number) next).intValue();
                }
            } else if (a7hVar.h.size() > 1) {
                iIntValue += 1073741823 - (1073741823 % a7hVar.h.size());
            }
        } else if (a7hVar.h.size() > 1) {
            iIntValue += 1073741823 - (1073741823 % a7hVar.h.size());
        }
        return Integer.valueOf(iIntValue);
    }

    private final Integer getSelectedStyleIndex() {
        a7h a7hVar = this.n2;
        if (a7hVar.h.isEmpty()) {
            return null;
        }
        Iterator it = a7hVar.h.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            long j = ((x6h) it.next()).a;
            Long l = this.l2;
            if (l != null && j == l.longValue()) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
        return Integer.valueOf(num != null ? num.intValue() : 0);
    }

    public final void F0(int i) {
        LinearLayoutManager linearLayoutManager = this.m2;
        View viewR = linearLayoutManager.r(i);
        if (viewR == null) {
            linearLayoutManager.p1(i, getCenterOffset());
        } else {
            z0(((viewR.getWidth() / 2) + viewR.getLeft()) - (getWidth() / 2), 0, false);
        }
    }

    public final void G0(boolean z) {
        Integer selectedStyleIndex = getSelectedStyleIndex();
        if (selectedStyleIndex != null) {
            int iIntValue = selectedStyleIndex.intValue();
            if (z) {
                a7h a7hVar = this.n2;
                if (a7hVar.h.size() > 1) {
                    iIntValue += 1073741823 - (1073741823 % a7hVar.h.size());
                }
            }
            this.m2.p1(iIntValue, getCenterOffset());
        }
    }

    public final void H0() {
        Integer selectedAdapterPosition = getSelectedAdapterPosition();
        if (selectedAdapterPosition != null) {
            this.m2.p1(selectedAdapterPosition.intValue(), gm0.K(48.0f * yl5.d().getDisplayMetrics().density) * 3);
        }
    }

    public final int getPickerOverlayColor() {
        zv8 zv8Var = p2[0];
        return ((Number) this.j2.b).intValue();
    }

    public final Long getSelectedStyleId() {
        return this.l2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.resolveSize(gm0.K(240.0f * yl5.d().getDisplayMetrics().density), i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.resolveSize(gm0.K(48.0f * yl5.d().getDisplayMetrics().density), i2), 1073741824));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
    }

    public final void setInfinite(boolean z) {
        this.k2.B(this, p2[1], Boolean.valueOf(z));
    }

    public final void setOnStyleSelectedListener(w6h w6hVar) {
        this.o2 = w6hVar;
    }

    public final void setPickerOverlayColor(int i) {
        this.j2.B(this, p2[0], Integer.valueOf(i));
    }
}
