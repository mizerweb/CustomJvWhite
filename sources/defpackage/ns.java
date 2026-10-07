package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes2.dex */
public final class ns implements ts, DialogInterface.OnClickListener {
    public nf a;
    public os b;
    public CharSequence c;
    public final /* synthetic */ us d;

    public ns(us usVar) {
        this.d = usVar;
    }

    @Override // defpackage.ts
    public final boolean a() {
        nf nfVar = this.a;
        if (nfVar != null) {
            return nfVar.isShowing();
        }
        return false;
    }

    @Override // defpackage.ts
    public final Drawable b() {
        return null;
    }

    @Override // defpackage.ts
    public final int c() {
        return 0;
    }

    @Override // defpackage.ts
    public final void d(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ts
    public final void dismiss() {
        nf nfVar = this.a;
        if (nfVar != null) {
            nfVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.ts
    public final CharSequence e() {
        return this.c;
    }

    @Override // defpackage.ts
    public final void f(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.ts
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ts
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ts
    public final void i(int i, int i2) {
        if (this.b == null) {
            return;
        }
        us usVar = this.d;
        mf mfVar = new mf(usVar.getPopupContext());
        hf hfVar = (hf) mfVar.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            hfVar.d = charSequence;
        }
        os osVar = this.b;
        int selectedItemPosition = usVar.getSelectedItemPosition();
        hfVar.i = osVar;
        hfVar.j = this;
        hfVar.m = selectedItemPosition;
        hfVar.l = true;
        nf nfVarD = mfVar.d();
        this.a = nfVarD;
        AlertController$RecycleListView alertController$RecycleListView = nfVarD.f.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.ts
    public final int j() {
        return 0;
    }

    @Override // defpackage.ts
    public final void k(ListAdapter listAdapter) {
        this.b = (os) listAdapter;
    }

    @Override // defpackage.ts
    public final void o(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        us usVar = this.d;
        usVar.setSelection(i);
        if (usVar.getOnItemClickListener() != null) {
            usVar.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }
}
