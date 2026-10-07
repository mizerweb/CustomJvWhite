package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class nca extends w79 implements bca {
    public static final Method D;
    public due C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.bca
    public final void l(yba ybaVar, MenuItem menuItem) {
        due dueVar = this.C;
        if (dueVar != null) {
            dueVar.l(ybaVar, menuItem);
        }
    }

    @Override // defpackage.w79
    public final kv5 p(Context context, boolean z) {
        mca mcaVar = new mca(context, z);
        mcaVar.setHoverListener(this);
        return mcaVar;
    }

    @Override // defpackage.bca
    public final void r(yba ybaVar, cca ccaVar) {
        due dueVar = this.C;
        if (dueVar != null) {
            dueVar.r(ybaVar, ccaVar);
        }
    }
}
