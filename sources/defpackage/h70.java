package defpackage;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class h70 extends uud {
    public final /* synthetic */ int u;

    public h70(Context context) {
        this.u = 11;
        TextView textView = new TextView(context);
        super(textView);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        int i = this.u;
        String str = "";
        View view = this.a;
        switch (i) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                ((ia3) view).setDescription(((lqd) k79Var).a);
                return;
            case 3:
                emd emdVar = ((qqd) k79Var).a;
                izb izbVar = (izb) view;
                izbVar.setId(Long.hashCode(emdVar.a));
                long j = emdVar.e;
                CharSequence charSequence = emdVar.f;
                String str2 = emdVar.d;
                String str3 = str;
                if (str2 != null) {
                    str3 = str2;
                }
                izbVar.j(j, charSequence, str3);
                izbVar.setTitle(emdVar.b);
                izbVar.setSubtitle(emdVar.c.b(izbVar.getContext()));
                return;
            case 4:
                sqd sqdVar = (sqd) k79Var;
                xl4 xl4Var = (xl4) view;
                CharSequence charSequenceB = sqdVar.b.b(xl4Var.getContext());
                CharSequence charSequence2 = str;
                if (charSequenceB != null) {
                    charSequence2 = charSequenceB;
                }
                xl4Var.setTitle(charSequence2);
                xl4Var.setDescription(sqdVar.a);
                return;
            case 5:
                ((TextView) view).setText("#id " + ((tqd) k79Var).a);
                return;
            case 6:
                throw new ClassCastException();
            case 7:
                fqd fqdVar = (fqd) k79Var;
                cyb cybVar = (cyb) view;
                cybVar.setSize(fqdVar.c);
                cybVar.setAppearance(fqdVar.d);
                cybVar.setText(np4.q(cybVar.getContext(), fqdVar.a));
                return;
            case 8:
                ard ardVar = (ard) k79Var;
                ((atf) view).setModelItem(new ctf(R.id.profile_phone_number_button, 0, new xnh(ardVar.b), null, null, null, null, null, null, false, ardVar.a, 1016));
                return;
            case 9:
                atf atfVar = (atf) view;
                atfVar.setDisableStartIconText(true);
                atfVar.setModelItem(new ctf(8388608L, 0, new tnh(((brd) k79Var).b), null, null, null, aql.a(R.drawable.ic_error_40), null, null, false, null, 1592));
                return;
            case 10:
                ((atf) view).setModelItem(new ctf(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 0, new tnh(u2f.$EnumSwitchMapping$0[qt4.D(((drd) k79Var).a)] == 1 ? R.string.scheduled_posts_title : R.string.scheduled_messages_title), null, null, null, aql.a(R.drawable.icon_clock), fsf.a, null, false, null, 1592));
                return;
            case 11:
                gqd gqdVar = (gqd) k79Var;
                TextView textView = (TextView) view;
                textView.setText(gqdVar.a);
                n1g.N(new vzc(gqdVar, (lq4) null, 9), textView);
                noh nohVar = q9i.a;
                q9i.a(gqdVar.c, textView);
                return;
            default:
                q0g q0gVar = ((o0g) view).d;
                q0gVar.c = true;
                q0gVar.b.c();
                return;
        }
    }

    @Override // defpackage.s7g
    public void F() {
        switch (this.u) {
            case 12:
                q0g q0gVar = ((o0g) this.a).d;
                q0gVar.b();
                q0gVar.c = false;
                q0gVar.invalidate();
                break;
        }
    }

    @Override // defpackage.uud
    public void I(b1k b1kVar) {
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 2:
                ((ia3) view).setListener(new vn7(9, b1kVar));
                break;
            case 4:
                ((xl4) view).setListener(new b1k(10, b1kVar));
                break;
        }
    }

    @Override // defpackage.uud
    public void J(View.OnClickListener onClickListener) {
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 0:
                qe7.H(view, 300L, onClickListener);
                break;
            case 1:
                qe7.H(view, 300L, onClickListener);
                break;
            case 3:
                qe7.H(view, 300L, onClickListener);
                break;
            case 5:
                qe7.H((TextView) view, 300L, onClickListener);
                break;
            case 6:
                qe7.H((TextView) view, 300L, onClickListener);
                break;
            case 7:
                qe7.H(view, 300L, onClickListener);
                break;
            case 8:
                qe7.H(view, 300L, onClickListener);
                break;
            case 10:
                qe7.H(view, 300L, onClickListener);
                break;
        }
    }

    @Override // defpackage.uud
    public void K(View.OnLongClickListener onLongClickListener) {
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 3:
                ((izb) view).setOnLongClickListener(onLongClickListener);
                break;
            case 8:
                ((atf) view).setOnLongClickListener(onLongClickListener);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h70(View view, int i) {
        super(view);
        this.u = i;
    }
}
