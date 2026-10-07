package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g7j implements OnReceiveContentListener {
    public final ztb a;

    public g7j(ztb ztbVar) {
        this.a = ztbVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        zo4 zo4Var = new zo4(new rj5(contentInfo));
        zo4 zo4VarA = this.a.a(view, zo4Var);
        if (zo4VarA == null) {
            return null;
        }
        if (zo4VarA == zo4Var) {
            return contentInfo;
        }
        ContentInfo contentInfoA = zo4VarA.a.a();
        Objects.requireNonNull(contentInfoA);
        return f82.n(contentInfoA);
    }
}
