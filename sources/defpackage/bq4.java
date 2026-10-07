package defpackage;

import android.content.Context;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class bq4 extends TextView implements eph {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bq4(Context context, int i) {
        super(context);
        this.a = i;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        switch (this.a) {
            case 0:
                setTextColor(kbcVar.getText().c);
                break;
            default:
                setTextColor(kbcVar.getText().c);
                break;
        }
    }
}
