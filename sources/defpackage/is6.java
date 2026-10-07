package defpackage;

import ru.ok.tamtam.android.prefs.FilePrefsException;

/* JADX INFO: loaded from: classes.dex */
public final class is6 implements ds6 {
    public final String a;

    public /* synthetic */ is6(String str) {
        this.a = str;
    }

    @Override // defpackage.ds6
    public void error(String str, Throwable th) {
        String str2 = this.a;
        if (th != null) {
            gm0.V(str2, str, new FilePrefsException(str, th));
        } else {
            gm0.Y(str2, str);
        }
    }

    @Override // defpackage.ds6
    public void log(String str) {
    }
}
