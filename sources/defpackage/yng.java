package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class yng extends ViewGroup implements eph {
    public kbc a;
    public final aog b;
    public final RecyclerView c;

    public yng(Context context) {
        super(context, null);
        aog aogVar = new aog(context);
        this.b = aogVar;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.oneme_stickers_sticker_set_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        recyclerView.h(new q91(iK, iK, 10), -1);
        recyclerView.setHasFixedSize(true);
        this.c = recyclerView;
        setClipChildren(false);
        addView(aogVar);
        addView(recyclerView);
    }

    public final kbc getCustomTheme() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        aog aogVar = this.b;
        int measuredWidth = aogVar.getMeasuredWidth() + paddingStart;
        aog aogVar2 = this.b;
        yab.j0(paddingStart, paddingTop, measuredWidth, aogVar2.getMeasuredHeight() + paddingTop, aogVar, this);
        int bottom = aogVar2.getBottom();
        int measuredWidth2 = getMeasuredWidth();
        int bottom2 = aogVar2.getBottom();
        RecyclerView recyclerView = this.c;
        yab.j0(0, bottom, measuredWidth2, recyclerView.getMeasuredHeight() + bottom2, recyclerView, this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        aog aogVar = this.b;
        aogVar.measure(i, i2);
        RecyclerView recyclerView = this.c;
        recyclerView.measure(i, i2);
        setMeasuredDimension(size, recyclerView.getMeasuredHeight() + aogVar.getMeasuredHeight());
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc kbcVar2 = this.a;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        this.b.onThemeChanged(kbcVar);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.a = kbcVar;
        if (kbcVar != null) {
            onThemeChanged(kbcVar);
        }
    }

    public final void setHeaderClickAction(af7 af7Var) {
        qe7.H(this.b.getHeaderButton(), 300L, new d8(18, af7Var));
    }
}
