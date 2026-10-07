package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f7j {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static zo4 b(View view, zo4 zo4Var) {
        ContentInfo contentInfoA = zo4Var.a.a();
        Objects.requireNonNull(contentInfoA);
        ContentInfo contentInfoN = f82.n(contentInfoA);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoN);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoN ? zo4Var : new zo4(new rj5(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, ztb ztbVar) {
        if (ztbVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new g7j(ztbVar));
        }
    }
}
