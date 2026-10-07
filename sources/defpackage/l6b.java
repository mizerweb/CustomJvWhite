package defpackage;

import android.content.Context;
import java.io.File;
import ru.ok.messages.utils.ContextDirCreationException;

/* JADX INFO: loaded from: classes.dex */
public final class l6b {
    public final File a;

    public l6b(Context context) {
        if (!qe7.W(false, null, new rgb(context, 8))) {
            gm0.V("ju6", "dataDir doesn't exists.", new ContextDirCreationException("dataDir"));
        }
        File fileQ0 = lu6.q0(context.getDataDir(), "accounts_db");
        fileQ0.mkdirs();
        this.a = fileQ0;
    }
}
