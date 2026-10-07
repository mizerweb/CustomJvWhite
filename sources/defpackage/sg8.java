package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class sg8 extends InputConnectionWrapper {
    public final /* synthetic */ oo6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg8(InputConnection inputConnection, oo6 oo6Var) {
        super(inputConnection, false);
        this.a = oo6Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        wo4 ft0Var;
        due dueVar = inputContentInfo == null ? null : new due(new i1m(inputContentInfo));
        View view = (View) this.a.b;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((i1m) dueVar.a).a).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((i1m) dueVar.a).a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((i1m) dueVar.a).a;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            ft0Var = new ft0(clipData, 2);
        } else {
            xo4 xo4Var = new xo4();
            xo4Var.b = clipData;
            xo4Var.c = 2;
            ft0Var = xo4Var;
        }
        ft0Var.b(inputContentInfo3.getLinkUri());
        ft0Var.setExtras(bundle2);
        if (i7j.h(view, ft0Var.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
