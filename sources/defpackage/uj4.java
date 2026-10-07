package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class uj4 {
    public final ny8 a;

    public uj4(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(Context context, Uri uri) {
        g5d g5dVar = (g5d) ((gjf) this.a.getValue());
        String str = String.format(context.getString(R.string.tt_sms_invite_text), Arrays.copyOf(new Object[]{g5dVar.b()}, 1));
        it3.a(context, str.toString());
        if (uri != null) {
            dp4.c(uri);
        }
        String str2 = sj8.a;
        sj8.j(context, str, uri);
    }
}
