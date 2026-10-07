package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.mods.ModsClickListener;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bt1 extends s7g {
    public final /* synthetic */ int u;
    public final Object v;
    public final ViewGroup w;

    public bt1(Context context, zo7 zo7Var, int i) {
        this.u = i;
        switch (i) {
            case 2:
                yyb yybVar = new yyb(context);
                super(yybVar);
                this.v = zo7Var;
                this.w = yybVar;
                break;
            default:
                izb izbVar = new izb(context, false);
                super(izbVar);
                this.v = zo7Var;
                this.w = izbVar;
                break;
        }
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        int i = this.u;
        ViewGroup viewGroup = this.w;
        switch (i) {
            case 0:
                ((o12) viewGroup).setListener((n12) this.v);
                break;
            case 1:
                izb izbVar = (izb) viewGroup;
                e6g e6gVar = k79Var instanceof e6g ? (e6g) k79Var : null;
                if (e6gVar != null) {
                    CharSequence charSequenceB = e6gVar.a.b(izbVar.getContext());
                    if (charSequenceB == null) {
                        charSequenceB = "";
                    }
                    izbVar.setTitle(charSequenceB);
                    CharSequence charSequenceB2 = e6gVar.b.b(izbVar.getContext());
                    CharSequence charSequence = charSequenceB2 != null ? charSequenceB2 : "";
                    izbVar.setSubtitle(charSequence);
                    qe7.H(izbVar, 300L, new ee(this, 12, charSequence));
                    izbVar.setLongClickable(true);
                    izbVar.setOnLongClickListener(new ro2(this, 0, charSequence));
                    break;
                }
                break;
            default:
                yyb yybVar = (yyb) viewGroup;
                if (k79Var instanceof bhf) {
                    SpannableString spannableString = new SpannableString("Настройки мода");
                    spannableString.setSpan(new ForegroundColorSpan(-11751600), 0, spannableString.length(), 33);
                    yybVar.setText(spannableString);
                    yybVar.setIcon(this.a.getContext().getDrawable(R.drawable.icon_share_android));
                    qe7.H(yybVar, 300L, new ModsClickListener());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt1(FrameLayout frameLayout, n12 n12Var) {
        super(frameLayout);
        this.u = 0;
        this.v = n12Var;
        this.w = (o12) frameLayout.findViewById(R.id.call_copy_link_preview);
    }
}
