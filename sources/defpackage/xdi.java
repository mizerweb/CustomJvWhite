package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xdi extends gnh {
    public final cf7 s;
    public final GradientDrawable t;
    public final TextView u;

    public xdi(Context context, cf7 cf7Var) {
        super(context);
        this.s = cf7Var;
        GradientDrawable gradientDrawableT = qyj.T(null, null, bc1.k(1.0f, yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        this.t = gradientDrawableT;
        TextView textView = new TextView(context);
        textView.setText(np4.q(textView.getContext(), R.string.update));
        q9i.a(q9i.q, textView);
        textView.setTextColor(((xac) pq3.j.h(textView).f().a).b.l);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setBackground(gradientDrawableT);
        this.u = textView;
        addView(textView);
    }

    @Override // defpackage.gnh, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int contentHorizontalPadding$message_list = getContentHorizontalPadding$message_list();
        int contentTopPadding$message_list = getContentTopPadding$message_list();
        if (n7j.o(getSenderNameViewStub$message_list().b)) {
            getSenderNameViewStub$message_list().c(contentHorizontalPadding$message_list, contentTopPadding$message_list);
            contentTopPadding$message_list = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, getSenderNameViewStub$message_list().a(), contentTopPadding$message_list);
        }
        if (n7j.o((ny8) getSenderAliasDelegate().b) && n7j.o(getSenderNameViewStub$message_list().b)) {
            getSenderAliasDelegate().T((getMeasuredWidth() - contentHorizontalPadding$message_list) - getSenderAliasDelegate().L(), getContentTopPadding$message_list() + ((getSenderNameViewStub$message_list().a() / 2) - (getSenderAliasDelegate().K() / 2)));
        }
        if (n7j.o((ny8) getMessageLinkDelegate().b)) {
            getMessageLinkDelegate().T(contentHorizontalPadding$message_list, contentTopPadding$message_list);
            contentTopPadding$message_list = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, getMessageLinkDelegate().K(), contentTopPadding$message_list);
        }
        qyj.M(getMessageTextView$message_list(), contentHorizontalPadding$message_list, contentTopPadding$message_list, 0, 12);
        int measuredHeight = getMessageTextView$message_list().getMeasuredHeight() + contentTopPadding$message_list;
        TextView textView = this.u;
        if (textView.getVisibility() == 0) {
            int iB = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, measuredHeight);
            qyj.M(textView, (getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2), iB, 0, 12);
            measuredHeight = iB + textView.getMeasuredHeight();
        }
        if (n7j.o((ny8) getReactionsDelegate().b)) {
            getReactionsDelegate().T(contentHorizontalPadding$message_list, zo5.b(8.0f, yl5.d().getDisplayMetrics().density, measuredHeight));
            getReactionsDelegate().K();
        }
        qyj.M(getDate$message_list(), (getMeasuredWidth() - getDate$message_list().getMeasuredWidth()) - getContentHorizontalPadding$message_list(), zo5.D(4.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight() - getDate$message_list().getMeasuredHeight()), 0, 12);
    }

    @Override // defpackage.gnh, android.view.View
    public final void onMeasure(int i, int i2) {
        int iF = r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        getMessageTextView$message_list().j();
        int measuredWidth = getDependOnOutsideView() ? iF : getMessageTextView$message_list().getMeasuredWidth();
        int measuredHeight = getMessageTextView$message_list().getMeasuredHeight();
        if (n7j.o((ny8) getSenderAliasDelegate().b) && n7j.o(getSenderNameViewStub$message_list().b)) {
            getSenderAliasDelegate().U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, getSenderAliasDelegate().L());
        }
        if (n7j.o(getSenderNameViewStub$message_list().b)) {
            getSenderNameViewStub$message_list().d(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, getSenderNameViewStub$message_list().b() + getSenderAliasDelegate().Z());
            measuredHeight = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, getSenderNameViewStub$message_list().a(), measuredHeight);
        }
        if (n7j.o((ny8) getMessageLinkDelegate().b)) {
            getMessageLinkDelegate().U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, getMessageLinkDelegate().L());
            measuredHeight = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, getMessageLinkDelegate().K(), measuredHeight);
        }
        if (n7j.o((ny8) getReactionsDelegate().b)) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, getReactionsDelegate().L());
            measuredHeight = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, getReactionsDelegate().K(), measuredHeight);
        }
        TextView textView = this.u;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(iF, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(40.0f * yl5.d().getDisplayMetrics().density), 1073741824));
            measuredWidth = Math.max(measuredWidth, textView.getMeasuredWidth());
            measuredHeight = c0a.e(14.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredHeight(), measuredHeight);
        }
        getDate$message_list().measure(i, i2);
        int measuredHeight2 = getDate$message_list().getMeasuredHeight() + measuredHeight;
        int iB = zo5.b(10.0f, yl5.d().getDisplayMetrics().density, getDate$message_list().getMeasuredWidth() + zo5.b(6.0f, yl5.d().getDisplayMetrics().density, n7j.o((ny8) getReactionsDelegate().b) ? getReactionsDelegate().L() : getMessageTextView$message_list().e(iF)));
        if (iB < iF) {
            measuredWidth = Math.max(measuredWidth, iB);
        } else {
            measuredHeight2 = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, measuredHeight2);
        }
        setMeasuredDimension(bc1.g(10.0f, yl5.d().getDisplayMetrics().density, 2, measuredWidth), c0a.e(10.0f, yl5.d().getDisplayMetrics().density, gm0.K(4.0f * yl5.d().getDisplayMetrics().density), measuredHeight2));
    }

    @Override // defpackage.gnh, defpackage.i59
    public final boolean r() {
        return false;
    }

    @Override // defpackage.gnh, defpackage.hnh
    public void setTextMessageColors(xac xacVar) {
        super.setTextMessageColors(xacVar);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(xacVar.a.e);
        GradientDrawable gradientDrawable = this.t;
        gradientDrawable.setColor(colorStateListValueOf);
        gradientDrawable.setStroke(gm0.K(1.0f * yl5.d().getDisplayMetrics().density), ColorStateList.valueOf(xacVar.d.e));
        this.u.setTextColor(xacVar.b.l);
        invalidate();
    }
}
