package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s47 extends s7g {
    public final /* synthetic */ int u = 1;
    public final af7 v;

    public s47(Context context, af7 af7Var, kbc kbcVar) {
        flg flgVar = new flg(context);
        flgVar.setCustomTheme(kbcVar);
        super(flgVar);
        this.v = af7Var;
        flgVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 81.0f), gm0.K(81.0f * yl5.d().getDisplayMetrics().density)));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 0:
                i47 i47Var = view instanceof i47 ? (i47) view : null;
                if (i47Var != null) {
                    i47Var.setIcon(R.drawable.icon_folder_fill);
                    i47Var.setTitle(new tnh(R.string.chats_list_empty_state_title));
                    i47Var.f(i47Var.getContext().getString(R.string.chats_list_empty_state_action), new o37(1, this));
                    break;
                }
                break;
            default:
                qe7.H(view, 300L, new x7(9, this));
                break;
        }
    }

    public s47(Context context, tl3 tl3Var) {
        i47 i47Var = new i47(context);
        i47Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        super(i47Var);
        this.v = tl3Var;
    }
}
