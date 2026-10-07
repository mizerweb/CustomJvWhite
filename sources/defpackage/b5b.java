package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class b5b extends wf4 {
    public static final /* synthetic */ zv8[] w;
    public final q9c s;
    public final TextView t;
    public final TextView u;
    public final zb v;

    static {
        z8b z8bVar = new z8b(b5b.class, "messageTextColor", "getMessageTextColor()Lone/me/calls/ui/view/event/MultiContactCellView$Companion$Appearance;");
        zfe.a.getClass();
        w = new zv8[]{z8bVar};
    }

    public b5b(Context context) {
        super(context, null);
        q9c q9cVar = new q9c(context);
        q9cVar.setId(R.id.call_waiting_room_events_multi_view_avatar);
        q9cVar.setAvatarSize(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f));
        this.s = q9cVar;
        TextView textViewE = qv1.e(context, R.id.call_waiting_room_events_multi_view_title);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textViewE.setEllipsize(truncateAt);
        a8g a8gVar = pq3.j;
        textViewE.setTextColor(a8gVar.l(textViewE).b.getText().b);
        q9i.f.b(textViewE, bx5.b);
        textViewE.setSingleLine();
        this.t = textViewE;
        TextView textView = new TextView(context);
        textView.setId(R.id.call_waiting_room_events_multi_view_subtitle);
        textView.setEllipsize(truncateAt);
        textView.setSingleLine();
        textView.setTextColor(a8gVar.l(textView).b.getText().d);
        q9i.g.b(textView, bx5.b);
        this.u = textView;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.call_waiting_room_events_multi_view_chevron);
        imageView.setImageResource(R.drawable.icon_chevron_right);
        int iK = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        imageView.setPadding(iK, iK, iK, iK);
        imageView.setImageTintList(ColorStateList.valueOf(a8gVar.l(imageView).b.getIcon().d));
        this.v = new zb(this);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        addView(q9cVar, new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        addView(textViewE, new uf4(-2, -2));
        addView(textView, new uf4(-2, -2));
        addView(imageView, new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
        setLayoutParams(new uf4(-1, gm0.K(60.0f * yl5.d().getDisplayMetrics().density)));
        eg4 eg4VarH = ch3.h(this);
        int id = q9cVar.getId();
        eg4VarH.d(id, 4, 0, 4);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.g(id).d.w = 0.0f;
        int id2 = textViewE.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 6, q9cVar.getId(), 7);
        new bsb(6, eg4VarH, id2).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id2, 4, textView.getId(), 3);
        eg4VarH.d(id2, 7, imageView.getId(), 6);
        eg4VarH.g(id2).d.w = 0.0f;
        eg4VarH.g(id2).d.l0 = true;
        int id3 = textView.getId();
        eg4VarH.d(id3, 3, textViewE.getId(), 4);
        eg4VarH.d(id3, 6, textViewE.getId(), 6);
        eg4VarH.d(id3, 7, textViewE.getId(), 7);
        eg4VarH.d(id3, 4, 0, 4);
        eg4VarH.g(id3).d.w = 0.0f;
        eg4VarH.g(id3).d.W = 2;
        int id4 = imageView.getId();
        eg4VarH.d(id4, 3, 0, 3);
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.a(this);
    }

    public final a5b getMessageTextColor() {
        zv8 zv8Var = w[0];
        return (a5b) this.v.b;
    }

    public final void setAvatars(List<ylc> list) {
        this.s.setAvatars(list);
    }

    public final void setMessage(ynh ynhVar) {
        this.u.setText(ynhVar != null ? ynhVar.b(getContext()) : null);
    }

    public final void setMessageTextColor(a5b a5bVar) {
        this.v.B(this, w[0], a5bVar);
    }
}
