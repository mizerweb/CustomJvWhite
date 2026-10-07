package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class aog extends ViewGroup implements eph {
    public final TextView a;
    public final TextView b;
    public final cyb c;
    public final cyb d;

    public aog(Context context) {
        super(context, null);
        TextView textViewE = qv1.e(context, R.id.oneme_stickers_sticker_set_header_title);
        q9i.a(q9i.h, textViewE);
        a8g a8gVar = pq3.j;
        textViewE.setTextColor(a8gVar.h(textViewE).getText().b);
        this.a = textViewE;
        TextView textViewE2 = qv1.e(context, R.id.oneme_stickers_sticker_set_header_subtitle);
        textViewE2.setTextColor(p.d(textViewE2, q9i.i, a8gVar, textViewE2).e);
        this.b = textViewE2;
        cyb cybVar = new cyb(context);
        cybVar.setId(R.id.oneme_stickers_sticker_set_header_button);
        ayb aybVar = ayb.j;
        cybVar.setSize(aybVar);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setVisibility(8);
        this.c = cybVar;
        cyb cybVar2 = new cyb(context);
        cybVar2.setId(R.id.oneme_stickers_sticker_set_header_more_button);
        cybVar2.setSize(aybVar);
        cybVar2.setAppearance(zxb.GHOST);
        cybVar2.setIconResource(R.drawable.icon_dots_vertical);
        cybVar2.setVisibility(8);
        this.d = cybVar2;
        addView(textViewE);
        addView(textViewE2);
        addView(cybVar);
        addView(cybVar2);
    }

    public final void a(CharSequence charSequence, String str, int i, zxb zxbVar, boolean z) {
        this.a.setText(charSequence);
        this.b.setText(str);
        String strQ = np4.q(getContext(), i);
        cyb cybVar = this.c;
        cybVar.setText(strQ);
        cybVar.setAppearance(zxbVar);
        cybVar.setVisibility(0);
        this.d.setVisibility(z ? 0 : 8);
    }

    public final cyb getHeaderButton() {
        return this.c;
    }

    public final cyb getMoreButton() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int right;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        TextView textView = this.a;
        qyj.M(textView, paddingStart, paddingTop, 0, 12);
        int paddingStart2 = getPaddingStart();
        int bottom = textView.getBottom();
        TextView textView2 = this.b;
        qyj.M(textView2, paddingStart2, bottom, 0, 12);
        int bottom2 = textView2.getBottom() / 2;
        cyb cybVar = this.c;
        int measuredHeight = bottom2 - (cybVar.getMeasuredHeight() / 2);
        int measuredWidth = getMeasuredWidth();
        int paddingEnd = getPaddingEnd();
        cyb cybVar2 = this.d;
        qyj.M(cybVar2, measuredWidth - (cybVar2.getMeasuredWidth() + paddingEnd), measuredHeight, 0, 12);
        if (cybVar2.getVisibility() == 0) {
            right = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, cybVar2.getLeft());
        } else {
            right = cybVar2.getRight();
        }
        qyj.M(cybVar, right - cybVar.getMeasuredWidth(), measuredHeight, 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        cyb cybVar = this.c;
        cybVar.measure(iMakeMeasureSpec, i2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        cyb cybVar2 = this.d;
        cybVar2.measure(iMakeMeasureSpec2, i2);
        int iB = qv1.b(8.0f, yl5.d().getDisplayMetrics().density, cybVar2.getMeasuredWidth() + zo5.b(10.0f, yl5.d().getDisplayMetrics().density, cybVar.getMeasuredWidth()), size);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iB, Integer.MIN_VALUE);
        TextView textView = this.a;
        textView.measure(iMakeMeasureSpec3, i2);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iB, Integer.MIN_VALUE);
        TextView textView2 = this.b;
        textView2.measure(iMakeMeasureSpec4, i2);
        setMeasuredDimension(size, textView2.getMeasuredHeight() + textView.getMeasuredHeight());
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setTextColor(kbcVar.getText().b);
        this.b.setTextColor(kbcVar.getText().e);
        this.c.e();
        this.d.e();
    }
}
