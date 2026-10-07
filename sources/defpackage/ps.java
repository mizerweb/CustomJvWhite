package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
public final class ps implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ps(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                rs rsVar = (rs) obj;
                us usVar = rsVar.G;
                usVar.setSelection(i);
                if (usVar.getOnItemClickListener() != null) {
                    usVar.performItemClick(view, i, rsVar.D.getItemId(i));
                }
                rsVar.dismiss();
                break;
            default:
                vn9 vn9Var = (vn9) obj;
                w79 w79Var = vn9Var.e;
                if (i < 0) {
                    item = !w79Var.z.isShowing() ? null : w79Var.c.getSelectedItem();
                } else {
                    item = vn9Var.getAdapter().getItem(i);
                }
                vn9.a(vn9Var, item);
                AdapterView.OnItemClickListener onItemClickListener = vn9Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !w79Var.z.isShowing() ? null : w79Var.c.getSelectedView();
                        i = !w79Var.z.isShowing() ? -1 : w79Var.c.getSelectedItemPosition();
                        j = !w79Var.z.isShowing() ? Long.MIN_VALUE : w79Var.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(w79Var.c, view, i, j);
                }
                w79Var.dismiss();
                break;
        }
    }
}
