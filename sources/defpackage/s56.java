package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class s56 extends j46 {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public s56(weh wehVar) {
        this.b = new WeakReference(wehVar);
    }

    @Override // defpackage.j46
    public void a() {
        switch (this.a) {
            case 1:
                weh wehVar = (weh) this.b.get();
                if (wehVar != null) {
                    wehVar.c();
                }
                break;
        }
    }

    @Override // defpackage.j46
    public final void b() {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                t56.a((EditText) weakReference.get(), 1);
                break;
            default:
                weh wehVar = (weh) weakReference.get();
                if (wehVar != null) {
                    wehVar.c();
                }
                break;
        }
    }

    public s56(EditText editText) {
        this.b = new WeakReference(editText);
    }
}
