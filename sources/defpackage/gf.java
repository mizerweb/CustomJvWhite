package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
public final class gf implements AdapterView.OnItemClickListener {
    public final /* synthetic */ lf a;
    public final /* synthetic */ hf b;

    public gf(hf hfVar, lf lfVar) {
        this.b = hfVar;
        this.a = lfVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        hf hfVar = this.b;
        DialogInterface.OnClickListener onClickListener = hfVar.j;
        lf lfVar = this.a;
        onClickListener.onClick(lfVar.b, i);
        if (hfVar.l) {
            return;
        }
        lfVar.b.dismiss();
    }
}
