package defpackage;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e2m {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
