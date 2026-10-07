package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import one.me.messages.list.ui.CommentAdminDeleteBottomSheet;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xo3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ xo3(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                yo3 yo3Var = ((zo3) view).a;
                if (yo3Var != null) {
                    CommentAdminDeleteBottomSheet commentAdminDeleteBottomSheet = (CommentAdminDeleteBottomSheet) ((s63) yo3Var).b;
                    zv8[] zv8VarArr = CommentAdminDeleteBottomSheet.C;
                    commentAdminDeleteBottomSheet.F1();
                }
                break;
            case 1:
                cq3 cq3Var = (cq3) view;
                go9 go9Var = cq3Var.j;
                if (go9Var != null) {
                    sp3 sp3Var = (sp3) ((c7k) go9Var).b;
                    if (!z ? sp3Var.e(cq3Var, sp3Var.e) : sp3Var.a(cq3Var)) {
                        sp3Var.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = cq3Var.i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
            default:
                atf atfVar = (atf) view;
                if (z) {
                    atfVar.callOnClick();
                }
                break;
        }
    }
}
