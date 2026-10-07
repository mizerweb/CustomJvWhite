package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class j24 extends wf4 implements h24 {
    public final ImageView s;
    public final TextView t;
    public final ImageView u;
    public final View v;

    public j24(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.messages_list_comments_icon);
        imageView.setImageResource(R.drawable.ic_comments_24);
        this.s = imageView;
        TextView textViewE = qv1.e(context, R.id.messages_list_comments_label);
        textViewE.setEllipsize(TextUtils.TruncateAt.END);
        textViewE.setMaxLines(1);
        q9i.a(q9i.f, textViewE);
        this.t = textViewE;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R.id.messages_list_comments_end_icon);
        imageView2.setImageResource(R.drawable.ic_arrow_right_20);
        this.u = imageView2;
        View view = new View(context);
        view.setId(R.id.messages_list_comments_top_divider);
        this.v = view;
        int i = ((fn8) pq3.j.h(this).u().c.b).c;
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = yl5.d().getDisplayMetrics().density * 12.0f;
        }
        Drawable drawableC = col.c(i, null, new ShapeDrawable(new RoundRectShape(fArr, null, null)), 2);
        setId(R.id.messages_list_comments);
        setBackground(drawableC);
        addView(this.v, new uf4(0, gm0.K(1.0f * yl5.d().getDisplayMetrics().density)));
        View view2 = this.s;
        uf4 uf4Var = new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        uf4Var.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f));
        addView(view2, uf4Var);
        uf4 uf4Var2 = new uf4(-2, -2);
        uf4Var2.setMarginStart(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        addView(this.t, uf4Var2);
        View view3 = this.u;
        uf4 uf4Var3 = new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
        uf4Var3.setMarginEnd(gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        addView(view3, uf4Var3);
        View view4 = this.v;
        ImageView imageView3 = this.s;
        TextView textView = this.t;
        ImageView imageView4 = this.u;
        eg4 eg4VarH = ch3.h(this);
        int id = view4.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = imageView3.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 4, 0, 4);
        int id3 = textView.getId();
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 4, 0, 4);
        eg4VarH.d(id3, 6, imageView3.getId(), 7);
        eg4VarH.d(id3, 7, imageView4.getId(), 6);
        eg4VarH.g(id3).d.w = 0.0f;
        int id4 = imageView4.getId();
        eg4VarH.d(id4, 3, 0, 3);
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.a(this);
    }

    private static /* synthetic */ void getRippleDrawable$annotations() {
    }

    @Override // defpackage.h24
    public final void a(xac xacVar) {
        this.v.setBackgroundColor(xacVar.d.e);
        int i = xacVar.b.a;
        this.s.setColorFilter(i);
        this.t.setTextColor(i);
        this.u.setColorFilter(i);
    }

    @Override // defpackage.wf4, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, qv1.a(44.0f, yl5.d().getDisplayMetrics().density, 1073741824));
    }

    @Override // defpackage.h24
    public final void p(int i) {
        String quantityString;
        if (i == 0) {
            quantityString = getContext().getString(R.string.messages_list_discussion_entry_comment);
        } else {
            quantityString = getContext().getResources().getQuantityString(R.plurals.messages_list_discussion_entry_comments_count, i, i < 10000 ? l5h.e.format(Integer.valueOf(i)) : l5h.a(i));
        }
        this.t.setText(quantityString);
    }
}
